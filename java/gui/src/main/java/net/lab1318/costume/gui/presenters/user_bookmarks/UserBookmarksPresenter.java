package net.lab1318.costume.gui.presenters.user_bookmarks;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.LinkedHashMap;
import java.util.Map;

import org.thryft.waf.gui.EventBus;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.eventbus.Subscribe;
import com.google.common.primitives.UnsignedInteger;
import com.google.inject.Inject;
import com.google.inject.servlet.SessionScoped;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.server.UserError;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectId;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
import net.lab1318.costume.api.models.user.UserBookmarkId;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.GetObjectSummariesOptions;
import net.lab1318.costume.api.services.object.GetObjectSummariesResult;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserCommandService.Messages.DeleteUserBookmarkByIdRequest;
import net.lab1318.costume.api.services.user.UserCommandService.Messages.PostUserBookmarkRequest;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.gui.models.object.ObjectSummaryEntryBeanQueryDefinition;
import net.lab1318.costume.gui.models.object.ObjectSummaryEntryBeanQueryFactory;
import net.lab1318.costume.gui.presenters.Presenter;
import net.lab1318.costume.gui.views.user_bookmarks.UserBookmarksView;

@SessionScoped
public class UserBookmarksPresenter extends Presenter<UserBookmarksView> {
    @Inject
    public UserBookmarksPresenter(final CollectionQueryService collectionQueryService, final EventBus eventBus,
            final InstitutionQueryService institutionQueryService,
            final ObjectSummaryQueryService objectSummaryQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final UserBookmarksView view) {
        super(eventBus, userCommandService, userQueryService, view);
        this.collectionQueryService = checkNotNull(collectionQueryService);
        this.institutionQueryService = checkNotNull(institutionQueryService);
        this.objectSummaryQueryService = checkNotNull(objectSummaryQueryService);
    }

    @Subscribe
    public void onDeleteUserBookmarkByIdRequest(final DeleteUserBookmarkByIdRequest request) {
        if (!_deleteUserBookmark(request.getId())) {
            return;
        }
    }

    @Subscribe
    public void onPostUserBookmarkRequest(final PostUserBookmarkRequest request) {
        final Optional<UserBookmarkId> userBookmarkId = _postUserBookmark(request.getUserBookmark());
        if (!userBookmarkId.isPresent()) {
            return;
        }
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        __refreshView(currentUser);
    }

    private void __refreshView(final Optional<UserEntry> currentUser) {
        if (!currentUser.isPresent()) {
            _getView().setComponentError(new UserError("Not logged in"));
            return;
        }

        ImmutableList<UserBookmarkEntry> bookmarks;
        try {
            bookmarks = _getUserQueryService().getUserBookmarksByUserId(currentUser.get().getId());
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchUserException e) {
            _getView().setComponentError(new UserError("Not logged in"));
            return;
        }

        ImmutableMap<ObjectId, UserBookmarkId> bookmarkedObjectIds;
        {
            final Map<ObjectId, UserBookmarkId> bookmarkedObjectIdsBuilder = new LinkedHashMap<>();
            for (final UserBookmarkEntry bookmarkEntry : bookmarks) {
                if (!bookmarkEntry.getModel().getObjectId().isPresent()) {
                    continue;
                }
                bookmarkedObjectIdsBuilder.put(bookmarkEntry.getModel().getObjectId().get(), bookmarkEntry.getId());
            }
            bookmarkedObjectIds = ImmutableMap.copyOf(bookmarkedObjectIdsBuilder);
        }

        final ObjectQuery objectQuery = ObjectQuery.builder().setObjectIds(bookmarkedObjectIds.keySet()).build();

        GetObjectSummariesResult firstResult;
        try {
            firstResult = objectSummaryQueryService.getObjectSummaries(GET_FIRST_RESULT_OPTIONS,
                    Optional.of(objectQuery));
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

        ImmutableMap<CollectionId, Collection> collectionMap;
        try {
            collectionMap = _getCollections(
                    ImmutableList.copyOf(firstResult.getFacets().get().getCollections().keySet()),
                    collectionQueryService);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchCollectionException e) {
            _getView().setComponentError(new SystemError("no such collection " + e.getId().get(), e));
            return;
        }

        ImmutableMap<InstitutionId, Institution> institutionMap;
        try {
            institutionMap = _getInstitutions(
                    ImmutableList.copyOf(firstResult.getFacets().get().getInstitutions().keySet()),
                    institutionQueryService);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchInstitutionException e) {
            _getView().setComponentError(new SystemError("no such institution " + e.getId().get(), e));
            return;
        }

        _getView().setModels(bookmarkedObjectIds, collectionMap, currentUser.get().getId(), institutionMap, objectQuery,
                new LazyQueryContainer(ObjectSummaryEntryBeanQueryDefinition.getInstance(),
                        ObjectSummaryEntryBeanQueryFactory.create(firstResult, objectQuery,
                                objectSummaryQueryService)));
    }

    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
    private final ObjectSummaryQueryService objectSummaryQueryService;
    private final static Optional<GetObjectSummariesOptions> GET_FIRST_RESULT_OPTIONS = Optional
            .of(GetObjectSummariesOptions.builder().setIncludeFacets(true).setFrom(UnsignedInteger.ZERO)
                    .setSize(
                            UnsignedInteger.valueOf(ObjectSummaryEntryBeanQueryDefinition.getInstance().getBatchSize()))
                    .build());
}

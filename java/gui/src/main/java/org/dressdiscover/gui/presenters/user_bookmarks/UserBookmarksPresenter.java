package org.dressdiscover.gui.presenters.user_bookmarks;

import static com.google.common.base.Preconditions.checkNotNull;

import java.util.LinkedHashMap;
import java.util.Map;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.gui.models.object.ObjectSummaryEntryBeanQueryDefinition;
import org.dressdiscover.gui.models.object.ObjectSummaryEntryBeanQueryFactory;
import org.dressdiscover.gui.presenters.Presenter;
import org.dressdiscover.gui.views.user_bookmarks.UserBookmarksView;
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

import org.dressdiscover.api.models.collection.Collection;
import org.dressdiscover.api.models.institution.Institution;
import org.dressdiscover.api.models.object.ObjectQuery;
import org.dressdiscover.api.models.user.UserBookmarkEntry;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.collection.CollectionQueryService;
import org.dressdiscover.api.services.collection.NoSuchCollectionException;
import org.dressdiscover.api.services.institution.InstitutionQueryService;
import org.dressdiscover.api.services.institution.NoSuchInstitutionException;
import org.dressdiscover.api.services.object.GetObjectSummariesOptions;
import org.dressdiscover.api.services.object.GetObjectSummariesResult;
import org.dressdiscover.api.services.object.ObjectSummaryQueryService;
import org.dressdiscover.api.services.user.NoSuchUserException;
import org.dressdiscover.api.services.user.UserCommandService;
import org.dressdiscover.api.services.user.UserCommandService.Messages.DeleteUserBookmarkByIdRequest;
import org.dressdiscover.api.services.user.UserQueryService;

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
        __refreshView(_getCurrentUser());
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

        ImmutableList<UserBookmarkEntry> bookmarksList;
        try {
            bookmarksList = _getUserQueryService().getUserBookmarksByUserId(currentUser.get().getId());
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchUserException e) {
            _getView().setComponentError(new UserError("Not logged in"));
            return;
        }

        ImmutableMap<ObjectId, UserBookmarkEntry> bookmarksMap;
        {
            final Map<ObjectId, UserBookmarkEntry> bookmarksMapBuilder = new LinkedHashMap<>();
            for (final UserBookmarkEntry bookmarkEntry : bookmarksList) {
                if (!bookmarkEntry.getModel().getObjectId().isPresent()) {
                    continue;
                }
                bookmarksMapBuilder.put(bookmarkEntry.getModel().getObjectId().get(), bookmarkEntry);
            }
            bookmarksMap = ImmutableMap.copyOf(bookmarksMapBuilder);
        }

        final ObjectQuery objectQuery = ObjectQuery.builder().setObjectIds(bookmarksMap.keySet()).build();

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
        } catch (final NoSuchInstitutionException e) {
            _getView().setComponentError(new SystemError("no such institution " + e.getId().get(), e));
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

        _getView().setModels(bookmarksMap, collectionMap, currentUser.get().getId(), institutionMap, objectQuery,
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

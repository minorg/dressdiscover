package org.dressdiscover.gui.presenters.objects;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import org.dressdiscover.api.models.collection.CollectionId;
import org.dressdiscover.api.models.institution.InstitutionId;
import org.dressdiscover.api.models.object.ObjectId;
import org.dressdiscover.api.models.user.UserBookmarkId;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.gui.models.object.ObjectSummaryEntryBeanQueryDefinition;
import org.dressdiscover.gui.models.object.ObjectSummaryEntryBeanQueryFactory;
import org.dressdiscover.gui.presenters.Presenter;
import org.dressdiscover.gui.views.objects.ObjectsView;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.protocol.InputProtocolException;
import org.thryft.protocol.JacksonJsonInputProtocol;
import org.thryft.waf.gui.EventBus;
import org.thryft.waf.lib.logging.LoggingUtils;
import org.vaadin.addons.lazyquerycontainer.LazyQueryContainer;

import com.google.common.base.Charsets;
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
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.object.ObjectFacets;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
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

@SessionScoped
public class ObjectsPresenter extends Presenter<ObjectsView> {
    @Inject
    public ObjectsPresenter(final CollectionQueryService collectionQueryService, final EventBus eventBus,
            final InstitutionQueryService institutionQueryService,
            final ObjectSummaryQueryService objectSummaryQueryService, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final ObjectsView view) {
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
        _getView().setBookmarks(__getBookmarks());
    }

    @Subscribe
    public void onPostUserBookmarkRequest(final PostUserBookmarkRequest request) {
        final Optional<UserBookmarkId> userBookmarkId = _postUserBookmark(request.getUserBookmark());
        if (!userBookmarkId.isPresent()) {
            return;
        }
        _getView().setBookmarks(__getBookmarks());
    }

    @Override
    protected void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event) {
        final ObjectQuery objectQuery;
        try {
            objectQuery = ObjectQuery.readAsStruct(
                    new JacksonJsonInputProtocol(URLDecoder.decode(event.getParameters(), Charsets.UTF_8.toString())));
        } catch (final InputProtocolException | UnsupportedEncodingException e) {
            _getView().setComponentError(new UserError("invalid query " + event.getParameters()));
            return;
        }

        final ObjectFacets availableObjectFacets;
        try {
            availableObjectFacets = objectSummaryQueryService
                    .getObjectSummaries(GET_AVAILABLE_OBJECT_FACETS_OPTIONS,
                            Optional.of(ObjectQuery.builder(objectQuery).unsetFacetFilters().build()))
                    .getFacets().get();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        }

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
            collectionMap = _getCollections(ImmutableList.copyOf(availableObjectFacets.getCollections().keySet()),
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
            institutionMap = _getInstitutions(ImmutableList.copyOf(availableObjectFacets.getInstitutions().keySet()),
                    institutionQueryService);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return;
        } catch (final NoSuchInstitutionException e) {
            _getView().setComponentError(new SystemError("no such institution " + e.getId().get(), e));
            return;
        }

        ImmutableMap<ObjectId, UserBookmarkEntry> bookmarks;
        Optional<UserId> currentUserId;
        if (currentUser.isPresent()) {
            currentUserId = Optional.of(currentUser.get().getId());
            bookmarks = __getBookmarks();
        } else {
            bookmarks = ImmutableMap.of();
            currentUserId = Optional.absent();
        }

        _getView().setModels(availableObjectFacets, bookmarks, collectionMap, currentUserId, institutionMap,
                objectQuery,
                new LazyQueryContainer(ObjectSummaryEntryBeanQueryDefinition.getInstance(),
                        ObjectSummaryEntryBeanQueryFactory.create(firstResult, objectQuery, objectSummaryQueryService)),
                firstResult.getFacets().get());
    }

    private ImmutableMap<ObjectId, UserBookmarkEntry> __getBookmarks() {
        final Optional<UserEntry> currentUser = _getCurrentUser();
        if (!currentUser.isPresent()) {
            return ImmutableMap.of();
        }

        try {
            final ImmutableList<UserBookmarkEntry> bookmarks = _getUserQueryService()
                    .getUserBookmarksByUserId(currentUser.get().getId(), OPTIONAL_TRUE);
            final Map<ObjectId, UserBookmarkEntry> bookmarkedObjectIdsBuilder = new LinkedHashMap<>();
            for (final UserBookmarkEntry bookmarkEntry : bookmarks) {
                if (!bookmarkEntry.getModel().getObjectId().isPresent()) {
                    continue;
                }
                bookmarkedObjectIdsBuilder.put(bookmarkEntry.getModel().getObjectId().get(), bookmarkEntry);
            }
            return ImmutableMap.copyOf(bookmarkedObjectIdsBuilder);
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return ImmutableMap.of();
        } catch (final NoSuchUserException e) {
            logger.warn(logMarker, "unable to get bookmarks for user {}, user no longer exists?",
                    currentUser.get().getId());
            return ImmutableMap.of();
        }
    }

    private final CollectionQueryService collectionQueryService;
    private final InstitutionQueryService institutionQueryService;
    private final ObjectSummaryQueryService objectSummaryQueryService;
    private final static Optional<GetObjectSummariesOptions> GET_FIRST_RESULT_OPTIONS = Optional
            .of(GetObjectSummariesOptions.builder().setIncludeFacets(true).setFrom(UnsignedInteger.ZERO)
                    .setSize(
                            UnsignedInteger.valueOf(ObjectSummaryEntryBeanQueryDefinition.getInstance().getBatchSize()))
                    .build());
    private final static Optional<GetObjectSummariesOptions> GET_AVAILABLE_OBJECT_FACETS_OPTIONS = Optional
            .of(GetObjectSummariesOptions.builder().setIncludeFacets(true).setSize(UnsignedInteger.ZERO).build());
    private final static Logger logger = LoggerFactory.getLogger(ObjectsPresenter.class);
    private final static Marker logMarker = LoggingUtils.getMarker(ObjectsPresenter.class);
    private final static Optional<Boolean> OPTIONAL_TRUE = Optional.of(Boolean.TRUE);
}

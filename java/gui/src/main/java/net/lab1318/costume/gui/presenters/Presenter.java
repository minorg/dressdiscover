package net.lab1318.costume.gui.presenters;

import static com.google.common.base.Preconditions.checkNotNull;
import static com.google.common.base.Preconditions.checkState;

import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.thryft.protocol.JacksonJsonOutputProtocol;
import org.thryft.protocol.OutputProtocolException;
import org.thryft.waf.gui.EventBus;
import org.thryft.waf.gui.views.View;
import org.thryft.waf.lib.logging.LoggingUtils;

import com.google.common.base.Charsets;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.eventbus.Subscribe;
import com.vaadin.navigator.ViewChangeListener.ViewChangeEvent;
import com.vaadin.server.SystemError;
import com.vaadin.ui.UI;

import net.lab1318.costume.api.models.collection.Collection;
import net.lab1318.costume.api.models.collection.CollectionId;
import net.lab1318.costume.api.models.institution.Institution;
import net.lab1318.costume.api.models.institution.InstitutionId;
import net.lab1318.costume.api.models.object.ObjectQuery;
import net.lab1318.costume.api.models.user.InvalidUserIdException;
import net.lab1318.costume.api.models.user.UserBookmark;
import net.lab1318.costume.api.models.user.UserBookmarkId;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.collection.CollectionQueryService;
import net.lab1318.costume.api.services.collection.CollectionQueryService.Messages.GetCollectionByIdRequest;
import net.lab1318.costume.api.services.collection.NoSuchCollectionException;
import net.lab1318.costume.api.services.institution.InstitutionQueryService;
import net.lab1318.costume.api.services.institution.InstitutionQueryService.Messages.GetInstitutionByIdRequest;
import net.lab1318.costume.api.services.institution.NoSuchInstitutionException;
import net.lab1318.costume.api.services.object.ObjectQueryService.Messages.GetObjectByIdRequest;
import net.lab1318.costume.api.services.object.ObjectSummaryQueryService.Messages.GetObjectSummariesRequest;
import net.lab1318.costume.api.services.user.DuplicateUserBookmarkException;
import net.lab1318.costume.api.services.user.NoSuchUserBookmarkException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.api.services.user.UserQueryService.Messages.GetUserBookmarksByUserIdRequest;
import net.lab1318.costume.gui.events.user.UserLogoutRequest;
import net.lab1318.costume.gui.views.TopLevelView;
import net.lab1318.costume.gui.views.object_by_id.ObjectByIdView;
import net.lab1318.costume.gui.views.objects.ObjectsView;
import net.lab1318.costume.gui.views.user_bookmarks.UserBookmarksView;

public abstract class Presenter<ViewT extends View> extends org.thryft.waf.gui.presenters.Presenter<ViewT> {
    protected static void _navigateTo(final ObjectQuery query) {
        String queryJson;
        try {
            final StringWriter jsonStringWriter = new StringWriter();
            final JacksonJsonOutputProtocol oprot = new JacksonJsonOutputProtocol(jsonStringWriter);
            query.writeAsStruct(oprot);
            oprot.flush();
            queryJson = jsonStringWriter.toString();
        } catch (final OutputProtocolException e) {
            throw new IllegalStateException();
        }
        try {
            UI.getCurrent().getNavigator()
                    .navigateTo(ObjectsView.NAME + "/" + URLEncoder.encode(queryJson, Charsets.UTF_8.toString()));
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    protected Presenter(final EventBus eventBus, final UserCommandService userCommandService,
            final UserQueryService userQueryService, final ViewT view) {
        super(eventBus, view);
        this.userCommandService = checkNotNull(userCommandService);
        this.userQueryService = checkNotNull(userQueryService);
    }

    @Subscribe
    public void onGetCollectionByIdRequest(final GetCollectionByIdRequest request) {
        _navigateTo(ObjectQuery.builder().setCollectionId(request.getId())
                .setInstitutionId(request.getId().getInstitutionId()).setWorkTypeText("PhysicalObject").build());
    }

    @Subscribe
    public void onGetInstitutionByIdRequest(final GetInstitutionByIdRequest request) {
        _navigateTo(ObjectQuery.builder().setInstitutionId(request.getId()).setWorkTypeText("PhysicalObject").build());
    }

    @Subscribe
    public void onGetObjectByIdRequest(final GetObjectByIdRequest request) {
        UI.getCurrent().getNavigator().navigateTo(ObjectByIdView.NAME + "/" + request.getId().toString());
    }

    @Subscribe
    public void onGetObjectSummariesRequest(final GetObjectSummariesRequest request) {
        _navigateTo(request.getQuery().get());
    }

    @Subscribe
    public void onGetUserBookmarksByUserIdRequest(final GetUserBookmarksByUserIdRequest request) {
        UI.getCurrent().getNavigator().navigateTo(UserBookmarksView.NAME);
    }

    @Subscribe
    public void onUserLogoutRequest(final UserLogoutRequest event) {
        SecurityUtils.getSubject().logout();

        currentUser = Optional.absent();

        if (_getView() instanceof TopLevelView) {
            ((TopLevelView) _getView()).setCurrentUser(Optional.absent());
        }

        UI.getCurrent().getPage().reload();
    }

    protected final boolean _deleteUserBookmark(final UserBookmarkId userBookmarkId) {
        if (!currentUser.isPresent()) {
            logger.warn(logMarker, "tried to delete a bookmark when not logged in");
            return false;
        }
        try {
            userCommandService.deleteUserBookmarkById(userBookmarkId);
            return true;
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return false;
        } catch (final NoSuchUserBookmarkException e) {
            logger.warn(logMarker, "user {} tried to delete a non-existent bookmark {}", currentUser.get().getId(),
                    userBookmarkId);
            return false;
        }
    }

    protected final ImmutableMap<CollectionId, Collection> _getCollections(
            final ImmutableList<CollectionId> collectionIds, final CollectionQueryService collectionQueryService)
                    throws IoException, NoSuchCollectionException {
        final ImmutableList<Collection> collections = collectionQueryService.getCollectionsByIds(collectionIds);
        checkState(collectionIds.size() == collections.size());
        final ImmutableMap.Builder<CollectionId, Collection> collectionMapBuilder = ImmutableMap.builder();
        for (int collectionI = 0; collectionI < collectionIds.size(); collectionI++) {
            collectionMapBuilder.put(collectionIds.get(collectionI), collections.get(collectionI));
        }
        return collectionMapBuilder.build();
    }

    protected final Optional<UserEntry> _getCurrentUser() {
        return currentUser;
    }

    protected final ImmutableMap<InstitutionId, Institution> _getInstitutions(
            final ImmutableList<InstitutionId> institutionIds, final InstitutionQueryService institutionQueryService)
                    throws IoException, NoSuchInstitutionException {
        final ImmutableList<Institution> institutions = institutionQueryService.getInstitutionsByIds(institutionIds);
        checkState(institutionIds.size() == institutions.size());
        final ImmutableMap.Builder<InstitutionId, Institution> institutionMapBuilder = ImmutableMap.builder();
        for (int institutionI = 0; institutionI < institutionIds.size(); institutionI++) {
            institutionMapBuilder.put(institutionIds.get(institutionI), institutions.get(institutionI));
        }
        return institutionMapBuilder.build();
    }

    protected final UserCommandService _getUserCommandService() {
        return userCommandService;
    }

    protected final UserQueryService _getUserQueryService() {
        return userQueryService;
    }

    protected abstract void _onViewEnter(final Optional<UserEntry> currentUser, final ViewChangeEvent event);

    @Override
    protected final void _onViewEnter(final ViewChangeEvent event) {
        currentUser = __getCurrentUser();
        if (_getView() instanceof TopLevelView) {
            ((TopLevelView) _getView()).setCurrentUser(currentUser);
        }

        _onViewEnter(currentUser, event);
    }

    @Override
    protected void _onViewExit(final ViewChangeEvent event) {
        currentUser = Optional.absent();
    }

    protected final Optional<UserBookmarkId> _postUserBookmark(final UserBookmark userBookmark) {
        if (!currentUser.isPresent()) {
            logger.warn(logMarker, "tried to post a bookmark when not logged in");
            return Optional.absent();
        } else if (!currentUser.get().getId().equals(userBookmark.getUserId())) {
            logger.warn(logMarker, "user {} tried to post a bookmark as another user {}", currentUser.get().getId(),
                    userBookmark.getUserId());
            return Optional.absent();
        }

        try {
            return Optional.of(userCommandService.postUserBookmark(userBookmark));
        } catch (final DuplicateUserBookmarkException e) {
            logger.warn(logMarker, "user {} tried to post a duplicate bookmark {}", currentUser.get().getId(),
                    userBookmark.getUserId());
            return Optional.absent();
        } catch (final IoException e) {
            _getView().setComponentError(new SystemError("I/O exception", e));
            return Optional.absent();
        }
    }

    private final Optional<UserEntry> __getCurrentUser() {
        final Subject currentSubject = SecurityUtils.getSubject();
        if (!currentSubject.isAuthenticated() && !currentSubject.isRemembered()) {
            logger.debug(logMarker, "no user authenticated or remembered");
            return Optional.absent();
        }

        final Object principal = currentSubject.getPrincipal();
        checkState(principal != null); // Should be caught above
        if (!(principal instanceof String)) {
            logger.warn(logMarker, "unknown principal object type {}", principal.getClass().getCanonicalName());
            return Optional.absent();
        }

        UserId currentUserId;
        try {
            currentUserId = UserId.parse((String) principal);
        } catch (final InvalidUserIdException e) {
            logger.warn(logMarker, "invalid principal string {}", principal);
            throw new AuthorizationException("invalid principal");
        }

        try {
            return Optional.of(new UserEntry(currentUserId, userQueryService.getUserById(currentUserId)));
        } catch (final IoException e) {
            logger.error(logMarker, "error getting user id '{}': {}", currentUserId, e);
            return Optional.absent();
        } catch (final NoSuchUserException e) {
            logger.warn(logMarker, "no such user id '{}'", currentUserId);
            return Optional.absent();
        }
    }

    private Optional<UserEntry> currentUser = Optional.absent();
    private final UserCommandService userCommandService;
    private final UserQueryService userQueryService;
    private final static Logger logger = LoggerFactory.getLogger(Presenter.class);
    private final static Marker logMarker = LoggingUtils.getMarker(Presenter.class);
}

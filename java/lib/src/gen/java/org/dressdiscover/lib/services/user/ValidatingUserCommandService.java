package org.dressdiscover.lib.services.user;

@com.google.inject.Singleton
public class ValidatingUserCommandService implements org.dressdiscover.api.services.user.UserCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.user.ValidatingUserCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingUserCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.user.ValidatingUserCommandService.delegate") org.dressdiscover.api.services.user.UserCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteUserBookmarkById(final net.lab1318.costume.api.models.user.UserBookmarkId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserBookmarkException {
        _validateDeleteUserBookmarkByIdParameters(id);
        delegate.deleteUserBookmarkById(id);
    }

    protected void _validateDeleteUserBookmarkByIdParameters(final net.lab1318.costume.api.models.user.UserBookmarkId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.user.UserCommandService.deleteUserBookmarkById: missing id");
    }

    @Override
    public final void deleteUserById(final net.lab1318.costume.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        _validateDeleteUserByIdParameters(id);
        delegate.deleteUserById(id);
    }

    protected void _validateDeleteUserByIdParameters(final net.lab1318.costume.api.models.user.UserId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.user.UserCommandService.deleteUserById: missing id");
    }

    @Override
    public final void deleteUsers() throws org.dressdiscover.api.services.IoException {
        delegate.deleteUsers();
    }

    @Override
    public final net.lab1318.costume.api.models.user.UserId postUser(final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.user.DuplicateUserException, org.dressdiscover.api.services.IoException {
        _validatePostUserParameters(user);
        return com.google.common.base.Preconditions.checkNotNull(delegate.postUser(user), "org.dressdiscover.api.services.user.UserCommandService.postUser: missing returnValue");
    }

    protected void _validatePostUserParameters(final org.dressdiscover.api.models.user.User user) {
        com.google.common.base.Preconditions.checkNotNull(user, "org.dressdiscover.api.services.user.UserCommandService.postUser: missing user");
    }

    @Override
    public final net.lab1318.costume.api.models.user.UserBookmarkId postUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) throws org.dressdiscover.api.services.user.DuplicateUserBookmarkException, org.dressdiscover.api.services.IoException {
        _validatePostUserBookmarkParameters(userBookmark);
        return com.google.common.base.Preconditions.checkNotNull(delegate.postUserBookmark(userBookmark), "org.dressdiscover.api.services.user.UserCommandService.postUserBookmark: missing returnValue");
    }

    protected void _validatePostUserBookmarkParameters(final org.dressdiscover.api.models.user.UserBookmark userBookmark) {
        com.google.common.base.Preconditions.checkNotNull(userBookmark, "org.dressdiscover.api.services.user.UserCommandService.postUserBookmark: missing userBookmark");
    }

    @Override
    public final void putUser(final net.lab1318.costume.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        _validatePutUserParameters(id, user);
        delegate.putUser(id, user);
    }

    protected void _validatePutUserParameters(final net.lab1318.costume.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.user.UserCommandService.putUser: missing id");
        com.google.common.base.Preconditions.checkNotNull(user, "org.dressdiscover.api.services.user.UserCommandService.putUser: missing user");
    }

    private final org.dressdiscover.api.services.user.UserCommandService delegate;
}

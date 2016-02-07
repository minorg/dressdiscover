package net.lab1318.costume.lib.services.user;

@com.google.inject.Singleton
public class ValidatingUserCommandService implements net.lab1318.costume.api.services.user.UserCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.user.ValidatingUserCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingUserCommandService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.user.ValidatingUserCommandService.delegate") net.lab1318.costume.api.services.user.UserCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteUserBookmarkById(final net.lab1318.costume.api.models.user.UserBookmarkId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserBookmarkException {
        _validateDeleteUserBookmarkByIdParameters(id);
        delegate.deleteUserBookmarkById(id);
    }

    protected void _validateDeleteUserBookmarkByIdParameters(final net.lab1318.costume.api.models.user.UserBookmarkId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.UserCommandService.deleteUserBookmarkById: missing id");
    }

    @Override
    public final void deleteUserById(final net.lab1318.costume.api.models.user.UserId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException {
        _validateDeleteUserByIdParameters(id);
        delegate.deleteUserById(id);
    }

    protected void _validateDeleteUserByIdParameters(final net.lab1318.costume.api.models.user.UserId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.UserCommandService.deleteUserById: missing id");
    }

    @Override
    public final void deleteUsers() throws net.lab1318.costume.api.services.IoException {
        delegate.deleteUsers();
    }

    @Override
    public final net.lab1318.costume.api.models.user.UserId postUser(final net.lab1318.costume.api.models.user.User user) throws net.lab1318.costume.api.services.user.DuplicateUserException, net.lab1318.costume.api.services.IoException {
        _validatePostUserParameters(user);
        return com.google.common.base.Preconditions.checkNotNull(delegate.postUser(user), "net.lab1318.costume.api.services.user.UserCommandService.postUser: missing returnValue");
    }

    protected void _validatePostUserParameters(final net.lab1318.costume.api.models.user.User user) {
        com.google.common.base.Preconditions.checkNotNull(user, "net.lab1318.costume.api.services.user.UserCommandService.postUser: missing user");
    }

    @Override
    public final net.lab1318.costume.api.models.user.UserBookmarkId postUserBookmark(final net.lab1318.costume.api.models.user.UserBookmark userBookmark) throws net.lab1318.costume.api.services.user.DuplicateUserBookmarkException, net.lab1318.costume.api.services.IoException {
        _validatePostUserBookmarkParameters(userBookmark);
        return com.google.common.base.Preconditions.checkNotNull(delegate.postUserBookmark(userBookmark), "net.lab1318.costume.api.services.user.UserCommandService.postUserBookmark: missing returnValue");
    }

    protected void _validatePostUserBookmarkParameters(final net.lab1318.costume.api.models.user.UserBookmark userBookmark) {
        com.google.common.base.Preconditions.checkNotNull(userBookmark, "net.lab1318.costume.api.services.user.UserCommandService.postUserBookmark: missing userBookmark");
    }

    @Override
    public final void putUser(final net.lab1318.costume.api.models.user.UserId id, final net.lab1318.costume.api.models.user.User user) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException {
        _validatePutUserParameters(id, user);
        delegate.putUser(id, user);
    }

    protected void _validatePutUserParameters(final net.lab1318.costume.api.models.user.UserId id, final net.lab1318.costume.api.models.user.User user) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.UserCommandService.putUser: missing id");
        com.google.common.base.Preconditions.checkNotNull(user, "net.lab1318.costume.api.services.user.UserCommandService.putUser: missing user");
    }

    private final net.lab1318.costume.api.services.user.UserCommandService delegate;
}

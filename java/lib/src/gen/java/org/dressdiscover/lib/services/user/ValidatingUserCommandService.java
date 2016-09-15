package org.dressdiscover.lib.services.user;

@com.google.inject.Singleton
public class ValidatingUserCommandService implements org.dressdiscover.api.services.user.UserCommandService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.user.ValidatingUserCommandService.delegate");

    @com.google.inject.Inject
    public ValidatingUserCommandService(@com.google.inject.name.Named("org.dressdiscover.lib.services.user.ValidatingUserCommandService.delegate") org.dressdiscover.api.services.user.UserCommandService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final void deleteUserBookmarkById(final org.dressdiscover.api.models.user.UserBookmarkId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserBookmarkException {
        _validateDeleteUserBookmarkByIdParameters(id);
        delegate.deleteUserBookmarkById(id);
    }

    protected void _validateDeleteUserBookmarkByIdParameters(final org.dressdiscover.api.models.user.UserBookmarkId id) {
        org.dressdiscover.api.services.user.UserCommandService.Messages.DeleteUserBookmarkByIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    @Override
    public final void deleteUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        _validateDeleteUserByIdParameters(id);
        delegate.deleteUserById(id);
    }

    protected void _validateDeleteUserByIdParameters(final org.dressdiscover.api.models.user.UserId id) {
        org.dressdiscover.api.services.user.UserCommandService.Messages.DeleteUserByIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    @Override
    public final void deleteUsers() throws org.dressdiscover.api.services.IoException {
        delegate.deleteUsers();
    }

    @Override
    public final org.dressdiscover.api.models.user.UserId postUser(final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.user.DuplicateUserException, org.dressdiscover.api.services.IoException {
        _validatePostUserParameters(user);
        return org.dressdiscover.api.services.user.UserCommandService.Messages.PostUserResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.postUser(user));
    }

    protected void _validatePostUserParameters(final org.dressdiscover.api.models.user.User user) {
        org.dressdiscover.api.services.user.UserCommandService.Messages.PostUserRequest.DefaultConstructionValidator.getInstance().validateUser(user);
    }

    @Override
    public final org.dressdiscover.api.models.user.UserBookmarkId postUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) throws org.dressdiscover.api.services.user.DuplicateUserBookmarkException, org.dressdiscover.api.services.IoException {
        _validatePostUserBookmarkParameters(userBookmark);
        return org.dressdiscover.api.services.user.UserCommandService.Messages.PostUserBookmarkResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.postUserBookmark(userBookmark));
    }

    protected void _validatePostUserBookmarkParameters(final org.dressdiscover.api.models.user.UserBookmark userBookmark) {
        org.dressdiscover.api.services.user.UserCommandService.Messages.PostUserBookmarkRequest.DefaultConstructionValidator.getInstance().validateUserBookmark(userBookmark);
    }

    @Override
    public final void putUser(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        _validatePutUserParameters(id, user);
        delegate.putUser(id, user);
    }

    protected void _validatePutUserParameters(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) {
        org.dressdiscover.api.services.user.UserCommandService.Messages.PutUserRequest.DefaultConstructionValidator.getInstance().validateId(id);
        org.dressdiscover.api.services.user.UserCommandService.Messages.PutUserRequest.DefaultConstructionValidator.getInstance().validateUser(user);
    }

    private final org.dressdiscover.api.services.user.UserCommandService delegate;
}

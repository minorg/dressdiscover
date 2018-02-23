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
        org.dressdiscover.api.services.user.UserCommandService.Messages.DeleteUserBookmarkByIdRequest.UncheckedValidator.validate(id);
        delegate.deleteUserBookmarkById(id);
    }

    @Override
    public final void deleteUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        org.dressdiscover.api.services.user.UserCommandService.Messages.DeleteUserByIdRequest.UncheckedValidator.validate(id);
        delegate.deleteUserById(id);
    }

    @Override
    public final void deleteUsers() throws org.dressdiscover.api.services.IoException {
        delegate.deleteUsers();
    }

    @Override
    public final org.dressdiscover.api.models.user.UserId postUser(final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.user.DuplicateUserException, org.dressdiscover.api.services.IoException {
        org.dressdiscover.api.services.user.UserCommandService.Messages.PostUserRequest.UncheckedValidator.validate(user);
        final org.dressdiscover.api.models.user.UserId __returnValue = delegate.postUser(user);
        org.dressdiscover.api.services.user.UserCommandService.Messages.PostUserResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    @Override
    public final org.dressdiscover.api.models.user.UserBookmarkId postUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) throws org.dressdiscover.api.services.user.DuplicateUserBookmarkException, org.dressdiscover.api.services.IoException {
        org.dressdiscover.api.services.user.UserCommandService.Messages.PostUserBookmarkRequest.UncheckedValidator.validate(userBookmark);
        final org.dressdiscover.api.models.user.UserBookmarkId __returnValue = delegate.postUserBookmark(userBookmark);
        org.dressdiscover.api.services.user.UserCommandService.Messages.PostUserBookmarkResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    @Override
    public final void putUser(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        org.dressdiscover.api.services.user.UserCommandService.Messages.PutUserRequest.UncheckedValidator.validate(id, user);
        delegate.putUser(id, user);
    }

    private final org.dressdiscover.api.services.user.UserCommandService delegate;
}

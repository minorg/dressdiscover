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
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserCommandService.deleteUserBookmarkById: id is missing");
            }
        }
        delegate.deleteUserBookmarkById(id);
    }

    @Override
    public final void deleteUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserCommandService.deleteUserById: id is missing");
            }
        }
        delegate.deleteUserById(id);
    }

    @Override
    public final void deleteUsers() throws org.dressdiscover.api.services.IoException {

        delegate.deleteUsers();
    }

    @Override
    public final org.dressdiscover.api.models.user.UserId postUser(final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.user.DuplicateUserException, org.dressdiscover.api.services.IoException {
        {
            if (user == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserCommandService.postUser: user is missing");
            }
        }
        final org.dressdiscover.api.models.user.UserId __returnValue = delegate.postUser(user);
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserCommandService.postUser: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    @Override
    public final org.dressdiscover.api.models.user.UserBookmarkId postUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) throws org.dressdiscover.api.services.user.DuplicateUserBookmarkException, org.dressdiscover.api.services.IoException {
        {
            if (userBookmark == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserCommandService.postUserBookmark: userBookmark is missing");
            }
        }
        final org.dressdiscover.api.models.user.UserBookmarkId __returnValue = delegate.postUserBookmark(userBookmark);
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserCommandService.postUserBookmark: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    @Override
    public final void putUser(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserCommandService.putUser: id is missing");
            }
        }
        {
            if (user == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserCommandService.putUser: user is missing");
            }
        }
        delegate.putUser(id, user);
    }

    private final org.dressdiscover.api.services.user.UserCommandService delegate;
}

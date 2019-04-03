package org.dressdiscover.lib.services.user;

@com.google.inject.Singleton
public class ValidatingUserQueryService implements org.dressdiscover.api.services.user.UserQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("org.dressdiscover.lib.services.user.ValidatingUserQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingUserQueryService(@com.google.inject.name.Named("org.dressdiscover.lib.services.user.ValidatingUserQueryService.delegate") org.dressdiscover.api.services.user.UserQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> getUserBookmarksByUserId(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        {
            if (userId == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserBookmarksByUserId: userId is missing");
            }
        }
        {
            if (objectIdsOnly == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserBookmarksByUserId: objectIdsOnly is missing");
            }
        }
        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> __returnValue = delegate.getUserBookmarksByUserId(userId, objectIdsOnly);
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserBookmarksByUserId: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    @Override
    public final org.dressdiscover.api.models.user.UserEntry getUserByEmailAddress(final String emailAddress) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        {
            if (emailAddress == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserByEmailAddress: emailAddress is missing");
            }
            if (!emailAddress.matches("[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}\\@[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}(\\.[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25})+")) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserByEmailAddress: emailAddress: not a valid email address");
            }
            if (emailAddress.isEmpty()) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserByEmailAddress: emailAddress: less than min length 1");
            }
            {
                final int __strLen = emailAddress.length();
                boolean __blank = true;
                for (int i = 0; i < __strLen; i++) {
                    if (!Character.isWhitespace(emailAddress.charAt(i))) {
                        __blank = false;
                        break;
                    }
                }
                if (__blank) {
                    throw new org.thryft.ThryftValidationException(String.format("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserByEmailAddress: emailAddress: blank '%s' (length=%d)", emailAddress, __strLen));
                }
            }
        }
        final org.dressdiscover.api.models.user.UserEntry __returnValue = delegate.getUserByEmailAddress(emailAddress);
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserByEmailAddress: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    @Override
    public final org.dressdiscover.api.models.user.User getUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        {
            if (id == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserById: id is missing");
            }
        }
        final org.dressdiscover.api.models.user.User __returnValue = delegate.getUserById(id);
        {
            if (__returnValue == null) {
                throw new org.thryft.ThryftValidationException("org.dressdiscover.api.services.user.ValidatingUserQueryService.getUserById: __returnValue is missing");
            }
        }
        return __returnValue;
    }

    private final org.dressdiscover.api.services.user.UserQueryService delegate;
}

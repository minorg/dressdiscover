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
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserBookmarksByUserIdRequest.UncheckedValidator.validate(userId, objectIdsOnly);
        final com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> __returnValue = delegate.getUserBookmarksByUserId(userId, objectIdsOnly);
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserBookmarksByUserIdResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    @Override
    public final org.dressdiscover.api.models.user.UserEntry getUserByEmailAddress(final String emailAddress) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserByEmailAddressRequest.UncheckedValidator.validate(emailAddress);
        final org.dressdiscover.api.models.user.UserEntry __returnValue = delegate.getUserByEmailAddress(emailAddress);
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserByEmailAddressResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    @Override
    public final org.dressdiscover.api.models.user.User getUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserByIdRequest.UncheckedValidator.validate(id);
        final org.dressdiscover.api.models.user.User __returnValue = delegate.getUserById(id);
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserByIdResponse.UncheckedValidator.validateReturnValue(__returnValue);
        return __returnValue;
    }

    private final org.dressdiscover.api.services.user.UserQueryService delegate;
}

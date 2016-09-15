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
        _validateGetUserBookmarksByUserIdParameters(userId, objectIdsOnly);
        return org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserBookmarksByUserIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getUserBookmarksByUserId(userId, objectIdsOnly));
    }

    protected void _validateGetUserBookmarksByUserIdParameters(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserBookmarksByUserIdRequest.DefaultConstructionValidator.getInstance().validateUserId(userId);
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserBookmarksByUserIdRequest.DefaultConstructionValidator.getInstance().validateObjectIdsOnly(objectIdsOnly);
    }

    @Override
    public final org.dressdiscover.api.models.user.UserEntry getUserByEmailAddress(final org.thryft.native_.EmailAddress emailAddress) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        _validateGetUserByEmailAddressParameters(emailAddress);
        return org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserByEmailAddressResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getUserByEmailAddress(emailAddress));
    }

    protected void _validateGetUserByEmailAddressParameters(final org.thryft.native_.EmailAddress emailAddress) {
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserByEmailAddressRequest.DefaultConstructionValidator.getInstance().validateEmailAddress(emailAddress);
    }

    @Override
    public final org.dressdiscover.api.models.user.User getUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        _validateGetUserByIdParameters(id);
        return org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserByIdResponse.DefaultConstructionValidator.getInstance().validateReturnValue(delegate.getUserById(id));
    }

    protected void _validateGetUserByIdParameters(final org.dressdiscover.api.models.user.UserId id) {
        org.dressdiscover.api.services.user.UserQueryService.Messages.GetUserByIdRequest.DefaultConstructionValidator.getInstance().validateId(id);
    }

    private final org.dressdiscover.api.services.user.UserQueryService delegate;
}

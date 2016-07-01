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
        return com.google.common.base.Preconditions.checkNotNull(delegate.getUserBookmarksByUserId(userId, objectIdsOnly), "org.dressdiscover.api.services.user.UserQueryService.getUserBookmarksByUserId: missing returnValue");
    }

    protected void _validateGetUserBookmarksByUserIdParameters(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
        com.google.common.base.Preconditions.checkNotNull(userId, "org.dressdiscover.api.services.user.UserQueryService.getUserBookmarksByUserId: missing userId");
        com.google.common.base.Preconditions.checkNotNull(objectIdsOnly, "org.dressdiscover.api.services.user.UserQueryService.getUserBookmarksByUserId: missing objectIdsOnly");
    }

    @Override
    public final org.dressdiscover.api.models.user.UserEntry getUserByEmailAddress(final org.thryft.native_.EmailAddress emailAddress) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        _validateGetUserByEmailAddressParameters(emailAddress);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getUserByEmailAddress(emailAddress), "org.dressdiscover.api.services.user.UserQueryService.getUserByEmailAddress: missing returnValue");
    }

    protected void _validateGetUserByEmailAddressParameters(final org.thryft.native_.EmailAddress emailAddress) {
        com.google.common.base.Preconditions.checkNotNull(emailAddress, "org.dressdiscover.api.services.user.UserQueryService.getUserByEmailAddress: missing emailAddress");
    }

    @Override
    public final org.dressdiscover.api.models.user.User getUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        _validateGetUserByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getUserById(id), "org.dressdiscover.api.services.user.UserQueryService.getUserById: missing returnValue");
    }

    protected void _validateGetUserByIdParameters(final org.dressdiscover.api.models.user.UserId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "org.dressdiscover.api.services.user.UserQueryService.getUserById: missing id");
    }

    private final org.dressdiscover.api.services.user.UserQueryService delegate;
}

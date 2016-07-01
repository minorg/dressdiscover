package org.dressdiscover.lib.services.user;

@com.google.inject.Singleton
public class ValidatingUserQueryService implements net.lab1318.costume.api.services.user.UserQueryService {
    public final static com.google.inject.name.Named DELEGATE_NAME = com.google.inject.name.Names.named("net.lab1318.costume.lib.services.user.ValidatingUserQueryService.delegate");

    @com.google.inject.Inject
    public ValidatingUserQueryService(@com.google.inject.name.Named("net.lab1318.costume.lib.services.user.ValidatingUserQueryService.delegate") net.lab1318.costume.api.services.user.UserQueryService delegate) {
        this.delegate = com.google.common.base.Preconditions.checkNotNull(delegate);
    }

    @Override
    public final com.google.common.collect.ImmutableList<net.lab1318.costume.api.models.user.UserBookmarkEntry> getUserBookmarksByUserId(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException {
        _validateGetUserBookmarksByUserIdParameters(userId, objectIdsOnly);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getUserBookmarksByUserId(userId, objectIdsOnly), "net.lab1318.costume.api.services.user.UserQueryService.getUserBookmarksByUserId: missing returnValue");
    }

    protected void _validateGetUserBookmarksByUserIdParameters(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) {
        com.google.common.base.Preconditions.checkNotNull(userId, "net.lab1318.costume.api.services.user.UserQueryService.getUserBookmarksByUserId: missing userId");
        com.google.common.base.Preconditions.checkNotNull(objectIdsOnly, "net.lab1318.costume.api.services.user.UserQueryService.getUserBookmarksByUserId: missing objectIdsOnly");
    }

    @Override
    public final net.lab1318.costume.api.models.user.UserEntry getUserByEmailAddress(final org.thryft.native_.EmailAddress emailAddress) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException {
        _validateGetUserByEmailAddressParameters(emailAddress);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getUserByEmailAddress(emailAddress), "net.lab1318.costume.api.services.user.UserQueryService.getUserByEmailAddress: missing returnValue");
    }

    protected void _validateGetUserByEmailAddressParameters(final org.thryft.native_.EmailAddress emailAddress) {
        com.google.common.base.Preconditions.checkNotNull(emailAddress, "net.lab1318.costume.api.services.user.UserQueryService.getUserByEmailAddress: missing emailAddress");
    }

    @Override
    public final net.lab1318.costume.api.models.user.User getUserById(final org.dressdiscover.api.models.user.UserId id) throws net.lab1318.costume.api.services.IoException, net.lab1318.costume.api.services.user.NoSuchUserException {
        _validateGetUserByIdParameters(id);
        return com.google.common.base.Preconditions.checkNotNull(delegate.getUserById(id), "net.lab1318.costume.api.services.user.UserQueryService.getUserById: missing returnValue");
    }

    protected void _validateGetUserByIdParameters(final org.dressdiscover.api.models.user.UserId id) {
        com.google.common.base.Preconditions.checkNotNull(id, "net.lab1318.costume.api.services.user.UserQueryService.getUserById: missing id");
    }

    private final net.lab1318.costume.api.services.user.UserQueryService delegate;
}

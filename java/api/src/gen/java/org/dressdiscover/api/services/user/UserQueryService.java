package org.dressdiscover.api.services.user;

public interface UserQueryService {
    public enum FunctionMetadata {
        GET_USER_BOOKMARKS_BY_USER_ID("get_user_bookmarks_by_user_id"),
        GET_USER_BY_EMAIL_ADDRESS("get_user_by_email_address"),
        GET_USER_BY_ID("get_user_by_id");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public default com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> getUserBookmarksByUserId(final org.dressdiscover.api.models.user.UserId userId) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException {
        return getUserBookmarksByUserId(userId, com.google.common.base.Optional.<Boolean> absent());
    }

    public com.google.common.collect.ImmutableList<org.dressdiscover.api.models.user.UserBookmarkEntry> getUserBookmarksByUserId(final org.dressdiscover.api.models.user.UserId userId, final com.google.common.base.Optional<Boolean> objectIdsOnly) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;

    public org.dressdiscover.api.models.user.UserEntry getUserByEmailAddress(final String emailAddress) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;

    public org.dressdiscover.api.models.user.User getUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;
}

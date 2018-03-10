package org.dressdiscover.api.services.user;

public interface UserCommandService {
    public enum FunctionMetadata {
        DELETE_USER_BOOKMARK_BY_ID("delete_user_bookmark_by_id"),
        DELETE_USER_BY_ID("delete_user_by_id"),
        DELETE_USERS("delete_users"),
        POST_USER("post_user"),
        POST_USER_BOOKMARK("post_user_bookmark"),
        PUT_USER("put_user");

        public String getThriftName() {
            return thriftName;
        }

        private FunctionMetadata(final String thriftName) {
            this.thriftName = thriftName;
        }

        private final String thriftName;
    }

    public void deleteUserBookmarkById(final org.dressdiscover.api.models.user.UserBookmarkId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserBookmarkException;

    public void deleteUserById(final org.dressdiscover.api.models.user.UserId id) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;

    public void deleteUsers() throws org.dressdiscover.api.services.IoException;

    public org.dressdiscover.api.models.user.UserId postUser(final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.user.DuplicateUserException, org.dressdiscover.api.services.IoException;

    public org.dressdiscover.api.models.user.UserBookmarkId postUserBookmark(final org.dressdiscover.api.models.user.UserBookmark userBookmark) throws org.dressdiscover.api.services.user.DuplicateUserBookmarkException, org.dressdiscover.api.services.IoException;

    public void putUser(final org.dressdiscover.api.models.user.UserId id, final org.dressdiscover.api.models.user.User user) throws org.dressdiscover.api.services.IoException, org.dressdiscover.api.services.user.NoSuchUserException;
}

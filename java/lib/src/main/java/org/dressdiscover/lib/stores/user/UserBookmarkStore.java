package org.dressdiscover.lib.stores.user;

import org.dressdiscover.api.models.user.UserBookmark;
import org.dressdiscover.api.models.user.UserBookmarkEntry;
import org.dressdiscover.api.models.user.UserBookmarkId;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.user.DuplicateUserBookmarkException;
import org.dressdiscover.api.services.user.NoSuchUserBookmarkException;
import org.slf4j.Marker;

import com.google.common.collect.ImmutableList;

public interface UserBookmarkStore {
    public void deleteUserBookmarkById(Marker logMarker, UserBookmarkId userBookmarkId)
            throws IoException, NoSuchUserBookmarkException;

    public ImmutableList<UserBookmarkEntry> getUserBookmarksByUserId(Marker logMarker, boolean objectIdsOnly,
            UserId userId) throws IoException;

    public UserBookmarkId postUserBookmark(final Marker logMarker, final UserBookmark userBookmark)
            throws DuplicateUserBookmarkException, IoException;
}

package net.lab1318.costume.lib.stores.user;

import org.slf4j.Logger;
import org.slf4j.Marker;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.UserBookmark;
import net.lab1318.costume.api.models.user.UserBookmarkEntry;
import net.lab1318.costume.api.models.user.UserBookmarkId;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.NoSuchUserBookmarkException;

public interface UserBookmarkStore {
    public void deleteUserBookmarkById(Logger logger, Marker logMarker, UserBookmarkId userBookmarkId)
            throws IoException, NoSuchUserBookmarkException;

    public ImmutableList<UserBookmarkEntry> getUserBookmarksByUserId(Logger logger, Marker logMarker, UserId userId)
            throws IoException;

    public UserBookmarkId postUserBookmark(final Logger logger, final Marker logMarker, final UserBookmark userBookmark)
            throws IoException;
}

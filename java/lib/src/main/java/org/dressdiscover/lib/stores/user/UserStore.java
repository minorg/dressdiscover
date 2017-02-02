package org.dressdiscover.lib.stores.user;

import org.dressdiscover.api.models.user.User;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.user.NoSuchUserException;
import org.slf4j.Marker;

import com.google.common.collect.ImmutableList;

public interface UserStore {
    public void deleteUserById(Marker logMarker, UserId userId) throws IoException, NoSuchUserException;

    public void deleteUsers(Marker logMarker) throws IoException;

    public UserEntry getUserByEmailAddress(final String emailAddress, final Marker logMarker)
            throws IoException, NoSuchUserException;

    public User getUserById(final Marker logMarker, final UserId userId) throws IoException, NoSuchUserException;

    public ImmutableList<UserEntry> getUsers(final Marker logMarker) throws IoException;

    public UserId postUser(final Marker logMarker, final User user) throws IoException;

    public void putUser(final Marker logMarker, final User user, final UserId userId)
            throws IoException, NoSuchUserException;
}

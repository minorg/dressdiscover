package org.dressdiscover.lib.stores.user;

import org.dressdiscover.api.models.user.User;
import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.api.models.user.UserId;
import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.user.NoSuchUserException;
import org.slf4j.Logger;
import org.slf4j.Marker;

import com.google.common.collect.ImmutableList;

public interface UserStore {
    public void deleteUserById(Logger logger, Marker logMarker, UserId userId) throws IoException, NoSuchUserException;

    public void deleteUsers(Logger logger, Marker logMarker) throws IoException;

    public UserEntry getUserByEmailAddress(final String emailAddress, final Logger logger, final Marker logMarker)
            throws IoException, NoSuchUserException;

    public User getUserById(final Logger logger, final Marker logMarker, final UserId userId)
            throws IoException, NoSuchUserException;

    public ImmutableList<UserEntry> getUsers(final Logger logger, final Marker logMarker) throws IoException;

    public UserId postUser(final Logger logger, final Marker logMarker, final User user) throws IoException;

    public void putUser(final Logger logger, final Marker logMarker, final User user, final UserId userId)
            throws IoException, NoSuchUserException;
}

package net.lab1318.costume.lib.stores.user;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.native_.EmailAddress;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.NoSuchUserException;

public interface UserStore {
    public void deleteUserById(Logger logger, Marker logMarker, UserId userId) throws IoException, NoSuchUserException;

    public void deleteUsers(Logger logger, Marker logMarker) throws IoException;

    public UserEntry getUserByEmailAddress(final EmailAddress emailAddress, final Logger logger, final Marker logMarker)
            throws IoException, NoSuchUserException;

    public User getUserById(final Logger logger, final Marker logMarker, final UserId userId)
            throws IoException, NoSuchUserException;

    public ImmutableList<UserEntry> getUsers(final Logger logger, final Marker logMarker) throws IoException;

    public UserId postUser(final Logger logger, final Marker logMarker, final User user) throws IoException;

    public void putUser(final Logger logger, final Marker logMarker, final User user, final UserId userId)
            throws IoException, NoSuchUserException;
}

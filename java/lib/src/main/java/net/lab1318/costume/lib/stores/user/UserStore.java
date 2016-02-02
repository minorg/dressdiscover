package net.lab1318.costume.lib.stores.user;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.native_.EmailAddress;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;

public interface UserStore {
    public boolean deleteUserById(UserId userId, Logger logger, Marker logMarker) throws IOException;

    public void deleteUsers(Logger logger, Marker logMarker) throws IOException;

    public UserEntry getUserByEmailAddress(final EmailAddress emailAddress, final Logger logger, final Marker logMarker)
            throws InvalidModelException, IOException, NoSuchModelException;

    public User getUserById(final UserId userId, final Logger logger, final Marker logMarker)
            throws InvalidModelException, IOException, NoSuchModelException;

    public ImmutableList<UserEntry> getUsers(final Logger logger, final Marker logMarker) throws IOException;

    public UserId postUser(final User user, final Logger logger, final Marker logMarker) throws IOException;

    public void putUser(final User user, final UserId userId, final Logger logger, final Marker logMarker)
            throws IOException, NoSuchModelException;
}

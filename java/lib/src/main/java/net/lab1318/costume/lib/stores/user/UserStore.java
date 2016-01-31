package net.lab1318.costume.lib.stores.user;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.Marker;
import org.thryft.waf.lib.stores.InvalidModelException;
import org.thryft.waf.lib.stores.NoSuchModelException;

import com.google.common.collect.ImmutableList;

import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;

public interface UserStore {
    public boolean deleteUserById(UserId collectionId, Logger logger, Marker logMarker) throws IOException;

    public void deleteUsers(Logger logger, Marker logMarker) throws IOException;

    public User getUserById(final UserId collectionId, final Logger logger, final Marker logMarker)
            throws InvalidModelException, IOException, NoSuchModelException;

    public ImmutableList<UserEntry> getUsers(final Logger logger, final Marker logMarker) throws IOException;

    public void putUser(final User collection, final UserId collectionId, final Logger logger, final Marker logMarker)
            throws IOException;
}

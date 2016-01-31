package net.lab1318.costume.lib.services.user;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.UserQueryService;

public interface IterableUserQueryService extends UserQueryService {
    public final static class Markers extends LoggingUserQueryService.Markers {
        public final static Marker GET_USERS = MarkerFactory.getMarker("GET_USERS");

        static {
            USER_QUERY_SERVICE.add(GET_USERS);
        }
    }

    public Iterable<UserEntry> getUsers() throws IoException;
}

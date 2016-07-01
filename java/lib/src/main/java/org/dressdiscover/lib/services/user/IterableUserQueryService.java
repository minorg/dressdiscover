package org.dressdiscover.lib.services.user;

import org.dressdiscover.api.models.user.UserEntry;
import org.dressdiscover.lib.services.user.LoggingUserQueryService;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

import org.dressdiscover.api.services.IoException;
import org.dressdiscover.api.services.user.UserQueryService;

public interface IterableUserQueryService extends UserQueryService {
    public final static class Markers extends LoggingUserQueryService.Markers {
        public final static Marker GET_USERS = MarkerFactory.getMarker("GET_USERS");

        static {
            USER_QUERY_SERVICE.add(GET_USERS);
        }
    }

    public Iterable<UserEntry> getUsers() throws IoException;
}

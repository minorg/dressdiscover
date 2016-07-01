package org.dressdiscover.api.models.user;

import org.thryft.waf.api.models.IntegerModelId;

import net.lab1318.costume.api.models.user.InvalidUserBookmarkIdException;

public final class UserBookmarkId extends IntegerModelId {
    public static UserBookmarkId parse(final String value) throws InvalidUserBookmarkIdException {
        try {
            return new UserBookmarkId(Integer.parseInt(value));
        } catch (final IllegalArgumentException e) {
            throw new InvalidUserBookmarkIdException("not an integer");
        }
    }

    public UserBookmarkId(final int value) {
        super(value);
    }
}

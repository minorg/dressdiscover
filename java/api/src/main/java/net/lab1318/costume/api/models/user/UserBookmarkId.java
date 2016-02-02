package net.lab1318.costume.api.models.user;

import org.thryft.waf.api.models.IntegerModelId;

public final class UserBookmarkId extends IntegerModelId {
    public static UserBookmarkId parse(final String value) throws InvalidUserIdException {
        try {
            return new UserBookmarkId(Integer.parseInt(value));
        } catch (final IllegalArgumentException e) {
            throw new InvalidUserIdException("not an integer");
        }
    }

    public UserBookmarkId(final int value) {
        super(value);
    }
}

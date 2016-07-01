package org.dressdiscover.api.models.user;

import org.thryft.waf.api.models.IntegerModelId;

import org.dressdiscover.api.models.user.InvalidUserIdException;

public final class UserId extends IntegerModelId {
    public static UserId parse(final String value) throws InvalidUserIdException {
        try {
            return new UserId(Integer.parseInt(value));
        } catch (final IllegalArgumentException e) {
            throw new InvalidUserIdException("not an integer");
        }
    }

    public UserId(final int value) {
        super(value);
    }
}

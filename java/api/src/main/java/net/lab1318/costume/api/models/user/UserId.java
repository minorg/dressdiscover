package net.lab1318.costume.api.models.user;

import static com.google.common.base.Preconditions.checkArgument;

import org.thryft.waf.api.models.ModelId;

public final class UserId implements ModelId {
    public static UserId parse(final String value) throws InvalidUserIdException {
        try {
            return new UserId(Integer.parseInt(value));
        } catch (final IllegalArgumentException e) {
            throw new InvalidUserIdException("not an integer");
        }
    }

    public UserId(final int value) {
        checkArgument(value >= 0);
        this.value = value;
    }

    public final int asInteger() {
        return value;
    }

    @Override
    public final boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UserId other = (UserId) obj;
        if (value != other.value) {
            return false;
        }
        return true;
    }

    @Override
    public final int hashCode() {
        return value;
    }

    @Override
    public final String toString() {
        return Integer.toString(value);
    }

    private final int value;
}

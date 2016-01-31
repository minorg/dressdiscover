package net.lab1318.costume.api.models.user;

import static com.google.common.base.Preconditions.checkNotNull;

import org.thryft.waf.api.models.StringModelId;

public final class UserId extends StringModelId {
    public static UserId parse(final String value) throws InvalidUserIdException {
        if (value.isEmpty()) {
            throw new InvalidUserIdException("empty string");
        }
        final String[] valueSplit = value.split("/");
        if (valueSplit.length != 2) {
            throw new InvalidUserIdException("malformed user ID: " + value);
        }
        final String authProviderId = valueSplit[0].trim();
        if (authProviderId.isEmpty()) {
            throw new InvalidUserIdException("empty provider ID: " + value);
        }
        final String unqualifiedUserId = valueSplit[1].trim();
        if (unqualifiedUserId.isEmpty()) {
            throw new InvalidUserIdException("empty user ID: " + value);
        }
        return new UserId(authProviderId, unqualifiedUserId, value);
    }

    private UserId(final String authProviderId, final String unqualifiedUserId, final String value) {
        super(value);
        this.authProviderId = checkNotNull(authProviderId);
        this.unqualifiedUserId = checkNotNull(unqualifiedUserId);
    }

    public String getAuthProviderId() {
        return authProviderId;
    }

    public String getUnqualifiedUserId() {
        return unqualifiedUserId;
    }

    private final String authProviderId;
    private final String unqualifiedUserId;
}

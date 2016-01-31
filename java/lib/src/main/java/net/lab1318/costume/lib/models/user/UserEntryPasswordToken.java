package net.lab1318.costume.lib.models.user;

import static com.google.common.base.Preconditions.checkNotNull;

import org.apache.shiro.authc.UsernamePasswordToken;

import net.lab1318.costume.api.models.user.UserEntry;

@SuppressWarnings("serial")
public class UserEntryPasswordToken extends UsernamePasswordToken {
    public UserEntryPasswordToken(final char[] password, final UserEntry userEntry) {
        super(userEntry.getId().toString(), checkNotNull(password), true);
        this.userEntry = checkNotNull(userEntry);
    }

    public UserEntry getUserEntry() {
        return userEntry;
    }

    private final UserEntry userEntry;
}

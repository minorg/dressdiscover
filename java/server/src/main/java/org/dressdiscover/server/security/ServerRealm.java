package org.dressdiscover.server.security;

import java.util.Collection;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.pam.UnsupportedTokenException;
import org.apache.shiro.authz.Permission;
import org.apache.shiro.realm.AuthenticatingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.SimplePrincipalCollection;
import org.dressdiscover.lib.models.user.UserEntryPasswordToken;

import com.google.common.base.MoreObjects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.inject.Singleton;

import org.dressdiscover.api.models.user.UserEntry;

@Singleton
public class ServerRealm extends AuthenticatingRealm {
    @SuppressWarnings("serial")
    public final static class Account implements org.apache.shiro.authc.Account {
        public Account(final UserEntry userEntry) {
            credentials = EMPTY_CREDENTIALS;
            principals = new SimplePrincipalCollection(userEntry.getId().toString(), NAME);
        }

        @Override
        public Object getCredentials() {
            return credentials;
        }

        @Override
        public Collection<Permission> getObjectPermissions() {
            return ImmutableSet.of();
        }

        @Override
        public PrincipalCollection getPrincipals() {
            return principals;
        }

        @Override
        public Collection<String> getRoles() {
            return ImmutableList.of();
        }

        @Override
        public Collection<String> getStringPermissions() {
            return ImmutableSet.of();
        }

        @Override
        public String toString() {
            return MoreObjects.toStringHelper(this).add("userId", principals.getPrimaryPrincipal()).toString();
        }

        private final char[] credentials;

        private final SimplePrincipalCollection principals;

        private final static char[] EMPTY_CREDENTIALS = new char[0];
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public boolean supports(final AuthenticationToken token) {
        return token instanceof UserEntryPasswordToken;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(final AuthenticationToken token)
            throws AuthenticationException {
        if (!(token instanceof UserEntryPasswordToken)) {
            throw new UnsupportedTokenException();
        }

        final UserEntry userEntry = ((UserEntryPasswordToken) token).getUserEntry();

        return new Account(userEntry);
    }

    public final static String NAME = "costume";
}

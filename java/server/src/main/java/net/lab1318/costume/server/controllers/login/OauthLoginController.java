package net.lab1318.costume.server.controllers.login;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Date;

import org.apache.shiro.SecurityUtils;
import org.thryft.waf.server.controllers.oauth.AbstractOauthLoginController;
import org.thryft.waf.server.controllers.oauth.GoogleOauthServiceProvider;
import org.thryft.waf.server.controllers.oauth.OauthUserProfile;

import com.google.common.base.Optional;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;

import net.lab1318.costume.api.models.ModelMetadata;
import net.lab1318.costume.api.models.user.InvalidUserIdException;
import net.lab1318.costume.api.models.user.User;
import net.lab1318.costume.api.models.user.UserEntry;
import net.lab1318.costume.api.models.user.UserId;
import net.lab1318.costume.api.services.IoException;
import net.lab1318.costume.api.services.user.NoSuchUserException;
import net.lab1318.costume.api.services.user.UserCommandService;
import net.lab1318.costume.api.services.user.UserQueryService;
import net.lab1318.costume.lib.CostumeProperties;
import net.lab1318.costume.lib.models.user.UserEntryPasswordToken;

@SuppressWarnings("serial")
@Singleton
public class OauthLoginController extends AbstractOauthLoginController<UserEntry> {
    @Inject
    public OauthLoginController(final CostumeProperties properties, final UserCommandService userCommandService,
            final UserQueryService userQueryService) {
        super(ImmutableMap.of("google",
                new GoogleOauthServiceProvider(properties.getGoogleOauthKey(), properties.getGoogleOauthSecret())));
        this.userCommandService = checkNotNull(userCommandService);
        this.userQueryService = checkNotNull(userQueryService);
    }

    @Override
    protected final String _getFailedLoginUrl(final String errorUrlCoded, final String stateParameterUrlDecoded) {
        return "/";
    }

    @Override
    protected final String _getNewLoginUrl(final String stateParameterUrlDecoded) {
        return _getSuccessfulLoginUrl(stateParameterUrlDecoded);
    }

    @Override
    protected String _getOauthCallbackUrlPathPrefix() {
        return "/api/oauth2/";
    }

    @Override
    protected Optional<String> _getOauthCallbackUrlScheme() {
        return Optional.absent();
    }

    @Override
    protected final String _getSuccessfulLoginUrl(final String stateParameterUrlDecoded) {
        if (stateParameterUrlDecoded == null || stateParameterUrlDecoded.isEmpty()) {
            return "/";
        }
        try {
            return "/#!" + URLEncoder.encode(stateParameterUrlDecoded, "ASCII");
        } catch (final UnsupportedEncodingException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override
    protected Optional<UserEntry> _getUser(final String providerId, final OauthUserProfile userProfile)
            throws IOException {
        try {
            final UserId userId = __getUserId(providerId, userProfile);
            return Optional.of(new UserEntry(userId, userQueryService.getUserById(userId)));
        } catch (final IoException e) {
            throw new IOException(e);
        } catch (final NoSuchUserException e) {
            return Optional.absent();
        }
    }

    @Override
    protected void _login(final UserEntry userEntry) {
        SecurityUtils.getSubject().login(new UserEntryPasswordToken(EMPTY_CHAR_ARRAY, userEntry));
    }

    @Override
    protected UserEntry _postUser(final String providerId, final OauthUserProfile userProfile) throws IOException {
        final User.Builder userBuilder = User.builder();
        final Date currentDate = new Date();
        userBuilder.setEmailAddress(userProfile.getEmailAddress());
        userBuilder.setModelMetadata(ModelMetadata.builder().setCtime(currentDate).setMtime(currentDate).build());
        final UserId userId = __getUserId(providerId, userProfile);
        try {
            userCommandService.putUser(userId, userBuilder.build());
            try {
                return new UserEntry(userId, userQueryService.getUserById(userId));
            } catch (final NoSuchUserException e) {
                throw new IllegalStateException(e);
            }
        } catch (final IoException e) {
            throw new IOException(e);
        }
    }

    private UserId __getUserId(final String providerId, final OauthUserProfile userProfile) {
        try {
            return UserId.parse(providerId + '/' + userProfile.getUsername());
        } catch (final InvalidUserIdException e) {
            throw new IllegalStateException(e);
        }
    }

    private final UserCommandService userCommandService;
    private final UserQueryService userQueryService;
    private final static char[] EMPTY_CHAR_ARRAY = new char[0];
}

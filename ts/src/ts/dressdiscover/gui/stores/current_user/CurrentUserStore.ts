import { Auth0DecodedHash, Auth0Error, WebAuth } from 'auth0-js';
import { User } from 'dressdiscover/api/models/user/user';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { Hrefs } from 'dressdiscover/gui/Hrefs';
import { CurrentUser } from 'dressdiscover/gui/models/current_user/CurrentUser';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import { Services } from 'dressdiscover/gui/services/Services';
import { ILogger } from 'dressdiscover/gui/util/logging/ILogger';
import * as invariant from 'invariant';
import { action, computed, observable, runInAction } from 'mobx';

export class CurrentUserStore {
    private readonly auth0: WebAuth;

    @observable.ref currentUser?: CurrentUser | null;
    @observable.ref error?: Auth0Error | Error | null;

    constructor(private readonly logger: ILogger) {
        this.auth0 = new WebAuth({
            clientID: "m32ET2Qx-y5NEXtgQV9Vffk_5D4j3lrf",
            domain: "dressdiscover.auth0.com",
            redirectUri: window.location.protocol + "//" + window.location.host + Hrefs.loginCallback,
            responseType: "token id_token",
            scope: "email openid profile"
        });

        runInAction("construction", () => {
            const hashString = localStorage.getItem(CurrentUserStore.CURRENT_USER_AUTH0_DECODED_HASH_KEY);
            if (hashString) {
                logger.debug("retrieved current user hash from local storage");
                this.setCurrentUserFromAuthResult(JSON.parse(hashString) as Auth0DecodedHash, false);
            } else {
                this.clearCurrentUser();
            }

            this.clearError();
        });
    }

    @computed
    get currentUserServices() {
        if (this.currentUser != null) {
            return this.currentUser.services;
        } else {
            return Services.default;
        }
    }

    @action
    handleLoginCallback() {
        this.clearError();
        this.clearCurrentUser();

        // gapi.client.setToken({ access_token: kwds.googleAccessToken });

        this.auth0.parseHash((err, authResult) => {
            if (authResult && authResult.accessToken && authResult.idToken) {
                this.setCurrentUserFromAuthResult(authResult);
            } else if (err) {
                this.setError(err);
            }
        });
    }

    @action
    handleLogoutCallback() {
    }

    @action
    renewCurrentUserSession() {
        invariant(this.currentUser, "expect existing user");

        this.auth0.checkSession({}, (err, authResult) => {
            if (authResult && authResult.accessToken && authResult.idToken) {
                this.clearError();
                this.setCurrentUser(authResult);
            } else if (err) {
                this.clearCurrentUser();
                this.setError(err);
            }
        });
    }

    @action
    setCurrentUserFromAuthResult(authResult: Auth0DecodedHash, saveToLocalStorage?: boolean) {
        if (!authResult.accessToken || !authResult.expiresIn || !authResult.idToken) {
            this.clearCurrentUser();
            this.setError(new Error("authResult has undefined fields"));
            return;
        }

        const currentUserSession = new CurrentUserSession({
            accessToken: authResult.accessToken,
            expiresAt: (authResult.expiresIn * 1000) + new Date().getTime(),
            idToken: authResult.idToken
        });

        // idTokenPayload:
        // at_hash: "..."
        // aud: "..."
        // email: "..."
        // email_verified: true
        // exp: 1549878922
        // family_name: "..."
        // given_name: "..."
        // iat: 123456
        // iss: "https://dressdiscover.auth0.com/"
        // locale: "en"
        // name: "..."
        // nickname: "..."
        // nonce: "..."
        // picture: "https://example.com/photo.jpg"
        // sub: "..."
        // updated_at: "2019-02-10T23:55:22.957Z"
        this.setCurrentUser(new CurrentUser({
            authResult,
            delegate: new User({
                emailAddress: authResult.idTokenPayload.email,
                emailAddressVerified: authResult.idTokenPayload.email_verified,
                familyName: authResult.idTokenPayload.family_name,
                givenName: authResult.idTokenPayload.given_name,
                locale: authResult.idTokenPayload.locale,
                name: authResult.idTokenPayload.name,
                nickname: authResult.idTokenPayload.nickname,
                pictureUrl: authResult.idTokenPayload.picture
            }),
            session: currentUserSession
        }));
    }

    @action
    setCurrentUserSettings(settings?: UserSettings) {
        const currentUser = this.currentUser;
        invariant(currentUser, "expected current user to be set");
        this.setCurrentUser(currentUser!.replaceSettings(settings), true);
    }

    @action
    setError(error: Auth0Error | Error) {
        this.error = error;
    }

    @action
    startLogin() {
        this.clearCurrentUser();
        this.clearError();

        this.auth0.authorize();
    }

    @action
    startLogout() {
        this.clearCurrentUser();
        this.clearError();
        this.auth0.logout({ returnTo: window.location.protocol + "//" + window.location.host + Hrefs.logoutCallback });
    }

    private clearCurrentUser() {
        this.currentUser = null;
        localStorage.removeItem(CurrentUserStore.CURRENT_USER_AUTH0_DECODED_HASH_KEY);
        this.logger.debug("cleared current user hash from local storage");
    }

    private clearError() {
        this.error = null;
    }

    private setCurrentUser(currentUser: CurrentUser, saveToLocalStorage?: boolean) {
        this.currentUser = currentUser;

        if (typeof (saveToLocalStorage) === "undefined" || saveToLocalStorage) {
            localStorage.setItem(CurrentUserStore.CURRENT_USER_AUTH0_DECODED_HASH_KEY, JSON.stringify(currentUser.authResult));
            this.logger.debug("set current user hash in local storage");
        }
    }

    private static readonly CURRENT_USER_AUTH0_DECODED_HASH_KEY = "currentUserAuth0DecodedHash";
}

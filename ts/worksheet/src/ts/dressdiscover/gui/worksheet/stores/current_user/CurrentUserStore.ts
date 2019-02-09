import { Auth0DecodedHash, Auth0Error, WebAuth } from 'auth0-js';
import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import { CurrentUser } from 'dressdiscover/gui/worksheet/models/current_user/CurrentUser';
import { CurrentUserSession } from 'dressdiscover/gui/worksheet/models/current_user/CurrentUserSession';
import * as invariant from 'invariant';
import { action, observable, runInAction } from 'mobx';

export class CurrentUserStore {
    private readonly auth0: WebAuth;

    @observable.ref currentUser?: CurrentUser | null;
    @observable.ref currentUserSession?: CurrentUserSession | null;
    @observable.ref error?: Auth0Error | Error | null;

    constructor() {
        this.auth0 = new WebAuth({
            clientID: "m32ET2Qx-y5NEXtgQV9Vffk_5D4j3lrf",
            domain: "dressdiscover.auth0.com",
            redirectUri: window.location.protocol + "//" + window.location.host + Hrefs.loginCallback,
            responseType: "token id_token",
            scope: "email openid profile"
        });

        runInAction("construction", () => {
            this.clearCurrentUser();
            this.clearError();
        });
    }

    @action
    handleLoginCallback() {
        this.clearError();
        this.clearCurrentUser();

        // gapi.client.setToken({ access_token: kwds.googleAccessToken });

        this.auth0.parseHash((err, authResult) => {
            if (authResult && authResult.accessToken && authResult.idToken) {
                this.setCurrentUserSession(authResult);
            } else if (err) {
                this.setError(err);
            }
        });
    }

    @action
    logoutCurrentUser() {
        this.clearCurrentUser();
        this.clearError();
    }

    @action
    renewCurrentUserSession() {
        invariant(this.currentUser, "expect existing user");
        invariant(this.currentUserSession, "expect existing session");

        this.auth0.checkSession({}, (err, authResult) => {
            if (authResult && authResult.accessToken && authResult.idToken) {
                this.clearError();
                this.setCurrentUserSession(authResult);
            } else if (err) {
                this.clearCurrentUser();
                this.setError(err);
            }
        });
    }

    @action
    setCurrentUserSession(authResult: Auth0DecodedHash) {
        if (!authResult.accessToken || !authResult.expiresIn || !authResult.idToken) {
            this.clearCurrentUser();
            this.setError(new Error("authResult has undefined fields"));
            return;
        }

        // idTokenPayload has many other fields
        this.currentUser = new CurrentUser({
            email: authResult.idTokenPayload.email,
            name: authResult.idTokenPayload.name
        });

        this.currentUserSession = new CurrentUserSession({
            accessToken: authResult.accessToken,
            expiresAt: (authResult.expiresIn * 1000) + new Date().getTime(),
            idToken: authResult.idToken
        });
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

    private clearCurrentUser() {
        this.currentUser = null;
        this.currentUserSession = null;
    }

    private clearError() {
        this.error = null;
    }
}

import { User } from 'dressdiscover/api/models/user/user';
import { UserIdentityProvider } from 'dressdiscover/api/models/user/user_identity_provider';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { CurrentUser } from 'dressdiscover/gui/models/current_user/CurrentUser';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import { Services } from 'dressdiscover/gui/services/Services';
import { ILogger } from 'dressdiscover/gui/util/logging/ILogger';
import * as invariant from 'invariant';
import { action, computed, observable, runInAction } from 'mobx';

export class CurrentUserStore {
    private readonly static CURRENT_USER_KEY = "currentUser";
    private readonly static USER_SETTINGS_KEY = "userSettings";

    @observable.ref currentUser?: CurrentUser | null;
    @observable.ref error?: Error | null;

    constructor(private readonly logger: ILogger) {
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
    setCurrentUserSession(currentUserSession: CurrentUserSession) {
        this.clearError();
        this.clearCurrentUser();

        gapi.client.setToken({ access_token: currentUserSession.accessToken });

        gapi.client.userinfo.get({}).then(
            (response) => {
                const result = response.result;
                this.setCurrentUser(new CurrentUser({
                    delegate: new User({
                        emailAddress: result.email as string,
                        emailAddressVerified: result.verified_email,
                        familyName: result.family_name,
                        givenName: result.given_name,
                        identityProvider: UserIdentityProvider.GOOGLE_OAUTH2,
                        identityProviderId: result.id as string,
                        locale: result.locale,
                        name: result.name,
                        pictureUrl: result.picture
                    }),
                    session: currentUserSession
                }));
            },
            (reason: any) => { this.setError(new Error(reason.toString())); });
    }

    @action
    handleLogoutCallback() {
    }

    @action
    renewCurrentUserSession() {
        invariant(this.currentUser, "expect existing user");

        // this.auth0WebAuth.checkSession({}, (err, authResult) => {
        //     if (authResult && authResult.accessToken && authResult.idToken) {
        //         this.clearError();
        //         this.setCurrentUser(authResult);
        //     } else if (err) {
        //         this.clearCurrentUser();
        //         this.setAuth0Error(err);
        //     }
        // });
    }

    // @action
    // setCurrentUserFromAuthResult(authResult: Auth0DecodedHash, saveToLocalStorage?: boolean) {
    //     if (!authResult.accessToken || !authResult.expiresIn || !authResult.idToken) {
    //         this.clearCurrentUser();
    //         this.setError(new Error("authResult has undefined fields"));
    //         return;
    //     }

    //     const currentUserSession = new CurrentUserSession({
    //         accessToken: authResult.accessToken,
    //         expiresAt: (authResult.expiresIn * 1000) + new Date().getTime(),
    //         idToken: authResult.idToken
    //     });

    //     // idTokenPayload:
    //     // at_hash: "..."
    //     // aud: "..."
    //     // email: "..."
    //     // email_verified: true
    //     // exp: 1549878922
    //     // family_name: "..."
    //     // given_name: "..."
    //     // iat: 123456
    //     // iss: "https://dressdiscover.auth0.com/"
    //     // locale: "en"
    //     // name: "..."
    //     // nickname: "..."
    //     // nonce: "..."
    //     // picture: "https://example.com/photo.jpg"
    //     // sub: "..."
    //     // updated_at: "2019-02-10T23:55:22.957Z"
    //     const subSplit = (authResult.idTokenPayload.sub as string).split("|", 2);
    //     invariant(subSplit.length === 2, "sub format");
    //     const identityProviderString = subSplit[0].toUpperCase().replace("-", "_");
    //     const identityProvider = UserIdentityProvider[identityProviderString as keyof typeof UserIdentityProvider];
    //     if (typeof (identityProvider) === "undefined") {
    //         throw new Rang
    //         eError("unexpected identity provider " + identityProviderString);
    //     }

    //     this.setCurrentUser(new CurrentUser({
    //         authResult,
    //         delegate: new User({
    //             emailAddress: authResult.idTokenPayload.email,
    //             emailAddressVerified: authResult.idTokenPayload.email_verified,
    //             familyName: authResult.idTokenPayload.family_name,
    //             givenName: authResult.idTokenPayload.given_name,
    //             identityProvider,
    //             identityProviderId: subSplit[1],
    //             locale: authResult.idTokenPayload.locale,
    //             name: authResult.idTokenPayload.name,
    //             nickname: authResult.idTokenPayload.nickname,
    //             pictureUrl: authResult.idTokenPayload.picture
    //         }),
    //         session: currentUserSession
    //     }));
    // }

    @action
    setCurrentUserSettings(settings?: UserSettings) {
        const currentUser = this.currentUser;
        invariant(currentUser, "expected current user to be set");
        this.setCurrentUser(currentUser!.replaceSettings(settings), true);
    }

    @action
    setError(error: Error) {
        this.error = error;
    }

    private clearCurrentUser() {
        this.currentUser = null;
        // localStorage.removeItem(CurrentUserStore.CURRENT_USER_AUTH0_DECODED_HASH_KEY);
        // this.logger.debug("cleared current user hash from local storage");
    }

    private clearError() {
        this.error = null;
    }

    private getUserSettings(userId: string): UserSettings | undefined {
        const allUserSettingsString = localStorage.getItem(CurrentUserStore.USER_SETTINGS_KEY);
        if (!allUserSettingsString) {
            return undefined;
        }
        const allUserSettings = JSON.parse(allUserSettingsString);
        const thisUserSettings = allUserSettings[userId];
        if (!thisUserSettings) {
            return undefined;
        }
        return UserSettings.fromThryftJsonObject(thisUserSettings);
    }

    private putUserSettings(userId: string, userSettings: UserSettings): void {
        const allUserSettingsString = localStorage.getItem(CurrentUserStore.USER_SETTINGS_KEY);
        const allUserSettings = allUserSettingsString ? JSON.parse(allUserSettingsString) : {};
        allUserSettings[userId] = userSettings.toThryftJsonObject();
        localStorage.putItem(CurrentUserStore.USER_SETTINGS_KEY, JSON.stringify(allUserSettings));
    }


    private setCurrentUser(currentUser: CurrentUser, saveToLocalStorage?: boolean) {
        this.currentUser = currentUser;

        // if (typeof (saveToLocalStorage) === "undefined" || saveToLocalStorage) {
        //     localStorage.setItem(CurrentUserStore.CURRENT_USER_AUTH0_DECODED_HASH_KEY, JSON.stringify(currentUser.authResult));
        //     this.logger.debug("set current user hash in local storage");
        // }
    }
}

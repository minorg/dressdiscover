import { User } from 'dressdiscover/api/models/user/user';
import { UserId } from 'dressdiscover/api/models/user/user_id';
import { UserIdentityProvider } from 'dressdiscover/api/models/user/user_identity_provider';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { NoSuchUserSettingsException } from 'dressdiscover/api/services/user/no_such_user_settings_exception';
import { CurrentUser } from 'dressdiscover/gui/models/current_user/CurrentUser';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import { convertGapiErrorToException, GapiException } from 'dressdiscover/gui/services/GapiException';
import { Services } from 'dressdiscover/gui/services/Services';
import { ILogger } from 'dressdiscover/gui/util/logging/ILogger';
import * as invariant from 'invariant';
import { action, computed, observable, runInAction } from 'mobx';

export class CurrentUserStore {
    private static readonly CURRENT_USER_ITEM_KEY = "currentUser";

    @observable.ref currentUser?: CurrentUser | null;
    @observable.ref error?: GapiException | Error | null;

    constructor(private readonly logger: ILogger) {
        runInAction("construction", () => {
            this.clearError();
            this.setCurrentUserFromLocalStorage();
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
    login(currentUserSession: CurrentUserSession) {
        this.clearCurrentUser();
        this.clearError();

        this.setGapiAccessToken(currentUserSession);

        ((gapi.client as any).oauth2.userinfo as gapi.client.oauth2.UserinfoResource).get({}).then(
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
                    id: UserId.parse(result.id as string),
                    session: currentUserSession
                }));
            },
            (reason: any) => {
                this.setError(convertGapiErrorToException(reason));
            });
    }

    @action
    logout() {
        this.clearCurrentUser();
    }

    @action
    checkCurrentUserSession() {
        const currentUser = this.currentUser;
        if (!currentUser) {
            return;
        }
        if (currentUser.session.isValid()) {
            return;
        }

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

    @action
    setCurrentUserSettings(settings?: UserSettings) {
        const currentUser = this.currentUser;
        invariant(currentUser, "expected current user to be set");
        if (settings) {
            // Intentionally ignore result.
            currentUser!.services.userSettingsCommandService.putUserSettings(({ id: currentUser!.id, userSettings: settings }));
        }
        this.setCurrentUser(currentUser!.replaceSettings(settings), true);
    }

    @action
    private clearCurrentUser() {
        this.currentUser = null;
        localStorage.removeItem(CurrentUserStore.CURRENT_USER_ITEM_KEY);
        this.logger.debug("cleared current user hash from local storage");

        gapi.client.setToken(null);
        this.logger.debug("cleared gapi client token");
    }

    @action
    private clearError() {
        this.error = null;
    }

    @action
    private setCurrentUser(currentUser: CurrentUser, saveToLocalStorage?: boolean) {
        this.currentUser = currentUser;

        if (typeof (saveToLocalStorage) === "undefined" || saveToLocalStorage) {
            localStorage.setItem(CurrentUserStore.CURRENT_USER_ITEM_KEY, JSON.stringify(currentUser.toJsonObject()));
            this.logger.debug("set current user hash in local storage");
        }
    }

    @action
    private setGapiAccessToken(currentUserSession: CurrentUserSession) {
        gapi.client.setToken({ access_token: currentUserSession.accessToken });
        this.logger.debug("set gapi access token");
    }

    private setCurrentUserFromLocalStorage() {
        const currentUserString = localStorage.getItem(CurrentUserStore.CURRENT_USER_ITEM_KEY);
        if (!currentUserString) {
            this.currentUser = null;
            return;
        }
        this.logger.debug("retrieved current user hash from local storage");
        const currentUser = CurrentUser.fromJsonObject(JSON.parse(currentUserString));

        // Can't set the gapi access token here, since gapi is probably not loaded yet.

        const self = this;
        Services.default.userSettingsQueryService.getUserSettings({ id: currentUser.id }).then((userSettings) => {
            self.setCurrentUser(currentUser.replaceSettings(userSettings), false);
        }, (reason) => {
            if (reason instanceof NoSuchUserSettingsException) {
                self.setCurrentUser(currentUser, false);
            } else {
                runInAction(() => {
                    self.currentUser = null;
                });
                self.setError(new Error(reason.toString()));
            }
        });
    }

    @action
    private setError(error: Error | GapiException) {
        this.error = error;
    }
}

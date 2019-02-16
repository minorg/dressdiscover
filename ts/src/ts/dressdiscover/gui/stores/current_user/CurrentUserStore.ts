import { User } from 'dressdiscover/api/models/user/user';
import { UserId } from 'dressdiscover/api/models/user/user_id';
import { UserIdentityProvider } from 'dressdiscover/api/models/user/user_identity_provider';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { NoSuchUserSettingsException } from 'dressdiscover/api/services/user/no_such_user_settings_exception';
import { CurrentUser } from 'dressdiscover/gui/models/current_user/CurrentUser';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import { Services } from 'dressdiscover/gui/services/Services';
import { ILogger } from 'dressdiscover/gui/util/logging/ILogger';
import * as invariant from 'invariant';
import { action, computed, observable, runInAction } from 'mobx';

export class CurrentUserStore {
    private static readonly CURRENT_USER_ITEM_KEY = "currentUser";

    @observable.ref currentUser?: CurrentUser | null;
    @observable.ref error?: Error | null;

    constructor(private readonly logger: ILogger) {
        runInAction("construction", () => {
            this.clearCurrentUser();
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
    setCurrentUserSession(currentUserSession: CurrentUserSession) {
        this.clearError();
        this.clearCurrentUser();

        gapi.client.setToken({ access_token: currentUserSession.accessToken });

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

    @action
    setCurrentUser(currentUser: CurrentUser, saveToLocalStorage?: boolean) {
        this.currentUser = currentUser;

        if (typeof (saveToLocalStorage) === "undefined" || saveToLocalStorage) {
            localStorage.setItem(CurrentUserStore.CURRENT_USER_ITEM_KEY, JSON.stringify(currentUser.toJsonObject()));
            this.logger.debug("set current user hash in local storage");
        }
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
    setError(error: Error) {
        this.error = error;
    }

    private clearCurrentUser() {
        this.currentUser = null;
        localStorage.removeItem(CurrentUserStore.CURRENT_USER_ITEM_KEY);
        this.logger.debug("cleared current user hash from local storage");
    }

    private clearError() {
        this.error = null;
    }

    private setCurrentUserFromLocalStorage() {
        const currentUserString = localStorage.getItem(CurrentUserStore.CURRENT_USER_ITEM_KEY);
        if (!currentUserString) {
            return;
        }
        const currentUserJson = JSON.parse(currentUserString);

        const currentUser = User.fromThryftJsonObject(currentUserJson);
        const currentUserId = UserId.parse(currentUserJson.id);
        const currentUserSession = new CurrentUserSession(currentUserJson.session);
        this.logger.debug("retrieved current user hash from local storage");

        Services.default.userSettingsQueryService.getUserSettings({ id: currentUserId }).then((userSettings) => {
            this.setCurrentUser(new CurrentUser({
                delegate: currentUser,
                id: currentUserId,
                session: currentUserSession,
                settings: userSettings
            }));
        }, (reason) => {
            if (reason instanceof NoSuchUserSettingsException) {
                this.setCurrentUser(new CurrentUser({
                    delegate: currentUser,
                    id: currentUserId,
                    session: currentUserSession
                }));
            } else {
                this.setError(new Error(reason.toString()));
            }
        });
    }
}

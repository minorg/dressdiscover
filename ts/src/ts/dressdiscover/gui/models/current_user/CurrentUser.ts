import { Auth0DecodedHash } from 'auth0-js';
import { User } from 'dressdiscover/api/models/user/user';
import { UserIdentityProvider } from 'dressdiscover/api/models/user/user_identity_provider';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import {
    DefaultWorksheetConfiguration,
} from 'dressdiscover/gui/models/worksheet/configuration/DefaultWorksheetConfiguration';
import { Services } from 'dressdiscover/gui/services/Services';

export class CurrentUser {
    constructor(kwds: { authResult: Auth0DecodedHash, delegate: User, session: CurrentUserSession, settings?: UserSettings }) {
        this.authResult = kwds.authResult;
        this.delegate = kwds.delegate;
        this.services = new Services((kwds.settings && kwds.settings.worksheetConfiguration) ? kwds.settings.worksheetConfiguration : DefaultWorksheetConfiguration.instance);
        this.session = kwds.session;
        this.settings = kwds.settings;
    }

    get accessToken(): string | undefined {
        return this.authResult.accessToken;
    }

    get identityProvider(): UserIdentityProvider {
        return this.delegate.identityProvider;
    }

    get name() {
        return this.delegate.name ? this.delegate.name : this.delegate.emailAddress;
    }

    replaceSettings(settings?: UserSettings): CurrentUser {
        return new CurrentUser({ authResult: this.authResult, delegate: this.delegate, session: this.session, settings });
    }

    readonly authResult: Auth0DecodedHash;
    private readonly delegate: User;
    readonly services: Services;
    readonly session: CurrentUserSession;
    readonly settings?: UserSettings;
}

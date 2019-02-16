import { User } from 'dressdiscover/api/models/user/user';
import { UserId } from 'dressdiscover/api/models/user/user_id';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import {
    DefaultWorksheetConfiguration,
} from 'dressdiscover/gui/models/worksheet/configuration/DefaultWorksheetConfiguration';
import { Services } from 'dressdiscover/gui/services/Services';

export class CurrentUser {
    constructor(kwds: { delegate: User, id: UserId, session: CurrentUserSession, settings?: UserSettings }) {
        this.delegate = kwds.delegate;
        this.id = kwds.id;
        this.services = new Services((kwds.settings && kwds.settings.worksheetConfiguration) ? kwds.settings.worksheetConfiguration : DefaultWorksheetConfiguration.instance);
        this.session = kwds.session;
        this.settings = kwds.settings;
    }

    get identityProvider() {
        return this.delegate.identityProvider;
    }

    get name() {
        return this.delegate.name ? this.delegate.name : this.delegate.emailAddress;
    }

    replaceSettings(newSettings?: UserSettings) {
        return new CurrentUser({ delegate: this.delegate, id: this.id, session: this.session, settings: newSettings });
    }

    toJsonObject() {
        const json = this.delegate.toThryftJsonObject();
        json.id = this.id.toString();
        json.session = this.session.toJsonObject();
        return json;
    }

    private readonly delegate: User;
    readonly id: UserId;
    readonly services: Services;
    readonly session: CurrentUserSession;
    readonly settings?: UserSettings;
}

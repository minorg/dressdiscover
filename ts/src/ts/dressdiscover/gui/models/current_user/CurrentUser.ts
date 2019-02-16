import { User } from 'dressdiscover/api/models/user/user';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import {
    DefaultWorksheetConfiguration,
} from 'dressdiscover/gui/models/worksheet/configuration/DefaultWorksheetConfiguration';
import { Services } from 'dressdiscover/gui/services/Services';

export class CurrentUser {
    constructor(kwds: { delegate: User, session: CurrentUserSession, settings?: UserSettings }) {
        this.delegate = kwds.delegate;
        this.services = new Services((kwds.settings && kwds.settings.worksheetConfiguration) ? kwds.settings.worksheetConfiguration : DefaultWorksheetConfiguration.instance);
        this.session = kwds.session;
        this.settings = kwds.settings;
    }

    static fromJsonObject(json: any) {
        return new CurrentUser({
            delegate: User.fromThryftJsonObject(json),
            session: new CurrentUserSession(json.session),
            settings: json.settings ? UserSettings.fromThryftJsonObject(json.settings) : undefined
        });
    }

    get name() {
        return this.delegate.name ? this.delegate.name : this.delegate.emailAddress;
    }

    replaceSettings(settings?: UserSettings): CurrentUser {
        return new CurrentUser({ delegate: this.delegate, session: this.session, settings });
    }

    toJsonObject() {
        const json = this.delegate.toJsonObject();
        json.session = this.session.toJsonObject();
        if (this.settings) {
            json.settings = this.settings.toJsonObject();
        }
        return json;
    }

    private readonly delegate: User;
    readonly services: Services;
    readonly session: CurrentUserSession;
    readonly settings?: UserSettings;
}

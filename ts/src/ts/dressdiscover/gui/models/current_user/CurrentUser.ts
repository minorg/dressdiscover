import { User } from 'dressdiscover/api/models/user/user';
import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import { Services } from 'dressdiscover/gui/services/Services';

export class CurrentUser {
    constructor(kwds: { delegate: User, session: CurrentUserSession, settings?: UserSettings }) {
        this.delegate = kwds.delegate;
        this.services = Services.default;
        this.session = kwds.session;
        this.settings = kwds.settings;
    }

    get name() {
        return this.delegate.name ? this.delegate.name : this.delegate.emailAddress;
    }

    private readonly delegate: User;
    readonly services: Services;
    readonly session: CurrentUserSession;
    readonly settings?: UserSettings;
}

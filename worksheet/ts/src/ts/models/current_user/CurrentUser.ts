import { User } from '~/models/user/user';
import { UserId } from '~/models/user/user_id';
import { UserSettings } from '~/models/user/user_settings';
import { CurrentUserSession } from '~/models/current_user/CurrentUserSession';
import {
    DefaultWorksheetConfiguration,
} from '~/models/worksheet/configuration/DefaultWorksheetConfiguration';
import { Services } from '~/services/Services';

export class CurrentUser {
    constructor(kwds: { delegate: User, id: UserId, session: CurrentUserSession, settings?: UserSettings }) {
        this.delegate = kwds.delegate;
        this.id = kwds.id;
        this.services = new Services((kwds.settings && kwds.settings.worksheetConfiguration) ? kwds.settings.worksheetConfiguration : DefaultWorksheetConfiguration.instance);
        this.session = kwds.session;
        this.settings = kwds.settings;
    }

    static fromJsonObject(json: any) {
        const delegate = Object.assign({}, json);
        const id = UserId.parse(json.id);
        const session = CurrentUserSession.fromJsonObject(json.session);
        return new CurrentUser({ delegate, id, session });
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
        const json: any = Object.assign({}, this.delegate);
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

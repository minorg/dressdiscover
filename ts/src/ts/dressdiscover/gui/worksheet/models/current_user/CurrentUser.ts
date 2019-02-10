import { CurrentUserSession } from 'dressdiscover/gui/worksheet/models/current_user/CurrentUserSession';
import { Services } from 'dressdiscover/gui/worksheet/services/Services';

export class CurrentUser {
    constructor(kwds: { email: string, name?: string, session: CurrentUserSession }) {
        this.email = kwds.email;
        this.namePrivate = kwds.name;
        this.services = Services.default;
        this.session = kwds.session;
    }

    get name() {
        return this.namePrivate ? this.namePrivate : this.email;
    }

    readonly email: string;
    private readonly namePrivate?: string;
    readonly services: Services;
    readonly session: CurrentUserSession;
}

import { CurrentUserSession } from 'dressdiscover/gui/worksheet/models/current_user/CurrentUserSession';

export class CurrentUser {
    constructor(kwds: { email: string, name?: string, session: CurrentUserSession }) {
        this.email = kwds.email;
        this.namePrivate = kwds.name;
        this.session = kwds.session;
    }

    get name() {
        return this.namePrivate ? this.namePrivate : this.email;
    }

    readonly email: string;
    private readonly namePrivate?: string;
    session: CurrentUserSession;
}

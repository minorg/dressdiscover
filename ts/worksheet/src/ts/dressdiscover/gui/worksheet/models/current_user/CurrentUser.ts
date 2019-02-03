export class CurrentUser {
    constructor(kwds: { email: string, name?: string }) {
        this.email = kwds.email;
        this.namePrivate = kwds.name;
    }

    get name() {
        return this.namePrivate ? this.namePrivate : this.email;
    }

    readonly email: string;
    private readonly namePrivate?: string;
}

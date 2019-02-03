export class CurrentUser {
    constructor(kwds: { email: string, googleAccessToken: string, name?: string }) {
        this.email = kwds.email;
        this.googleAccessToken = kwds.googleAccessToken;
        this.namePrivate = kwds.name;
    }

    get name() {
        return this.namePrivate ? this.namePrivate : this.email;
    }

    readonly email: string;
    readonly googleAccessToken: string;
    private readonly namePrivate?: string;
}

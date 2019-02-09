export class CurrentUserSession {
    constructor(kwds: { accessToken: string, expiresAt: number, idToken: string }) {
        this.accessToken = kwds.accessToken;
        this.expiresAt = kwds.expiresAt;
        this.idToken = kwds.idToken;
    }

    readonly accessToken: string;
    readonly expiresAt: number;
    readonly idToken: string;
}

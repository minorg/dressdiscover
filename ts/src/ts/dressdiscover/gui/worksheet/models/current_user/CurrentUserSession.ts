export class CurrentUserSession {
    constructor(kwds: { accessToken: string, expiresAt: number, idToken: string }) {
        this.accessToken = kwds.accessToken;
        this.expiresAt = kwds.expiresAt;
        this.idToken = kwds.idToken;
    }

    isValid() {
        return new Date().getTime() < this.expiresAt;
    }

    readonly accessToken: string;
    readonly expiresAt: number;
    readonly idToken: string;
}

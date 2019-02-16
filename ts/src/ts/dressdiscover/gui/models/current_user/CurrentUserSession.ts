export class CurrentUserSession {
    constructor(kwds: { accessToken: string, expiresAt: Date }) {
        this.accessToken = kwds.accessToken;
        this.expiresAt = kwds.expiresAt;
    }

    isValid() {
        return new Date() < this.expiresAt;
    }

    toJsonObject() {
        return {
            accessToken: this.accessToken,
            expiresAt: this.expiresAt
        }
    }

    readonly accessToken: string;
    readonly expiresAt: Date;
}

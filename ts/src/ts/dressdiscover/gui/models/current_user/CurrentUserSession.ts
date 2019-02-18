export class CurrentUserSession {
    constructor(kwds: { accessToken: string, expiresAt: Date }) {
        this.accessToken = kwds.accessToken;
        this.expiresAt = kwds.expiresAt;
    }

    static fromJsonObject(json: any) {
        return new CurrentUserSession({ accessToken: json.accessToken, expiresAt: new Date(json.expiresAt) });
    }

    isValid() {
        const currentDate = new Date();
        return currentDate.getTime() < this.expiresAt.getTime();
    }

    toJsonObject() {
        return {
            accessToken: this.accessToken,
            expiresAt: this.expiresAt.getTime()
        }
    }

    readonly accessToken: string;
    readonly expiresAt: Date;
}

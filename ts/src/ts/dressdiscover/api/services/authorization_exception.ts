export class AuthorizationException implements Exception {
    constructor(kwds: {causeMessage: string}) {
        this.causeMessage = AuthorizationException.validateCauseMessage(kwds.causeMessage);
    }

    public deepCopy(): AuthorizationException {
        return new AuthorizationException({ causeMessage: this.causeMessage });
    }

    public equals(other: AuthorizationException): boolean {
        if (!(this.causeMessage === other.causeMessage)) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): AuthorizationException {
        let causeMessage: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "cause_message") {
                causeMessage = json[fieldName];
            }
        }
        if (causeMessage == null) {
            throw new TypeError("causeMessage is required");
        }
        return new AuthorizationException({causeMessage});
    }

    public toJsonObject(): {[index: string]: any} {
        const json: {[index: string]: any} = {};
        json.cause_message = this.causeMessage;
        return json;
    }

    public toString(): string {
        return "AuthorizationException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {[index: string]: any} {
        const json: {[index: string]: any} = {};
        json.cause_message = this.causeMessage;
        return json;
    }

    private static validateCauseMessage(causeMessage: string): string {
        if (causeMessage == null) {
            throw new RangeError("causeMessage is null or undefined");
        }
        if (causeMessage.trim().length === 0) {
            throw new RangeError("causeMessage is blank");
        }
        if (causeMessage.length < 1) {
            throw new RangeError("expected len(causeMessage) to be >= 1, was " + causeMessage.length);
        }
        return causeMessage;
    }

    public readonly causeMessage: string;
}

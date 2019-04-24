export class AuthenticationException implements Exception {
    constructor(kwds: {causeMessage: string}) {
        this.causeMessage = AuthenticationException.validateCauseMessage(kwds.causeMessage);
    }

    public deepCopy(): AuthenticationException {
        return new AuthenticationException({ causeMessage: this.causeMessage });
    }

    public equals(other: AuthenticationException): boolean {
        if (this.causeMessage !== other.causeMessage) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): AuthenticationException {
        let causeMessage: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "cause_message") {
                causeMessage = json[fieldName];
            }
        }
        if (causeMessage == null) {
            throw new TypeError("causeMessage is required");
        }
        return new AuthenticationException({causeMessage});
    }

    public toJsonObject(): {cause_message: string} {
        return {
            cause_message: this.causeMessage
        };
    }

    public toString(): string {
        return "AuthenticationException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {cause_message: string} {
        return {
            cause_message: this.causeMessage
        };
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

export class IoException {
    constructor(kwds: {causeMessage: string}) {
        this.causeMessage = IoException.validateCauseMessage(kwds.causeMessage);
    }

    public deepCopy(): IoException {
        return new IoException({ causeMessage: this.causeMessage });
    }

    public equals(other: IoException): boolean {
        if (!(this.causeMessage === other.causeMessage)) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): IoException {
        let causeMessage: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "cause_message") {
                causeMessage = json[fieldName];
            }
        }
        if (causeMessage == null) {
            throw new TypeError("causeMessage is required");
        }
        return new IoException({causeMessage});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.cause_message = this.causeMessage;
        return json;
    }

    public toString(): string {
        return "IoException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
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

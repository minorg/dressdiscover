export class IoException {
    constructor(kwds: {causeMessage: string}) {
        this._causeMessage = IoException._validateCauseMessage(kwds.causeMessage);
    }

    get causeMessage(): string {
        return this._causeMessage;
    }

    set causeMessage(causeMessage: string) {
        this._causeMessage = IoException._validateCauseMessage(causeMessage);
    }

    private static _validateCauseMessage(causeMessage: string): string {
        if (causeMessage == null) {
            throw new RangeError('causeMessage is null or undefined');
        }
        return causeMessage;
    }

    deepCopy(): IoException {
        return new IoException({ causeMessage: this.causeMessage });
    }

    equals(other: IoException): boolean {
        if (!(this.causeMessage === other.causeMessage)) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): IoException {
        var causeMessage: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "cause_message") {
                causeMessage = json[fieldName];
            }
        }
        if (causeMessage == null) {
            throw new TypeError('causeMessage is required');
        }
        return new IoException({causeMessage: causeMessage});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["cause_message"] = this.causeMessage;
        return json;
    }

    toString(): string {
        return "IoException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["cause_message"] = this.causeMessage;
        return json;
    }

    private _causeMessage: string;
}

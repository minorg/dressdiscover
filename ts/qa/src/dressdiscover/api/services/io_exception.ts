export class IoException {
    private _causeMessage: string;

    constructor(kwds: {causeMessage: string}) {
        this.causeMessage = kwds.causeMessage;
    }

    get causeMessage(): string {
        return this._causeMessage;
    }

    set causeMessage(causeMessage: string) {
        this._causeMessage = causeMessage;
    }

    static fromThryftJSON(json: any): IoException {
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

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["cause_message"] = this.causeMessage;
        return json;
    }
}

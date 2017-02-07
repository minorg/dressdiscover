export class IoException {
    constructor(public causeMessage: string) {
    }

    static fromThryftJSON(json: any): IoException {
        var causeMessage: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "cause_message") {
                causeMessage = json[fieldName];
            }
        }
        if (causeMessage == null) {
            throw new Error('causeMessage is required');
        }
        return new IoException(causeMessage);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["cause_message"] = this.causeMessage;
        return json;
    }
}

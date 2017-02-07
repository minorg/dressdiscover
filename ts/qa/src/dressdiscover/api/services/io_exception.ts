export class IoException {
    constructor(private causeMessage: string) {
    }

    static fromThryftJSON(json: any): IoException {
        causeMessage: string;
        for (var fieldName in json) {
            if (fieldName == "cause_message") {
                causeMessage = json[fieldName];
            }
        }
        return new IoException(causeMessage);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["cause_message"] = this.causeMessage;
        return json;
    }
}

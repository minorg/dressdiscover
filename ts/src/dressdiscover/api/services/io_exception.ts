import * as Backbone from "backbone";

export class IoException extends Backbone.Model {
    constructor(attributes?: {causeMessage: string}) {
        super(attributes);
    }

    get causeMessage(): string {
        return this.get('causeMessage');
    }

    set causeMessage(value: string) {
        this.set('causeMessage', value);
    }

    static fromThryftJSON(json: any): IoException {
        var out: IoException = new IoException;
        for (var fieldName in json) {
            if (fieldName == "cause_message") {
                out.attributes.causeMessage = json[fieldName];
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["cause_message"] = this.causeMessage;
        return json;
    }
}

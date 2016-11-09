import * as Backbone from "backbone";

export class IoException extends Backbone.Model {
    constructor(attributes?: {cause_message: string}) {
        super(attributes);
    }

    get cause_message(): string {
        return this.get('cause_message');
    }

    set cause_message(value: string) {
        this.set('cause_message', value);
    }

    static fromThryftJSON(json: any): IoException {
        var out: IoException = new IoException;
        for (var fieldName in json) {
            if (fieldName == "cause_message") {
                out.attributes.cause_message = json[fieldName];
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["cause_message"] = this.cause_message;
        return json;
    }
}

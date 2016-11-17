import * as Backbone from "backbone";

export class IoException extends Backbone.Model {
    constructor(attributes?: {causeMessage: string}) {
        if (!attributes) {
            attributes = {};
        }
        attributes["validation"] = {
            cause_message: {
                "fn": function(value, attr, computedState) {
                    if (typeof value !== "string") {
                        return "expected dressdiscover.api.services.IoException.cause_message to be a string";
                    }
                },
                "required": true
            }
        }
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

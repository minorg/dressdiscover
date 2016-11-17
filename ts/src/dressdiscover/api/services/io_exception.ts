import * as Backbone from "backbone";

export class IoException extends Backbone.Model {
    validation = {
        causeMessage: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected IoException.cause_message to be a string";
                }
                return undefined;
            },
            "required": true
        }
    }

    validationError: any;

    constructor(attributes?: {causeMessage: string}, options?: any) {
        super(attributes, options);
    }

    get causeMessage(): string {
        return this.get('causeMessage');
    }

    set causeMessage(value: string) {
        this.set('causeMessage', value, { validate: true });
    }

    static fromThryftJSON(json: any): IoException {
        var out: IoException = new IoException;
        for (var fieldName in json) {
            if (fieldName == "cause_message") {
                out.attributes.causeMessage = json[fieldName];
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["cause_message"] = this.causeMessage;
        return json;
    }
}

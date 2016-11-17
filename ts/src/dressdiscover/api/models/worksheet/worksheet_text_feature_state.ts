import * as Backbone from "backbone";

export class WorksheetTextFeatureState extends Backbone.Model {
    validation = {
        text: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetTextFeatureState.text to be a string";
                }
                return undefined;
            },
            "minLength": 1, "required": true
        }
    }

    validationError: any;

    constructor(attributes?: {text: string}, options?: any) {
        super(attributes, options);
    }

    get text(): string {
        return this.get('text');
    }

    set text(value: string) {
        this.set('text', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetTextFeatureState {
        var out: WorksheetTextFeatureState = new WorksheetTextFeatureState;
        for (var fieldName in json) {
            if (fieldName == "text") {
                out.attributes.text = json[fieldName];
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["text"] = this.text;
        return json;
    }
}

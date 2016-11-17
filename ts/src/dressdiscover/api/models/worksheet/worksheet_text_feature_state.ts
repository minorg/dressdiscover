import * as Backbone from "backbone";

export class WorksheetTextFeatureState extends Backbone.Model {
    constructor(attributes?: {text: string}) {
        let attributes_: any = {};
        if (attributes) {
            attributes_["text"] = attributes["text"];
        }
        attributes_["validation"] = {
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
        super(attributes_);
    }

    get text(): string {
        return this.get('text');
    }

    set text(value: string) {
        this.set('text', value);
    }

    static fromThryftJSON(json: any): WorksheetTextFeatureState {
        var out: WorksheetTextFeatureState = new WorksheetTextFeatureState;
        for (var fieldName in json) {
            if (fieldName == "text") {
                out.attributes.text = json[fieldName];
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["text"] = this.text;
        return json;
    }
}

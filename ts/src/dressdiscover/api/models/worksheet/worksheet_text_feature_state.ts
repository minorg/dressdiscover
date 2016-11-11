import * as Backbone from "backbone";

export class WorksheetTextFeatureState extends Backbone.Model {
    constructor(attributes?: {text: string}) {
        super(attributes);
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

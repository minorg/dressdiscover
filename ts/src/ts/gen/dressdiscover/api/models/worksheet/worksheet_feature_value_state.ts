import * as Backbone from "backbone";

export class WorksheetFeatureValueState extends Backbone.Model {
    constructor(attributes?: {selected?: boolean, text?: string}) {
        super(attributes);
    }

    get selected(): boolean {
        return this.get('selected');
    }

    set selected(value: boolean) {
        this.set('selected', value);
    }

    get text(): string {
        return this.get('text');
    }

    set text(value: string) {
        this.set('text', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureValueState {
        var out: WorksheetFeatureValueState = new WorksheetFeatureValueState;
        for (var fieldName in json) {
            if (fieldName == "selected") {
                out.attributes.selected = json[fieldName];
            } else if (fieldName == "text") {
                out.attributes.text = json[fieldName];
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("selected")) {
            json["selected"] = this.selected;
        }
        if (this.has("text")) {
            json["text"] = this.text;
        }
        return json;
    }
}

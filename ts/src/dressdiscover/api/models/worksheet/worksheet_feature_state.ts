import * as Backbone from "backbone";
import { WorksheetFeatureStateId as dressdiscover_api_models_worksheet_WorksheetFeatureStateId } from "./worksheet_feature_state_id";

export class WorksheetFeatureState extends Backbone.Model {
    constructor(attributes?: {id: dressdiscover_api_models_worksheet_WorksheetFeatureStateId, selected?: boolean, text?: string}) {
        super(attributes);
    }

    get id(): dressdiscover_api_models_worksheet_WorksheetFeatureStateId {
        return this.get('id');
    }

    set id(value: dressdiscover_api_models_worksheet_WorksheetFeatureStateId) {
        this.set('id', value);
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

    static fromThryftJSON(json: any): WorksheetFeatureState {
        var out: WorksheetFeatureState = new WorksheetFeatureState;
        for (var fieldName in json) {
            if (fieldName == "id") {
                out.attributes.id = dressdiscover_api_models_worksheet_WorksheetFeatureStateId.fromThryftJSON(json[fieldName]);
            } else if (fieldName == "selected") {
                out.attributes.selected = json[fieldName];
            } else if (fieldName == "text") {
                out.attributes.text = json[fieldName];
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toThryftJSON();
        if (this.has("selected")) {
            json["selected"] = this.selected;
        }
        if (this.has("text")) {
            json["text"] = this.text;
        }
        return json;
    }
}

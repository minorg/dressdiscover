import * as Backbone from "backbone";
import { WorksheetEnumFeatureDefinition } from "./worksheet_enum_feature_definition";
import { WorksheetTextFeatureDefinition } from "./worksheet_text_feature_definition";

export class WorksheetFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, displayName?: string, enum_?: WorksheetEnumFeatureDefinition, text?: WorksheetTextFeatureDefinition}) {
        super(attributes);
    }

    get id(): string {
        return this.get('id');
    }

    set id(value: string) {
        this.set('id', value);
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value);
    }

    get enum_(): WorksheetEnumFeatureDefinition {
        return this.get('enum_');
    }

    set enum_(value: WorksheetEnumFeatureDefinition) {
        this.set('enum_', value);
    }

    get text(): WorksheetTextFeatureDefinition {
        return this.get('text');
    }

    set text(value: WorksheetTextFeatureDefinition) {
        this.set('text', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureDefinition {
        var out: WorksheetFeatureDefinition = new WorksheetFeatureDefinition;
        for (var fieldName in json) {
            if (fieldName == "id") {
                out.attributes.id = json[fieldName];
            } else if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            } else if (fieldName == "enum_") {
                out.attributes.enum_ = WorksheetEnumFeatureDefinition.fromThryftJSON(json[fieldName]);
            } else if (fieldName == "text") {
                out.attributes.text = WorksheetTextFeatureDefinition.fromThryftJSON(json[fieldName]);
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.has("displayName")) {
            json["display_name"] = this.displayName;
        }
        if (this.has("enum_")) {
            json["enum_"] = this.enum_.toThryftJSON();
        }
        if (this.has("text")) {
            json["text"] = this.text.toThryftJSON();
        }
        return json;
    }
}

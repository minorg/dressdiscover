import * as Backbone from "backbone";
import { WorksheetEnumFeatureDefinition } from "./worksheet_enum_feature_definition";
import { WorksheetTextFeatureDefinition } from "./worksheet_text_feature_definition";

export class WorksheetFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, displayName?: string, enum_?: WorksheetEnumFeatureDefinition, text?: WorksheetTextFeatureDefinition}) {
        if (!attributes) {
            attributes = {};
        }
        attributes["validation"] = {
            id: {
                "fn": function(value, attr, computedState) {
                    if (typeof value !== "string") {
                        return "expected dressdiscover.api.models.worksheet.WorksheetFeatureDefinition.id to be a string";
                    }
                },
                "required": true
            },

            display_name: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "string") {
                            return "expected dressdiscover.api.models.worksheet.WorksheetFeatureDefinition.display_name to be a string";
                        }
                    }
                },
                "minLength": 1, "required": false
            },

            enum_: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (!(value instanceof dressdiscover.api.models.worksheet.WorksheetEnumFeatureDefinition)) {
                            return "expected dressdiscover.api.models.worksheet.WorksheetFeatureDefinition.enum_ to be a dressdiscover.api.models.worksheet.WorksheetEnumFeatureDefinition";
                        }
                        if (!value.isValid(true)) {
                            return value.validationError;
                        }
                    }
                },
                "required": false
            },

            text: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (!(value instanceof dressdiscover.api.models.worksheet.WorksheetTextFeatureDefinition)) {
                            return "expected dressdiscover.api.models.worksheet.WorksheetFeatureDefinition.text to be a dressdiscover.api.models.worksheet.WorksheetTextFeatureDefinition";
                        }
                        if (!value.isValid(true)) {
                            return value.validationError;
                        }
                    }
                },
                "required": false
            }
        }
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

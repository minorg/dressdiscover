import * as Backbone from "backbone";
import { WorksheetEnumFeatureDefinition } from "./worksheet_enum_feature_definition";
import { WorksheetTextFeatureDefinition } from "./worksheet_text_feature_definition";

export class WorksheetFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, displayName?: string, enum_?: WorksheetEnumFeatureDefinition, text?: WorksheetTextFeatureDefinition}) {
        let attributes_: any = {};
        if (attributes) {
            attributes_["id"] = attributes["id"];
            attributes_["displayName"] = attributes["displayName"];
            attributes_["enum_"] = attributes["enum_"];
            attributes_["text"] = attributes["text"];
        }
        attributes_["validation"] = {
            id: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating id");
                    if (typeof value !== "string") {
                        return "expected WorksheetFeatureDefinition.id to be a string";
                    }
                    return undefined;
                },
                "required": true
            },

            displayName: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating displayName");
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "string") {
                            return "expected WorksheetFeatureDefinition.display_name to be a string";
                        }
                    }
                    return undefined;
                },
                "minLength": 1, "required": false
            },

            enum_: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating enum_");
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (!(value instanceof WorksheetEnumFeatureDefinition)) {
                            return "expected WorksheetFeatureDefinition.enum_ to be a WorksheetEnumFeatureDefinition";
                        }
                        if (!value.isValid(true)) {
                            return value.validationError;
                        }
                    }
                    return undefined;
                },
                "required": false
            },

            text: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating text");
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (!(value instanceof WorksheetTextFeatureDefinition)) {
                            return "expected WorksheetFeatureDefinition.text to be a WorksheetTextFeatureDefinition";
                        }
                        if (!value.isValid(true)) {
                            return value.validationError;
                        }
                    }
                    return undefined;
                },
                "required": false
            }
        }
        super(attributes_);
    }

    get id(): string {
        return this.get('id');
    }

    set id(value: string) {
        this.set('id', value, { validate: true });
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value, { validate: true });
    }

    get enum_(): WorksheetEnumFeatureDefinition {
        return this.get('enum_');
    }

    set enum_(value: WorksheetEnumFeatureDefinition) {
        this.set('enum_', value, { validate: true });
    }

    get text(): WorksheetTextFeatureDefinition {
        return this.get('text');
    }

    set text(value: WorksheetTextFeatureDefinition) {
        this.set('text', value, { validate: true });
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

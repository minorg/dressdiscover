import * as Backbone from "backbone";
import { WorksheetEnumFeatureValueImage } from "./worksheet_enum_feature_value_image";

export class WorksheetEnumFeatureValueDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, displayName?: string, image?: WorksheetEnumFeatureValueImage}) {
        if (!attributes) {
            attributes = {};
        }
        attributes["validation"] = {
            id: {
                "fn": function(value, attr, computedState) {
                    if (typeof value !== "string") {
                        return "expected dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueDefinition.id to be a string";
                    }
                },
                "required": true
            },

            display_name: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "string") {
                            return "expected dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueDefinition.display_name to be a string";
                        }
                    }
                },
                "minLength": 1, "required": false
            },

            image: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (!(value instanceof dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueImage)) {
                            return "expected dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueDefinition.image to be a dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueImage";
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

    get image(): WorksheetEnumFeatureValueImage {
        return this.get('image');
    }

    set image(value: WorksheetEnumFeatureValueImage) {
        this.set('image', value);
    }

    static fromThryftJSON(json: any): WorksheetEnumFeatureValueDefinition {
        var out: WorksheetEnumFeatureValueDefinition = new WorksheetEnumFeatureValueDefinition;
        for (var fieldName in json) {
            if (fieldName == "id") {
                out.attributes.id = json[fieldName];
            } else if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            } else if (fieldName == "image") {
                out.attributes.image = WorksheetEnumFeatureValueImage.fromThryftJSON(json[fieldName]);
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
        if (this.has("image")) {
            json["image"] = this.image.toThryftJSON();
        }
        return json;
    }
}

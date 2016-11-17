import * as Backbone from "backbone";
import { WorksheetEnumFeatureValueImage } from "./worksheet_enum_feature_value_image";

export class WorksheetEnumFeatureValueDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, displayName?: string, image?: WorksheetEnumFeatureValueImage}) {
        let attributes_: any = {};
        if (attributes) {
            attributes_["id"] = attributes["id"];
            attributes_["displayName"] = attributes["displayName"];
            attributes_["image"] = attributes["image"];
        }
        attributes_["validation"] = {
            id: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating id");
                    if (typeof value !== "string") {
                        return "expected WorksheetEnumFeatureValueDefinition.id to be a string";
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
                            return "expected WorksheetEnumFeatureValueDefinition.display_name to be a string";
                        }
                    }
                    return undefined;
                },
                "minLength": 1, "required": false
            },

            image: {
                "fn": function(value: any, attr: any, computedState: any) {
                    console.debug("validating image");
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (!(value instanceof WorksheetEnumFeatureValueImage)) {
                            return "expected WorksheetEnumFeatureValueDefinition.image to be a WorksheetEnumFeatureValueImage";
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

    get image(): WorksheetEnumFeatureValueImage {
        return this.get('image');
    }

    set image(value: WorksheetEnumFeatureValueImage) {
        this.set('image', value, { validate: true });
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

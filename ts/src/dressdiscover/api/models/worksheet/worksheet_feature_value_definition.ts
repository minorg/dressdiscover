import * as Backbone from "backbone";
import { WorksheetFeatureValueImage } from "./worksheet_feature_value_image";

export class WorksheetFeatureValueDefinition extends Backbone.Model {
    validation = {
        id: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueDefinition.id to be a string";
                }

                return undefined;
            },
            "required": true
        },

        displayName: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueDefinition.display_name to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureValueDefinition.display_name is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": false
        },

        image: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (!(value instanceof WorksheetFeatureValueImage)) {
                    return "expected WorksheetFeatureValueDefinition.image to be a WorksheetFeatureValueImage";
                }
                if (!value.isValid(true)) {
                    return value.validationError;
                }

                return undefined;
            },
            "required": false
        }
    }

    validationError: any;

    constructor(attributes?: {id: string, displayName?: string, image?: WorksheetFeatureValueImage}, options?: any) {
        super(attributes, options);
    }

    get id(): string {
        return this.get('id');
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value, { validate: true });
    }

    get image(): WorksheetFeatureValueImage {
        return this.get('image');
    }

    set image(value: WorksheetFeatureValueImage) {
        this.set('image', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetFeatureValueDefinition {
        var out: WorksheetFeatureValueDefinition = new WorksheetFeatureValueDefinition;
        for (var fieldName in json) {
            if (fieldName == "id") {
                out.attributes.id = json[fieldName];
            } else if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            } else if (fieldName == "image") {
                out.attributes.image = WorksheetFeatureValueImage.fromThryftJSON(json[fieldName]);
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
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

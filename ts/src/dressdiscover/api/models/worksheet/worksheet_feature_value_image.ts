import * as Backbone from "backbone";
import { WorksheetFeatureValueImageRights } from "./worksheet_feature_value_image_rights";

export class WorksheetFeatureValueImage extends Backbone.Model {
    validation = {
        rights: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (!(value instanceof WorksheetFeatureValueImageRights)) {
                    return "expected WorksheetFeatureValueImage.rights to be a WorksheetFeatureValueImageRights";
                }
                if (!value.isValid(true)) {
                    return value.validationError;
                }

                return undefined;
            },
            "required": true
        },

        thumbnailUrl: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueImage.thumbnail_url to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureValueImage.thumbnail_url is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": true
        },

        fullSizeUrl: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueImage.full_size_url to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureValueImage.full_size_url is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": false
        }
    }

    validationError: any;

    constructor(attributes?: {rights: WorksheetFeatureValueImageRights, thumbnailUrl: string, fullSizeUrl?: string}, options?: any) {
        super(attributes, options);
    }

    get rights(): WorksheetFeatureValueImageRights {
        return this.get('rights');
    }

    set rights(value: WorksheetFeatureValueImageRights) {
        this.set('rights', value, { validate: true });
    }

    get thumbnailUrl(): string {
        return this.get('thumbnailUrl');
    }

    set thumbnailUrl(value: string) {
        this.set('thumbnailUrl', value, { validate: true });
    }

    get fullSizeUrl(): string {
        return this.get('fullSizeUrl');
    }

    set fullSizeUrl(value: string) {
        this.set('fullSizeUrl', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetFeatureValueImage {
        var out: WorksheetFeatureValueImage = new WorksheetFeatureValueImage;
        for (var fieldName in json) {
            if (fieldName == "rights") {
                out.attributes.rights = WorksheetFeatureValueImageRights.fromThryftJSON(json[fieldName]);
            } else if (fieldName == "thumbnail_url") {
                out.attributes.thumbnailUrl = json[fieldName];
            } else if (fieldName == "full_size_url") {
                out.attributes.fullSizeUrl = json[fieldName];
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["rights"] = this.rights.toThryftJSON();
        json["thumbnail_url"] = this.thumbnailUrl;
        if (this.has("fullSizeUrl")) {
            json["full_size_url"] = this.fullSizeUrl;
        }
        return json;
    }
}

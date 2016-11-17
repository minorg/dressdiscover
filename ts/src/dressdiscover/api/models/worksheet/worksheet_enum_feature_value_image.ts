import * as Backbone from "backbone";

export class WorksheetEnumFeatureValueImage extends Backbone.Model {
    validation = {
        rights: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetEnumFeatureValueImage.rights to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetEnumFeatureValueImage.rights is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": true
        },

        thumbnailUrl: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetEnumFeatureValueImage.thumbnail_url to be a string";
                }

                return undefined;
            },
            "required": true
        },

        fullSizeUrl: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (typeof value !== "string") {
                    return "expected WorksheetEnumFeatureValueImage.full_size_url to be a string";
                }

                return undefined;
            },
            "required": false
        }
    }

    validationError: any;

    constructor(attributes?: {rights: string, thumbnailUrl: URL, fullSizeUrl?: URL}, options?: any) {
        super(attributes, options);
    }

    get rights(): string {
        return this.get('rights');
    }

    set rights(value: string) {
        this.set('rights', value, { validate: true });
    }

    get thumbnailUrl(): URL {
        return this.get('thumbnailUrl');
    }

    set thumbnailUrl(value: URL) {
        this.set('thumbnailUrl', value, { validate: true });
    }

    get fullSizeUrl(): URL {
        return this.get('fullSizeUrl');
    }

    set fullSizeUrl(value: URL) {
        this.set('fullSizeUrl', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetEnumFeatureValueImage {
        var out: WorksheetEnumFeatureValueImage = new WorksheetEnumFeatureValueImage;
        for (var fieldName in json) {
            if (fieldName == "rights") {
                out.attributes.rights = json[fieldName];
            } else if (fieldName == "thumbnail_url") {
                out.attributes.thumbnailUrl = new URL(json[fieldName]);
            } else if (fieldName == "full_size_url") {
                out.attributes.fullSizeUrl = new URL(json[fieldName]);
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["rights"] = this.rights;
        json["thumbnail_url"] = this.thumbnailUrl.toString();
        if (this.has("fullSizeUrl")) {
            json["full_size_url"] = this.fullSizeUrl.toString();
        }
        return json;
    }
}

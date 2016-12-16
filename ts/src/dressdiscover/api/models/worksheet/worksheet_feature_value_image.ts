import * as Backbone from "backbone";

export class WorksheetFeatureValueImage extends Backbone.Model {
    validation = {
        rights: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueImage.rights to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureValueImage.rights is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": true
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

    constructor(attributes?: {rights: string, thumbnailUrl: string, fullSizeUrl?: string}, options?: any) {
        super(attributes, options);
    }

    get rights(): string {
        return this.get('rights');
    }

    set rights(value: string) {
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
                out.attributes.rights = json[fieldName];
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
        json["rights"] = this.rights;
        json["thumbnail_url"] = this.thumbnailUrl;
        if (this.has("fullSizeUrl")) {
            json["full_size_url"] = this.fullSizeUrl;
        }
        return json;
    }
}

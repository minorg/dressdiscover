import * as Backbone from "backbone";

export class WorksheetEnumFeatureValueImage extends Backbone.Model {
    constructor(attributes?: {rights: string, thumbnailUrl: URL, fullSizeUrl?: URL}) {
        if (!attributes) {
            attributes = {};
        }
        attributes["validation"] = {
            rights: {
                "fn": function(value, attr, computedState) {
                    if (typeof value !== "string") {
                        return "expected dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueImage.rights to be a string";
                    }
                },
                "required": true
            },

            thumbnail_url: {
                "fn": function(value, attr, computedState) {
                    if (typeof value !== "string") {
                        return "expected dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueImage.thumbnail_url to be a string";
                    }
                },
                "pattern": "url", "required": true
            },

            full_size_url: {
                "fn": function(value, attr, computedState) {
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "string") {
                            return "expected dressdiscover.api.models.worksheet.WorksheetEnumFeatureValueImage.full_size_url to be a string";
                        }
                    }
                },
                "pattern": "url", "required": false
            }
        }
        super(attributes);
    }

    get rights(): string {
        return this.get('rights');
    }

    set rights(value: string) {
        this.set('rights', value);
    }

    get thumbnailUrl(): URL {
        return this.get('thumbnailUrl');
    }

    set thumbnailUrl(value: URL) {
        this.set('thumbnailUrl', value);
    }

    get fullSizeUrl(): URL {
        return this.get('fullSizeUrl');
    }

    set fullSizeUrl(value: URL) {
        this.set('fullSizeUrl', value);
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

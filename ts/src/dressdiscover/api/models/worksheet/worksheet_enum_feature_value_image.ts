import * as Backbone from "backbone";

export class WorksheetEnumFeatureValueImage extends Backbone.Model {
    constructor(attributes?: {rights: string, thumbnailUrl: URL, fullSizeUrl?: URL}) {
        let attributes_: any = {};
        if (attributes) {
            attributes_["rights"] = attributes["rights"];
            attributes_["thumbnailUrl"] = attributes["thumbnailUrl"];
            attributes_["fullSizeUrl"] = attributes["fullSizeUrl"];
        }
        attributes_["validation"] = {
            rights: {
                "fn": function(value: any, attr: any, computedState: any) {
                    if (typeof value !== "string") {
                        return "expected WorksheetEnumFeatureValueImage.rights to be a string";
                    }
                    return undefined;
                },
                "required": true
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
                    if (typeof attr !== "undefined" && attr !== "null") {
                        if (typeof value !== "string") {
                            return "expected WorksheetEnumFeatureValueImage.full_size_url to be a string";
                        }
                    }
                    return undefined;
                },
                "required": false
            }
        }
        super(attributes_);
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

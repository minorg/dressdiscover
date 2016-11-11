import * as Backbone from "backbone";

export class WorksheetFeatureValueImage extends Backbone.Model {
    constructor(attributes?: {rights: string, thumbnailUrl: string, fullSizeUrl?: string}) {
        super(attributes);
    }

    get rights(): string {
        return this.get('rights');
    }

    set rights(value: string) {
        this.set('rights', value);
    }

    get thumbnailUrl(): string {
        return this.get('thumbnailUrl');
    }

    set thumbnailUrl(value: string) {
        this.set('thumbnailUrl', value);
    }

    get fullSizeUrl(): string {
        return this.get('fullSizeUrl');
    }

    set fullSizeUrl(value: string) {
        this.set('fullSizeUrl', value);
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

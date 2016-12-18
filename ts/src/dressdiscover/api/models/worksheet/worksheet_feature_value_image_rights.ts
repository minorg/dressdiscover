import * as Backbone from "backbone";

export class WorksheetFeatureValueImageRights extends Backbone.Model {
    validation = {
        author: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueImageRights.author to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureValueImageRights.author is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": true
        },

        license: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueImageRights.license to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureValueImageRights.license is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": true
        },

        sourceName: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueImageRights.source_name to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureValueImageRights.source_name is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": true
        },

        sourceUrl: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetFeatureValueImageRights.source_url to be a string";
                }

                return undefined;
            },
            "required": true
        }
    }

    validationError: any;

    constructor(attributes?: {author: string, license: string, sourceName: string, sourceUrl: URL}, options?: any) {
        super(attributes, options);
    }

    get author(): string {
        return this.get('author');
    }

    set author(value: string) {
        this.set('author', value, { validate: true });
    }

    get license(): string {
        return this.get('license');
    }

    set license(value: string) {
        this.set('license', value, { validate: true });
    }

    get sourceName(): string {
        return this.get('sourceName');
    }

    set sourceName(value: string) {
        this.set('sourceName', value, { validate: true });
    }

    get sourceUrl(): URL {
        return this.get('sourceUrl');
    }

    set sourceUrl(value: URL) {
        this.set('sourceUrl', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetFeatureValueImageRights {
        var out: WorksheetFeatureValueImageRights = new WorksheetFeatureValueImageRights;
        for (var fieldName in json) {
            if (fieldName == "author") {
                out.attributes.author = json[fieldName];
            } else if (fieldName == "license") {
                out.attributes.license = json[fieldName];
            } else if (fieldName == "source_name") {
                out.attributes.sourceName = json[fieldName];
            } else if (fieldName == "source_url") {
                out.attributes.sourceUrl = new URL(json[fieldName]);
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["author"] = this.author;
        json["license"] = this.license;
        json["source_name"] = this.sourceName;
        json["source_url"] = this.sourceUrl.toString();
        return json;
    }
}

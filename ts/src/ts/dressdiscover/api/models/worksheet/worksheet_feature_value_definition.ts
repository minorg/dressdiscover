import * as Backbone from "backbone";

export class WorksheetFeatureValueDefinition extends Backbone.Model {
    constructor(attributes?: {displayName: string}) {
        super(attributes);
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureValueDefinition {
        var out: WorksheetFeatureValueDefinition = new WorksheetFeatureValueDefinition;
        for (var fieldName in json) {
            if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["display_name"] = this.displayName;
        return json;
    }
}

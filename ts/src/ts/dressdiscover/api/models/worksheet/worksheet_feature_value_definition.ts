import * as Backbone from "backbone";

export class WorksheetFeatureValueDefinition extends Backbone.Model {
    constructor(attributes?: {id: string, displayName?: string}) {
        super(attributes);
    }

    get id(): string {
        return this.get('id');
    }

    set id(value: string) {
        this.set('id', value);
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
            if (fieldName == "id") {
                out.attributes.id = json[fieldName];
            } else if (fieldName == "display_name") {
                out.attributes.displayName = json[fieldName];
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
        return json;
    }
}

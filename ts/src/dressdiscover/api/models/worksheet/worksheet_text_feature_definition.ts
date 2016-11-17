import * as Backbone from "backbone";

export class WorksheetTextFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {}) {
        if (!attributes) {
            attributes = {};
        }
        attributes["validation"] = {

        }
        super(attributes);
    }



    static fromThryftJSON(json: any): WorksheetTextFeatureDefinition {
        return new WorksheetTextFeatureDefinition;
    }

    toThryftJSON(): any {
        return {};
    }
}

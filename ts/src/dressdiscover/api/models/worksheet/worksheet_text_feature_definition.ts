import * as Backbone from "backbone";

export class WorksheetTextFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {}) {
        super(attributes);
    }



    static fromThryftJSON(json: any): WorksheetTextFeatureDefinition {
        return new WorksheetTextFeatureDefinition;
    }

    toThryftJSON(): any {
        return {};
    }
}

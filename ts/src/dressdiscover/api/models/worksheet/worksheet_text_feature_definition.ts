import * as Backbone from "backbone";

export class WorksheetTextFeatureDefinition extends Backbone.Model {
    constructor(attributes?: {}) {
        let attributes_: any = {};
        if (attributes) {
        }
        attributes_["validation"] = {

        }
        super(attributes_);
    }



    static fromThryftJSON(json: any): WorksheetTextFeatureDefinition {
        return new WorksheetTextFeatureDefinition;
    }

    toThryftJSON(): any {
        return {};
    }
}

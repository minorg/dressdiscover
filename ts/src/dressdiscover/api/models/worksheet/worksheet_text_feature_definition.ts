import * as Backbone from "backbone";

export class WorksheetTextFeatureDefinition extends Backbone.Model {
    validation = {

    }

    validationError: any;

    constructor(attributes?: {}, options?: any) {
        super(attributes, options);
    }



    static fromThryftJSON(json: any): WorksheetTextFeatureDefinition {
        return new WorksheetTextFeatureDefinition;
    }

    toThryftJSON(): any {
        return {};
    }
}

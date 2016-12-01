import * as Backbone from "backbone";
import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";

export class WorksheetDefinition extends Backbone.Model {
    validation = {
        rootFeatureSet: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (!(value instanceof WorksheetFeatureSetDefinition)) {
                    return "expected WorksheetDefinition.root_feature_set to be a WorksheetFeatureSetDefinition";
                }
                if (!value.isValid(true)) {
                    return value.validationError;
                }

                return undefined;
            },
            "required": true
        }
    }

    validationError: any;

    constructor(attributes?: {rootFeatureSet: WorksheetFeatureSetDefinition}, options?: any) {
        super(attributes, options);
    }

    get rootFeatureSet(): WorksheetFeatureSetDefinition {
        return this.get('rootFeatureSet');
    }

    set rootFeatureSet(value: WorksheetFeatureSetDefinition) {
        this.set('rootFeatureSet', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetDefinition {
        var out: WorksheetDefinition = new WorksheetDefinition;
        for (var fieldName in json) {
            if (fieldName == "root_feature_set") {
                out.attributes.rootFeatureSet = WorksheetFeatureSetDefinition.fromThryftJSON(json[fieldName]);
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["root_feature_set"] = this.rootFeatureSet.toThryftJSON();
        return json;
    }
}

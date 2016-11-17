import * as Backbone from "backbone";
import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";

export class WorksheetDefinition extends Backbone.Model {
    validation = {
        rootFeatureSets: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (!(value instanceof Backbone.Collection)) {
                    return "expected WorksheetDefinition.root_feature_sets to be a Backbone.Collection";
                }
                if (value.model !== WorksheetFeatureSetDefinition) {
                    return "expected WorksheetDefinition.root_feature_sets to be a Backbone.Collection with model=WorksheetFeatureSetDefinition";
                }
                for (let __model0 of value.models) {
                    if (!__model0.isValid(true)) {
                        return __model0.validationError;
                    }
                }
                return undefined;
            },
            "required": true
        }
    }

    validationError: any;

    constructor(attributes?: {rootFeatureSets: Backbone.Collection<WorksheetFeatureSetDefinition>}, options?: any) {
        super(attributes, options);
    }

    get rootFeatureSets(): Backbone.Collection<WorksheetFeatureSetDefinition> {
        return this.get('rootFeatureSets');
    }

    set rootFeatureSets(value: Backbone.Collection<WorksheetFeatureSetDefinition>) {
        this.set('rootFeatureSets', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetDefinition {
        var out: WorksheetDefinition = new WorksheetDefinition;
        for (var fieldName in json) {
            if (fieldName == "root_feature_sets") {
                out.attributes.rootFeatureSets = function(json: any[]): Backbone.Collection<WorksheetFeatureSetDefinition> { var sequence: WorksheetFeatureSetDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<WorksheetFeatureSetDefinition>(sequence); }(json[fieldName]);
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["root_feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.rootFeatureSets.models);
        return json;
    }
}

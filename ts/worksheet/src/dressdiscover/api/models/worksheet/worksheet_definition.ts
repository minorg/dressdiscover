import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";

export class WorksheetDefinition {
    constructor(kwds: {featureSets: WorksheetFeatureSetDefinition[]}) {
        this._featureSets = WorksheetDefinition._validateFeatureSets(kwds.featureSets);
    }

    get featureSets(): WorksheetFeatureSetDefinition[] {
        return this._featureSets;
    }

    set featureSets(featureSets: WorksheetFeatureSetDefinition[]) {
        this._featureSets = WorksheetDefinition._validateFeatureSets(featureSets);
    }

    private static _validateFeatureSets(featureSets: WorksheetFeatureSetDefinition[]): WorksheetFeatureSetDefinition[] {
        return featureSets;
    }

    deepCopy(): WorksheetDefinition {
        return new WorksheetDefinition({ featureSets: function(__value0: WorksheetFeatureSetDefinition[]) { let __copy0: WorksheetFeatureSetDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.featureSets) });
    }

    equals(other: WorksheetDefinition): boolean {
        if (!(function(left: WorksheetFeatureSetDefinition[], right: WorksheetFeatureSetDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureSets, other.featureSets))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetDefinition {
        var featureSets: WorksheetFeatureSetDefinition[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "feature_sets") {
                featureSets = function(json: any[]): WorksheetFeatureSetDefinition[] { var sequence: WorksheetFeatureSetDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (featureSets == null) {
            throw new TypeError('featureSets is required');
        }
        return new WorksheetDefinition({featureSets: featureSets});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.featureSets);
        return json;
    }

    toString(): string {
        return "WorksheetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.featureSets);
        return json;
    }

    private _featureSets: WorksheetFeatureSetDefinition[];
}

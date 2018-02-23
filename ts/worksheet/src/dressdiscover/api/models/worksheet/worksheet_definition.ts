import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";

export class WorksheetDefinition {
    private _rootFeatureSet: WorksheetFeatureSetDefinition;

    constructor(kwds: {rootFeatureSet: WorksheetFeatureSetDefinition}) {
        this.rootFeatureSet = kwds.rootFeatureSet;
    }

    get rootFeatureSet(): WorksheetFeatureSetDefinition {
        return this._rootFeatureSet;
    }

    set rootFeatureSet(rootFeatureSet: WorksheetFeatureSetDefinition) {
        this._rootFeatureSet = rootFeatureSet;
    }

    deepCopy(): WorksheetDefinition {
        return new WorksheetDefinition({ rootFeatureSet: this.rootFeatureSet.deepCopy() });
    }

    equals(other: WorksheetDefinition): boolean {
        if (!(this.rootFeatureSet.equals(other.rootFeatureSet))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetDefinition {
        var rootFeatureSet: WorksheetFeatureSetDefinition | undefined;
        for (var fieldName in json) {
            if (fieldName == "root_feature_set") {
                rootFeatureSet = WorksheetFeatureSetDefinition.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (rootFeatureSet == null) {
            throw new TypeError('rootFeatureSet is required');
        }
        return new WorksheetDefinition({rootFeatureSet: rootFeatureSet});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["root_feature_set"] = this.rootFeatureSet.toJsonObject();
        return json;
    }

    toString(): string {
        return "WorksheetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["root_feature_set"] = this.rootFeatureSet.toThryftJsonObject();
        return json;
    }
}

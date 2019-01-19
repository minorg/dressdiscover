import { WorksheetExtentDefinition } from "./worksheet_extent_definition";
import { WorksheetFeatureDefinition } from "./worksheet_feature_definition";
import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";
import { WorksheetFeatureValueDefinition } from "./worksheet_feature_value_definition";

export class WorksheetDefinition {
    constructor(kwds: {featureSets: WorksheetFeatureSetDefinition[], featureValues: WorksheetFeatureValueDefinition[], features: WorksheetFeatureDefinition[], extents?: WorksheetExtentDefinition[]}) {
        this.featureSetsPrivate = WorksheetDefinition.validateFeatureSets(kwds.featureSets);
        this.featureValuesPrivate = WorksheetDefinition.validateFeatureValues(kwds.featureValues);
        this.featuresPrivate = WorksheetDefinition.validateFeatures(kwds.features);
        if (kwds.extents != null) {
            this.extentsPrivate = WorksheetDefinition.validateExtents(kwds.extents);
        } else {
            this.extentsPrivate = undefined;
        }
    }

    get featureSets(): WorksheetFeatureSetDefinition[] {
        return this.featureSetsPrivate;
    }

    set featureSets(featureSets: WorksheetFeatureSetDefinition[]) {
        this.featureSetsPrivate = WorksheetDefinition.validateFeatureSets(featureSets);
    }

    get featureValues(): WorksheetFeatureValueDefinition[] {
        return this.featureValuesPrivate;
    }

    set featureValues(featureValues: WorksheetFeatureValueDefinition[]) {
        this.featureValuesPrivate = WorksheetDefinition.validateFeatureValues(featureValues);
    }

    get features(): WorksheetFeatureDefinition[] {
        return this.featuresPrivate;
    }

    set features(features: WorksheetFeatureDefinition[]) {
        this.featuresPrivate = WorksheetDefinition.validateFeatures(features);
    }

    get extents(): WorksheetExtentDefinition[] | undefined {
        return this.extentsPrivate;
    }

    set extents(extents: WorksheetExtentDefinition[] | undefined) {
        this.extentsPrivate = WorksheetDefinition.validateExtents(extents);
    }

    public deepCopy(): WorksheetDefinition {
        return new WorksheetDefinition({ featureSets: (this.featureSets).map((value0) => value0.deepCopy()), featureValues: (this.featureValues).map((value0) => value0.deepCopy()), features: (this.features).map((value0) => value0.deepCopy()), extents: (this.extents ? ((this.extents).map((value0) => value0.deepCopy())) : undefined) });
    }

    public equals(other: WorksheetDefinition): boolean {
        if (!(((left: WorksheetFeatureSetDefinition[], right: WorksheetFeatureSetDefinition[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.featureSets, other.featureSets))) {
            return false;
        }

        if (!(((left: WorksheetFeatureValueDefinition[], right: WorksheetFeatureValueDefinition[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.featureValues, other.featureValues))) {
            return false;
        }

        if (!(((left: WorksheetFeatureDefinition[], right: WorksheetFeatureDefinition[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.features, other.features))) {
            return false;
        }

        if (!((!((typeof (this.extents)) === "undefined") && !((typeof (other.extents)) === "undefined")) ? (((left: WorksheetExtentDefinition[], right: WorksheetExtentDefinition[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })((this.extents as WorksheetExtentDefinition[]), (other.extents as WorksheetExtentDefinition[]))) : (((typeof (this.extents)) === "undefined") && ((typeof (other.extents)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetDefinition {
        let featureSets: WorksheetFeatureSetDefinition[] | undefined;
        let featureValues: WorksheetFeatureValueDefinition[] | undefined;
        let features: WorksheetFeatureDefinition[] | undefined;
        let extents: WorksheetExtentDefinition[] | undefined;
        for (const fieldName in json) {
            if (fieldName === "feature_sets") {
                featureSets = (json[fieldName]).map((element: any) => WorksheetFeatureSetDefinition.fromThryftJsonObject(element));
            } else if (fieldName === "feature_values") {
                featureValues = (json[fieldName]).map((element: any) => WorksheetFeatureValueDefinition.fromThryftJsonObject(element));
            } else if (fieldName === "features") {
                features = (json[fieldName]).map((element: any) => WorksheetFeatureDefinition.fromThryftJsonObject(element));
            } else if (fieldName === "extents") {
                extents = (json[fieldName]).map((element: any) => WorksheetExtentDefinition.fromThryftJsonObject(element));
            }
        }
        if (featureSets == null) {
            throw new TypeError("featureSets is required");
        }
        if (featureValues == null) {
            throw new TypeError("featureValues is required");
        }
        if (features == null) {
            throw new TypeError("features is required");
        }
        return new WorksheetDefinition({featureSets, featureValues, features, extents});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.feature_sets = (this.featureSets).map((inElement) => inElement.toJsonObject());
        json.feature_values = (this.featureValues).map((inElement) => inElement.toJsonObject());
        json.features = (this.features).map((inElement) => inElement.toJsonObject());
        if (this.extents != null) {
            json.extents = (this.extents).map((inElement) => inElement.toJsonObject());
        }
        return json;
    }

    public toString(): string {
        return "WorksheetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.feature_sets = (this.featureSets).map((inElement) => inElement.toThryftJsonObject());
        json.feature_values = (this.featureValues).map((inElement) => inElement.toThryftJsonObject());
        json.features = (this.features).map((inElement) => inElement.toThryftJsonObject());
        if (this.extents != null) {
            json.extents = (this.extents).map((inElement) => inElement.toThryftJsonObject());
        }
        return json;
    }

    private static validateExtents(extents: WorksheetExtentDefinition[] | undefined): WorksheetExtentDefinition[] | undefined {
        if (extents != null) {
            if (extents.length < 1) {
                throw new RangeError("expected len(extents) to be >= 1, was " + extents.length);
            }
        }
        return extents;
    }

    private static validateFeatureSets(featureSets: WorksheetFeatureSetDefinition[]): WorksheetFeatureSetDefinition[] {
        if (featureSets == null) {
            throw new RangeError("featureSets is null or undefined");
        }
        if (featureSets.length < 1) {
            throw new RangeError("expected len(featureSets) to be >= 1, was " + featureSets.length);
        }
        return featureSets;
    }

    private static validateFeatureValues(featureValues: WorksheetFeatureValueDefinition[]): WorksheetFeatureValueDefinition[] {
        if (featureValues == null) {
            throw new RangeError("featureValues is null or undefined");
        }
        if (featureValues.length < 1) {
            throw new RangeError("expected len(featureValues) to be >= 1, was " + featureValues.length);
        }
        return featureValues;
    }

    private static validateFeatures(features: WorksheetFeatureDefinition[]): WorksheetFeatureDefinition[] {
        if (features == null) {
            throw new RangeError("features is null or undefined");
        }
        if (features.length < 1) {
            throw new RangeError("expected len(features) to be >= 1, was " + features.length);
        }
        return features;
    }

    private extentsPrivate?: WorksheetExtentDefinition[];

    private featureSetsPrivate: WorksheetFeatureSetDefinition[];

    private featureValuesPrivate: WorksheetFeatureValueDefinition[];

    private featuresPrivate: WorksheetFeatureDefinition[];
}

import { WorksheetFeatureDefinition } from "./worksheet_feature_definition";
import { WorksheetFeatureSetDefinition } from "./worksheet_feature_set_definition";
import { WorksheetFeatureValueDefinition } from "./worksheet_feature_value_definition";

export class WorksheetDefinition {
    constructor(kwds: {featureSets: WorksheetFeatureSetDefinition[], featureValues: WorksheetFeatureValueDefinition[], features: WorksheetFeatureDefinition[]}) {
        this.featureSets = WorksheetDefinition.validateFeatureSets(kwds.featureSets);
        this.featureValues = WorksheetDefinition.validateFeatureValues(kwds.featureValues);
        this.features = WorksheetDefinition.validateFeatures(kwds.features);
    }

    public deepCopy(): WorksheetDefinition {
        return new WorksheetDefinition({ featureSets: (this.featureSets).map((value0) => value0.deepCopy()), featureValues: (this.featureValues).map((value0) => value0.deepCopy()), features: (this.features).map((value0) => value0.deepCopy()) });
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

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetDefinition {
        let featureSets: WorksheetFeatureSetDefinition[] | undefined;
        let featureValues: WorksheetFeatureValueDefinition[] | undefined;
        let features: WorksheetFeatureDefinition[] | undefined;
        for (const fieldName in json) {
            if (fieldName === "feature_sets") {
                featureSets = (json[fieldName]).map((element: any) => WorksheetFeatureSetDefinition.fromThryftJsonObject(element));
            } else if (fieldName === "feature_values") {
                featureValues = (json[fieldName]).map((element: any) => WorksheetFeatureValueDefinition.fromThryftJsonObject(element));
            } else if (fieldName === "features") {
                features = (json[fieldName]).map((element: any) => WorksheetFeatureDefinition.fromThryftJsonObject(element));
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
        return new WorksheetDefinition({featureSets, featureValues, features});
    }

    public toJsonObject(): {feature_sets: Array<{description: {rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, text_en: string} | undefined, display_name_en: string, feature_ids: Array<string>, id: string}>, feature_values: Array<{description: {rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, text_en: string} | undefined, display_name_en: string, id: string, image: {full_size_url: {absolute: string | undefined, relative: string | undefined} | undefined, rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, thumbnail_url: {absolute: string | undefined, relative: string | undefined}} | undefined}>, features: Array<{description: {rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, text_en: string} | undefined, display_name_en: string, id: string, value_ids: Array<string>}>} {
        return {
            feature_sets: (this.featureSets).map((inElement) => inElement.toJsonObject()),
            feature_values: (this.featureValues).map((inElement) => inElement.toJsonObject()),
            features: (this.features).map((inElement) => inElement.toJsonObject())
        };
    }

    public toString(): string {
        return "WorksheetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {feature_sets: Array<{description: {rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, text_en: string} | undefined, display_name_en: string, feature_ids: Array<string>, id: string}>, feature_values: Array<{description: {rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, text_en: string} | undefined, display_name_en: string, id: string, image: {full_size_url: {absolute: string | undefined, relative: string | undefined} | undefined, rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, thumbnail_url: {absolute: string | undefined, relative: string | undefined}} | undefined}>, features: Array<{description: {rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, text_en: string} | undefined, display_name_en: string, id: string, value_ids: Array<string>}>} {
        return {
            feature_sets: (this.featureSets).map((inElement) => inElement.toThryftJsonObject()),
            feature_values: (this.featureValues).map((inElement) => inElement.toThryftJsonObject()),
            features: (this.features).map((inElement) => inElement.toThryftJsonObject())
        };
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

    public readonly featureSets: WorksheetFeatureSetDefinition[];
    public readonly featureValues: WorksheetFeatureValueDefinition[];
    public readonly features: WorksheetFeatureDefinition[];
}

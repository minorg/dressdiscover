import {WorksheetFeatureDefinition} from "./WorksheetFeatureDefinition";
import {WorksheetFeatureSetDefinition} from "./WorksheetFeatureSetDefinition";
import {WorksheetFeatureValueDefinition} from "./WorksheetFeatureValueDefinition";

export interface WorksheetDefinition {
  readonly features: readonly WorksheetFeatureDefinition[];
  readonly featureSets: readonly WorksheetFeatureSetDefinition[];
  readonly featureValues: readonly WorksheetFeatureValueDefinition[];
}

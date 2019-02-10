import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_definition';
import {
    WorksheetFeatureValueDefinition,
} from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_value_definition';
import * as _ from 'lodash';

export class WorksheetDefinitionValidator {
    validateWorksheetDefinition(definition: WorksheetDefinition): WorksheetDefinition {
        const featuresById: { [index: string]: WorksheetFeatureDefinition } = {};
        for (let feature of definition.features) {
            if (_.isUndefined(featuresById[feature.id.toString()])) {
                featuresById[feature.id.toString()] = feature;
            } else {
                console.error("duplicate feature id " + feature.id);
            }
        }

        const featureValuesById: { [index: string]: WorksheetFeatureValueDefinition } = {};
        for (let featureValue of definition.featureValues) {
            if (_.isUndefined(featureValuesById[featureValue.id.toString()])) {
                featureValuesById[featureValue.id.toString()] = featureValue;
            } else {
                console.error("duplicate feature value id " + featureValue.id);
            }
        }

        for (let featureSet of definition.featureSets) {
            for (var featureI = 0; featureI < featureSet.featureIds.length;) {
                const featureId = featureSet.featureIds[featureI];
                if (!_.isUndefined(featuresById[featureId.toString()])) {
                    featureI++;
                } else {
                    console.error("feature set " + featureSet.id + " references unknown feature id " + featureId);
                    featureSet.featureIds.splice(featureI, 1);
                }
            }
        }

        for (let feature of definition.features) {
            for (var featureValueI = 0; featureValueI < feature.valueIds.length;) {
                const featureValueId = feature.valueIds[featureValueI];
                if (!_.isUndefined(featureValuesById[featureValueId.toString()])) {
                    featureValueI++;
                } else {
                    console.error("feature " + feature.id + " references unknown feature value " + featureValueId);
                    feature.valueIds.splice(featureValueI, 1);
                }
            }
        }

        return definition;
    }
}
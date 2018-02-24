import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureValueDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_definition';
import * as _ from 'underscore';

export class WorksheetDefinitionValidator {
    validateWorksheetDefinition(definition: WorksheetDefinition): WorksheetDefinition {
        const featuresById: { [index: string]: WorksheetFeatureDefinition } = {};
        for (let feature of definition.features) {
            if (!_.isUndefined(featuresById[feature.id])) {
                throw new RangeError("duplicate feature id " + feature.id);
            }
            featuresById[feature.id] = feature;
        }

        const featureValuesById: { [index: string]: WorksheetFeatureValueDefinition } = {};
        for (let featureValue of definition.featureValues) {
            if (!_.isUndefined(featureValuesById[featureValue.id])) {
                throw new RangeError("duplicate feature value id " + featureValue.id);
            }
            featureValuesById[featureValue.id] = featureValue;
        }

        for (let featureSet of definition.featureSets) {
            for (let featureId of featureSet.featureIds) {
                if (_.isUndefined(featuresById[featureId])) {
                    throw new RangeError("feature set " + featureSet.id + " references unknown feature id " + featureId);
                }
            }
        }

        for (let feature of definition.features) {
            for (let featureValueId of feature.valueIds) {
                if (_.isUndefined(featureValuesById[featureValueId])) {
                    throw new RangeError("feature " + feature.id + " references unknown feature " + featureValueId);
                }
            }
        }

        return definition;
    }
}
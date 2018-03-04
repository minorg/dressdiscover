import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetExtentDefinition } from 'dressdiscover/api/models/worksheet/worksheet_extent_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureValueDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_definition';
import * as _ from 'lodash';

export class WorksheetDefinitionValidator {
    validateWorksheetDefinition(definition: WorksheetDefinition): WorksheetDefinition {
        const extentsById: { [index: string]: WorksheetExtentDefinition } = {};
        if (definition.extents) {
            for (let extent of definition.extents) {
                if (_.isUndefined(extentsById[extent.id.toString()])) {
                    extentsById[extent.id.toString()] = extent;
                } else {
                    console.error("duplicate extent id " + extent.id);
                }
            }
        }

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
            if (featureSet.extentIds) {
                for (let extentId of featureSet.extentIds) {
                    if (_.isUndefined(extentsById[extentId.toString()])) {
                        throw new RangeError("feature set " + featureSet.id + " references unknown extent id " + extentId);
                    }
                }
            }

            for (let featureId of featureSet.featureIds) {
                if (_.isUndefined(featuresById[featureId.toString()])) {
                    throw new RangeError("feature set " + featureSet.id + " references unknown feature id " + featureId);
                }
            }
        }

        for (let feature of definition.features) {
            if (feature.extentIds) {
                for (let extentId of feature.extentIds) {
                    if (_.isUndefined(extentsById[extentId.toString()])) {
                        throw new RangeError("feature " + feature.id + " references unknown extent id " + extentId);
                    }
                }
            }

            for (let featureValueId of feature.valueIds) {
                if (_.isUndefined(featureValuesById[featureValueId.toString()])) {
                    throw new RangeError("feature " + feature.id + " references unknown feature " + featureValueId);
                }
            }
        }

        return definition;
    }
}
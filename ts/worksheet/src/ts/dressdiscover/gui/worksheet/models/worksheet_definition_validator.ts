import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetExtentDefinition } from 'dressdiscover/api/models/worksheet/worksheet_extent_definition';
import { WorksheetExtentId } from 'dressdiscover/api/models/worksheet/worksheet_extent_id';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureValueDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_definition';
import * as _ from 'lodash';

export class WorksheetDefinitionValidator {
    private _validateExtentIds(caller: string, extentsById: { [index: string]: WorksheetExtentDefinition }, extentIds: WorksheetExtentId[]) {
        for (var extentI = 0; extentI < extentIds.length; ){
            const extentId = extentIds[extentI];
            if (!_.isUndefined(extentsById[extentId.toString()])) {
                extentI++;
            } else {
                extentIds.splice(extentI, 1);
                console.error(caller + " references unknown extent id " + extentId);
            }
        }
    }

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
                this._validateExtentIds("feature set " + featureSet.id, extentsById, featureSet.extentIds);
            }

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
            if (feature.extentIds) {
                this._validateExtentIds("feature " + feature.id, extentsById, feature.extentIds);
            }

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
import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import {
    NoSuchWorksheetFeatureDefinitionException,
} from 'dressdiscover/api/services/worksheet/no_such_worksheet_feature_definition_exception';
import {
    NoSuchWorksheetFeatureSetDefinitionException,
} from 'dressdiscover/api/services/worksheet/no_such_worksheet_feature_set_definition_exception';
import {
    NoSuchWorksheetFeatureValueDefinitionException,
} from 'dressdiscover/api/services/worksheet/no_such_worksheet_feature_value_definition_exception';
import {
    WorksheetExtentDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetExtentDefinitionWrapper';
import {
    WorksheetFeatureDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetFeatureDefinitionWrapper';
import {
    WorksheetFeatureSetDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetFeatureSetDefinitionWrapper';
import {
    WorksheetFeatureValueDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetFeatureValueDefinitionWrapper';

export class WorksheetDefinitionWrapper {
    constructor(readonly definition: WorksheetDefinition) {
        // Order is important
        if (definition.extents) {
            for (let extent of definition.extents) {
                this.extents.push(new WorksheetExtentDefinitionWrapper(extent));
            }
        }
        for (let featureValue of definition.featureValues) {
            this.featureValues.push(new WorksheetFeatureValueDefinitionWrapper(featureValue));
        }
        for (let feature of definition.features) {
            this.features.push(new WorksheetFeatureDefinitionWrapper(feature, this));
        }
        for (let featureSet of definition.featureSets) {
            this.featureSets.push(new WorksheetFeatureSetDefinitionWrapper(featureSet, this));
        }
    }

    getFeatureSetById(featureSetId: WorksheetFeatureSetId): WorksheetFeatureSetDefinitionWrapper {
        for (let featureSetDefinition of this.featureSets) {
            if (featureSetDefinition.id.equals(featureSetId)) {
                return featureSetDefinition;
            }
        }
        throw new NoSuchWorksheetFeatureSetDefinitionException({ id: featureSetId });
    }

    getFeatureById(featureId: WorksheetFeatureId): WorksheetFeatureDefinitionWrapper {
        for (let featureDefinition of this.features) {
            if (featureDefinition.id.equals(featureId)) {
                return featureDefinition;
            }
        }
        throw new NoSuchWorksheetFeatureDefinitionException({ id: featureId });
    }

    getFeatureValueById(featureValueId: WorksheetFeatureValueId): WorksheetFeatureValueDefinitionWrapper {
        for (let featureValueDefinition of this.featureValues) {
            if (featureValueDefinition.id.equals(featureValueId)) {
                return featureValueDefinition;
            }
        }
        throw new NoSuchWorksheetFeatureValueDefinitionException({ id: featureValueId });
    }

    getNextFeatureId(kwds: { currentFeatureId: WorksheetFeatureId, currentFeatureSetDefinition: WorksheetFeatureSetDefinition }): WorksheetFeatureId | undefined {
        let currentFeatureIndex: number = 0;
        for (; currentFeatureIndex < kwds.currentFeatureSetDefinition.featureIds.length; currentFeatureIndex++) {
            if (kwds.currentFeatureSetDefinition.featureIds[currentFeatureIndex].equals(kwds.currentFeatureId)) {
                break;
            }
        }
        if (currentFeatureIndex == kwds.currentFeatureSetDefinition.featureIds.length) {
            throw new NoSuchWorksheetFeatureDefinitionException({ id: kwds.currentFeatureId });
        }

        if (currentFeatureIndex + 1 < kwds.currentFeatureSetDefinition.featureIds.length) {
            return kwds.currentFeatureSetDefinition.featureIds[currentFeatureIndex + 1];
        } else {
            return undefined;
        }
    }

    getNextFeatureSetId(kwds: { currentFeatureSetId: WorksheetFeatureSetId, featureSetIds: WorksheetFeatureSetId[] }) {
        let currentFeatureSetIndex: number = 0;
        for (; currentFeatureSetIndex < kwds.featureSetIds.length; currentFeatureSetIndex++) {
            if (kwds.featureSetIds[currentFeatureSetIndex].equals(kwds.currentFeatureSetId)) {
                break;
            }
        }
        if (currentFeatureSetIndex == kwds.featureSetIds.length) {
            throw new NoSuchWorksheetFeatureSetDefinitionException({ id: kwds.currentFeatureSetId });
        }

        if (currentFeatureSetIndex + 1 < kwds.featureSetIds.length) {
            return kwds.featureSetIds[currentFeatureSetIndex + 1];
        } else {
            return undefined;
        }
    }

    readonly extents: WorksheetExtentDefinitionWrapper[] = [];
    readonly featureSets: WorksheetFeatureSetDefinitionWrapper[] = [];
    readonly featureValues: WorksheetFeatureValueDefinitionWrapper[] = [];
    readonly features: WorksheetFeatureDefinitionWrapper[] = [];
}
import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import {
    NoSuchWorksheetFeatureDefinitionException,
} from 'dressdiscover/api/services/worksheet/no_such_worksheet_feature_definition_exception';
import {
    NoSuchWorksheetFeatureSetDefinitionException,
} from 'dressdiscover/api/services/worksheet/no_such_worksheet_feature_set_definition_exception';

export class WorksheetDefinitionWrapper {
    constructor(worksheetDefinition: WorksheetDefinition) {
        this._delegate = worksheetDefinition;
    }

    get featureSets() {
        return this._delegate.featureSets;
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

    getFeatureSetDefinition(featureSetId: WorksheetFeatureSetId): WorksheetFeatureSetDefinition {
        for (let featureSetDefinition of this._delegate.featureSets) {
            if (featureSetDefinition.id.equals(featureSetId)) {
                return featureSetDefinition;
            }
        }
        throw new NoSuchWorksheetFeatureSetDefinitionException({ id: featureSetId });
    }

    getFeatureDefinition(featureId: WorksheetFeatureId): WorksheetFeatureDefinition {
        for (let featureDefinition of this._delegate.features) {
            if (featureDefinition.id.equals(featureId)) {
                return featureDefinition;
            }
        }
        throw new NoSuchWorksheetFeatureDefinitionException({ id: featureId });
    }

    private _delegate: WorksheetDefinition;
}
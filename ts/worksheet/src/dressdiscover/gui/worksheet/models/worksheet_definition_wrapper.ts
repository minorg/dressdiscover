import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
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

    getNextFeatureId(kwds: { currentFeatureSetDefinition: WorksheetFeatureSetDefinition, currentFeatureId: string }): string | undefined {
        let currentFeatureIndex: number = 0;
        for (; currentFeatureIndex < kwds.currentFeatureSetDefinition.featureIds.length; currentFeatureIndex++) {
            if (kwds.currentFeatureSetDefinition.featureIds[currentFeatureIndex] == kwds.currentFeatureId) {
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

    getNextFeatureSetId(kwds: { currentFeatureSetId: string, featureSetDefinitions: [] }) {
        let currentFeatureSetIndex: number = 0;
        for (; currentFeatureSetIndex < this._delegate.featureIds.length; currentFeatureSetIndex++) {
            if (kwds.currentFeatureSetDefinition.featureIds[currentFeatureSetIndex] == kwds.currentFeatureId) {
                break;
            }
        }
        if (currentFeatureSetIndex == kwds.currentFeatureSetDefinition.featureIds.length) {
            throw new NoSuchWorksheetFeatureDefinitionException({ id: kwds.currentFeatureId });
        }

        if (currentFeatureSetIndex + 1 < kwds.currentFeatureSetDefinition.featureIds.length) {
            return kwds.currentFeatureSetDefinition.featureIds[currentFeatureSetIndex + 1];
        } else {
            return undefined;
        }
    }

    getNextFeatureSet({ currentFeatureSetId: string }) {

    }

    getFeatureSetDefinition(featureSetId: string): WorksheetFeatureSetDefinition {
        const featureSet = this._delegate.featureSets[featureSetId];
        if (featureSet) {
            return featureSet;
        } else {
            throw new NoSuchWorksheetFeatureSetDefinitionException({ id: featureSetId });
        }
    }

    getFeatureDefinition(featureSetId: string): WorksheetFeatureDefinition {
        const featureSet = this._delegate.featureSets[featureSetId];
        if (featureSet) {
            return featureSet;
        } else {
            throw new NoSuchWorksheetFeatureSetDefinitionException({ id: featureSetId });
        }
    }

    private _delegate: WorksheetDefinition;
}
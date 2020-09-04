import {
  WorksheetFeatureSetDefinition,
} from 'dressdiscover/gui/models/worksheet/definition/worksheet_feature_set_definition';
import { WorksheetFeatureSetId } from 'dressdiscover/gui/models/worksheet/worksheet_feature_set_id';
import { AbstractDefinitionWrapper } from 'dressdiscover/gui/models/worksheet/definition/AbstractDefinitionWrapper';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/models/worksheet/definition/WorksheetDefinitionWrapper';
import {
  WorksheetFeatureDefinitionWrapper,
} from 'dressdiscover/gui/models/worksheet/definition/WorksheetFeatureDefinitionWrapper';

export class WorksheetFeatureSetDefinitionWrapper extends AbstractDefinitionWrapper<WorksheetFeatureSetDefinition, WorksheetFeatureSetId> {
    constructor(definition: WorksheetFeatureSetDefinition, root: WorksheetDefinitionWrapper) {
        super(definition);
        for (const featureId of this.featureIds) {
            this.features.push(root.featureById(featureId));
        }
    }

    get featureIds() {
        return this.definition.featureIds;
    }

    readonly features: WorksheetFeatureDefinitionWrapper[] = [];
}

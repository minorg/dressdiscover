import {
  WorksheetFeatureSetDefinition,
} from '~/models/worksheet/definition/worksheet_feature_set_definition';
import { WorksheetFeatureSetId } from '~/models/worksheet/worksheet_feature_set_id';
import { AbstractDefinitionWrapper } from '~/models/worksheet/definition/AbstractDefinitionWrapper';
import { WorksheetDefinitionWrapper } from '~/models/worksheet/definition/WorksheetDefinitionWrapper';
import {
  WorksheetFeatureDefinitionWrapper,
} from '~/models/worksheet/definition/WorksheetFeatureDefinitionWrapper';

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

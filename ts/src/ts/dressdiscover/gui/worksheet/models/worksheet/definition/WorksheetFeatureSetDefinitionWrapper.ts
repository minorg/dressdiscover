import {
    WorksheetFeatureSetDefinition,
} from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_set_definition';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import {
    AbstractDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/definition/AbstractDefinitionWrapper';
import {
    WorksheetDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/definition/WorksheetDefinitionWrapper';
import {
    WorksheetFeatureDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/definition/WorksheetFeatureDefinitionWrapper';

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

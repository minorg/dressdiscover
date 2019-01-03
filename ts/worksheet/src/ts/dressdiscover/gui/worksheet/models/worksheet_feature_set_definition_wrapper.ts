import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { AbstractDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/abstract_definition_wrapper';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { WorksheetFeatureDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_feature_definition_wrapper';

export class WorksheetFeatureSetDefinitionWrapper extends AbstractDefinitionWrapper<WorksheetFeatureSetDefinition, WorksheetFeatureSetId> {
    constructor(definition: WorksheetFeatureSetDefinition, root: WorksheetDefinitionWrapper) {
        super(definition);
        for (let featureId of this.featureIds) {
            this.features.push(root.getFeatureById(featureId));
        }
    }

    get featureIds() {
        return this.definition.featureIds;
    }

    readonly features: WorksheetFeatureDefinitionWrapper[] = [];
}

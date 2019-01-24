import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { AbstractDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet/AbstractDefinitionWrapper';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetDefinitionWrapper';
import {
    WorksheetFeatureValueDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetFeatureValueDefinitionWrapper';

export class WorksheetFeatureDefinitionWrapper extends AbstractDefinitionWrapper<WorksheetFeatureDefinition, WorksheetFeatureId> {
    constructor(definition: WorksheetFeatureDefinition, root: WorksheetDefinitionWrapper) {
        super(definition);
        for (let valueId of this.valueIds) {
            this.values.push(root.featureValueById(valueId));
        }
    }

    get valueIds() {
        return this.definition.valueIds;
    }

    readonly values: WorksheetFeatureValueDefinitionWrapper[] = [];
}

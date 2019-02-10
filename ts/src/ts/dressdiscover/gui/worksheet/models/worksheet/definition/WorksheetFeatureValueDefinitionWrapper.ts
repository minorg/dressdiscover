import {
    WorksheetFeatureValueDefinition,
} from 'dressdiscover/api/models/worksheet/definition/worksheet_feature_value_definition';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import {
    AbstractDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/definition/AbstractDefinitionWrapper';

export class WorksheetFeatureValueDefinitionWrapper extends AbstractDefinitionWrapper<WorksheetFeatureValueDefinition, WorksheetFeatureValueId> {
    get image() {
        return this.definition.image;
    }
}

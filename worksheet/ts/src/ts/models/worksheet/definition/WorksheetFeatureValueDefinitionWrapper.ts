import {
  WorksheetFeatureValueDefinition,
} from '~/models/worksheet/definition/worksheet_feature_value_definition';
import { WorksheetFeatureValueId } from '~/models/worksheet/worksheet_feature_value_id';
import { AbstractDefinitionWrapper } from '~/models/worksheet/definition/AbstractDefinitionWrapper';

export class WorksheetFeatureValueDefinitionWrapper extends AbstractDefinitionWrapper<WorksheetFeatureValueDefinition, WorksheetFeatureValueId> {
    get image() {
        return this.definition.image;
    }
}

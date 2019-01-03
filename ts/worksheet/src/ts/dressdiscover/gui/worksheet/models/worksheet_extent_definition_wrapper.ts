import { WorksheetExtentDefinition } from 'dressdiscover/api/models/worksheet/worksheet_extent_definition';
import { WorksheetExtentId } from 'dressdiscover/api/models/worksheet/worksheet_extent_id';
import { AbstractDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/abstract_definition_wrapper';

export class WorksheetExtentDefinitionWrapper extends AbstractDefinitionWrapper<WorksheetExtentDefinition, WorksheetExtentId> {
    constructor(definition: WorksheetExtentDefinition) {
        super(definition);
    }
}

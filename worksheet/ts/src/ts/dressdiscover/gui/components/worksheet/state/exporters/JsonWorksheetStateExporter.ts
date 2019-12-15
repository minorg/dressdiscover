import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/WorksheetStateExporter';

export class JsonWorksheetStateExporter implements WorksheetStateExporter<any[]> {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): any[] {
        return worksheetStates.map((worksheetState) => worksheetState.toJsonObject());
    }
}

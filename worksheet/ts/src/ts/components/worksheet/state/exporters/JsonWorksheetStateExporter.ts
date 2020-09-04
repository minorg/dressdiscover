import { WorksheetDefinition } from '~/models/worksheet/definition/WorksheetDefinition';
import { WorksheetState } from '~/models/worksheet/state/WorksheetState';
import { WorksheetStateExporter } from '~/components/worksheet/state/exporters/WorksheetStateExporter';

export class JsonWorksheetStateExporter implements WorksheetStateExporter<any[]> {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): any[] {
        return worksheetStates.map((worksheetState) => worksheetState.toJsonObject());
    }
}

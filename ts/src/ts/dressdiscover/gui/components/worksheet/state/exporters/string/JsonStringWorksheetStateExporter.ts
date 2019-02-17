import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import {
    StringWorksheetStateExporter,
} from 'dressdiscover/gui/components/worksheet/state/exporters/string/StringWorksheetStateExporter';

export class JsonStringWorksheetStateExporter implements StringWorksheetStateExporter {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): string {
        return JSON.stringify(worksheetStates.map((worksheetState) => worksheetState.toJsonObject()), undefined, 4);
    }

    get fileExtension() {
        return "json";
    }

    get mimeType() {
        return "application/json";
    }
}

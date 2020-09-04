import { WorksheetDefinition } from 'dressdiscover/gui/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/gui/models/worksheet/state/worksheet_state';
import {
    JsonWorksheetStateExporter,
} from 'dressdiscover/gui/components/worksheet/state/exporters/JsonWorksheetStateExporter';
import {
    StringWorksheetStateExporter,
} from 'dressdiscover/gui/components/worksheet/state/exporters/string/StringWorksheetStateExporter';

export class JsonStringWorksheetStateExporter implements StringWorksheetStateExporter {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): string {
        return JSON.stringify(this.delegate.export(worksheetDefinition, worksheetStates), null, 4);
    }

    get displayName() {
        return "JSON";
    }

    get fileExtension() {
        return "json";
    }

    get mimeType() {
        return "application/json";
    }

    private readonly delegate = new JsonWorksheetStateExporter();
}

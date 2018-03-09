import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { StringExporter } from 'dressdiscover/gui/worksheet/exporters/string/string_exporter';

export class JsonExporter implements StringExporter {
    export(worksheetDefinition: WorksheetDefinition, worksheetState: WorksheetState): string {
        return JSON.stringify(worksheetState.toJsonObject(), undefined, 4);
    }

    get fileExtension() {
        return "json";
    }

    get mimeType() {
        return "application/json";
    }
}
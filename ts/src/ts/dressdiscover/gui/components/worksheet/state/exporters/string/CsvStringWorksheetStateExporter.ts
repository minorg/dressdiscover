import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { CsvWorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/CsvWorksheetStateExporter';
import {
    StringWorksheetStateExporter,
} from 'dressdiscover/gui/components/worksheet/state/exporters/string/StringWorksheetStateExporter';
import * as Papa from 'papaparse';

export class CsvStringWorksheetStateExporter implements StringWorksheetStateExporter {
    export(worksheetStates: WorksheetState[]): string {
        return Papa.unparse(this.csvExporter.export(worksheetStates));
    }

    get fileExtension() {
        return "csv";
    }

    get mimeType() {
        return "text/csv";
    }

    private readonly csvExporter: CsvWorksheetStateExporter = new CsvWorksheetStateExporter();
}

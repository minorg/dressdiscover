import { CsvWorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/CsvWorksheetStateExporter';
import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';
import * as Papa from 'papaparse';

export class CsvStringWorksheetStateExporter implements StringWorksheetStateExporter {
    export(worksheetState: WorksheetStateWrapper): string {
        return Papa.unparse(this.csvExporter.export(worksheetState));
    }

    get fileExtension() {
        return "csv";
    }

    get mimeType() {
        return "text/csv";
    }

    private readonly csvExporter: CsvWorksheetStateExporter = new CsvWorksheetStateExporter();
}

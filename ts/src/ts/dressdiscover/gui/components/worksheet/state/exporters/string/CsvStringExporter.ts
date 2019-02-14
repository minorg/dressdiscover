import { StringExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/string/StringExporter';
import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';
import * as Papa from 'papaparse';

import { CsvExporter } from '../CsvExporter';

export class CsvStringExporter implements StringExporter {
    export(worksheetState: WorksheetStateWrapper): string {
        return Papa.unparse(this.csvExporter.export(worksheetState));
    }

    get fileExtension() {
        return "csv";
    }

    get mimeType() {
        return "text/csv";
    }

    private readonly csvExporter: CsvExporter = new CsvExporter();
}

import { WorksheetDefinition } from '~/models/worksheet/definition/WorksheetDefinition';
import { WorksheetState } from '~/models/worksheet/state/WorksheetState';
import { CsvWorksheetStateExporter } from '~/components/worksheet/state/exporters/CsvWorksheetStateExporter';
import {
    StringWorksheetStateExporter,
} from '~/components/worksheet/state/exporters/string/StringWorksheetStateExporter';
import * as Papa from 'papaparse';

export class CsvStringWorksheetStateExporter implements StringWorksheetStateExporter {
    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): string {
        return Papa.unparse(this.csvExporter.export(worksheetDefinition, worksheetStates));
    }

    get displayName() {
        return "CSV";
    }

    get fileExtension() {
        return "csv";
    }

    get mimeType() {
        return "text/csv";
    }

    private readonly csvExporter: CsvWorksheetStateExporter = new CsvWorksheetStateExporter();
}

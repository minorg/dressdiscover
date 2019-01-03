import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';

export interface StringExporter {
    export(worksheetDefinition: WorksheetDefinition, worksheetState: WorksheetState): string;

    readonly fileExtension: string;
    readonly mimeType: string;
}

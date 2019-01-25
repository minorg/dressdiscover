import { WorksheetStateWrapper } from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetStateWrapper';

export interface StringExporter {
    export(worksheetState: WorksheetStateWrapper): string;

    readonly fileExtension: string;
    readonly mimeType: string;
}

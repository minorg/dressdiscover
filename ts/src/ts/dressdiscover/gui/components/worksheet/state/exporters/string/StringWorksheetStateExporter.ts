import { WorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/WorksheetStateExporter';

export interface StringWorksheetStateExporter extends WorksheetStateExporter<string> {
    readonly fileExtension: string;
    readonly mimeType: string;
}

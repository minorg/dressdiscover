import {
    StringWorksheetStateExporter,
} from 'dressdiscover/gui/components/worksheet/state/exporters/string/StringWorksheetStateExporter';
import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';

export class JsonStringWorksheetStateExporter implements StringWorksheetStateExporter {
    export(worksheetState: WorksheetStateWrapper): string {
        return JSON.stringify(worksheetState.toJsonObject(), undefined, 4);
    }

    get fileExtension() {
        return "json";
    }

    get mimeType() {
        return "application/json";
    }
}

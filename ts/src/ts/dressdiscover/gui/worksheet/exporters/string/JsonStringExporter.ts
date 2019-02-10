import { StringExporter } from 'dressdiscover/gui/worksheet/exporters/string/StringExporter';
import { WorksheetStateWrapper } from 'dressdiscover/gui/worksheet/models/worksheet/state/WorksheetStateWrapper';

export class JsonStringExporter implements StringExporter {
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

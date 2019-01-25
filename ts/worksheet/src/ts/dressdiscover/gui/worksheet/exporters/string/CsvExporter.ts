import { StringExporter } from 'dressdiscover/gui/worksheet/exporters/string/StringExporter';
import { WorksheetStateWrapper } from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetStateWrapper';
import * as Papa from 'papaparse';

export class CsvExporter implements StringExporter {
    export(worksheetState: WorksheetStateWrapper): string {
        const rows: string[][] = [];
        const header = ["id", "feature_set_id", "feature_id", "feature_value_id", "text"];
        rows.push(header);

        for (const featureSetState of worksheetState.featureSetStates) {
            for (const featureState of featureSetState.features) {
                const rowPrefix = [worksheetState.id.toString(), featureSetState.id.toString(), featureState.id.toString()];
                if (featureState.selectedValueIds) {
                    for (const selectedValueId of featureState.selectedValueIds) {
                        let row: string[] = [];
                        row = row.concat(rowPrefix);
                        row.push(selectedValueId.toString());
                        rows.push(row);
                    }
                }
            }
        }

        if (worksheetState.text) {
            const row: string[] = [worksheetState.id.toString()];
            while (row.length < header.length - 1) {
                row.push('');
            }
            row.push(worksheetState.text);
            rows.push(row);
        }

        return Papa.unparse(rows);
    }

    get fileExtension() {
        return "csv";
    }

    get mimeType() {
        return "text/csv";
    }
}

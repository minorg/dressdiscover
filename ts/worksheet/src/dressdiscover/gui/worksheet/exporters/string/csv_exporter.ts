import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { StringExporter } from 'dressdiscover/gui/worksheet/exporters/string/string_exporter';
import Papa = require('papaparse');

export class CsvExporter implements StringExporter {
    export(worksheetDefinition: WorksheetDefinition, worksheetState: WorksheetState): string {
        const rows: string[][] = [];
        let header = ["id", "feature_set_id", "feature_id", "feature_value_id", "text"];
        rows.push(header);

        for (let featureSetState of worksheetState.featureSets) {
            for (let featureState of featureSetState.features) {
                const rowPrefix = [worksheetState.id.toString(), featureSetState.id.toString(), featureState.id.toString()];
                if (featureState.selectedValueIds) {
                    for (let selectedValueId of featureState.selectedValueIds) {
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
import { WorksheetStateWrapper } from '../models/worksheet/WorksheetStateWrapper';
import { Exporter } from './Exporter';

export class CsvExporter implements Exporter<string[][]> {
    export(worksheetState: WorksheetStateWrapper): string[][] {
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

        return rows;
    }
}
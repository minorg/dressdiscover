import { WorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/WorksheetStateExporter';
import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';

export class CsvWorksheetStateExporter implements WorksheetStateExporter<string[][]> {
    export(worksheetState: WorksheetStateWrapper): string[][] {
        const rows: string[][] = [];
        const headerRow = ["id"];
        rows.push(headerRow);

        const dataRow = [worksheetState.id.toString()];
        rows.push(dataRow);

        if (worksheetState.text) {
            headerRow.push("description");
            dataRow.push(worksheetState.text);
        }

        for (const featureSetState of worksheetState.featureSetStates) {
            for (const featureState of featureSetState.features) {
                if (!featureState.selectedValueIds) {
                    continue;
                }

                headerRow.push(featureSetState.id.toString() + "/" + featureState.id.toString());
                dataRow.push(featureState.selectedValueIds.map((valueId) => valueId.toString()).join(";"));
            }
        }

        return rows;
    }
}
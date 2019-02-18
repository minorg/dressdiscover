import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/WorksheetStateExporter';
import * as _ from 'lodash';

export class CsvWorksheetStateExporter implements WorksheetStateExporter<string[][]> {
    static parseFeatureHeader(featureHeader: string): [WorksheetFeatureSetId, WorksheetFeatureId] {
        const split = featureHeader.split("/", 2);
        if (split.length !== 2) {
            throw new RangeError();
        }
        return [WorksheetFeatureSetId.parse(split[0]), WorksheetFeatureId.parse(split[1])];
    }

    export(worksheetStates: WorksheetState[]): string[][] {
        const rows: string[][] = [];

        const headerRow = ["id", "description"];
        for (const worksheetState of worksheetStates) {
            for (const featureSetState of worksheetState.featureSets) {
                for (const featureState of featureSetState.features) {
                    // Output every feature set and feature state, even if it doesn't have values.
                    const header = featureSetState.id.toString() + "/" + featureState.id.toString();
                    if (!headerRow.some((existingHeader) => existingHeader === header)) {
                        headerRow.push(header);
                    }
                }
            }
        }
        rows.push(headerRow);

        for (const worksheetState of worksheetStates) {
            const dataRow = [worksheetState.id.toString()];

            if (worksheetState.text) {
                dataRow.push(worksheetState.text);
            } else {
                dataRow.push("");
            }

            for (const featureHeader of headerRow.slice(2)) {
                const [featureSetId, featureId] = CsvWorksheetStateExporter.parseFeatureHeader(featureHeader);
                const featureSetState = _.find(worksheetState.featureSets, (existingFeatureSetState) => existingFeatureSetState.id.equals(featureSetId));
                if (!featureSetState) {
                    dataRow.push("");
                    continue;
                }
                const featureState = _.find(featureSetState.features, (existingFeatureState) => existingFeatureState.id.equals(featureId));
                if (!featureState) {
                    dataRow.push("");
                    continue;
                }
                if (!featureState.selectedValueIds) {
                    dataRow.push("");
                    continue;
                }
                dataRow.push(featureState.selectedValueIds.map((valueId) => valueId.toString()).join(";"));
            }

            rows.push(dataRow);
        }

        return rows;
    }
}

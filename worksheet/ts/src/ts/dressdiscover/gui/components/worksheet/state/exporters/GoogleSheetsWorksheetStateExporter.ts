import { WorksheetDefinition } from 'dressdiscover/gui/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/gui/models/worksheet/state/worksheet_state';
import { WorksheetFeatureId } from 'dressdiscover/gui/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/gui/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateExporter } from 'dressdiscover/gui/components/worksheet/state/exporters/WorksheetStateExporter';
import * as _ from 'lodash';

export class GoogleSheetsWorksheetStateExporter implements WorksheetStateExporter<string[][]> {
    static readonly FIRST_FEATURE_COLUMN_INDEX = 4;

    static parseFeatureHeader(featureHeader: string): [WorksheetFeatureSetId, WorksheetFeatureId] {
        const split = featureHeader.split("/", 2);
        if (split.length !== 2) {
            throw new RangeError();
        }
        return [WorksheetFeatureSetId.parse(split[0]), WorksheetFeatureId.parse(split[1])];
    }

    export(worksheetDefinition: WorksheetDefinition, worksheetStates: WorksheetState[]): string[][] {
        const rows: string[][] = [];

        const headerRow = ["id", "ctime", "mtime", "description"];
        // Output all feature sets and values so they're represented in the CSV.
        for (const featureSetDefinition of worksheetDefinition.featureSets) {
            for (const featureId of featureSetDefinition.featureIds) {
                headerRow.push(featureSetDefinition.id.toString() + "/" + featureId.toString());
            }
        }
        rows.push(headerRow);

        for (const worksheetState of worksheetStates) {
            const dataRow = [worksheetState.id.toString(), worksheetState.ctime.toISOString(), worksheetState.mtime.toISOString()];

            if (worksheetState.text) {
                dataRow.push(worksheetState.text);
            } else {
                dataRow.push("");
            }

            for (const featureHeader of headerRow.slice(GoogleSheetsWorksheetStateExporter.FIRST_FEATURE_COLUMN_INDEX)) {
                const [featureSetId, featureId] = GoogleSheetsWorksheetStateExporter.parseFeatureHeader(featureHeader);
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

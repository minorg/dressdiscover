import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/state/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/state/worksheet_feature_state';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/state/worksheet_state_id';
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import {
    GoogleSheetsWorksheetStateExporter,
} from 'dressdiscover/gui/components/worksheet/state/exporters/GoogleSheetsWorksheetStateExporter';
import * as _ from 'lodash';
import * as Papa from 'papaparse';

export class GoogleSheetsWorksheetStateImporter {
    importCsvRows(csvRows: string[][]): WorksheetState[] {
        if (csvRows.length < 2) {
            return [];
        }

        const headerRow = csvRows[0];
        if (headerRow.length < GoogleSheetsWorksheetStateExporter.FIRST_FEATURE_COLUMN_INDEX) {
            return [];
        }
        const parsedHeaderColumns: any[] = headerRow.slice(GoogleSheetsWorksheetStateExporter.FIRST_FEATURE_COLUMN_INDEX).map((headerColumn) => GoogleSheetsWorksheetStateExporter.parseFeatureHeader(headerColumn));

        const worksheetStates: WorksheetState[] = [];
        for (const dataRow of csvRows.slice(1)) {
            if (dataRow.length < GoogleSheetsWorksheetStateExporter.FIRST_FEATURE_COLUMN_INDEX) {
                continue;
            }

            if (!dataRow[0].length) {
                continue;
            }
            const id = WorksheetStateId.parse(dataRow[0]);
            const ctime = new Date(Date.parse(dataRow[1]));
            const mtime = new Date(Date.parse(dataRow[2]));

            let description: string | undefined = dataRow[3];
            description = description.length ? description : undefined;

            // Build a map of maps of feature value id's.
            const featureSetValueIds: { [index: string]: { [index: string]: WorksheetFeatureValueId[] } } = {};
            dataRow.slice(GoogleSheetsWorksheetStateExporter.FIRST_FEATURE_COLUMN_INDEX).map((dataColumn, dataColumnI) => {
                const headerColumn = parsedHeaderColumns[dataColumnI];
                if (!headerColumn) {
                    return;
                }
                const [featureSetId, featureId] = headerColumn;
                if (!featureSetValueIds[featureSetId.toString()]) {
                    featureSetValueIds[featureSetId.toString()] = {};
                }
                featureSetValueIds[featureSetId.toString()][featureId.toString()] = dataColumn.length ? dataColumn.split(";").map((valueId) => WorksheetFeatureValueId.parse(valueId)) : [];
            });
            console.info("Feature set value ids: " + JSON.stringify(featureSetValueIds));

            const featureSetStates: WorksheetFeatureSetState[] = [];
            for (const featureSetIdString of _.keys(featureSetValueIds)) {
                const featureSetId = WorksheetFeatureSetId.parse(featureSetIdString);
                const featureStates: WorksheetFeatureState[] = [];
                for (const featureIdString of _.keys(featureSetValueIds[featureSetIdString])) {
                    const featureId = WorksheetFeatureId.parse(featureIdString);
                    const selectedValueIds = featureSetValueIds[featureSetIdString][featureIdString];
                    featureStates.push(new WorksheetFeatureState({ id: featureId, selectedValueIds: selectedValueIds.length ? selectedValueIds : undefined }));
                }
                featureSetStates.push(new WorksheetFeatureSetState({ features: featureStates, id: featureSetId }));
            }
            worksheetStates.push(new WorksheetState({ ctime, featureSets: featureSetStates, id, mtime, text: description }));
        }

        return worksheetStates;
    }

    importCsvString(csvString: string) {
        return this.importCsvRows(Papa.parse(csvString).data);
    }
}

import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureValueDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_definition';
import Papa = require('papaparse');
import * as _ from 'underscore';

export class WorksheetDefinitionCsvParser {
    parseWorksheetDefinitionCsv(kwds: {
        featuresCsv: string,
        featureSetsCsv: string,
        featureValuesCsv: string
    }): WorksheetDefinition {
        return new WorksheetDefinition({
            extents: [],
            features: this._parseFeaturesCsv(kwds.featuresCsv),
            featureSets: this._parseFeatureSetsCsv(kwds.featureSetsCsv),
            featureValues: this._parseFeatureValuesCsv(kwds.featureValuesCsv)
        });
    }

    private static _parseDuplicateColumnRows(duplicateColumnNames: string[], rows: any[]): any[] {
        let rowI = 0;
        let header: string[] = [];
        let outRows: any[] = [];
        for (let row of rows) {
            if (rowI++ == 0) {
                header = row;
                continue;
            }
            let outRow: any = {};
            for (let columnI in row) {
                const columnName = header[columnI];
                const columnValue = row[columnI];
                if (_.isEmpty(columnName) || _.isEmpty(columnValue)) {
                    continue;
                }
                if (_.contains(duplicateColumnNames, columnName)) {
                    if (_.isUndefined(outRow[columnName])) {
                        outRow[columnName] = [columnValue];
                    } else {
                        outRow[columnName].push(columnValue);
                    }
                } else {
                    outRow[columnName] = columnValue;
                }
            }
            if (!_.isEmpty(outRow)) {
                outRows.push(outRow);
            }
        }
        return outRows;
    }

    private _parseFeaturesCsv(csv: string): WorksheetFeatureDefinition[] {
        const features: WorksheetFeatureDefinition[] = [];
        const parsedCsv = Papa.parse(csv);
        let rows = WorksheetDefinitionCsvParser._parseDuplicateColumnRows(["value"], parsedCsv.data);
        for (let row of rows) {
            features.push(new WorksheetFeatureDefinition({
                displayName: row["display_name"],
                id: row["id"],
                valueIds: row["value"]
            }));
        }
        return features;
    }

    private _parseFeatureSetsCsv(csv: any): WorksheetFeatureSetDefinition[] {
        const featureSets: WorksheetFeatureSetDefinition[] = [];
        const parsedCsv = Papa.parse(csv);
        let rows = WorksheetDefinitionCsvParser._parseDuplicateColumnRows(["feature"], parsedCsv.data);
        for (let row of rows) {
            featureSets.push(new WorksheetFeatureSetDefinition({
                displayName: row["display_name"],
                featureIds: row["feature"],
                id: row["id"]
            }));
        }
        return featureSets;
    }

    private _parseFeatureValuesCsv(csv: string): WorksheetFeatureValueDefinition[] {
        const values: WorksheetFeatureValueDefinition[] = [];
        const parsedCsv = Papa.parse(csv, { header: true });
        for (let row of parsedCsv.data) {
            const id = row["id"];
            if (_.isEmpty(id)) {
                continue;
            }
            const value = new WorksheetFeatureValueDefinition({ id: id });
            values.push(value);
        }
        return values;
    }
}
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

    private _parseFeaturesCsv(csv: string): WorksheetFeatureDefinition[] {
        const features: WorksheetFeatureDefinition[] = [];
        // const parsedCsv = Papa.parse(csv);
        return features;
    }

    private _parseFeatureSetsCsv(csv: any): WorksheetFeatureSetDefinition[] {
        const featureSets: WorksheetFeatureSetDefinition[] = [];
        const parsedCsv = Papa.parse(csv);
        let rowI = 0;
        let header: string[] = [];
        for (let row of parsedCsv.data) {
            if (rowI++ == 0) {
                header = row;
                continue;
            }
            for (let colI in row) {
                const colHeader = header[colI];
                const colValue = row[colI];
                if (_.isEmpty(colHeader) || _.isEmpty(colValue)) {
                    continue;
                }
                console.info(colHeader + " = " + colValue);
            }
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
            const value = new WorksheetFeatureValueDefinition({id: id});
            values.push(value);
        }
        return values;
    }
}
﻿import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetDefinitionQueryService } from 'dressdiscover/api/services/worksheet/worksheet_definition_query_service';
import { WorksheetDefinitionCsvParser } from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetDefinitionCsvParser';
import { WorksheetDefinitionValidator } from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetDefinitionValidator';

declare function require(moduleName: string): any;

export class LocalWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    getWorksheetDefinition(): Promise<WorksheetDefinition> {
        return new Promise((resolve, reject) => {
            resolve(this._worksheetDefinition);
        });
    }

    constructor() {
        this._worksheetDefinition = new WorksheetDefinitionValidator().validateWorksheetDefinition(new WorksheetDefinitionCsvParser().parseWorksheetDefinitionCsv({
            extentsCsv: require("raw-loader!../../../../../definitions/extents.csv"),
            featuresCsv: require("raw-loader!../../../../../definitions/features.csv"),
            featureSetsCsv: require("raw-loader!../../../../../definitions/feature_sets.csv"),
            featureValuesCsv: require("raw-loader!../../../../../definitions/feature_values.csv")
        }));
        // console.debug("Worksheet definition:\n" + JSON.stringify(this._worksheetDefinition.toThryftJsonObject(), undefined, 4));
    }

    private _worksheetDefinition: WorksheetDefinition;
}

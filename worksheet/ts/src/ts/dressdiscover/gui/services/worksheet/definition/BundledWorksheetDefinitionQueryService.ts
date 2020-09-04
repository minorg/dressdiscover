﻿import { WorksheetDefinition } from 'dressdiscover/gui/models/worksheet/definition/worksheet_definition';
import {
    WorksheetDefinitionQueryService,
} from 'dressdiscover/gui/services/worksheet/definition/worksheet_definition_query_service';
import { WorksheetDefinitionCsvParser } from 'dressdiscover/gui/models/worksheet/definition/WorksheetDefinitionCsvParser';
import { WorksheetDefinitionValidator } from 'dressdiscover/gui/models/worksheet/definition/WorksheetDefinitionValidator';

declare function require(moduleName: string): any;

export class BundledWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    getWorksheetDefinition(): Promise<WorksheetDefinition> {
        return new Promise((resolve, reject) => {
            resolve(this._worksheetDefinition);
        });
    }

    constructor() {
        this._worksheetDefinition = new WorksheetDefinitionValidator().validateWorksheetDefinition(new WorksheetDefinitionCsvParser().parseWorksheetDefinitionCsv({
            featureSetsCsv: require("raw-loader!definitions/feature_sets.csv"),
            featuresCsv: require("raw-loader!definitions/features.csv"),
            featureValuesCsv: require("raw-loader!definitions/feature_values.csv"),
            rightsLicensesCsv: require("raw-loader!definitions/rights_licenses.csv")
        }));
        // console.debug("Worksheet definition:\n" + JSON.stringify(this._worksheetDefinition.toThryftJsonObject(), undefined, 4));
    }

    private _worksheetDefinition: WorksheetDefinition;
}

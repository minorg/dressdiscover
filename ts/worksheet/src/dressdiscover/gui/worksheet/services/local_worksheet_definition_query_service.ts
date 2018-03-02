import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import {
    AsyncToSyncWorksheetDefinitionQueryService,
} from 'dressdiscover/api/services/worksheet/async_to_sync_worksheet_definition_query_service';
import { WorksheetDefinitionCsvParser } from 'dressdiscover/gui/worksheet/models/worksheet_definition_csv_parser';
import { WorksheetDefinitionValidator } from 'dressdiscover/gui/worksheet/models/worksheet_definition_validator';

declare function require(moduleName: string): any;

export class LocalWorksheetDefinitionQueryService extends AsyncToSyncWorksheetDefinitionQueryService {
    constructor() {
        super();

        this._worksheetDefinition = new WorksheetDefinitionValidator().validateWorksheetDefinition(new WorksheetDefinitionCsvParser().parseWorksheetDefinitionCsv({
            extentsCsv: require("raw-loader!../../../../../definitions/extents.csv"),
            featuresCsv: require("raw-loader!../../../../../definitions/features.csv"),
            featureSetsCsv: require("raw-loader!../../../../../definitions/feature_sets.csv"),
            featureValuesCsv: require("raw-loader!../../../../../definitions/feature_values.csv")
        }));
        console.info("Worksheet definition:\n" + JSON.stringify(this._worksheetDefinition.toThryftJsonObject(), undefined, 4));
    }

    getWorksheetDefinitionSync(): WorksheetDefinition {
        return this._worksheetDefinition;
    }

    private _worksheetDefinition: WorksheetDefinition;
}

import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import {
    AsyncToSyncWorksheetDefinitionQueryService,
} from 'dressdiscover/api/services/worksheet/async_to_sync_worksheet_definition_query_service';
import { WorksheetDefinitionCsvParser } from 'dressdiscover/gui/worksheet/models/worksheet_definition_csv_parser';

declare function require(moduleName: string): any;

export class LocalWorksheetDefinitionQueryService extends AsyncToSyncWorksheetDefinitionQueryService {
    constructor() {
        super();

        this._worksheetDefinition = new WorksheetDefinitionCsvParser().parseWorksheetDefinitionCsv({
            featuresCsv: require("raw-loader!../../../../../definitions/features.csv"),
            featureSetsCsv: require("raw-loader!../../../../../definitions/feature_sets.csv"),
            featureValuesCsv: require("raw-loader!../../../../../definitions/feature_values.csv")
        });
    }

    getWorksheetDefinitionSync(): WorksheetDefinition {
        return this._worksheetDefinition;
    }

    private _worksheetDefinition: WorksheetDefinition;
}

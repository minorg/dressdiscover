import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureValueDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_definition';

export class WorksheetDefinitionCsvParser {
    parseWorksheetDefinitionCsv(kwds: {
        featuresCsv: string,
        featureSetsCsv: string,
        featureValuesCsv: string
    }): WorksheetDefinition {
        return new WorksheetDefinition({
            features: this._parseFeaturesCsv(kwds.featuresCsv),
            featureSets: this._parseFeatureSetsCsv(kwds.featureSetsCsv)
        });
    }

    private _parseFeaturesCsv(csv: string): WorksheetFeatureDefinition[] {

    }

    private _parseFeatureSetsCsv(csv: any): WorksheetFeatureSetDefinition[] {
    }

    private _parseFeatureValuesCsv(csv: string): WorksheetFeatureValueDefinition[] {
    }

}
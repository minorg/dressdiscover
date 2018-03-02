import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';

export class FeatureStateViewModel extends TopLevelViewModel {
    constructor(kwds: {
        definition: WorksheetDefinition
        featureDefinition: WorksheetFeatureDefinition,
        featureState: WorksheetFeatureState,
        featureSetDefinition: WorksheetFeatureSetDefinition,
        state: WorksheetState
    }) {
        super();
        this.definition = kwds.definition;
        this.featureDefinition = kwds.featureDefinition;
        this.featureState = kwds.featureState;
        this.featureSetDefinition = kwds.featureSetDefinition;
        this.state = kwds.state;
    }

    definition: WorksheetDefinition;
    readonly featureDefinition: WorksheetFeatureDefinition;
    readonly featureSetDefinition: WorksheetFeatureSetDefinition;
    readonly featureState: WorksheetFeatureState;
    readonly state: WorksheetState;
}

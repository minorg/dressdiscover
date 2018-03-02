import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';

export class FeatureSetStateViewModel extends TopLevelViewModel {
    constructor(kwds: {
        featureSetId: string,
        featureSetState: WorksheetFeatureSetState,
        state: WorksheetState
    }) {
        super();
        this.featureSetId = kwds.featureSetId;
        this.featureSetState = kwds.featureSetState;
        this.state = kwds.state;
    }

    readonly featureSetId: string;
    readonly featureSetState: any;
    readonly state: WorksheetState;
}

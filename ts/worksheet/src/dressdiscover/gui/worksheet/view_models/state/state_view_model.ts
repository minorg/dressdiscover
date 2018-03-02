import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';

export class StateViewModel extends TopLevelViewModel {
    constructor(kwds: {
        state: WorksheetState
    }) {
        super();
        this.state = kwds.state;
    }

    readonly state: WorksheetState;
}
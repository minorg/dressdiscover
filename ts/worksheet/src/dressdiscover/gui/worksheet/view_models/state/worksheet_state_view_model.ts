import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import * as _ from 'lodash';

export class WorksheetStateViewModel extends AbstractStateViewModel {
    constructor(kwds: { currentStateMark: WorksheetStateMark }) {
        super(kwds);
        _.bindAll(this, "onClickNextButton");
    }

    onClickNextButton() {
        if (Application.instance.session.worksheetState().featureSets.length == 0) {
            Application.instance.session.worksheetState().featureSets.push(new WorksheetFeatureSetState({ features: [], id: this.worksheetDefinition.featureSets[0].id }))
        }
        Application.instance.router.goToNextState(this._currentStateMark);
    }
}
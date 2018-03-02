import { WorksheetFeatureDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_definition';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';

export class FeatureStateViewModel extends AbstractStateViewModel {
    constructor(kwds: {
        currentStateMark: WorksheetStateMark,
        featureDefinition: WorksheetFeatureDefinition,
        featureSetDefinition: WorksheetFeatureSetDefinition,
        featureState: WorksheetFeatureState
    }) {
        super({ currentStateMark: kwds.currentStateMark });
        this.featureDefinition = kwds.featureDefinition;
        this.featureSetDefinition = kwds.featureSetDefinition;
        this.featureState = kwds.featureState;
    }

    // onClickNextButton() {
    //     Application.instance.router.goToNextState(this._currentStateMark);
    // }

    readonly featureDefinition: WorksheetFeatureDefinition;
    readonly featureSetDefinition: WorksheetFeatureSetDefinition;
    readonly featureState: WorksheetFeatureState;
}

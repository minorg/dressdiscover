import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import {
    WorksheetFeatureSetDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet_feature_set_definition_wrapper';
import { WorksheetFeatureSetStateTable } from 'dressdiscover/gui/worksheet/models/worksheet_feature_set_state_table';
import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import * as ko from 'knockout';

export class FeatureSetStateViewModel extends AbstractStateViewModel {
    constructor(kwds: {
        currentStateMark: WorksheetStateMark,
        featureSetDefinition: WorksheetFeatureSetDefinitionWrapper
    }) {
        super({ currentStateMark: kwds.currentStateMark });
        this.featureSetDefinition = kwds.featureSetDefinition;
        this.featureSetStateMark = kwds.currentStateMark;
        this.table = new WorksheetFeatureSetStateTable({
            featureSetDefinition: kwds.featureSetDefinition,
            featureSetState: this._featureSetState,
            includeFeatureDescriptions: !kwds.currentStateMark.review,
            worksheetStateId: kwds.currentStateMark.worksheetStateId
        });
    }

    save() {
        throw new EvalError();
    }

    readonly featureSetStateMark: WorksheetStateMark;
    readonly featureSetDefinition: WorksheetFeatureSetDefinitionWrapper;
    readonly nextButtonEnabled = ko.observable<boolean>(true);
    readonly previousButtonEnabled = ko.observable<boolean>(true);
    readonly table: WorksheetFeatureSetStateTable;
}

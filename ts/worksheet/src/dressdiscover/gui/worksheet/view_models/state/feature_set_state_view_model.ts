import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
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
        featureSetDefinition: WorksheetFeatureSetDefinitionWrapper,
        featureSetState: WorksheetFeatureSetState
    }) {
        super({ currentStateMark: kwds.currentStateMark });
        this.featureSetDefinition = kwds.featureSetDefinition;
        this.table = new WorksheetFeatureSetStateTable({
            featureSetDefinition: kwds.featureSetDefinition,
            featureSetState: kwds.featureSetState,
            worksheetStateId: kwds.currentStateMark.worksheetStateId
        });
    }

    readonly featureSetDefinition: WorksheetFeatureSetDefinitionWrapper;
    readonly nextButtonEnabled = ko.observable<boolean>(true);
    readonly previousButtonEnabled = ko.observable<boolean>(true);
    readonly table: WorksheetFeatureSetStateTable;
}

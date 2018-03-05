import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { WorksheetFeatureDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_feature_definition_wrapper';
import {
    WorksheetFeatureSetDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet_feature_set_definition_wrapper';
import {
    WorksheetFeatureValueDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet_feature_value_definition_wrapper';
import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import * as ko from 'knockout';
import _ = require('lodash');

class SelectableFeatureValue {
    constructor(readonly definition: WorksheetFeatureValueDefinitionWrapper, selected: boolean) {
        this.selected(selected);
    }

    onToggleSelected() {
        this.selected(!this.selected());
        return false;
    }

    selected = ko.observable<boolean>();
}

export class FeatureStateViewModel extends AbstractStateViewModel {
    constructor(kwds: {
        currentStateMark: WorksheetStateMark,
        featureDefinition: WorksheetFeatureDefinitionWrapper,
        featureSetDefinition: WorksheetFeatureSetDefinitionWrapper,
        featureState: WorksheetFeatureState
    }) {
        super({ currentStateMark: kwds.currentStateMark });

        this.featureDefinition = kwds.featureDefinition;
        this.featureSetDefinition = kwds.featureSetDefinition;
        this.featureSetStateMark = new WorksheetStateMark({ featureSetId: kwds.currentStateMark.featureSetId, worksheetStateId: this.currentStateMark.worksheetStateId });

        this._featureState = kwds.featureState;
        for (let featureValueDefinition of kwds.featureDefinition.values) {
            const selectableValue = new SelectableFeatureValue(
                featureValueDefinition,
                kwds.featureState.selectedValueIds ? _.some(kwds.featureState.selectedValueIds, (featureValueId) => featureValueId.equals(featureValueDefinition.id)) : false
            );
            this.selectableValues.push(selectableValue);

            const self = this;
            selectableValue.selected.subscribe((newSelected) => {
                self._saveState();
            });
        }
    }

    private _saveState() {
        const selectedValueIds: WorksheetFeatureValueId[] = [];
        for (let checkSelectableFeatureValue of this.selectableValues) {
            if (checkSelectableFeatureValue.selected()) {
                selectedValueIds.push(checkSelectableFeatureValue.definition.id);
            }
        }
        if (selectedValueIds.length > 0) {
            this._featureState.selectedValueIds = selectedValueIds;
        } else {
            this._featureState.selectedValueIds = undefined;
        }
        this.worksheetState.notifySubscribers(this.worksheetState());
    }

    readonly featureDefinition: WorksheetFeatureDefinitionWrapper;
    readonly featureSetDefinition: WorksheetFeatureSetDefinitionWrapper;
    readonly featureSetStateMark: WorksheetStateMark;
    private _featureState: WorksheetFeatureState;
    nextButtonEnabled = ko.observable<boolean>(true);
    previousButtonEnabled = ko.observable<boolean>(true);
    readonly selectableValues: SelectableFeatureValue[] = [];
}

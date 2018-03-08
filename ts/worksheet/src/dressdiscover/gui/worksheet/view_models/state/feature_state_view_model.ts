import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
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

    onToggleDescription() {
        this.descriptionShown(!this.descriptionShown());
    }

    onToggleSelected() {
        this.selected(!this.selected());
    }

    readonly descriptionShown = ko.observable<boolean>(false);
    readonly selected = ko.observable<boolean>();
}

export class FeatureStateViewModel extends AbstractStateViewModel {
    constructor(kwds: {
        currentStateMark: WorksheetStateMark,
        featureDefinition: WorksheetFeatureDefinitionWrapper,
        featureSetDefinition: WorksheetFeatureSetDefinitionWrapper
    }) {
        super({ currentStateMark: kwds.currentStateMark });

        this.featureDefinition = kwds.featureDefinition;
        this.featureSetDefinition = kwds.featureSetDefinition;
        this.featureSetStateMark = new WorksheetStateMark({ featureSetId: kwds.currentStateMark.featureSetId, worksheetStateId: this.currentStateMark.worksheetStateId });

        const featureState = this._featureState;
        for (let featureValueDefinition of kwds.featureDefinition.values) {
            const selectableValue = new SelectableFeatureValue(
                featureValueDefinition,
                featureState && featureState.selectedValueIds ? _.some(featureState.selectedValueIds, (featureValueId) => featureValueId.equals(featureValueDefinition.id)) : false
            );
            this.selectableValues.push(selectableValue);

            const self = this;
            selectableValue.selected.subscribe((newSelected) => {
                self.save();
            });
        }
    }

    save() {
        let featureState = this._featureState;
        if (!featureState) {
            let featureSetState = this._featureSetState;
            if (!featureSetState) {
                featureSetState = new WorksheetFeatureSetState({ features: [], id: this.currentStateMark.featureSetId as WorksheetFeatureSetId });
                this.worksheetState().featureSets.push(featureSetState);
            }

            featureState = new WorksheetFeatureState({ id: this.currentStateMark.featureId as WorksheetFeatureId });
            featureSetState.features.push(featureState);
        }

        const selectedValueIds: WorksheetFeatureValueId[] = [];
        for (let checkSelectableFeatureValue of this.selectableValues) {
            if (checkSelectableFeatureValue.selected()) {
                selectedValueIds.push(checkSelectableFeatureValue.definition.id);
            }
        }
        if (selectedValueIds.length > 0) {
            featureState.selectedValueIds = selectedValueIds;
        } else {
            featureState.selectedValueIds = undefined;
        }

        this.worksheetState.notifySubscribers(this.worksheetState());
    }

    readonly featureDefinition: WorksheetFeatureDefinitionWrapper;
    readonly featureSetDefinition: WorksheetFeatureSetDefinitionWrapper;
    readonly featureSetStateMark: WorksheetStateMark;
    nextButtonEnabled = ko.observable<boolean>(true);
    previousButtonEnabled = ko.observable<boolean>(true);
    readonly selectableValues: SelectableFeatureValue[] = [];
}

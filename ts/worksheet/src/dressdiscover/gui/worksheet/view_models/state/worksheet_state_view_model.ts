import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import * as ko from 'knockout';
import { WorksheetFeatureSetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_definition';
import _ = require('lodash');
import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';

class SelectableFeatureSet {
    constructor(public readonly definition: WorksheetFeatureSetDefinition) {
    }

    get displayName() {
        return this.definition.displayName ? this.definition.displayName : this.definition.id;
    }

    onToggle() {
        this.selected(!this.selected());
    }

    readonly selected = ko.observable<boolean>();
}

export class WorksheetStateViewModel extends AbstractStateViewModel {
    constructor(kwds: { currentStateMark: WorksheetStateMark }) {
        super(kwds);

        if (this.currentStateMark.review) {
            this.nextButtonEnabled = ko.observable<boolean>(false);
            this.previousButtonEnabled = ko.observable<boolean>(true);
        } else {
            this.nextButtonEnabled = ko.pureComputed<boolean>({
                owner: this,
                read: () => _.some(this.selectableFeatureSets, (featureSet) => featureSet.selected())
            });
            this.previousButtonEnabled = ko.observable<boolean>(false);
            this.selectableFeatureSets = _.map(this.worksheetDefinition.featureSets, (featureSetDefinition) => new SelectableFeatureSet(featureSetDefinition));
        }
    }

    onClickNextButton() {
        const existingFeatureSetStatesById: { [index: string]: WorksheetFeatureSetState } = {};
        for (let featureSetState of this.worksheetState().featureSets) {
            existingFeatureSetStatesById[featureSetState.id.toString()] = featureSetState;
        }

        this.worksheetState().featureSets = [];
        for (let selectableFeatureSet of this.selectableFeatureSets) {
            if (selectableFeatureSet.selected()) {
                let featureSetState = existingFeatureSetStatesById[selectableFeatureSet.definition.id.toString()];
                if (!featureSetState) {
                    featureSetState = new WorksheetFeatureSetState({ features: [], id: selectableFeatureSet.definition.id });
                }
                this.worksheetState().featureSets.push(featureSetState);
            }
        }
        this.worksheetState.notifySubscribers(this.worksheetState());

        super.onClickNextButton();
    }

    readonly nextButtonEnabled: KnockoutObservable<boolean>;
    readonly previousButtonEnabled: KnockoutObservable<boolean>;
    readonly selectableFeatureSets: SelectableFeatureSet[] = [];
}
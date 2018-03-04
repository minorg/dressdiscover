import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { WorksheetFeatureDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_feature_definition_wrapper';
import {
    WorksheetFeatureSetDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet_feature_set_definition_wrapper';
import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import * as ko from 'knockout';

class Feature {
    constructor(readonly definition: WorksheetFeatureDefinitionWrapper, readonly stateMark: WorksheetStateMark, readonly state?: WorksheetFeatureState) {
    }
}

export class FeatureSetStateViewModel extends AbstractStateViewModel {
    constructor(kwds: {
        currentStateMark: WorksheetStateMark,
        featureSetDefinition: WorksheetFeatureSetDefinitionWrapper,
        featureSetState: WorksheetFeatureSetState
    }) {
        super({ currentStateMark: kwds.currentStateMark });

        this.featureSetDefinition = kwds.featureSetDefinition;
        for (let featureDefinition of kwds.featureSetDefinition.features) {
            let featureState: WorksheetFeatureState | undefined = undefined;
            for (let checkFeatureState of kwds.featureSetState.features) {
                if (checkFeatureState.id.equals(featureDefinition.id)) {
                    featureState = checkFeatureState;
                    break;
                }
            }

            const featureStateMark = new WorksheetStateMark({
                featureId: featureDefinition.id,
                featureSetId: kwds.featureSetDefinition.id,
                worksheetStateId: kwds.currentStateMark.worksheetStateId
            });

            this.features.push(new Feature(featureDefinition, featureStateMark, featureState));
        }
    }

    readonly featureSetDefinition: WorksheetFeatureSetDefinitionWrapper;
    readonly features: Feature[] = [];
    nextButtonEnabled = ko.observable<boolean>(true);
    previousButtonEnabled = ko.observable<boolean>(true);
}

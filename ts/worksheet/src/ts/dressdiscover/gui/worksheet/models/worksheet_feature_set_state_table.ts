import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { WorksheetFeatureDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_feature_definition_wrapper';
import {
    WorksheetFeatureSetDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet_feature_set_definition_wrapper';
import {
    WorksheetFeatureValueDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet_feature_value_definition_wrapper';

class WorksheetFeatureSetStateTableRow {
    constructor(readonly featureDefinition: WorksheetFeatureDefinitionWrapper, readonly featureStateMark: WorksheetStateMark, featureState?: WorksheetFeatureState) {
        if (featureState && featureState.selectedValueIds) {
            for (let valueId of featureState.selectedValueIds) {
                this.values.push(Application.instance.worksheetDefinition.getFeatureValueById(valueId));
            }
        }
    }

    readonly values: WorksheetFeatureValueDefinitionWrapper[] = [];
}

export class WorksheetFeatureSetStateTable {
    constructor(kwds: {
        featureSetDefinition: WorksheetFeatureSetDefinitionWrapper,
        featureSetState?: WorksheetFeatureSetState,
        includeFeatureDescriptions: boolean,
        worksheetStateId: WorksheetStateId
    }) {
        this.featureSetDefinition = kwds.featureSetDefinition;
        this.includeFeatureDescriptions = kwds.includeFeatureDescriptions;

        for (let featureDefinition of kwds.featureSetDefinition.features) {
            let featureState: WorksheetFeatureState | undefined = undefined;
            if (kwds.featureSetState) {
                for (let checkFeatureState of kwds.featureSetState.features) {
                    if (checkFeatureState.id.equals(featureDefinition.id)) {
                        featureState = checkFeatureState;
                        break;
                    }
                }
            }

            const featureStateMark = new WorksheetStateMark({
                featureId: featureDefinition.id,
                featureSetId: kwds.featureSetDefinition.id,
                worksheetStateId: kwds.worksheetStateId
            });

            this.rows.push(new WorksheetFeatureSetStateTableRow(featureDefinition, featureStateMark, featureState));
        }
    }

    readonly featureSetDefinition: WorksheetFeatureSetDefinitionWrapper;
    readonly includeFeatureDescriptions: boolean;
    readonly rows: WorksheetFeatureSetStateTableRow[] = [];
}
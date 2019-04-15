import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/state/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/state/worksheet_feature_state';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/state/worksheet_state_mark';
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import * as _ from 'lodash';

import { WorksheetDefinitionWrapper } from '../definition/WorksheetDefinitionWrapper';
import { WorksheetFeatureDefinitionWrapper } from '../definition/WorksheetFeatureDefinitionWrapper';
import { WorksheetFeatureSetDefinitionWrapper } from '../definition/WorksheetFeatureSetDefinitionWrapper';
import { WorksheetStateMachine } from './WorksheetStateMachine';

export class WorksheetStateWrapper {
    constructor(
        readonly currentStateMark: WorksheetStateMark,
        readonly worksheetDefinition: WorksheetDefinitionWrapper,
        private readonly worksheetState: WorksheetState
    ) {
        this.worksheetStateMachine = new WorksheetStateMachine(worksheetDefinition, worksheetState);
        this.currentStateMarkIndex = this.worksheetStateMachine.indexOfStateMark(currentStateMark);
    }

    get currentFeatureDefinition(): WorksheetFeatureDefinitionWrapper | undefined {
        if (!this.currentStateMark.featureId) {
            return undefined;
        }
        return this.worksheetDefinition.featureById(this.currentStateMark.featureId);
    }

    get currentFeatureSetDefinition(): WorksheetFeatureSetDefinitionWrapper | undefined {
        if (!this.currentStateMark.featureSetId) {
            return undefined;
        }
        return this.worksheetDefinition.featureSetById(this.currentStateMark.featureSetId);
    }

    get currentFeatureState(): WorksheetFeatureState | undefined {
        if (!this.currentStateMark.featureId) {
            return undefined;
        }
        const featureSetState = this.currentFeatureSetState;
        if (!featureSetState) {
            return undefined;
        }
        return featureSetState.features.find((featureState) => featureState.id.equals(this.currentStateMark.featureId));
    }

    get currentFeatureStateMark() {
        return this.currentStateMark.featureId ? this.currentStateMark : undefined;
    }

    get currentFeatureSetState(): WorksheetFeatureSetState | undefined {
        if (!this.currentStateMark.featureSetId) {
            return undefined;
        }
        return this.worksheetState.featureSets.find((featureSetState) => featureSetState.id.equals(this.currentStateMark.featureSetId));
    }

    get currentFeatureSetStateMark(): WorksheetStateMark | undefined {
        return this.currentStateMark.featureSetId ? new WorksheetStateMark({ worksheetStateId: this.currentStateMark.worksheetStateId, featureSetId: this.currentStateMark.featureSetId }) : undefined;
    }

    get featureSetStates(): WorksheetFeatureSetState[] {
        return this.worksheetState.featureSets;
    }

    get firstStateMark(): WorksheetStateMark {
        return this.worksheetStateMachine.firstStateMark;
    }

    get lastStateMark(): WorksheetStateMark {
        return this.worksheetStateMachine.lastStateMark;
    }

    get lastStateMarkIndex(): number {
        return this.worksheetStateMachine.length - 1;
    }

    get nextStateMark(): WorksheetStateMark {
        return this.worksheetStateMachine.nextStateMark(this.currentStateMark);
    }

    get id() {
        return this.worksheetState.id;
    }

    get progressPercentage(): number {
        return Math.round(this.currentStateMarkIndex / this.lastStateMarkIndex * 100.0);
    }

    get previousStateMark(): WorksheetStateMark {
        return this.worksheetStateMachine.previousStateMark(this.currentStateMark);
    }

    selectFeatureSets(featureSetIds: WorksheetFeatureSetId[]): void {
        const selectedFeatureSetStates: WorksheetFeatureSetState[] = [];
        for (const featureSetId of featureSetIds) {
            const existingFeatureSetState = this.worksheetState.featureSets.find((featureSet) => featureSet.id.equals(featureSetId));
            if (existingFeatureSetState) {
                selectedFeatureSetStates.push(existingFeatureSetState);
            } else {
                selectedFeatureSetStates.push(new WorksheetFeatureSetState({ features: [], id: featureSetId }));
            }
        }
        this.worksheetState.featureSets = selectedFeatureSetStates;
        this.worksheetStateMachine.recalculateStateMarks(this.worksheetState);
        this.worksheetState.mtime = new Date();
    }

    selectFeatureValues(featureValueIds: WorksheetFeatureValueId[] | undefined) {
        let featureState = this.currentFeatureState;
        let featureSetState = this.currentFeatureSetState;

        if (!_.isEmpty(featureValueIds)) {
            if (!featureState) {
                if (!featureSetState) {
                    console.debug("creating new feature set " + this.currentStateMark.featureSetId);
                    featureSetState = new WorksheetFeatureSetState({ features: [], id: this.currentStateMark.featureSetId as WorksheetFeatureSetId });
                    this.worksheetState.featureSets.push(featureSetState);
                }

                console.debug("creating new feature " + this.currentStateMark.featureId);
                featureState = new WorksheetFeatureState({ id: this.currentStateMark.featureId as WorksheetFeatureId });
                featureSetState.features.push(featureState);
            }

            featureState.selectedValueIds = featureValueIds;
        } else if (featureState && featureSetState) {
            // No selected values, remove the feature
            console.debug("removing empty feature " + this.currentStateMark.featureId);
            _.remove(featureSetState.features, (feature) => feature.id.equals(this.currentStateMark.featureId));
            // Don't remove empty feature sets, they're used to indicate which were selected.
        }

        this.worksheetStateMachine.recalculateStateMarks(this.worksheetState);
        this.worksheetState.mtime = new Date();
    }

    get selectedFeatureSetIds(): WorksheetFeatureSetId[] {
        return this.worksheetState.featureSets.map((featureSet) => featureSet.id);
    }

    get text() {
        return this.worksheetState.text;
    }

    set text(text: string | undefined) {
        this.worksheetState.text = text;
    }

    toJsonObject() {
        return this.worksheetState.toJsonObject();
    }

    toWorksheetState() {
        return this.worksheetState;
    }

    readonly currentStateMarkIndex: number;
    private worksheetStateMachine: WorksheetStateMachine;
}

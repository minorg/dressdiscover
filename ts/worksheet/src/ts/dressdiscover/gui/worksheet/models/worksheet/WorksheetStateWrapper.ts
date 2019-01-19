import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { WorksheetStore } from 'dressdiscover/gui/worksheet/stores/worksheet/WorksheetStore';
import * as _ from 'lodash';

import { WorksheetDefinitionWrapper } from './WorksheetDefinitionWrapper';
import { WorksheetFeatureDefinitionWrapper } from './WorksheetFeatureDefinitionWrapper';
import { WorksheetFeatureSetDefinitionWrapper } from './WorksheetFeatureSetDefinitionWrapper';
import { WorksheetStateMachine } from './WorksheetStateMachine';

export class WorksheetStateWrapper {
    constructor(
        readonly currentStateMark: WorksheetStateMark,
        readonly worksheetDefinition: WorksheetDefinitionWrapper,
        private readonly worksheetState: WorksheetState,
        private readonly worksheetStore: WorksheetStore
    ) {
        this.worksheetStateMachine = new WorksheetStateMachine(worksheetDefinition, worksheetState);
        this.currentStateMarkIndex = this.worksheetStateMachine.indexOfStateMark(currentStateMark);
    }

    get currentFeatureDefinition(): WorksheetFeatureDefinitionWrapper | undefined {
        const currentFeatureState = this.currentFeatureState;
        if (!currentFeatureState) {
            return undefined;
        }
        return this.worksheetDefinition.getFeatureById(currentFeatureState.id);
    }

    get currentFeatureSetDefinition(): WorksheetFeatureSetDefinitionWrapper | undefined {
        const currentFeatureSetState = this.currentFeatureSetState;
        if (!currentFeatureSetState) {
            return undefined;
        }
        return this.worksheetDefinition.getFeatureSetById(currentFeatureSetState.id);
    }

    get currentFeatureState(): WorksheetFeatureState | undefined {
        if (!this.currentStateMark.featureId) {
            return undefined;
        }
        const featureSetState = this.currentFeatureSetState;
        if (!featureSetState) {
            return undefined;
        }
        return _.find(featureSetState.features, (featureState) => featureState.id.equals(this.currentStateMark.featureId));
    }

    get currentFeatureStateMark() {
        return this.currentStateMark.featureId ? this.currentStateMark : undefined;
    }

    get currentFeatureSetState(): WorksheetFeatureSetState | undefined {
        if (!this.currentStateMark.featureSetId) {
            return undefined;
        }
        return _.find(this.worksheetState.featureSets, (featureSetState) => featureSetState.id.equals(this.currentStateMark.featureSetId));
    }

    get currentFeatureSetStateMark(): WorksheetStateMark | undefined {
        return this.currentStateMark.featureSetId ? new WorksheetStateMark({ worksheetStateId: this.currentStateMark.worksheetStateId, featureSetId: this.currentStateMark.featureSetId }) : undefined;
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

    save() {
        this.worksheetStore.putWorksheetState({ state: this.worksheetState });
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

    readonly currentStateMarkIndex: number;
    private worksheetStateMachine: WorksheetStateMachine;
}

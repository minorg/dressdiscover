import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';

import { WorksheetDefinitionWrapper } from './worksheet_definition_wrapper';

export class WorksheetStateMachine {
    constructor(private readonly worksheetDefinition: WorksheetDefinitionWrapper) {
    }

    calculateStateMarks(worksheetState: WorksheetState) {
        this._stateMarks = [];

        // First state, always the worksheet start
        const worksheetStateId = worksheetState.id;
        this._stateMarks.push(new WorksheetStateMark({ worksheetStateId: worksheetStateId }));

        if (worksheetState.featureSets.length > 0) {
            for (let featureSetState of worksheetState.featureSets) {
                const featureSetId = featureSetState.id;
                const featureSetDefinition = this.worksheetDefinition.getFeatureSetById(featureSetId);

                // Feature set start
                this._stateMarks.push(new WorksheetStateMark({
                    featureSetId: featureSetId,
                    worksheetStateId: worksheetStateId
                }));

                for (let featureId of featureSetDefinition.featureIds) {
                    // Feature start is the same as review
                    this._stateMarks.push(new WorksheetStateMark({
                        featureId: featureId,
                        featureSetId: featureSetId,
                        worksheetStateId: worksheetStateId
                    }));
                }

                if (worksheetState.featureSets.length > 1) {
                    // Feature set review
                    this._stateMarks.push(new WorksheetStateMark({
                        featureSetId: featureSetId,
                        review: true,
                        worksheetStateId: worksheetStateId
                    }));
                }
            }
        }

        // Worksheet review, always the last state
        this._stateMarks.push(new WorksheetStateMark({
            review: true,
            worksheetStateId: worksheetStateId
        }));
    }

    get firstStateMark(): WorksheetStateMark {
        if (this._stateMarks.length == 0) {
            throw new EvalError();
        }
        return this._stateMarks[0];
    }

    indexOfStateMark(stateMark: WorksheetStateMark): number {
        if (this._stateMarks.length == 0) {
            throw new EvalError();
        }
        for (let stateMarkI = 0; stateMarkI < this._stateMarks.length; stateMarkI++) {
            if (this._stateMarks[stateMarkI].equals(stateMark)) {
                return stateMarkI;
            }
        }
        throw new EvalError("state not found in state machine");
    }

    get lastStateMark(): WorksheetStateMark {
        if (this._stateMarks.length == 0) {
            throw new EvalError();
        }
        return this._stateMarks[this._stateMarks.length - 1];
    }

    get length() {
        return this._stateMarks.length;
    }

    nextStateMark(currentStateMark: WorksheetStateMark): WorksheetStateMark {
        const stateMarkI = this.indexOfStateMark(currentStateMark);
        if (stateMarkI + 1 == this._stateMarks.length) {
            throw new EvalError();
        }
        return this._stateMarks[stateMarkI + 1];
    }

    previousStateMark(currentStateMark: WorksheetStateMark): WorksheetStateMark {
        const stateMarkI = this.indexOfStateMark(currentStateMark);
        if (stateMarkI == 0) {
            throw new EvalError();
        }
        return this._stateMarks[stateMarkI - 1];
    }

    private _stateMarks: WorksheetStateMark[] = [];
}
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';

import { WorksheetDefinitionWrapper } from './WorksheetDefinitionWrapper';

export class WorksheetStateMachine {
    constructor(worksheetDefinition: WorksheetDefinitionWrapper, worksheetState: WorksheetState) {
        // First state, always the worksheet start
        const worksheetStateId = worksheetState.id;
        this.stateMarks.push(new WorksheetStateMark({ worksheetStateId }));

        if (worksheetState.featureSets.length > 0) {
            for (const featureSetState of worksheetState.featureSets) {
                const featureSetId = featureSetState.id;
                const featureSetDefinition = worksheetDefinition.getFeatureSetById(featureSetId);

                // Feature set start
                this.stateMarks.push(new WorksheetStateMark({
                    featureSetId,
                    worksheetStateId
                }));

                for (const featureId of featureSetDefinition.featureIds) {
                    // Feature start is the same as review
                    this.stateMarks.push(new WorksheetStateMark({
                        featureId,
                        featureSetId,
                        worksheetStateId
                    }));
                }

                if (worksheetState.featureSets.length > 1) {
                    // Feature set review
                    this.stateMarks.push(new WorksheetStateMark({
                        featureSetId,
                        review: true,
                        worksheetStateId
                    }));
                }
            }
        }

        // Worksheet review, always the last state
        this.stateMarks.push(new WorksheetStateMark({
            review: true,
            worksheetStateId
        }));
    }

    get firstStateMark(): WorksheetStateMark {
        return this.stateMarks[0];
    }

    indexOfStateMark(stateMark: WorksheetStateMark): number {
        for (let stateMarkI = 0; stateMarkI < this.stateMarks.length; stateMarkI++) {
            if (this.stateMarks[stateMarkI].equals(stateMark)) {
                return stateMarkI;
            }
        }
        throw new EvalError("state not found in state machine");
    }

    get lastStateMark(): WorksheetStateMark {
        return this.stateMarks[this.stateMarks.length - 1];
    }

    get length() {
        return this.stateMarks.length;
    }

    nextStateMark(currentStateMark: WorksheetStateMark): WorksheetStateMark {
        const stateMarkI = this.indexOfStateMark(currentStateMark);
        if (stateMarkI + 1 === this.stateMarks.length) {
            throw new EvalError();
        }
        return this.stateMarks[stateMarkI + 1];
    }

    previousStateMark(currentStateMark: WorksheetStateMark): WorksheetStateMark {
        const stateMarkI = this.indexOfStateMark(currentStateMark);
        if (stateMarkI === 0) {
            throw new EvalError();
        }
        return this.stateMarks[stateMarkI - 1];
    }

    private stateMarks: WorksheetStateMark[] = [];
}

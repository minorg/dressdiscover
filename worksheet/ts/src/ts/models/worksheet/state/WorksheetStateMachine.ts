import {WorksheetState} from "~/models/worksheet/state/WorksheetState";
import {WorksheetStateMark} from "~/models/worksheet/state/WorksheetStateMark";

import {WorksheetDefinitionWrapper} from "../definition/WorksheetDefinitionWrapper";
import * as _ from "lodash";

export class WorksheetStateMachine {
  constructor(
    private readonly worksheetDefinition: WorksheetDefinitionWrapper,
    worksheetState: WorksheetState
  ) {
    this.recalculateStateMarks(worksheetState);
  }

  get firstStateMark(): WorksheetStateMark {
    return this.stateMarks[0];
  }

  indexOfStateMark(stateMark: WorksheetStateMark): number {
    for (
      let stateMarkI = 0;
      stateMarkI < this.stateMarks.length;
      stateMarkI++
    ) {
      if (_.isEqual(this.stateMarks[stateMarkI], stateMark)) {
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

  recalculateStateMarks(worksheetState: WorksheetState) {
    this.stateMarks = [];

    // First state, always the worksheet start
    const worksheetStateId = worksheetState.id;
    this.stateMarks.push({worksheetStateId});

    if (worksheetState.featureSets.length > 0) {
      for (const featureSetState of worksheetState.featureSets) {
        const featureSetId = featureSetState.id;
        const featureSetDefinition = this.worksheetDefinition.featureSetById(
          featureSetId
        );

        // Feature set start
        this.stateMarks.push({
          featureSetId,
          worksheetStateId,
        });

        for (const featureId of featureSetDefinition.featureIds) {
          // Feature start is the same as review
          this.stateMarks.push({
            featureId,
            featureSetId,
            worksheetStateId,
          });
        }

        // Feature set review
        this.stateMarks.push({
          featureSetId,
          review: true,
          worksheetStateId,
        });
      }
    }

    // Worksheet review, always the last state
    this.stateMarks.push({
      review: true,
      worksheetStateId,
    });
  }

  private stateMarks: WorksheetStateMark[] = [];
}

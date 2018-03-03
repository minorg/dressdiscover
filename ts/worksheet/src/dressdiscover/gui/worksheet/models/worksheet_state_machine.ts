import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';

export class WorksheetStateMachine {
    getNextStateMark(currentStateMark: WorksheetStateMark): WorksheetStateMark {
        const worksheetDefinition = Application.instance.worksheetDefinition;
        const worksheetState = Application.instance.session.worksheetState();
        if (!worksheetState) {
            throw new EvalError();
        } else if (!worksheetState.id.equals(currentStateMark.worksheetStateId)) {
            throw new EvalError();
        }

        const featureSetIds: WorksheetFeatureSetId[] = [];
        for (let featureSetState of worksheetState.featureSets) {
            featureSetIds.push(featureSetState.id);
        }
        if (featureSetIds.length == 0) {
            // Should have already selected featurce sets on the worksheet start.
            throw new EvalError();
        }

        if (!currentStateMark.featureSetId) {
            // Currently on a worksheet start or review.
            if (currentStateMark.review) {
                // Currently reviewing worksheet
                throw new EvalError();
            }
            // Currently starting worksheet
            // Go to first feature set
            return new WorksheetStateMark({ featureSetId: featureSetIds[0], worksheetStateId: worksheetState.id });
        }

        const currentFeatureSetDefinition = worksheetDefinition.getFeatureSetDefinition(currentStateMark.featureSetId);

        if (!currentStateMark.featureId) {
            // Currently on a feature set start or review.
            if (currentStateMark.review) {
                // Currently reviewing feature set
                const nextFeatureSetId = worksheetDefinition.getNextFeatureSetId({ currentFeatureSetId: currentStateMark.featureSetId, featureSetIds: featureSetIds });
                if (nextFeatureSetId) {
                    // Go to next feature set
                    return new WorksheetStateMark({
                        featureSetId: nextFeatureSetId,
                        worksheetStateId: worksheetState.id
                    });
                } else {
                    // Go to worksheet review
                    return new WorksheetStateMark({
                        review: true,
                        worksheetStateId: worksheetState.id
                    });
                }
            } else {
                // Currently starting feature set
                // Go to first feature of feature set
                return new WorksheetStateMark({
                    featureId: currentFeatureSetDefinition.featureIds[0],
                    featureSetId: currentStateMark.featureSetId,
                    worksheetStateId: worksheetState.id
                });
            }
        }

        // Currently on a feature
        const nextFeatureId = worksheetDefinition.getNextFeatureId({ currentFeatureId: currentStateMark.featureId, currentFeatureSetDefinition: currentFeatureSetDefinition });
        if (nextFeatureId) {
            // Go to next feature
            return new WorksheetStateMark({
                featureId: nextFeatureId,
                featureSetId: currentStateMark.featureSetId,
                worksheetStateId: worksheetState.id
            });
        } else {
            // Go to feature set review
            return new WorksheetStateMark({
                featureSetId: currentStateMark.featureSetId,
                review: true,
                worksheetStateId: worksheetState.id
            });
        }
    }
}
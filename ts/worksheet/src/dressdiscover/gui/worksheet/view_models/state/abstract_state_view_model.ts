import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';

export abstract class AbstractStateViewModel extends TopLevelViewModel {
    constructor(kwds: { currentStateMark: WorksheetStateMark }) {
        super();
        this._currentStateMark = kwds.currentStateMark;
    }

    get review() {
        return this._currentStateMark.review;
    }

    get titleTagText(): string {
        let result = "Worksheet '" + this.worksheetState.id + "'";
        if (this._currentStateMark.featureSetId) {
            const featureSetDefinition = this.worksheetDefinition.getFeatureSetDefinition(this._currentStateMark.featureSetId);
            result += ", Feature set '" + (featureSetDefinition.displayName ? featureSetDefinition.displayName : featureSetDefinition.id) + "'";

            if (this._currentStateMark.featureId) {
                const featureDefinition = this.worksheetDefinition.getFeatureDefinition(this._currentStateMark.featureId);
                result += ", Feature '" + (featureDefinition.displayName ? featureDefinition.displayName : featureDefinition.id) + "'";
            }
        }
        return result;
    }

    get worksheetDefinition(): WorksheetDefinitionWrapper {
        return Application.instance.worksheetDefinition;
    }

    get worksheetState(): WorksheetState {
        const result = Application.instance.session.worksheetState();
        if (!result) {
            throw new EvalError();
        }
        return result
    }

    protected readonly _currentStateMark: WorksheetStateMark;
}
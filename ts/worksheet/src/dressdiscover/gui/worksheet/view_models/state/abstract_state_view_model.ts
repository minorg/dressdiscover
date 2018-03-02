import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { StateMark } from 'dressdiscover/gui/worksheet/models/state_mark';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';

export abstract class AbstractStateViewModel extends TopLevelViewModel {
    constructor(kwds: { currentStateMark: StateMark }) {
        super();
        this._currentStateMark = kwds.currentStateMark;
    }

    get review() {
        return this._currentStateMark.review;
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

    protected readonly _currentStateMark: StateMark;
}
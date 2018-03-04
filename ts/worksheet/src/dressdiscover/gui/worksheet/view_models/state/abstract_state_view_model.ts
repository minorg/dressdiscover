import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';

export abstract class AbstractStateViewModel extends TopLevelViewModel {
    constructor(kwds: { currentStateMark: WorksheetStateMark }) {
        super();
        this.currentStateMark = kwds.currentStateMark;
    }

    onClickNextButton() {
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.nextStateMark(this.currentStateMark));
    }

    onClickPreviousButton() {
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.previousStateMark(this.currentStateMark));
    }

    abstract nextButtonEnabled: KnockoutObservable<boolean>;

    abstract previousButtonEnabled: KnockoutObservable<boolean>;

    get review() {
        return this.currentStateMark.review;
    }

    get titleTagText(): string {
        let result = "Worksheet '" + this.worksheetState.id + "'";
        if (this.currentStateMark.featureSetId) {
            const featureSetDefinition = this.worksheetDefinition.getFeatureSetById(this.currentStateMark.featureSetId);
            result += ", Feature set '" + (featureSetDefinition.displayName ? featureSetDefinition.displayName : featureSetDefinition.id) + "'";

            if (this.currentStateMark.featureId) {
                const featureDefinition = this.worksheetDefinition.getFeatureById(this.currentStateMark.featureId);
                result += ", Feature '" + (featureDefinition.displayName ? featureDefinition.displayName : featureDefinition.id) + "'";
            }
        }
        return result;
    }

    get worksheetDefinition(): WorksheetDefinitionWrapper {
        return Application.instance.worksheetDefinition;
    }

    get worksheetState() {
        if (!Application.instance.session.worksheetState()) {
            throw new EvalError();
        }
        return Application.instance.session.worksheetState;
    }

    readonly currentStateMark: WorksheetStateMark;
}
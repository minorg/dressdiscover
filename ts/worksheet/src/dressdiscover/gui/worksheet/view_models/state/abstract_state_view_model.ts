import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';

export abstract class AbstractStateViewModel extends TopLevelViewModel {
    constructor(kwds: { currentStateMark: WorksheetStateMark }) {
        super({ title: "" });
        this.currentStateMark = kwds.currentStateMark;
        this.currentStateMarkIndex = Application.instance.session.worksheetStateMachine.indexOfStateMark(kwds.currentStateMark);

        {
            this.title = "Worksheet '" + this.worksheetState.id + "'";
            if (this.currentStateMark.featureSetId) {
                const featureSetDefinition = this.worksheetDefinition.getFeatureSetById(this.currentStateMark.featureSetId);
                this.title += ", Feature set '" + (featureSetDefinition.displayName ? featureSetDefinition.displayName : featureSetDefinition.id) + "'";

                if (this.currentStateMark.featureId) {
                    const featureDefinition = this.worksheetDefinition.getFeatureById(this.currentStateMark.featureId);
                    this.title += ", Feature '" + (featureDefinition.displayName ? featureDefinition.displayName : featureDefinition.id) + "'";
                }
            }
        }
    }

    onClickFinishButton() {
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.lastStateMark);
    }

    onClickNextButton() {
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.nextStateMark(this.currentStateMark));
    }

    onClickPreviousButton() {
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.previousStateMark(this.currentStateMark));
    }

    get lastStateMarkIndex() {
        return Application.instance.session.worksheetStateMachine.length - 1;
    }

    abstract nextButtonEnabled: KnockoutObservable<boolean>;

    abstract previousButtonEnabled: KnockoutObservable<boolean>;

    get progressPercentage(): string {
        return Math.round(this.currentStateMarkIndex / this.lastStateMarkIndex * 100.0) + '%';
    }

    get review() {
        return this.currentStateMark.review;
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
    readonly currentStateMarkIndex: number;
}
import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { Breadcrumb } from 'dressdiscover/gui/worksheet/models/breadcrumb';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import _ = require('lodash');

export abstract class AbstractStateViewModel extends TopLevelViewModel {
    constructor(kwds: { currentStateMark: WorksheetStateMark }) {
        super({ breadcrumbs: [], title: "" });
        this.currentStateMark = kwds.currentStateMark;
        this.currentStateMarkIndex = Application.instance.session.worksheetStateMachine.indexOfStateMark(kwds.currentStateMark);

        {
            this.breadcrumbs.push(new Breadcrumb(this.worksheetState().id.toString(), { href: this.hrefs.state(new WorksheetStateMark({ worksheetStateId: this.currentStateMark.worksheetStateId })) }));
            this.title = "Worksheet '" + this.worksheetState().id + "'";
            if (this.currentStateMark.featureSetId) {
                const featureSetDefinition = this.worksheetDefinition.getFeatureSetById(this.currentStateMark.featureSetId);
                this.breadcrumbs.push(new Breadcrumb(featureSetDefinition.displayName, { href: this.hrefs.state(new WorksheetStateMark({ featureSetId: this.currentStateMark.featureSetId, worksheetStateId: this.currentStateMark.worksheetStateId })) }));
                this.title += ", Feature set '" + featureSetDefinition.displayName + "'";

                if (this.currentStateMark.featureId) {
                    const featureDefinition = this.worksheetDefinition.getFeatureById(this.currentStateMark.featureId);
                    this.breadcrumbs.push(new Breadcrumb(featureDefinition.displayName, { active: true, href: this.hrefs.state(this.currentStateMark) }));
                    this.title += ", Feature '" + featureDefinition.displayName + "'";
                }
            }
        }
    }

    protected get _featureState(): WorksheetFeatureState | undefined {
        if (!this.currentStateMark.featureId) {
            throw new EvalError();
        }
        const featureSetState = this._featureSetState;
        if (!featureSetState) {
            return undefined;
        }
        return _.find(featureSetState.features, (featureState) => featureState.id.equals(this.currentStateMark.featureId));
    }

    protected get _featureSetState(): WorksheetFeatureSetState | undefined {
        if (!this.currentStateMark.featureSetId) {
            throw new EvalError();
        }
        return _.find(this.worksheetState().featureSets, (featureSetState) => featureSetState.id.equals(this.currentStateMark.featureSetId));
    }

    get lastStateMarkIndex() {
        return Application.instance.session.worksheetStateMachine.length - 1;
    }

    abstract nextButtonEnabled: KnockoutObservable<boolean>;

    abstract previousButtonEnabled: KnockoutObservable<boolean>;

    onClickFinishButton() {
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.lastStateMark);
    }

    onClickNextButton() {
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.nextStateMark(this.currentStateMark));
    }

    onClickPreviousButton() {
        Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.previousStateMark(this.currentStateMark));
    }

    get progressPercentage(): string {
        return Math.round(this.currentStateMarkIndex / this.lastStateMarkIndex * 100.0) + '%';
    }

    get review() {
        return this.currentStateMark.review;
    }

    abstract save();

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
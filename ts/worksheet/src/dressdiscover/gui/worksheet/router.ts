import {
    NoSuchWorksheetFeatureDefinitionException,
} from 'dressdiscover/api/services/worksheet/no_such_worksheet_feature_definition_exception';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { Hrefs } from 'dressdiscover/gui/worksheet/hrefs';
import { StateMark } from 'dressdiscover/gui/worksheet/models/state_mark';
import { WorksheetStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/worksheet_state_view_model';
import { CreditsView } from 'dressdiscover/gui/worksheet/views/credits/credits_view';
import { PrivacyView } from 'dressdiscover/gui/worksheet/views/privacy/privacy_view';
import { StartView } from 'dressdiscover/gui/worksheet/views/start/start_view';
import { WorksheetStateView } from 'dressdiscover/gui/worksheet/views/state/worksheet_state_view';
import * as Sammy from 'sammy';

export class Router {
    constructor() {
        const self = this;
        this._sammy.get('^/$', (context: any) => {
            self._onGetRoot();
        });
        this._sammy.get("^/#/credits$", (context: any) => {
            self._onGetCredits();
        });
        this._sammy.get("^/#/privacy", (context: any) => {
            self._onGetPrivacy();
        });
        this._sammy.get("^/#/state/:stateId/", (context: any) => {
            self._onGetState(context);
        });
        this._sammy.get("^/#/state/:stateId/:featureSetId/", (context: any) => {
            self._onGetState(context);
        });
        this._sammy.get("^/#/state/:stateId/:featureSetId/:featureId", (context: any) => {
            self._onGetState(context);
        });
    }

    private _onGetCredits() {
        new CreditsView().show();
    }

    private _onGetPrivacy() {
        new PrivacyView().show();
    }

    private _onGetRoot() {
        new StartView().show();
    }

    private _onGetState(context: any) {
        const stateId = context.params.stateId;
        Application.instance.services.worksheetStateQueryService.getWorksheetStateAsync({
            error: (errorKwds) => {
                Application.instance.session.worksheetState(null);
                Application.instance.errorHandler.handleAsyncError(errorKwds);
            },
            id: stateId,
            success: (state) => {
                Application.instance.session.worksheetState(state);
            }
        });
    }

    goToNextState(currentStateMark: StateMark) {
        try {
            const worksheetDefinition = Application.instance.worksheetDefinition;
            const worksheetState = Application.instance.session.worksheetState();
            if (!worksheetState) {
                throw new EvalError();
            }

            if (!currentStateMark.featureSetId) {
                new WorksheetStateView(new WorksheetStateViewModel({ currentStateMark: currentStateMark })).show();
                return;
            }

            const currentFeatureSetDefinition = worksheetDefinition.getFeatureSetDefinition(currentStateMark.featureSetId);

            if (!currentStateMark.featureId) {
                let nextStateMark: StateMark;
                if (currentStateMark.review) {
                    // Reviewing current feature set
                } else {
                    // Starting feature set
                    // Go to first feature of feature set
                    nextStateMark = new StateMark({
                        featureId: currentFeatureSetDefinition.featureIds[0],
                        featureSetId: currentStateMark.featureSetId,
                        worksheetStateId: worksheetState.id
                    });
                }
                this.setLocation(this._hrefs.state(nextStateMark));
                return;
            }

            let currentFeatureIndex: number = 0;
            for (; currentFeatureIndex < currentFeatureSetDefinition.featureIds.length; currentFeatureIndex++) {
                if (currentFeatureSetDefinition.featureIds[currentFeatureIndex] == currentStateMark.currentFeatureId) {
                    break;
                }
            }
            if (currentFeatureIndex == currentFeatureSetDefinition.featureIds.length) {
                throw new NoSuchWorksheetFeatureDefinitionException({ id: currentStateMark.featureId });
            }

            if (currentFeatureIndex + 1 < currentFeatureSetDefinition.featureIds.length) {
                // Go to next feature in set
                const nextStateMark = new StateMark({
                    featureId: currentFeatureSetDefinition.featureIds[currentFeatureIndex + 1],
                    featureSetId: currentStateMark.featureSetId,
                    worksheetStateId: worksheetState.id
                });
                this.setLocation(this._hrefs.state(nextStateMark));
                return;
            }

            let currentFeatureSetIndex: number = 0;
            for (; currentFeatureIndex < currentFeatureSetDefinition.featureIds.length; currentFeatureIndex++) {
                if (currentFeatureSetDefinition.featureIds[currentFeatureIndex] == currentStateMark.currentFeatureId) {
                    break;
                }
            }
            if (currentFeatureIndex == currentFeatureSetDefinition.featureIds.length) {
                throw new NoSuchWorksheetFeatureDefinitionException({ id: currentStateMark.featureId });
            }

        } catch (e) {
            Application.instance.errorHandler.handleSyncError(e);
        }
    }

    run() {
        this._sammy.run();
    }

    setLocation(location: string) {
        this._sammy.setLocation(location);
    }

    private _hrefs = new Hrefs();
    private _sammy: Sammy.Application = Sammy();
}
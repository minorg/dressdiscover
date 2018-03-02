import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { Hrefs } from 'dressdiscover/gui/worksheet/hrefs';
import { CreditsView } from 'dressdiscover/gui/worksheet/views/credits/credits_view';
import { PrivacyView } from 'dressdiscover/gui/worksheet/views/privacy/privacy_view';
import { StartView } from 'dressdiscover/gui/worksheet/views/start/start_view';
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

    goToNextState(currentStateMark: WorksheetStateMark) {
        console.info("Current state mark: " + currentStateMark.toString());
        try {
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
                this.goToState(new WorksheetStateMark({ featureSetId: featureSetIds[0], worksheetStateId: worksheetState.id }))
                return;
            }

            const currentFeatureSetDefinition = worksheetDefinition.getFeatureSetDefinition(currentStateMark.featureSetId);

            if (!currentStateMark.featureId) {
                // Currently on a feature set start or review.
                if (currentStateMark.review) {
                    // Currently reviewing feature set
                    const nextFeatureSetId = worksheetDefinition.getNextFeatureSetId({ currentFeatureSetId: currentStateMark.featureSetId, featureSetIds: featureSetIds });
                    if (nextFeatureSetId) {
                        // Go to next feature set
                        this.goToState(new WorksheetStateMark({
                            featureSetId: nextFeatureSetId,
                            worksheetStateId: worksheetState.id
                        }));
                        return;
                    } else {
                        // Go to worksheet review
                        this.goToState(new WorksheetStateMark({
                            review: true,
                            worksheetStateId: worksheetState.id
                        }));
                        return;
                    }
                } else {
                    // Currently starting feature set
                    // Go to first feature of feature set
                    this.goToState(new WorksheetStateMark({
                        featureId: currentFeatureSetDefinition.featureIds[0],
                        featureSetId: currentStateMark.featureSetId,
                        worksheetStateId: worksheetState.id
                    }));
                    return;
                }
            }

            // Currently on a feature
            const nextFeatureId = worksheetDefinition.getNextFeatureId({ currentFeatureId: currentStateMark.featureId, currentFeatureSetDefinition: currentFeatureSetDefinition });
            if (nextFeatureId) {
                // Go to next feature
                this.goToState(new WorksheetStateMark({
                    featureId: nextFeatureId,
                    featureSetId: currentStateMark.featureSetId,
                    worksheetStateId: worksheetState.id
                }));
                return;
            } else {
                // Go to feature set review
                this.goToState(new WorksheetStateMark({
                    featureSetId: currentStateMark.featureSetId,
                    review: true,
                    worksheetStateId: worksheetState.id
                }));
            }
        } catch (e) {
            Application.instance.errorHandler.handleSyncError(e);
        }
    }

    goToState(stateMark: WorksheetStateMark) {
        console.info("New state mark: " + stateMark.toString());
        this.setLocation(this._hrefs.state(stateMark));
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
import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetFeatureState } from 'dressdiscover/api/models/worksheet/worksheet_feature_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { Hrefs } from 'dressdiscover/gui/worksheet/hrefs';
import { FeatureSetStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/feature_set_state_view_model';
import { FeatureStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/feature_state_view_model';
import { WorksheetStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/worksheet_state_view_model';
import { StartView } from 'dressdiscover/gui/worksheet/views/start/start_view';
import { FeatureSetStateView } from 'dressdiscover/gui/worksheet/views/state/feature_set_state_view';
import { FeatureStateView } from 'dressdiscover/gui/worksheet/views/state/feature_state_view';
import { WorksheetStateView } from 'dressdiscover/gui/worksheet/views/state/worksheet_state_view';
import { StaticView } from 'dressdiscover/gui/worksheet/views/static/static_view';
import _ = require('lodash');
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
        this._sammy.get("^/#/privacy$", (context: any) => {
            self._onGetPrivacy();
        });
        this._sammy.get("^/#/state/:worksheetStateId/:featureSetId/:featureId$", (context: any) => {
            self._onGetState(context);
        });
        this._sammy.get("^/#/state/:worksheetStateId/:featureSetId/$", (context: any) => {
            self._onGetState(context);
        });
        this._sammy.get("^/#/state/:worksheetStateId/$", (context: any) => {
            self._onGetState(context);
        });
    }

    private _onGetCredits() {
        new StaticView({ contentHtmlFileName: "static/credits_view.html", title: "Credits" }).show();
    }

    private _onGetPrivacy() {
        new StaticView({ contentHtmlFileName: "static/privacy_view.html", title: "Privacy Policy" }).show();
    }

    private _onGetRoot() {
        new StartView().show();
    }

    private _onGetState(context: any) {
        let stateMark: WorksheetStateMark;

        try {
            stateMark = new WorksheetStateMark({
                featureId: context.params.featureId ? WorksheetFeatureId.parse(context.params.featureId) : undefined,
                featureSetId: context.params.featureSetId ? WorksheetFeatureSetId.parse(context.params.featureSetId) : undefined,
                review: context.params.review ? true : undefined,
                worksheetStateId: WorksheetStateId.parse(context.params.worksheetStateId),
            });
        } catch (e) {
            if (e instanceof RangeError) {
                Application.instance.errorHandler.handleSyncError(e);
            } else {
                throw e;
            }
            return;
        }
        console.info("Get state mark: " + stateMark.toString());

        Application.instance.services.worksheetStateQueryService.getWorksheetStateAsync({
            error: (errorKwds) => {
                Application.instance.session.worksheetState(null);
                Application.instance.errorHandler.handleAsyncError(errorKwds);
            },
            id: stateMark.worksheetStateId,
            success: (state) => {
                // Wait to change session worksheetState until we've created any state placeholders.

                try {
                    if (stateMark.featureSetId) {
                        const featureSetDefinition = Application.instance.worksheetDefinition.getFeatureSetById(stateMark.featureSetId);

                        let featureSetState = _.find(state.featureSets, (featureSetState) => featureSetState.id.equals(stateMark.featureSetId));
                        if (!featureSetState) {
                            featureSetState = new WorksheetFeatureSetState({ features: [], id: stateMark.featureSetId });
                            state.featureSets.push(featureSetState);
                        }

                        if (stateMark.featureId) {
                            let featureState = _.find(featureSetState.features, (featureState) => featureState.id.equals(stateMark.featureId));
                            if (!featureState) {
                                featureState = new WorksheetFeatureState({ id: stateMark.featureId });
                                featureSetState.features.push(featureState);
                            }

                            // Save the worksheet state now that we've added any placeholders
                            Application.instance.session.worksheetState(state);

                            new FeatureStateView(new FeatureStateViewModel({
                                currentStateMark: stateMark,
                                featureDefinition: Application.instance.worksheetDefinition.getFeatureById(stateMark.featureId),
                                featureSetDefinition: featureSetDefinition,
                                featureState: featureState
                            })).show();
                        } else {
                            // Save the worksheet state now that we've added any placeholders
                            Application.instance.session.worksheetState(state);

                            new FeatureSetStateView(new FeatureSetStateViewModel({
                                currentStateMark: stateMark,
                                featureSetDefinition: featureSetDefinition,
                                featureSetState: featureSetState
                            })).show();
                        }
                    } else {
                        Application.instance.session.worksheetState(state);
                        new WorksheetStateView(new WorksheetStateViewModel({ currentStateMark: stateMark })).show();
                    }
                } catch (e) {
                    Application.instance.errorHandler.handleSyncError(e);
                }
            }
        });
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
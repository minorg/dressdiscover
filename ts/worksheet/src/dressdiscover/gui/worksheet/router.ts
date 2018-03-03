import { WorksheetFeatureId } from 'dressdiscover/api/models/worksheet/worksheet_feature_id';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { Hrefs } from 'dressdiscover/gui/worksheet/hrefs';
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
        this._sammy.get("^/#/state/:worksheetStateId/", (context: any) => {
            self._onGetState(context);
        });
        this._sammy.get("^/#/state/:worksheetStateId/:featureSetId/", (context: any) => {
            self._onGetState(context);
        });
        this._sammy.get("^/#/state/:worksheetStateId/:featureSetId/:featureId", (context: any) => {
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

        Application.instance.services.worksheetStateQueryService.getWorksheetStateAsync({
            error: (errorKwds) => {
                Application.instance.session.worksheetState(null);
                Application.instance.errorHandler.handleAsyncError(errorKwds);
            },
            id: stateMark.worksheetStateId,
            success: (state) => {
                Application.instance.session.worksheetState(state);
                // TODO: differentiate the views depending on which parts of the mark are set.
                new WorksheetStateView(new WorksheetStateViewModel({ currentStateMark: stateMark })).show();
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
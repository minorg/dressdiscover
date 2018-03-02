import { Application } from 'dressdiscover/gui/worksheet/application';
import { StateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/state_view_model';
import { CreditsView } from 'dressdiscover/gui/worksheet/views/credits/credits_view';
import { PrivacyView } from 'dressdiscover/gui/worksheet/views/privacy/privacy_view';
import { StartView } from 'dressdiscover/gui/worksheet/views/start/start_view';
import { StateView } from 'dressdiscover/gui/worksheet/views/state/state_view';
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
        this._sammy.get("^/#/state/:stateId/:featureSetId/:featureId", (context: any) => {
            self._onGetFeatureState(context);
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

    private _onGetFeatureState(context: any) {
    }

    private _onGetState(context: any) {
        const state = Application.instance.services.worksheetStateQueryService.getWorksheetStateSync({
            id: context.params.stateId
        })
        new StateView(new StateViewModel({
            state: state
        })).show();
    }

    run() {
        this._sammy.run();
    }

    setLocation(location: string) {
        this._sammy.setLocation(location);
    }

    private _sammy: Sammy.Application = Sammy();
}
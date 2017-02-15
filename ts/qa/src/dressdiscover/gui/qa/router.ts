import * as Sammy from "sammy";
import { HomeView } from "dressdiscover/gui/qa/views/home_view";
import { HomeViewModel } from "dressdiscover/gui/qa/view_models/home_view_model";
import { Session } from "dressdiscover/gui/qa/models/session";
import { Services } from "dressdiscover/gui/qa/services/services";
import { UserIdInputView } from "dressdiscover/gui/qa/views/user_id_input_view";

export class Router {
    constructor(sammy: Sammy.Application, session: Session, services: Services) {
        this._sammy = sammy;
        this._session = session;
        this._services = services;

        const self = this;
        sammy.get('', (context: any) => {
            self.onGetRoot(context);
        });
        sammy.get('#/question/:objectId/:questionSetId/:questionId', (context: any) => {
            self.onGetQuestion(context);        
        });
    }

    private checkAuthentication(onSuccess: () => void) {
        if (this._session.currentUserId) {
            onSuccess();
        } else {
            new UserIdInputView(onSuccess, this._session).show();
        }       
    }

    private onGetRoot(context: any) {
        this.checkAuthentication(() => {
            const objects = this._services.queryService.getObjectsSync();
            new HomeView(new HomeViewModel(objects)).show();
        });
    }

    goToQuestion(objectId: string, questionId: string, questionSetId: string) {
    }

    private onGetQuestion(context: any) {
        this.checkAuthentication(() => {
        
        });
    }

    private _sammy: Sammy.Application;
    private _session: Session;
    private _services: Services;
}
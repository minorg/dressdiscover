import * as Sammy from "sammy";
import { Session } from "dressdiscover/gui/qa/models/session";
import { UserIdInputView } from "dressdiscover/gui/qa/views/user_id_input_view";

export class Router {
    constructor(sammy: Sammy.Application, session: Session) {
        this._sammy = sammy;
        this._session = session;

        const self = this;
        sammy.get('', (context: any) => {
            self.onGetRoot(context);
        });
        sammy.get('#/question/:objectId/:questionSetId/:questionId', (context: any) => {
            self.onGetQuestion(context);        
        });
    }

    private checkAuthentication(onSuccess: () => void) {
        while (!this._session.currentUserId) {
            new UserIdInputView(onSuccess).show();
        }        

        onSuccess();
    }

    private onGetRoot(context: any) {
        this.checkAuthentication(() => {
            // Load root page
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
}
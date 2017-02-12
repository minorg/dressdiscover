import * as Sammy from "sammy";
import { Router } from "dressdiscover/gui/qa/router";
import { Session } from "dressdiscover/gui/qa/models/session";

export class Application {
    private constructor() {
        this._session = new Session();
        this._router = new Router(this.sammy, this.session);
    }

    static get instance() {
        return Application._instance;
    }

    get router() {
        return this._router;
    }

    get session() {
        return this._session;
    }

    run() {
        this.sammy.run();
    }

    private _router: Router;
    private sammy: Sammy.Application = Sammy();
    private _session: Session;
    private static _instance: Application = new Application();
}

$(() => {
    Application.instance.run();
});

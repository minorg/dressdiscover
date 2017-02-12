import * as Sammy from "sammy";
import { Router } from "dressdiscover/gui/qa/router";
import { Session } from "dressdiscover/gui/qa/models/session";
import { Services } from "dressdiscover/gui/qa/services/services";

export class Application {
    private constructor() {
        this._session = new Session();
        this._router = new Router(this.sammy, this.session);
        this._services = new Services();
    }

    static get instance() {
        return Application._instance;
    }

    get router() {
        return this._router;
    }

    run() {
        this.sammy.run();
    }

    get session() {
        return this._session;
    }

    get services() {
        return this._services;
    }

    private _router: Router;
    private sammy: Sammy.Application = Sammy();
    private _session: Session;
    private _services: Services;
    private static _instance: Application = new Application();
}

$(() => {
    Application.instance.run();
});

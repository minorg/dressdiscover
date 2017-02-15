import { Router } from "dressdiscover/gui/qa/router";
import { Session } from "dressdiscover/gui/qa/models/session";
import { Services } from "dressdiscover/gui/qa/services/services";

export class Application {
    private constructor() {
        this._session = new Session();
        this._services = new Services();
        this._router = new Router();
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

    get services() {
        return this._services;
    }

    private _router: Router;
    private _session: Session;
    private _services: Services;
    private static _instance: Application = new Application();
}

$(() => {
    Application.instance.router.run();
});

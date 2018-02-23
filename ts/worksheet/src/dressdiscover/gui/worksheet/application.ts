import './custom.scss';
import 'bootstrap';

import { Router } from 'dressdiscover/gui/worksheet/router';
import { Services } from 'dressdiscover/gui/worksheet/services/services';
import { Session } from 'dressdiscover/gui/worksheet/session';

export class Application {
    private constructor() {
    }

    static get instance() {
        if (!Application._instance) {
            throw new Error("instance not initialized");
        }
        return Application._instance;
    }

    static run() {
        if (Application._instance) {
            throw new Error("instance already initialized");
        }

        Application._instance = new Application();
    }

    public readonly router = new Router();
    public readonly services = new Services();
    public readonly session = new Session();
    private static _instance?: Application;
}

$(() => {
    Application.run();
});

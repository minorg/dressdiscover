import './custom.scss';
import 'bootstrap';

// import { Session } from 'dressdiscover/gui/models/session';
// import { Router } from 'dressdiscover/gui/router';
// import { Services } from 'dressdiscover/gui/services/services';

export class Application {
    // private constructor(services: Services, session: Session) {
    //     this._session = session;
    //     this._services = services;
    //     this._router = new Router();
    // }

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

        // const services = new Services();
        // services.thingQueryService.getThingCategoryDefinitionsAsync({
        //     error: (errorKwds) => {
        //         const session = new Session(new ThingCategoryDefinitions(new ThingCategoryDefinition({ id: 1, text: "Root" })));
        //         const instance = new Application(services, session);
        //         Application._instance = instance;
        //         ErrorModalView.fromAsyncError(errorKwds).show({
        //             onHidden: () => {
        //                 instance.router.run();
        //             }
        //         });
        //     },
        //     success: (definitions) => {
        //         const session = new Session(new ThingCategoryDefinitions(definitions));
        //         Application._instance = new Application(services, session);
        //         Application._instance.router.run();
        //     }
        // });
    }

    // get router() {
    //     return this._router;
    // }

    // get session() {
    //     return this._session;
    // }

    // get services() {
    //     return this._services;
    // }

    // private _router: Router;
    // private _session: Session;
    // private _services: Services;
    private static _instance?: Application;
}

$(() => {
    Application.run();
});

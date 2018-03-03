import './custom.scss';
import 'bootstrap';

import { ErrorHandler } from 'dressdiscover/gui/worksheet/error_handler';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { WorksheetStateMachine } from 'dressdiscover/gui/worksheet/models/worksheet_state_machine';
import { Router } from 'dressdiscover/gui/worksheet/router';
import { Services } from 'dressdiscover/gui/worksheet/services/services';
import { Session } from 'dressdiscover/gui/worksheet/session';

export class Application {
    private constructor(
        public readonly errorHandler: ErrorHandler,
        public readonly services: Services,
        public readonly worksheetDefinition: WorksheetDefinitionWrapper
    ) {
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

        const errorHandler = new ErrorHandler();
        const services = new Services();
        services.worksheetDefinitionQueryService.getWorksheetDefinitionAsync({
            error: errorHandler.handleAsyncError,
            success: (definition) => {
                Application._instance = new Application(errorHandler, services, new WorksheetDefinitionWrapper(definition));
                Application.instance.router.run();
            }
        });
    }

    readonly router = new Router();
    readonly session = new Session();
    readonly worksheetStateMachine = new WorksheetStateMachine;
    private static _instance?: Application;
}

$(() => {
    Application.run();
});

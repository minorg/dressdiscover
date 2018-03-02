import './custom.scss';
import 'bootstrap';

import { ErrorHandler } from 'dressdiscover/gui/worksheet/error_handler';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { Router } from 'dressdiscover/gui/worksheet/router';
import { Services } from 'dressdiscover/gui/worksheet/services/services';
import { Session } from 'dressdiscover/gui/worksheet/session';

export class Application {
    private constructor(public readonly worksheetDefinition: WorksheetDefinitionWrapper) {
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

        Application.instance.services.worksheetDefinitionQueryService.getWorksheetDefinitionAsync({
            error: Application.instance.errorHandler.handleAsyncError,
            success: (definition) => {
                Application._instance = new Application(new WorksheetDefinitionWrapper(definition));
                Application.instance.router.run();
            }
        });
    }

    readonly errorHandler = new ErrorHandler();
    readonly router = new Router();
    readonly services = new Services();
    readonly session = new Session();
    private static _instance?: Application;
}

$(() => {
    Application.run();
});

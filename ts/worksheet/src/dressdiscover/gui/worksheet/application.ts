import './custom.scss';
import 'bootstrap';

import { ErrorHandler } from 'dressdiscover/gui/worksheet/error_handler';
import { WorksheetDefinitionWrapper } from 'dressdiscover/gui/worksheet/models/worksheet_definition_wrapper';
import { Router } from 'dressdiscover/gui/worksheet/router';
import { Services } from 'dressdiscover/gui/worksheet/services/services';
import { Session } from 'dressdiscover/gui/worksheet/session';
import * as ko from 'knockout';

export class Application {
    private constructor(
        public readonly errorHandler: ErrorHandler,
        public readonly services: Services,
        public readonly worksheetDefinition: WorksheetDefinitionWrapper
    ) {
        this._initCustomBindings();
    }

    private _initCustomBindings() {
        ko.bindingHandlers.iCheck = {
            init: function (element, valueAccessor, allBindingsAccessor, viewModel, bindingContext) {
                var $el = $(element) as any;
                var observable = valueAccessor();

                $el.iCheck({
                    checkboxClass: 'icheckbox_square-red',
                    inheritClass: true
                });

                // var enabled = allBindingsAccessor().enable();
                // if (enabled) {
                //     $el.iCheck('enable');
                // }
                // else {
                //     $el.iCheck('disable');
                // }

                ko.utils.domNodeDisposal.addDisposeCallback(element, function () {
                    $el.iCheck('destroy');
                });

                // allBindingsAccessor().enable.subscribeChanged(function (newValue, oldValue) {
                //     if (newValue != oldValue) {
                //         $el.iCheck('update');
                //     }
                // });

                // ifChecked handles tabs and clicks
                $el.on('ifChecked', function (e) {
                    observable(true);
                });
                $el.on('ifUnchecked', function (e) {
                    observable(false);
                });

                (ko as any).bindingHandlers.iCheck.update(element, valueAccessor, allBindingsAccessor, viewModel, bindingContext);
            },
            update: function (element, valueAccessor, allBindingsAccessor, viewModel, bindingContext) {
                // This update handles both the reverting of values from cancelling edits, and the initial value setting.
                var $el = $(element) as any;
                var value = ko.unwrap(valueAccessor());
                if (value == true) {
                    $el.iCheck('check');
                } else if (value == false || value == null || value == "") { // Handle clearing the value on reverts.
                    $el.iCheck('uncheck');
                }
            }
        };
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

        console.info("Ping response: ", services.worksheetPingQueryService.pingSync({ message: "ping server" }));

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
    private static _instance?: Application;
}

$(() => {
    Application.run();
});

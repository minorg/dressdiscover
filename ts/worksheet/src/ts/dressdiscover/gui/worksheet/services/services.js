"use strict";
var local_worksheet_command_service_1 = require("dressdiscover/gui/worksheet/services/local_worksheet_command_service");
var local_worksheet_query_service_1 = require("dressdiscover/gui/worksheet/services/local_worksheet_query_service");
var Services = (function () {
    function Services() {
        this._worksheetCommandService = new local_worksheet_command_service_1.LocalWorksheetCommandService;
        this._worksheetQueryService = new local_worksheet_query_service_1.LocalWorksheetQueryService;
    }
    Object.defineProperty(Services.prototype, "worksheetCommandService", {
        get: function () {
            return this._worksheetCommandService;
        },
        enumerable: true,
        configurable: true
    });
    Object.defineProperty(Services.prototype, "worksheetQueryService", {
        get: function () {
            return this._worksheetQueryService;
        },
        enumerable: true,
        configurable: true
    });
    return Services;
}());
exports.Services = Services;
//# sourceMappingURL=services.js.map
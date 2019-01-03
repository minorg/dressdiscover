"use strict";
var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var async_to_sync_worksheet_command_service_1 = require("dressdiscover/api/services/worksheet/async_to_sync_worksheet_command_service");
var local_worksheet_query_service_1 = require("dressdiscover/gui/worksheet/services/local_worksheet_query_service");
var LocalWorksheetCommandService = (function (_super) {
    __extends(LocalWorksheetCommandService, _super);
    function LocalWorksheetCommandService() {
        return _super !== null && _super.apply(this, arguments) || this;
    }
    LocalWorksheetCommandService.prototype.deleteWorksheetStateSync = function (kwds) {
        console.info("delete " + kwds.accessionNumber);
        localStorage.removeItem(local_worksheet_query_service_1.LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.accessionNumber));
    };
    LocalWorksheetCommandService.prototype.putWorksheetStateSync = function (kwds) {
        var jsonString = JSON.stringify(kwds.state.toThryftJSON());
        console.info("put " + jsonString);
        localStorage.setItem(local_worksheet_query_service_1.LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.state.accessionNumber), jsonString);
    };
    return LocalWorksheetCommandService;
}(async_to_sync_worksheet_command_service_1.AsyncToSyncWorksheetCommandService));
exports.LocalWorksheetCommandService = LocalWorksheetCommandService;
//# sourceMappingURL=local_worksheet_command_service.js.map
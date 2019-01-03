"use strict";
var __extends = (this && this.__extends) || function (d, b) {
    for (var p in b) if (b.hasOwnProperty(p)) d[p] = b[p];
    function __() { this.constructor = d; }
    d.prototype = b === null ? Object.create(b) : (__.prototype = b.prototype, new __());
};
var async_to_sync_worksheet_query_service_1 = require("dressdiscover/api/services/worksheet/async_to_sync_worksheet_query_service");
var worksheet_definition_1 = require("dressdiscover/api/models/worksheet/worksheet_definition");
var worksheet_state_1 = require("dressdiscover/api/models/worksheet/worksheet_state");
var LocalWorksheetQueryService = (function (_super) {
    __extends(LocalWorksheetQueryService, _super);
    function LocalWorksheetQueryService() {
        var _this = _super.call(this) || this;
        _this._worksheetDefinition = worksheet_definition_1.WorksheetDefinition.fromThryftJSON(WORKSHEET_DEFINITION);
        return _this;
    }
    LocalWorksheetQueryService.prototype.getWorksheetAccessionNumbersSync = function () {
        var result = [];
        for (var keyI = 0;; keyI++) {
            var key = localStorage.key(keyI);
            if (key == null) {
                break;
            }
            if (!key.match("^" + LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX)) {
                continue;
            }
            else if (key.length == LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX.length) {
                continue;
            }
            result.push(key.substr(LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX.length));
        }
        return result;
    };
    LocalWorksheetQueryService.prototype.getWorksheetDefinitionSync = function () {
        return this._worksheetDefinition;
    };
    LocalWorksheetQueryService.getWorksheetStateItemKey = function (accessionNumber) {
        return LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX + accessionNumber;
    };
    LocalWorksheetQueryService.prototype.getWorksheetStateSync = function (kwds) {
        var jsonString = localStorage.getItem(LocalWorksheetQueryService.getWorksheetStateItemKey(kwds.accessionNumber));
        console.info("state from service: " + jsonString);
        if (jsonString == null) {
            return new worksheet_state_1.WorksheetState();
        }
        return worksheet_state_1.WorksheetState.fromThryftJSON(JSON.parse(jsonString));
    };
    return LocalWorksheetQueryService;
}(async_to_sync_worksheet_query_service_1.AsyncToSyncWorksheetQueryService));
LocalWorksheetQueryService._WORKSHEET_ITEM_KEY_PREFIX = "worksheet/state/";
exports.LocalWorksheetQueryService = LocalWorksheetQueryService;
//# sourceMappingURL=local_worksheet_query_service.js.map
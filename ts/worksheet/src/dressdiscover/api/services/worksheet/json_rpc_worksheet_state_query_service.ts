import * as $ from "jquery"
import { IoException } from "../io_exception";
import { NoSuchWorksheetStateException } from "./no_such_worksheet_state_exception";
import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export class JsonRpcWorksheetStateQueryService implements WorksheetStateQueryService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this._endpointUrl = kwds.endpointUrl;
        this._methodEndpoints = !!kwds.methodEndpoints;
    }

    getWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["id"] = kwds.id.toString();

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            }),
            dataType: 'json',
            error: (jqXHR, textStatus, errorThrown) => {
                kwds.error({jqXHR: jqXHR, textStatus, errorThrown: errorThrown});
            },
            mimeType: 'application/json',
            type: 'POST',
            success: (data, textStatus, jqXHR) => {
                // data is a JSON-RPC 2.0 response, either
                // {"jsonrpc": "2.0", "result": -19, "id": 2} on success
                // or
                // {"jsonrpc": "2.0", "error": {"code": -32601, "message": "Method not found"}, "id": "1"} on error

                if (typeof data.result !== "undefined") {
                    kwds.success(WorksheetState.fromThryftJsonObject(data.result));
                    return;
                }

                var __error;
                if (data.error["@class"] && data.error.data) {
                    var __error_class = data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                        __error = IoException.fromThryftJsonObject(data.error.data);
                    } else if (__error_class == 'dressdiscover.api.services.worksheet.no_such_worksheet_state_exception.NoSuchWorksheetStateException') {
                        __error = NoSuchWorksheetStateException.fromThryftJsonObject(data.error.data);
                    } else {
                        __error = new Error(data.error.message);
                    }
                } else {
                    __error = new Error(data.error.message);
                }
                kwds.error({jqXHR: jqXHR, textStatus: __error.toString(), errorThrown: __error});
            },
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_state" : "")
        });
    }

    getWorksheetStateSync(kwds: {id: WorksheetStateId}): WorksheetState {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["id"] = kwds.id.toString();

        var __error;
        var __returnValue: WorksheetState | undefined = undefined;

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            }),
            dataType: 'json',
            error: (jqXHR, textStatus, errorThrown) => {
                __error = new Error(errorThrown);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: (data) => {
                if (typeof data.result !== "undefined") {
                    __returnValue = WorksheetState.fromThryftJsonObject(data.result);
                } else {
                    if (data.error["@class"] && data.error.data) {
                        var __error_class = data.error["@class"];
                        if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                            __error = IoException.fromThryftJsonObject(data.error.data);
                        } else if (__error_class == 'dressdiscover.api.services.worksheet.no_such_worksheet_state_exception.NoSuchWorksheetStateException') {
                            __error = NoSuchWorksheetStateException.fromThryftJsonObject(data.error.data);
                        } else {
                            __error = new Error(data.error.message);
                        }
                    } else {
                        __error = new Error(data.error.message);
                    }
                }
            },
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_state" : ""),
        });

        if (typeof __returnValue !== "undefined") {
            return __returnValue;
        } else {
            throw __error;
        }
    }

    getWorksheetStateIdsAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetStateId[]) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state_ids',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            error: (jqXHR, textStatus, errorThrown) => {
                kwds.error({jqXHR: jqXHR, textStatus, errorThrown: errorThrown});
            },
            mimeType: 'application/json',
            type: 'POST',
            success: (data, textStatus, jqXHR) => {
                // data is a JSON-RPC 2.0 response, either
                // {"jsonrpc": "2.0", "result": -19, "id": 2} on success
                // or
                // {"jsonrpc": "2.0", "error": {"code": -32601, "message": "Method not found"}, "id": "1"} on error

                if (typeof data.result !== "undefined") {
                    kwds.success(function(json: any[]): WorksheetStateId[] { var sequence: WorksheetStateId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetStateId.parse(json[i])); } return sequence; }(data.result));
                    return;
                }

                var __error;
                if (data.error["@class"] && data.error.data) {
                    var __error_class = data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                        __error = IoException.fromThryftJsonObject(data.error.data);
                    } else {
                        __error = new Error(data.error.message);
                    }
                } else {
                    __error = new Error(data.error.message);
                }
                kwds.error({jqXHR: jqXHR, textStatus: __error.toString(), errorThrown: __error});
            },
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_state_ids" : "")
        });
    }

    getWorksheetStateIdsSync(): WorksheetStateId[] {
        var __error;
        var __returnValue: WorksheetStateId[] | undefined = undefined;

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state_ids',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            error: (jqXHR, textStatus, errorThrown) => {
                __error = new Error(errorThrown);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: (data) => {
                if (typeof data.result !== "undefined") {
                    __returnValue = function(json: any[]): WorksheetStateId[] { var sequence: WorksheetStateId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetStateId.parse(json[i])); } return sequence; }(data.result);
                } else {
                    if (data.error["@class"] && data.error.data) {
                        var __error_class = data.error["@class"];
                        if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                            __error = IoException.fromThryftJsonObject(data.error.data);
                        } else {
                            __error = new Error(data.error.message);
                        }
                    } else {
                        __error = new Error(data.error.message);
                    }
                }
            },
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_state_ids" : ""),
        });

        if (typeof __returnValue !== "undefined") {
            return __returnValue;
        } else {
            throw __error;
        }
    }
    
    private readonly _endpointUrl: string;
    private readonly _methodEndpoints: boolean;
}

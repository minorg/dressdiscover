import * as $ from "jquery"
import { DuplicateWorksheetStateException } from "./duplicate_worksheet_state_exception";
import { IoException } from "../io_exception";
import { NoSuchWorksheetStateException } from "./no_such_worksheet_state_exception";
import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateCommandService } from "./worksheet_state_command_service";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export class JsonRpcWorksheetStateCommandService implements WorksheetStateCommandService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this._endpointUrl = kwds.endpointUrl;
        this._methodEndpoints = !!kwds.methodEndpoints;
    }

    deleteWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["id"] = kwds.id.toString();

        $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'delete_worksheet_state',
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
                    kwds.success();
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
            url: this._endpointUrl + (this._methodEndpoints ? "/delete_worksheet_state" : "")
        });
    }

    deleteWorksheetStateSync(kwds: {id: WorksheetStateId}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["id"] = kwds.id.toString();

        var __error;

        $.ajax({
            async: false,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'delete_worksheet_state',
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
                if (typeof data.result === "undefined") {
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
            url: this._endpointUrl + (this._methodEndpoints ? "/delete_worksheet_state" : ""),
        });

        if (__error) {
            throw __error;
        }
    }

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["state"] = kwds.state.toThryftJsonObject();

        $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_worksheet_state',
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
                    kwds.success();
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
            url: this._endpointUrl + (this._methodEndpoints ? "/put_worksheet_state" : "")
        });
    }

    putWorksheetStateSync(kwds: {state: WorksheetState}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["state"] = kwds.state.toThryftJsonObject();

        var __error;

        $.ajax({
            async: false,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_worksheet_state',
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
                if (typeof data.result === "undefined") {
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
            url: this._endpointUrl + (this._methodEndpoints ? "/put_worksheet_state" : ""),
        });

        if (__error) {
            throw __error;
        }
    }

    renameWorksheetStateAsync(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["new_id"] = kwds.newId.toString();
        __jsonrpc_params["old_id"] = kwds.oldId.toString();

        $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'rename_worksheet_state',
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
                    kwds.success();
                    return;
                }

                var __error;
                if (data.error["@class"] && data.error.data) {
                    var __error_class = data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.worksheet.duplicate_worksheet_state_exception.DuplicateWorksheetStateException') {
                        __error = DuplicateWorksheetStateException.fromThryftJsonObject(data.error.data);
                    } else if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
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
            url: this._endpointUrl + (this._methodEndpoints ? "/rename_worksheet_state" : "")
        });
    }

    renameWorksheetStateSync(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["new_id"] = kwds.newId.toString();
        __jsonrpc_params["old_id"] = kwds.oldId.toString();

        var __error;

        $.ajax({
            async: false,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'rename_worksheet_state',
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
                if (typeof data.result === "undefined") {
                    if (data.error["@class"] && data.error.data) {
                        var __error_class = data.error["@class"];
                        if (__error_class == 'dressdiscover.api.services.worksheet.duplicate_worksheet_state_exception.DuplicateWorksheetStateException') {
                            __error = DuplicateWorksheetStateException.fromThryftJsonObject(data.error.data);
                        } else if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
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
            url: this._endpointUrl + (this._methodEndpoints ? "/rename_worksheet_state" : ""),
        });

        if (__error) {
            throw __error;
        }
    }
    
    private readonly _endpointUrl: string;
    private readonly _methodEndpoints: boolean;
}

import * as $ from "jquery"
import { IoException } from "../io_exception";
import { WorksheetPingQueryService } from "./worksheet_ping_query_service";

export class JsonRpcWorksheetPingQueryService implements WorksheetPingQueryService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this._endpointUrl = kwds.endpointUrl;
        this._methodEndpoints = !!kwds.methodEndpoints;
    }

    pingAsync(kwds: {message: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["message"] = kwds.message;

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'ping',
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
                    kwds.success(data.result);
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
            url: this._endpointUrl + (this._methodEndpoints ? "/ping" : "")
        });
    }

    pingSync(kwds: {message: string}): string {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["message"] = kwds.message;

        var __error;
        var __returnValue: string | undefined = undefined;

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'ping',
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
                    __returnValue = data.result;
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
            url: this._endpointUrl + (this._methodEndpoints ? "/ping" : ""),
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

import * as $ from "jquery"
import { IoException } from "../io_exception";
import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetDefinitionQueryService } from "./worksheet_definition_query_service";

export class JsonRpcWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this._endpointUrl = kwds.endpointUrl;
        this._methodEndpoints = !!kwds.methodEndpoints;
    }

    getWorksheetDefinitionAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetDefinition) => void}): void {
        $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_definition',
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
                    kwds.success(WorksheetDefinition.fromThryftJsonObject(data.result));
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
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_definition" : "")
        });
    }

    getWorksheetDefinitionSync(): WorksheetDefinition {
        var __error;
        var __returnValue: WorksheetDefinition | undefined = undefined;

        $.ajax({
            async: false,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_definition',
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
                    __returnValue = WorksheetDefinition.fromThryftJsonObject(data.result);
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
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_definition" : ""),
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

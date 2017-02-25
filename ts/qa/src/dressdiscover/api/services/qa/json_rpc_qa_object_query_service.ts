import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaObjectQueryService } from "./qa_object_query_service";

export class JsonRpcQaObjectQueryService implements QaObjectQueryService {
    constructor(private baseUrl?: string) {
    }

    getObjectByIdAsync(kwds: {id: QaObjectId, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QaObject) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["id"] = kwds.id.toString();

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_object_by_id',
                params: __jsonrpc_params,
                id: '1234'
            }),
            dataType: 'json',
            error: function(jqXHR: any, textStatus: any, errorThrown: any) {
                if (kwds.error) {
                    kwds.error({jqXHR: jqXHR as JQueryXHR, textStatus: textStatus as string, errorThrown: errorThrown as string});
                }
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(data: any, textStatus: string, jqXHR: JQueryXHR) {
                // data is a JSON-RPC 2.0 response, either
                // {"jsonrpc": "2.0", "result": -19, "id": 2} on success
                // or
                // {"jsonrpc": "2.0", "error": {"code": -32601, "message": "Method not found"}, "id": "1"} on error
                if (typeof data.result !== "undefined") {
                    if (kwds.success) {
                        kwds.success(QaObject.fromThryftJSON(data.result));
                    }
                } else {
                    if (kwds.error) {
                        kwds.error({jqXHR: jqXHR, textStatus: data.error.message, errorThrown: null});
                    }
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/qa_object_query',
        });
    }

    getObjectByIdSync(kwds: {id: QaObjectId}): QaObject {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["id"] = kwds.id.toString();

        var returnValue: QaObject | undefined = undefined;

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_object_by_id',
                params: __jsonrpc_params,
                id: '1234'
            }),
            dataType: 'json',
            error: function(jqXHR: any, textStatus: any, errorThrown: any) {
                throw new Error(errorThrown);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(data: any) {
                if (typeof data.result !== "undefined") {
                    returnValue = QaObject.fromThryftJSON(data.result);
                } else {
                    throw new Error(data.error);
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/qa_object_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }

    getObjectsAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QaObject[]) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_objects',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            error: function(jqXHR: any, textStatus: any, errorThrown: any) {
                if (kwds.error) {
                    kwds.error({jqXHR: jqXHR as JQueryXHR, textStatus: textStatus as string, errorThrown: errorThrown as string});
                }
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(data: any, textStatus: string, jqXHR: JQueryXHR) {
                // data is a JSON-RPC 2.0 response, either
                // {"jsonrpc": "2.0", "result": -19, "id": 2} on success
                // or
                // {"jsonrpc": "2.0", "error": {"code": -32601, "message": "Method not found"}, "id": "1"} on error
                if (typeof data.result !== "undefined") {
                    if (kwds.success) {
                        kwds.success(function(json: any[]): QaObject[] { var sequence: QaObject[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QaObject.fromThryftJSON(json[i])); } return sequence; }(data.result));
                    }
                } else {
                    if (kwds.error) {
                        kwds.error({jqXHR: jqXHR, textStatus: data.error.message, errorThrown: null});
                    }
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/qa_object_query',
        });
    }

    getObjectsSync(): QaObject[] {
        var returnValue: QaObject[] | undefined = undefined;

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_objects',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            error: function(jqXHR: any, textStatus: any, errorThrown: any) {
                throw new Error(errorThrown);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(data: any) {
                if (typeof data.result !== "undefined") {
                    returnValue = function(json: any[]): QaObject[] { var sequence: QaObject[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QaObject.fromThryftJSON(json[i])); } return sequence; }(data.result);
                } else {
                    throw new Error(data.error);
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/qa_object_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }
}

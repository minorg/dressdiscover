import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaObjectQueryService } from "./qa_object_query_service";

export class JsonRpcQaObjectQueryService implements QaObjectQueryService {
    getObjectByIdAsync(kwds: {id: QaObjectId, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject) => void}): void {
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
                kwds.error(jqXHR as JQueryXHR, textStatus as string, errorThrown as string);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    kwds.success(QaObject.fromThryftJSON(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/qa_object_query',
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
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    returnValue = QaObject.fromThryftJSON(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/qa_object_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }

    getObjectsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject[]) => void}): void {
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
                kwds.error(jqXHR as JQueryXHR, textStatus as string, errorThrown as string);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    kwds.success(function(json: any[]): QaObject[] { var sequence: QaObject[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QaObject.fromThryftJSON(json[i])); } return sequence; }(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/qa_object_query',
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
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    returnValue = function(json: any[]): QaObject[] { var sequence: QaObject[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QaObject.fromThryftJSON(json[i])); } return sequence; }(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/qa_object_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }
}

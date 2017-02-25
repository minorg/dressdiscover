import { QuestionSet } from "../../models/qa/question_set";
import { QuestionSetId } from "../../models/qa/question_set_id";
import { QuestionSetQueryService } from "./question_set_query_service";

export class JsonRpcQuestionSetQueryService implements QuestionSetQueryService {
    constructor(private baseUrl?: string) {
    }

    getQuestionSetsAsync(kwds: {ids: QuestionSetId[], error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QuestionSet[]) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["ids"] = function (__inArray: QuestionSetId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(kwds.ids);

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_question_sets',
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
                        kwds.success(function(json: any[]): QuestionSet[] { var sequence: QuestionSet[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionSet.fromThryftJSON(json[i])); } return sequence; }(data.result));
                    }
                } else {
                    if (kwds.error) {
                        kwds.error({jqXHR: jqXHR, textStatus: data.error.message, errorThrown: null});
                    }
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/question_set_query',
        });
    }

    getQuestionSetsSync(kwds: {ids: QuestionSetId[]}): QuestionSet[] {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["ids"] = function (__inArray: QuestionSetId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(kwds.ids);

        var returnValue: QuestionSet[] | undefined = undefined;

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_question_sets',
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
                    returnValue = function(json: any[]): QuestionSet[] { var sequence: QuestionSet[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionSet.fromThryftJSON(json[i])); } return sequence; }(data.result);
                } else {
                    throw new Error(data.error);
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/question_set_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }
}

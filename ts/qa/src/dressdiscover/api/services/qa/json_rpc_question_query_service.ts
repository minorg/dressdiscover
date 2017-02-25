import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionQueryService } from "./question_query_service";

export class JsonRpcQuestionQueryService implements QuestionQueryService {
    constructor(private baseUrl?: string) {
    }

    getQuestionsAsync(kwds: {ids: QuestionId[], error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: Question[]) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["ids"] = function (__inArray: QuestionId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(kwds.ids);

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_questions',
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
                        kwds.success(function(json: any[]): Question[] { var sequence: Question[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Question.fromThryftJSON(json[i])); } return sequence; }(data.result));
                    }
                } else {
                    if (kwds.error) {
                        kwds.error({jqXHR: jqXHR, textStatus: data.error.message, errorThrown: null});
                    }
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/question_query',
        });
    }

    getQuestionsSync(kwds: {ids: QuestionId[]}): Question[] {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["ids"] = function (__inArray: QuestionId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(kwds.ids);

        var returnValue: Question[] | undefined = undefined;

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_questions',
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
                    returnValue = function(json: any[]): Question[] { var sequence: Question[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Question.fromThryftJSON(json[i])); } return sequence; }(data.result);
                } else {
                    throw new Error(data.error);
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/question_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }
}

import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionQueryService } from "./question_query_service";

export class JsonRpcQuestionQueryService implements QuestionQueryService {
    constructor(private baseUrl?: string) {
    }

    getQuestionsAsync(kwds: {ids: QuestionId[], error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: Question[]) => void}): void {
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
                    kwds.error(jqXHR as JQueryXHR, textStatus as string, errorThrown as string);
                }
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    if (kwds.success) {
                        kwds.success(function(json: any[]): Question[] { var sequence: Question[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Question.fromThryftJSON(json[i])); } return sequence; }(__response.result));
                    }
                } else {
                    if (kwds.error) {
                        kwds.error(null, __response.error.message, null);
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
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    returnValue = function(json: any[]): Question[] { var sequence: Question[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Question.fromThryftJSON(json[i])); } return sequence; }(__response.result);
                } else {
                    throw new Error(__response.error);
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

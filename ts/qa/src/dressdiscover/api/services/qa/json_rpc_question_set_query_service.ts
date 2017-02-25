import { QuestionSet } from "../../models/qa/question_set";
import { QuestionSetId } from "../../models/qa/question_set_id";
import { QuestionSetQueryService } from "./question_set_query_service";

export class JsonRpcQuestionSetQueryService implements QuestionSetQueryService {
    getQuestionSetsAsync(kwds: {ids: QuestionSetId[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QuestionSet[]) => void}): void {
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
                kwds.error(jqXHR as JQueryXHR, textStatus as string, errorThrown as string);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    kwds.success(function(json: any[]): QuestionSet[] { var sequence: QuestionSet[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionSet.fromThryftJSON(json[i])); } return sequence; }(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/question_set_query',
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
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    returnValue = function(json: any[]): QuestionSet[] { var sequence: QuestionSet[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionSet.fromThryftJSON(json[i])); } return sequence; }(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/question_set_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }
}

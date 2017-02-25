import { Answer } from "../../models/qa/answer";
import { AnswerQueryService } from "./answer_query_service";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaUserId } from "../../models/qa/qa_user_id";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionSetId } from "../../models/qa/question_set_id";

export class JsonRpcAnswerQueryService implements AnswerQueryService {
    constructor(private baseUrl?: string) {
    }

    getAnswersAsync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: Answer[]) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["object_id"] = kwds.objectId.toString();
        __jsonrpc_params["question_set_id"] = kwds.questionSetId.toString();
        if (typeof kwds.questionIds !== "undefined") {
            __jsonrpc_params["question_ids"] = function (__inArray: QuestionId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(kwds.questionIds);
        }
        if (typeof kwds.userId !== "undefined") {
            __jsonrpc_params["user_id"] = kwds.userId.toString();
        }

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_answers',
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
                        kwds.success(function(json: any[]): Answer[] { var sequence: Answer[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Answer.fromThryftJSON(json[i])); } return sequence; }(__response.result));
                    }
                } else {
                    if (kwds.error) {
                        kwds.error(null, __response.error.message, null);
                    }
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/answer_query',
        });
    }

    getAnswersSync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId}): Answer[] {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["object_id"] = kwds.objectId.toString();
        __jsonrpc_params["question_set_id"] = kwds.questionSetId.toString();
        if (typeof kwds.questionIds !== "undefined") {
            __jsonrpc_params["question_ids"] = function (__inArray: QuestionId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(kwds.questionIds);
        }
        if (typeof kwds.userId !== "undefined") {
            __jsonrpc_params["user_id"] = kwds.userId.toString();
        }

        var returnValue: Answer[] | undefined = undefined;

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_answers',
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
                    returnValue = function(json: any[]): Answer[] { var sequence: Answer[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Answer.fromThryftJSON(json[i])); } return sequence; }(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/answer_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }
}

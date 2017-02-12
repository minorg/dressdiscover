import { Answer } from "../../models/qa/answer";
import { QaObject } from "../../models/qa/qa_object";
import { QaQueryService } from "./qa_query_service";
import { QuestionSet } from "../../models/qa/question_set";

export class JsonRpcQaQueryService implements QaQueryService {
    getAnswersAsync(kwds: {objectId: string, questionSetId: string, questionIds?: string[], userId?: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: Answer[]) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["object_id"] = kwds.objectId;
        __jsonrpc_params["question_set_id"] = kwds.questionSetId;
        if (typeof kwds.questionIds !== "undefined") {
            __jsonrpc_params["question_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(kwds.questionIds);
        }
        if (typeof kwds.userId !== "undefined") {
            __jsonrpc_params["user_id"] = kwds.userId;
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
                kwds.error(jqXHR as JQueryXHR, textStatus as string, errorThrown as string);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    kwds.success(function(json: any[]): Answer[] { var sequence: Answer[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Answer.fromThryftJSON(json[i])); } return sequence; }(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/qa_query',
        });
    }

    getAnswersSync(kwds: {objectId: string, questionSetId: string, questionIds?: string[], userId?: string}): Answer[] {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["object_id"] = kwds.objectId;
        __jsonrpc_params["question_set_id"] = kwds.questionSetId;
        if (typeof kwds.questionIds !== "undefined") {
            __jsonrpc_params["question_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(kwds.questionIds);
        }
        if (typeof kwds.userId !== "undefined") {
            __jsonrpc_params["user_id"] = kwds.userId;
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
            url: '/api/jsonrpc/qa_query',
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
            url: '/api/jsonrpc/qa_query',
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
            url: '/api/jsonrpc/qa_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }

    getQuestionSetsAsync(kwds: {ids: string[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QuestionSet[]) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(kwds.ids);

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
            url: '/api/jsonrpc/qa_query',
        });
    }

    getQuestionSetsSync(kwds: {ids: string[]}): QuestionSet[] {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(kwds.ids);

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
            url: '/api/jsonrpc/qa_query',
        });

        if (typeof returnValue === "undefined") {
            throw new Error("should never happen");
        }
        return returnValue;
    }
}

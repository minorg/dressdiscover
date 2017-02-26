import { Answer } from "../../models/qa/answer";
import { AnswerCommandService } from "./answer_command_service";

export class JsonRpcAnswerCommandService implements AnswerCommandService {
    constructor(private baseUrl?: string) {
    }

    deleteAnswersAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: () => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'delete_answers',
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
                        kwds.success();
                    }
                } else {
                    if (kwds.error) {
                        kwds.error({jqXHR: jqXHR, textStatus: data.error.message, errorThrown: null});
                    }
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/answer_command',
        });
    }

    deleteAnswersSync(): void {
        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'delete_answers',
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
                if (typeof data.result === "undefined") {
                    throw new Error(data.error);
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/answer_command',
        });
    }

    putAnswerAsync(kwds: {answer: Answer, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: () => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["answer"] = kwds.answer.toThryftJSON();

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_answer',
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
                        kwds.success();
                    }
                } else {
                    if (kwds.error) {
                        kwds.error({jqXHR: jqXHR, textStatus: data.error.message, errorThrown: null});
                    }
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/answer_command',
        });
    }

    putAnswerSync(kwds: {answer: Answer}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["answer"] = kwds.answer.toThryftJSON();

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_answer',
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
                if (typeof data.result === "undefined") {
                    throw new Error(data.error);
                }
            },
            url: (this.baseUrl ? this.baseUrl : "") + '/api/jsonrpc/answer_command',
        });
    }
}

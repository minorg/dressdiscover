import { Answer } from "../../models/qa/answer";
import { QaCommandService } from "./qa_command_service";

export class JsonRpcQaCommandService implements QaCommandService {
    putAnswerAsync(kwds: {answer: Answer, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void {
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
                kwds.error(jqXHR as JQueryXHR, textStatus as string, errorThrown as string);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    kwds.success();
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/qa_command',
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
            success: function(__response: any) {
                if (typeof __response.result === "undefined") {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/qa_command',
        });
    }
}

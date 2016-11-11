import { WorksheetState as dressdiscover_api_models_worksheet_WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetCommandService {
    putWorksheetStateAsync(kwds: {state: dressdiscover_api_models_worksheet_WorksheetState, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void;
    putWorksheetStateSync(kwds: {state: dressdiscover_api_models_worksheet_WorksheetState}): void;
}

export class JsonRpcWorksheetCommandService implements WorksheetCommandService {
    putWorksheetStateAsync(kwds: {state: dressdiscover_api_models_worksheet_WorksheetState, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["state"] = kwds.state.toThryftJSON();

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_worksheet_state',
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
            url: '/api/jsonrpc/worksheet_command',
        });
    }

    putWorksheetStateSync(kwds: {state: dressdiscover_api_models_worksheet_WorksheetState}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["state"] = kwds.state.toThryftJSON();

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_worksheet_state',
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
            url: '/api/jsonrpc/worksheet_command',
        });
    }
}

export abstract class AsyncToSyncWorksheetCommandService implements WorksheetCommandService {
    putWorksheetStateAsync(kwds: {state: dressdiscover_api_models_worksheet_WorksheetState, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void {
        try {
            this.putWorksheetStateSync({state: kwds.state});
            kwds.success();
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract putWorksheetStateSync(kwds: {state: dressdiscover_api_models_worksheet_WorksheetState}): void;
}

import { WorksheetFeatureSetState as dressdiscover_api_models_worksheet_WorksheetFeatureSetState } from "../../models/worksheet/worksheet_feature_set_state";

export interface WorksheetCommandService {
    putWorksheetFeatureSetStatesAsync(kwds: {worksheetFeatureSetStates: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void;
    putWorksheetFeatureSetStatesSync(kwds: {worksheetFeatureSetStates: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}}): void;
}

export class JsonRpcWorksheetCommandService implements WorksheetCommandService {
    putWorksheetFeatureSetStatesAsync(kwds: {worksheetFeatureSetStates: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["worksheet_feature_set_states"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(kwds.worksheetFeatureSetStates);

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_worksheet_feature_set_states',
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

    putWorksheetFeatureSetStatesSync(kwds: {worksheetFeatureSetStates: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["worksheet_feature_set_states"] = function (value: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} { var outObject: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(kwds.worksheetFeatureSetStates);

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_worksheet_feature_set_states',
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
    putWorksheetFeatureSetStatesAsync(kwds: {worksheetFeatureSetStates: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void {
        try {
            this.putWorksheetFeatureSetStatesSync({worksheetFeatureSetStates: kwds.worksheetFeatureSetStates});
            kwds.success();
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract putWorksheetFeatureSetStatesSync(kwds: {worksheetFeatureSetStates: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}}): void;
}
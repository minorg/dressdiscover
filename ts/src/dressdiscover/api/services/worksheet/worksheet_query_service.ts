import { WorksheetDefinition as dressdiscover_api_models_worksheet_WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetState as dressdiscover_api_models_worksheet_WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetQueryService {
    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: dressdiscover_api_models_worksheet_WorksheetDefinition) => void}): void;
    getWorksheetDefinitionSync(): dressdiscover_api_models_worksheet_WorksheetDefinition;

    getWorksheetStateAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: dressdiscover_api_models_worksheet_WorksheetState) => void}): void;
    getWorksheetStateSync(): dressdiscover_api_models_worksheet_WorksheetState;
}

export class JsonRpcWorksheetQueryService implements WorksheetQueryService {
    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: dressdiscover_api_models_worksheet_WorksheetDefinition) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_definition',
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
                    kwds.success(dressdiscover_api_models_worksheet_WorksheetDefinition.fromThryftJSON(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });
    }

    getWorksheetDefinitionSync(): dressdiscover_api_models_worksheet_WorksheetDefinition {
        var returnValue: dressdiscover_api_models_worksheet_WorksheetDefinition = new dressdiscover_api_models_worksheet_WorksheetDefinition();

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_definition',
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
                    returnValue = dressdiscover_api_models_worksheet_WorksheetDefinition.fromThryftJSON(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });

        return returnValue;
    }

    getWorksheetStateAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: dressdiscover_api_models_worksheet_WorksheetState) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
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
                    kwds.success(dressdiscover_api_models_worksheet_WorksheetState.fromThryftJSON(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });
    }

    getWorksheetStateSync(): dressdiscover_api_models_worksheet_WorksheetState {
        var returnValue: dressdiscover_api_models_worksheet_WorksheetState = new dressdiscover_api_models_worksheet_WorksheetState();

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
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
                    returnValue = dressdiscover_api_models_worksheet_WorksheetState.fromThryftJSON(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });

        return returnValue;
    }
}

export abstract class AsyncToSyncWorksheetQueryService implements WorksheetQueryService {
    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: dressdiscover_api_models_worksheet_WorksheetDefinition) => void}): void {
        try {
            kwds.success(this.getWorksheetDefinitionSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetDefinitionSync(): dressdiscover_api_models_worksheet_WorksheetDefinition;

    getWorksheetStateAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: dressdiscover_api_models_worksheet_WorksheetState) => void}): void {
        try {
            kwds.success(this.getWorksheetStateSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetStateSync(): dressdiscover_api_models_worksheet_WorksheetState;
}

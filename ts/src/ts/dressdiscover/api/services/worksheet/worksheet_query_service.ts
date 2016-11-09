import { WorksheetFeatureSetDefinition as dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition } from "../../models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState as dressdiscover_api_models_worksheet_WorksheetFeatureSetState } from "../../models/worksheet/worksheet_feature_set_state";

export interface WorksheetQueryService {
    getWorksheetFeatureSetDefinitionsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition}) => void}): void;
    getWorksheetFeatureSetDefinitionsSync(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition};

    getWorksheetFeatureSetStatesAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}) => void}): void;
    getWorksheetFeatureSetStatesSync(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState};
}

export class JsonRpcWorksheetQueryService implements WorksheetQueryService {
    getWorksheetFeatureSetDefinitionsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition}) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_feature_set_definitions',
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
                    kwds.success(function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition.fromThryftJSON(json[key]); } return map; }(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });
    }

    getWorksheetFeatureSetDefinitionsSync(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition} {
        var returnValue: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition} = {};

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_feature_set_definitions',
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
                    returnValue = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition.fromThryftJSON(json[key]); } return map; }(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });

        return returnValue;
    }

    getWorksheetFeatureSetStatesAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_feature_set_states',
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
                    kwds.success(function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });
    }

    getWorksheetFeatureSetStatesSync(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} {
        var returnValue: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} = {};

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_feature_set_states',
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
                    returnValue = function (json: any): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover_api_models_worksheet_WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(__response.result);
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
    getWorksheetFeatureSetDefinitionsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition}) => void}): void {
        try {
            kwds.success(this.getWorksheetFeatureSetDefinitionsSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetFeatureSetDefinitionsSync(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetDefinition};

    getWorksheetFeatureSetStatesAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState}) => void}): void {
        try {
            kwds.success(this.getWorksheetFeatureSetStatesSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetFeatureSetStatesSync(): {[index: string]: dressdiscover_api_models_worksheet_WorksheetFeatureSetState};
}

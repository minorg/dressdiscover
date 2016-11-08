module dressdiscover.api.services.worksheet {
    export interface WorksheetQueryService {
        getWorksheetFeatureSetDefinitionsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition}) => void}): void;
        getWorksheetFeatureSetDefinitionsSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition};

        getWorksheetFeatureSetStatesAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}) => void}): void;
        getWorksheetFeatureSetStatesSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState};
    }

    export class JsonRpcWorksheetQueryService implements WorksheetQueryService {
        getWorksheetFeatureSetDefinitionsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition}) => void}): void {
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
                        kwds.success(function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.fromThryftJSON(json[key]); } return map; }(__response.result));
                    } else {
                        kwds.error(null, __response.error.message, null);
                    }
                },
                url: '/api/jsonrpc/worksheet_query',
            });
        }

        getWorksheetFeatureSetDefinitionsSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition} {
            var returnValue: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition} = {};

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
                        returnValue = function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.fromThryftJSON(json[key]); } return map; }(__response.result);
                    } else {
                        throw new Error(__response.error);
                    }
                },
                url: '/api/jsonrpc/worksheet_query',
            });

            return returnValue;
        }

        getWorksheetFeatureSetStatesAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}) => void}): void {
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
                        kwds.success(function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(__response.result));
                    } else {
                        kwds.error(null, __response.error.message, null);
                    }
                },
                url: '/api/jsonrpc/worksheet_query',
            });
        }

        getWorksheetFeatureSetStatesSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} {
            var returnValue: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} = {};

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
                        returnValue = function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(__response.result);
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
        getWorksheetFeatureSetDefinitionsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition}) => void}): void {
            try {
                kwds.success(this.getWorksheetFeatureSetDefinitionsSync());
            } catch (e) {
                kwds.error(null, e.message, e);
            }
        }

        abstract getWorksheetFeatureSetDefinitionsSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition};

        getWorksheetFeatureSetStatesAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}) => void}): void {
            try {
                kwds.success(this.getWorksheetFeatureSetStatesSync());
            } catch (e) {
                kwds.error(null, e.message, e);
            }
        }

        abstract getWorksheetFeatureSetStatesSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState};
    }
}

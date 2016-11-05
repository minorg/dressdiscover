/// <reference path="../../../../../../../typings/index.d.ts" />
module dressdiscover.api.services.worksheet {
    export interface WorksheetQueryService {
        getWorksheetFeatureSetDefinitionsAsync(kwds: {error: (jqXHR: JQueryXHR, textStatus: string, errorThrown: string) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition}) => void}): void;
        getWorksheetFeatureSetDefinitionsSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition};

        getWorksheetFeatureSetStatesAsync(kwds: {error: (jqXHR: JQueryXHR, textStatus: string, errorThrown: string) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}) => void}): void;
        getWorksheetFeatureSetStatesSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState};
    }

    export class JsonRpcWorksheetQueryService implements WorksheetQueryService {
        getWorksheetFeatureSetDefinitionsAsync(kwds: {error: (jqXHR: JQueryXHR, textStatus: string, errorThrown: string) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition}) => void}): void {
            $.ajax({
                async:true,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'get_worksheet_feature_set_definitions',
                    params:{},
                    id:'1234'
                }),
                dataType:'json',
                error:function(jqXHR, textStatus, errorThrown) {
                    kwds.error(jqXHR, textStatus, errorThrown);
                },
                mimeType:'application/json',
                type:'POST',
                success:function(__response) {
                    if (typeof __response.result !== "undefined") {
                        kwds.success(function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.fromThryftJSON(json[key]); } return map; }(__response.result));
                    } else {
                        kwds.error(null, __response.error.message, null);
                    }
                },
                url:'/api/jsonrpc/worksheet_query',
            });
        }

        getWorksheetFeatureSetDefinitionsSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition} {
            var returnValue: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition} = null;

            $.ajax({
                async:false,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'get_worksheet_feature_set_definitions',
                    params:{},
                    id:'1234'
                }),
                dataType:'json',
                error:function(jqXHR, textStatus, errorThrown) {
                    throw new Error(errorThrown);
                },
                mimeType:'application/json',
                type:'POST',
                success:function(__response) {
                    if (typeof __response.result !== "undefined") {
                        returnValue = function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition.fromThryftJSON(json[key]); } return map; }(__response.result);
                    } else {
                        throw new Error(__response.error);
                    }
                },
                url:'/api/jsonrpc/worksheet_query',
            });

            return returnValue;
        }

        getWorksheetFeatureSetStatesAsync(kwds: {error: (jqXHR: JQueryXHR, textStatus: string, errorThrown: string) => any, success: (return_value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}) => void}): void {
            $.ajax({
                async:true,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'get_worksheet_feature_set_states',
                    params:{},
                    id:'1234'
                }),
                dataType:'json',
                error:function(jqXHR, textStatus, errorThrown) {
                    kwds.error(jqXHR, textStatus, errorThrown);
                },
                mimeType:'application/json',
                type:'POST',
                success:function(__response) {
                    if (typeof __response.result !== "undefined") {
                        kwds.success(function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(__response.result));
                    } else {
                        kwds.error(null, __response.error.message, null);
                    }
                },
                url:'/api/jsonrpc/worksheet_query',
            });
        }

        getWorksheetFeatureSetStatesSync(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} {
            var returnValue: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} = null;

            $.ajax({
                async:false,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'get_worksheet_feature_set_states',
                    params:{},
                    id:'1234'
                }),
                dataType:'json',
                error:function(jqXHR, textStatus, errorThrown) {
                    throw new Error(errorThrown);
                },
                mimeType:'application/json',
                type:'POST',
                success:function(__response) {
                    if (typeof __response.result !== "undefined") {
                        returnValue = function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureSetState.fromThryftJSON(json[key]); } return map; }(__response.result);
                    } else {
                        throw new Error(__response.error);
                    }
                },
                url:'/api/jsonrpc/worksheet_query',
            });

            return returnValue;
        }
    }
}

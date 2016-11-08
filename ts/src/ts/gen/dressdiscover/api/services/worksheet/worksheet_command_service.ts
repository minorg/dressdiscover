module dressdiscover.api.services.worksheet {
    export interface WorksheetCommandService {
        putWorksheetFeatureSetStatesAsync(kwds: {worksheet_feature_set_states: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}, error: (jqXHR: JQueryXHR, textStatus: string, errorThrown: string) => any, success: () => void}): void;
        putWorksheetFeatureSetStatesSync(kwds: {worksheet_feature_set_states: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}}): void;
    }

    export class JsonRpcWorksheetCommandService implements WorksheetCommandService {
        putWorksheetFeatureSetStatesAsync(kwds: {worksheet_feature_set_states: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}, error: (jqXHR: JQueryXHR, textStatus: string, errorThrown: string) => any, success: () => void}): void {
            var __jsonrpc_params: {[index: string]: any} = {};
            __jsonrpc_params["worksheet_feature_set_states"] = function (value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} { var outObject: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(kwds.worksheet_feature_set_states);

            $.ajax({
                async:true,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'put_worksheet_feature_set_states',
                    params:__jsonrpc_params,
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
                        kwds.success();
                    } else {
                        kwds.error(null, __response.error.message, null);
                    }
                },
                url:'/api/jsonrpc/worksheet_command',
            });
        }

        putWorksheetFeatureSetStatesSync(kwds: {worksheet_feature_set_states: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}}): void {
            var __jsonrpc_params: {[index: string]: any} = {};
            __jsonrpc_params["worksheet_feature_set_states"] = function (value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} { var outObject: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(kwds.worksheet_feature_set_states);

            $.ajax({
                async:false,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'put_worksheet_feature_set_states',
                    params:__jsonrpc_params,
                    id:'1234'
                }),
                dataType:'json',
                error:function(jqXHR, textStatus, errorThrown) {
                    throw new Error(errorThrown);
                },
                mimeType:'application/json',
                type:'POST',
                success:function(__response) {
                    if (typeof __response.result === "undefined") {
                        throw new Error(__response.error);
                    }
                },
                url:'/api/jsonrpc/worksheet_command',
            });
        }
    }

    export abstract class AsyncToSyncWorksheetCommandService implements WorksheetCommandService {
        putWorksheetFeatureSetStatesAsync(kwds: {worksheet_feature_set_states: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}, error: (jqXHR: JQueryXHR, textStatus: string, errorThrown: string) => any, success: () => void}): void {
            try {
                this.putWorksheetFeatureSetStatesSync({worksheet_feature_set_states: kwds.worksheet_feature_set_states});
            } catch (e) {
                kwds.error(null, e, null);
            }
        }

        abstract putWorksheetFeatureSetStatesSync(kwds: {worksheet_feature_set_states: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureSetState}}): void;
    }
}

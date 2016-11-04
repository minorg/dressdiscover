/// <reference path="../../../../../../../typings/index.d.ts" />
module dressdiscover.api.services.wizard {
    export interface WizardQueryService {
        getWizardFeatureSetDefinitionsAsync(kwds: {success: (return_value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetDefinition}) => void}): void;
        getWizardFeatureSetDefinitionsSync(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetDefinition};

        getWizardFeatureSetStatesAsync(kwds: {success: (return_value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState}) => void}): void;
        getWizardFeatureSetStatesSync(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState};
    }

    export class JsonRpcWizardQueryService implements WizardQueryService {
        getWizardFeatureSetDefinitionsAsync(kwds: {success: (return_value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetDefinition}) => void}): void {
            $.ajax({
                async:true,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'get_wizard_feature_set_definitions',
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
                        kwds.success(function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureSetDefinition.fromThryftJSON(json[key]); } return map; }(__response.result));
                    } else {
                        kwds.error(null, __response.error.message, null);
                    }
                },
                url:'/api/jsonrpc/wizard_query',
            });
        }

        getWizardFeatureSetDefinitionsSync(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetDefinition} {
            var returnValue: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetDefinition} = null;

            $.ajax({
                async:false,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'get_wizard_feature_set_definitions',
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
                        returnValue = function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureSetDefinition.fromThryftJSON(json[key]); } return map; }(__response.result);
                    } else {
                        throw new Error(__response.error);
                    }
                },
                url:'/api/jsonrpc/wizard_query',
            });

            return returnValue;
        }

        getWizardFeatureSetStatesAsync(kwds: {success: (return_value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState}) => void}): void {
            $.ajax({
                async:true,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'get_wizard_feature_set_states',
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
                        kwds.success(function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureSetState.fromThryftJSON(json[key]); } return map; }(__response.result));
                    } else {
                        kwds.error(null, __response.error.message, null);
                    }
                },
                url:'/api/jsonrpc/wizard_query',
            });
        }

        getWizardFeatureSetStatesSync(): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState} {
            var returnValue: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState} = null;

            $.ajax({
                async:false,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'get_wizard_feature_set_states',
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
                        returnValue = function (json: any): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.wizard.WizardFeatureSetState.fromThryftJSON(json[key]); } return map; }(__response.result);
                    } else {
                        throw new Error(__response.error);
                    }
                },
                url:'/api/jsonrpc/wizard_query',
            });

            return returnValue;
        }
    }
}

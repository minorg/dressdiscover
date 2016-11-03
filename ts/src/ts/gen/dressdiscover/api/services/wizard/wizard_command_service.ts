/// <reference path="../../../../../../typings/index.d.ts" />
module dressdiscover.api.services.wizard {
    export class WizardCommandService {
        putWizardFeatureSetStatesAsync(kwds: {wizard_feature_set_states: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState}, error: (jqXHR: JQueryXHR, textStatus: string, errorThrown: string) => any, success: () => void}): void {
            var __jsonrpc_params: {[index: string]: any} = {};
            __jsonrpc_params["wizard_feature_set_states"] = function (value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState}): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState} { var outObject: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState} = {}; for (var key in value) { outObject[key] = json[key].toThryftJSON(); } return outObject; }(kwds.wizard_feature_set_states);

            $.ajax({
                async:true,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'put_wizard_feature_set_states',
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
                url:'/api/jsonrpc/wizard_command',
            });
        }

        putWizardFeatureSetStatesSync(kwds: {wizard_feature_set_states: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState}}): void {
            var __jsonrpc_params: {[index: string]: any} = {};
            __jsonrpc_params["wizard_feature_set_states"] = function (value: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState}): {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState} { var outObject: {[index: string]: dressdiscover.api.models.wizard.WizardFeatureSetState} = {}; for (var key in value) { outObject[key] = json[key].toThryftJSON(); } return outObject; }(kwds.wizard_feature_set_states);

            $.ajax({
                async:false,
                data:JSON.stringify({
                    jsonrpc:'2.0',
                    method:'put_wizard_feature_set_states',
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
                url:'/api/jsonrpc/wizard_command',
            });
        }
    }
}

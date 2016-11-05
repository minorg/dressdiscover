/// <reference path="../../../../../../../typings/index.d.ts" />
module dressdiscover.api.models.worksheet {
    export class WorksheetFeatureState extends Backbone.Model {
        constructor(attributes?: {feature_values: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueState}}) {
            super(attributes);
        }

        get feature_values(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueState} {
            return this.get('feature_values');
        }

        set feature_values(value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueState}) {
            this.set('feature_values', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.worksheet.WorksheetFeatureState {
            var out: dressdiscover.api.models.worksheet.WorksheetFeatureState = new dressdiscover.api.models.worksheet.WorksheetFeatureState;
            for (var fieldName in json) {
                if (fieldName == "feature_values") {
                    out.attributes.feature_values = function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureValueState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            json["feature_values"] = function (value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueState}): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueState} { var outObject: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.feature_values);
            return json;
        }
    }
}

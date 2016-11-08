module dressdiscover.api.models.worksheet {
    export class WorksheetFeatureSetState extends Backbone.Model {
        constructor(attributes?: {features?: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureState}}) {
            super(attributes);
        }

        get features(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureState} {
            return this.get('features');
        }

        set features(value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureState}) {
            this.set('features', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.worksheet.WorksheetFeatureSetState {
            var out: dressdiscover.api.models.worksheet.WorksheetFeatureSetState = new dressdiscover.api.models.worksheet.WorksheetFeatureSetState;
            for (var fieldName in json) {
                if (fieldName == "features") {
                    out.attributes.features = function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureState} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureState.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            if (this.has("features")) {
                json["features"] = function (value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureState}): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureState} { var outObject: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureState} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.features);
            }
            return json;
        }
    }
}

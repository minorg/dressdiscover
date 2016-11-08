module dressdiscover.api.models.worksheet {
    export class WorksheetFeatureDefinition extends Backbone.Model {
        constructor(attributes?: {display_name: string, type: dressdiscover.api.models.worksheet.WorksheetFeatureType, feature_values?: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition}}) {
            super(attributes);
        }

        get display_name(): string {
            return this.get('display_name');
        }

        set display_name(value: string) {
            this.set('display_name', value);
        }

        get type(): dressdiscover.api.models.worksheet.WorksheetFeatureType {
            return this.get('type');
        }

        set type(value: dressdiscover.api.models.worksheet.WorksheetFeatureType) {
            this.set('type', value);
        }

        get feature_values(): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition} {
            return this.get('feature_values');
        }

        set feature_values(value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition}) {
            this.set('feature_values', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.worksheet.WorksheetFeatureDefinition {
            var out: dressdiscover.api.models.worksheet.WorksheetFeatureDefinition = new dressdiscover.api.models.worksheet.WorksheetFeatureDefinition;
            for (var fieldName in json) {
                if (fieldName == "display_name") {
                    out.attributes.display_name = json[fieldName];
                } else if (fieldName == "type") {
                    out.attributes.type = dressdiscover.api.models.worksheet.WorksheetFeatureType[json[fieldName]];
                } else if (fieldName == "feature_values") {
                    out.attributes.feature_values = function (json: any): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition} { var map: any = {}; for (var key in json) { map[key] = dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition.fromThryftJSON(json[key]); } return map; }(json[fieldName]);
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            json["display_name"] = this.display_name;
            json["type"] = dressdiscover.api.models.worksheet.WorksheetFeatureType[this.type];
            if (this.has("feature_values")) {
                json["feature_values"] = function (value: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition}): {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition} { var outObject: {[index: string]: dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition} = {}; for (var key in value) { outObject[key] = value[key].toThryftJSON(); } return outObject; }(this.feature_values);
            }
            return json;
        }
    }
}

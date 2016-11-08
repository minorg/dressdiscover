module dressdiscover.api.models.worksheet {
    export class WorksheetFeatureValueDefinition extends Backbone.Model {
        constructor(attributes?: {display_name: string}) {
            super(attributes);
        }

        get display_name(): string {
            return this.get('display_name');
        }

        set display_name(value: string) {
            this.set('display_name', value);
        }

        static fromThryftJSON(json: any): dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition {
            var out: dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition = new dressdiscover.api.models.worksheet.WorksheetFeatureValueDefinition;
            for (var fieldName in json) {
                if (fieldName == "display_name") {
                    out.attributes.display_name = json[fieldName];
                }
            }
            return out;
        }

        toThryftJSON(): any {
            var json: {[index: string]: any} = {};
            json["display_name"] = this.display_name;
            return json;
        }
    }
}

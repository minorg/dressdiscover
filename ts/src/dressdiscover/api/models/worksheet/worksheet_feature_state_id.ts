import * as Backbone from "backbone";

export class WorksheetFeatureStateId extends Backbone.Model {
    constructor(attributes?: {featureId: string, featureSetIds: string[], featureValueId?: string}) {
        super(attributes);
    }

    get featureId(): string {
        return this.get('featureId');
    }

    set featureId(value: string) {
        this.set('featureId', value);
    }

    get featureSetIds(): string[] {
        return this.get('featureSetIds');
    }

    set featureSetIds(value: string[]) {
        this.set('featureSetIds', value);
    }

    get featureValueId(): string {
        return this.get('featureValueId');
    }

    set featureValueId(value: string) {
        this.set('featureValueId', value);
    }

    static fromThryftJSON(json: any): WorksheetFeatureStateId {
        var out: WorksheetFeatureStateId = new WorksheetFeatureStateId;
        for (var fieldName in json) {
            if (fieldName == "feature_id") {
                out.attributes.featureId = json[fieldName];
            } else if (fieldName == "feature_set_ids") {
                out.attributes.featureSetIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "feature_value_id") {
                out.attributes.featureValueId = json[fieldName];
            }
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["feature_id"] = this.featureId;
        json["feature_set_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.featureSetIds);
        if (this.has("featureValueId")) {
            json["feature_value_id"] = this.featureValueId;
        }
        return json;
    }
}

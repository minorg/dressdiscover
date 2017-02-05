import * as Backbone from "backbone";
import { WorksheetFeatureValueDefinition } from "./worksheet_feature_value_definition";

export class WorksheetFeatureDefinition extends Backbone.Model {
    validation = {
        id: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof value !== "string") {
                    return "expected WorksheetFeatureDefinition.id to be a string";
                }

                return undefined;
            },
            "required": true
        },

        displayName: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (typeof value !== "string") {
                    return "expected WorksheetFeatureDefinition.display_name to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureDefinition.display_name is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": false
        },

        values_: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (!(value instanceof Backbone.Collection)) {
                    return "expected WorksheetFeatureDefinition.values_ to be a Backbone.Collection";
                }
                if (value.model !== WorksheetFeatureValueDefinition) {
                    return "expected WorksheetFeatureDefinition.values_ to be a Backbone.Collection with model=WorksheetFeatureValueDefinition";
                }
                for (let __model0 of value.models) {
                    if (!__model0.isValid(true)) {
                        return __model0.validationError;
                    }
                }

                return undefined;
            },
            "minLength": 1, "required": false
        }
    }

    validationError: any;

    constructor(attributes?: {id: string, displayName?: string, values_?: Backbone.Collection<WorksheetFeatureValueDefinition>}, options?: any) {
        super(attributes, options);
    }

    get id(): string {
        return this.get('id');
    }

    get displayName(): string {
        return this.get('displayName');
    }

    set displayName(value: string) {
        this.set('displayName', value, { validate: true });
    }

    get values_(): Backbone.Collection<WorksheetFeatureValueDefinition> {
        return this.get('values_');
    }

    set values_(value: Backbone.Collection<WorksheetFeatureValueDefinition>) {
        this.set('values_', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetFeatureDefinition {
        const attributes: any = {};
        for (var fieldName in json) {
            if (fieldName == "id") {
                attributes["id"] = json[fieldName];
            } else if (fieldName == "display_name") {
                attributes["displayName"] = json[fieldName];
            } else if (fieldName == "values_") {
                attributes["values_"] = function(json: any[]): Backbone.Collection<WorksheetFeatureValueDefinition> { var sequence: WorksheetFeatureValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureValueDefinition.fromThryftJSON(json[i])); } return new Backbone.Collection<WorksheetFeatureValueDefinition>(sequence); }(json[fieldName]);
            }
        }
        const out = new WorksheetFeatureDefinition(attributes);
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.has("displayName")) {
            json["display_name"] = this.displayName;
        }
        if (this.has("values_")) {
            json["values_"] = function (__inArray: WorksheetFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values_.models);
        }
        return json;
    }
}

import * as Backbone from "backbone";

export class WorksheetEnumFeatureState extends Backbone.Model {
    validation = {
        selectedValues: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (!Array.isArray(value)) {
                    return "expected WorksheetEnumFeatureState.selected_values to be an Array";
                }
                for (var __i0 = 0; __i0 < value.length; __i0++) {
                    if (typeof value[__i0] !== "string") {
                        return "expected WorksheetEnumFeatureState.selected_values[i] to be a string";
                    }
                }

                return undefined;
            },
            "minLength": 1, "required": true
        }
    }

    validationError: any;

    constructor(attributes?: {selectedValues: string[]}, options?: any) {
        super(attributes, options);
    }

    get selectedValues(): string[] {
        return this.get('selectedValues');
    }

    set selectedValues(value: string[]) {
        this.set('selectedValues', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetEnumFeatureState {
        var out: WorksheetEnumFeatureState = new WorksheetEnumFeatureState;
        for (var fieldName in json) {
            if (fieldName == "selected_values") {
                out.attributes.selectedValues = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            }
        }
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["selected_values"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.selectedValues);
        return json;
    }
}

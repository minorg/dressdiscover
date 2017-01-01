import * as Backbone from "backbone";

export class WorksheetFeatureState extends Backbone.Model {
    validation = {
        selectedValues: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (!Array.isArray(value)) {
                    return "expected WorksheetFeatureState.selected_values to be an Array";
                }
                for (var __i0 = 0; __i0 < value.length; __i0++) {
                    if (typeof value[__i0] !== "string") {
                        return "expected WorksheetFeatureState.selected_values[i] to be a string";
                    }
                }

                return undefined;
            },
            "minLength": 1, "required": false
        },

        text: {
            "fn": function(value: any, attr: any, computedState: any) {
                if (typeof attr === "undefined" || attr === null) {
                    return undefined;
                }

                if (typeof value !== "string") {
                    return "expected WorksheetFeatureState.text to be a string";
                }

                if (/^\s*$/.test(value)) {
                    return "WorksheetFeatureState.text is blank";
                }

                return undefined;
            },
            "minLength": 1, "required": false
        }
    }

    validationError: any;

    constructor(attributes?: {selectedValues?: string[], text?: string}, options?: any) {
        super(attributes, options);
    }

    get selectedValues(): string[] {
        return this.get('selectedValues');
    }

    set selectedValues(value: string[]) {
        this.set('selectedValues', value, { validate: true });
    }

    get text(): string {
        return this.get('text');
    }

    set text(value: string) {
        this.set('text', value, { validate: true });
    }

    static fromThryftJSON(json: any): WorksheetFeatureState {
        const attributes: any = {};
        for (var fieldName in json) {
            if (fieldName == "selected_values") {
                attributes["selectedValues"] = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "text") {
                attributes["text"] = json[fieldName];
            }
        }
        const out = new WorksheetFeatureState(attributes);
        if (!out.isValid(true)) {
            throw new Error(out.validationError);
        }
        return out;
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.has("selectedValues")) {
            json["selected_values"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.selectedValues);
        }
        if (this.has("text")) {
            json["text"] = this.text;
        }
        return json;
    }
}

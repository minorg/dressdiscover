export class WorksheetFeatureState {
    constructor(kwds?: {selectedValues?: string[], text?: string}) {
        if (!kwds) {
            return;
        }
        if (kwds.selectedValues != null) {
            this.selectedValues = kwds.selectedValues;
        }
        if (kwds.text != null) {
            this.text = kwds.text;
        }
    }

    get selectedValues(): string[] | undefined {
        return this._selectedValues;
    }

    set selectedValues(selectedValues: string[] | undefined) {
        if (selectedValues != null) {
            if (selectedValues.length < 1) {
                throw new RangeError("expected len(selectedValues) to be >= 1, was " + selectedValues.length);
            }
        }
        this._selectedValues = selectedValues;
    }

    get text(): string | undefined {
        return this._text;
    }

    set text(text: string | undefined) {
        if (text != null) {
            if (text.trim().length == 0) {
                throw new RangeError('text is blank');
            }
            if (text.length < 1) {
                throw new RangeError("expected len(text) to be >= 1, was " + text.length);
            }
        }
        this._text = text;
    }

    deepCopy(): WorksheetFeatureState {
        return new WorksheetFeatureState({ selectedValues: (this.selectedValues ? (function(__value0: string[]) { let __copy0: string[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.selectedValues)) : undefined), text: this.text });
    }

    equals(other: WorksheetFeatureState): boolean {
        if (!((!((typeof (this.selectedValues)) === "undefined") && !((typeof (other.selectedValues)) === "undefined")) ? (function(left: string[], right: string[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }((this.selectedValues as string[]), (other.selectedValues as string[]))) : (((typeof (this.selectedValues)) === "undefined") && ((typeof (other.selectedValues)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.text)) === "undefined") && !((typeof (other.text)) === "undefined")) ? ((this.text as string) === (other.text as string)) : (((typeof (this.text)) === "undefined") && ((typeof (other.text)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureState {
        var selectedValues: string[] | undefined;
        var text: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "selected_values") {
                selectedValues = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            }
        }

        return new WorksheetFeatureState({selectedValues: selectedValues, text: text});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        if (this.selectedValues != null) {
            json["selected_values"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.selectedValues);
        }
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        if (this.selectedValues != null) {
            json["selected_values"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.selectedValues);
        }
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }

    private _selectedValues?: string[] = undefined;

    private _text?: string = undefined;
}

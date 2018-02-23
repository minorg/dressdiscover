export class WorksheetFeatureState {
    constructor(kwds?: {selectedValueIds?: string[], text?: string}) {
        if (!kwds) {
            return;
        }
        if (kwds.selectedValueIds != null) {
            this.selectedValueIds = kwds.selectedValueIds;
        }
        if (kwds.text != null) {
            this.text = kwds.text;
        }
    }

    get selectedValueIds(): string[] | undefined {
        return this._selectedValueIds;
    }

    set selectedValueIds(selectedValueIds: string[] | undefined) {
        if (selectedValueIds != null) {
            if (selectedValueIds.length < 1) {
                throw new RangeError("expected len(selectedValueIds) to be >= 1, was " + selectedValueIds.length);
            }
        }
        this._selectedValueIds = selectedValueIds;
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
        return new WorksheetFeatureState({ selectedValueIds: (this.selectedValueIds ? (function(__value0: string[]) { let __copy0: string[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.selectedValueIds)) : undefined), text: this.text });
    }

    equals(other: WorksheetFeatureState): boolean {
        if (!((!((typeof (this.selectedValueIds)) === "undefined") && !((typeof (other.selectedValueIds)) === "undefined")) ? (function(left: string[], right: string[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }((this.selectedValueIds as string[]), (other.selectedValueIds as string[]))) : (((typeof (this.selectedValueIds)) === "undefined") && ((typeof (other.selectedValueIds)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.text)) === "undefined") && !((typeof (other.text)) === "undefined")) ? ((this.text as string) === (other.text as string)) : (((typeof (this.text)) === "undefined") && ((typeof (other.text)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureState {
        var selectedValueIds: string[] | undefined;
        var text: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "selected_value_ids") {
                selectedValueIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            }
        }

        return new WorksheetFeatureState({selectedValueIds: selectedValueIds, text: text});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        if (this.selectedValueIds != null) {
            json["selected_value_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.selectedValueIds);
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
        if (this.selectedValueIds != null) {
            json["selected_value_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.selectedValueIds);
        }
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }

    private _selectedValueIds?: string[] = undefined;

    private _text?: string = undefined;
}

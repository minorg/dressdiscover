import { WorksheetFeatureId } from "./worksheet_feature_id";
import { WorksheetFeatureValueId } from "./worksheet_feature_value_id";

export class WorksheetFeatureState {
    constructor(kwds: {id: WorksheetFeatureId, selectedValueIds?: WorksheetFeatureValueId[], text?: string}) {
        this._id = WorksheetFeatureState._validateId(kwds.id);
        if (kwds.selectedValueIds != null) {
            this._selectedValueIds = WorksheetFeatureState._validateSelectedValueIds(kwds.selectedValueIds);
        } else {
            this._selectedValueIds = undefined;
        }
        if (kwds.text != null) {
            this._text = WorksheetFeatureState._validateText(kwds.text);
        } else {
            this._text = undefined;
        }
    }

    get id(): WorksheetFeatureId {
        return this._id;
    }

    set id(id: WorksheetFeatureId) {
        this._id = WorksheetFeatureState._validateId(id);
    }

    get selectedValueIds(): WorksheetFeatureValueId[] | undefined {
        return this._selectedValueIds;
    }

    set selectedValueIds(selectedValueIds: WorksheetFeatureValueId[] | undefined) {
        this._selectedValueIds = WorksheetFeatureState._validateSelectedValueIds(selectedValueIds);
    }

    get text(): string | undefined {
        return this._text;
    }

    set text(text: string | undefined) {
        this._text = WorksheetFeatureState._validateText(text);
    }

    private static _validateId(id: WorksheetFeatureId): WorksheetFeatureId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    private static _validateSelectedValueIds(selectedValueIds: WorksheetFeatureValueId[] | undefined): WorksheetFeatureValueId[] | undefined {
        if (selectedValueIds != null) {
            if (selectedValueIds.length < 1) {
                throw new RangeError("expected len(selectedValueIds) to be >= 1, was " + selectedValueIds.length);
            }
        }
        return selectedValueIds;
    }

    private static _validateText(text: string | undefined): string | undefined {
        if (text != null) {
            if (text.trim().length == 0) {
                throw new RangeError('text is blank');
            }
            if (text.length < 1) {
                throw new RangeError("expected len(text) to be >= 1, was " + text.length);
            }
        }
        return text;
    }

    deepCopy(): WorksheetFeatureState {
        return new WorksheetFeatureState({ id: this.id, selectedValueIds: (this.selectedValueIds ? (function(__value0: WorksheetFeatureValueId[]) { let __copy0: WorksheetFeatureValueId[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.selectedValueIds)) : undefined), text: this.text });
    }

    equals(other: WorksheetFeatureState): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.selectedValueIds)) === "undefined") && !((typeof (other.selectedValueIds)) === "undefined")) ? (function(left: WorksheetFeatureValueId[], right: WorksheetFeatureValueId[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }((this.selectedValueIds as WorksheetFeatureValueId[]), (other.selectedValueIds as WorksheetFeatureValueId[]))) : (((typeof (this.selectedValueIds)) === "undefined") && ((typeof (other.selectedValueIds)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.text)) === "undefined") && !((typeof (other.text)) === "undefined")) ? ((this.text as string) === (other.text as string)) : (((typeof (this.text)) === "undefined") && ((typeof (other.text)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureState {
        var id: WorksheetFeatureId | undefined;
        var selectedValueIds: WorksheetFeatureValueId[] | undefined;
        var text: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetFeatureId.parse(json[fieldName]);
            } else if (fieldName == "selected_value_ids") {
                selectedValueIds = function(json: any[]): WorksheetFeatureValueId[] { var sequence: WorksheetFeatureValueId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureValueId.parse(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureState({id: id, selectedValueIds: selectedValueIds, text: text});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        if (this.selectedValueIds != null) {
            json["selected_value_ids"] = function (__inArray: WorksheetFeatureValueId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.selectedValueIds);
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
        json["id"] = this.id.toString();
        if (this.selectedValueIds != null) {
            json["selected_value_ids"] = function (__inArray: WorksheetFeatureValueId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.selectedValueIds);
        }
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }

    private _id: WorksheetFeatureId;

    private _selectedValueIds?: WorksheetFeatureValueId[];

    private _text?: string;
}

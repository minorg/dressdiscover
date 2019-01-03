import { WorksheetFeatureSetState } from "./worksheet_feature_set_state";
import { WorksheetStateId } from "./worksheet_state_id";

export class WorksheetState {
    constructor(kwds: {featureSets: WorksheetFeatureSetState[], id: WorksheetStateId, text?: string}) {
        this._featureSets = WorksheetState._validateFeatureSets(kwds.featureSets);
        this._id = WorksheetState._validateId(kwds.id);
        if (kwds.text != null) {
            this._text = WorksheetState._validateText(kwds.text);
        } else {
            this._text = undefined;
        }
    }

    get featureSets(): WorksheetFeatureSetState[] {
        return this._featureSets;
    }

    set featureSets(featureSets: WorksheetFeatureSetState[]) {
        this._featureSets = WorksheetState._validateFeatureSets(featureSets);
    }

    get id(): WorksheetStateId {
        return this._id;
    }

    set id(id: WorksheetStateId) {
        this._id = WorksheetState._validateId(id);
    }

    get text(): string | undefined {
        return this._text;
    }

    set text(text: string | undefined) {
        this._text = WorksheetState._validateText(text);
    }

    private static _validateFeatureSets(featureSets: WorksheetFeatureSetState[]): WorksheetFeatureSetState[] {
        if (featureSets == null) {
            throw new RangeError('featureSets is null or undefined');
        }
        return featureSets;
    }

    private static _validateId(id: WorksheetStateId): WorksheetStateId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
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

    deepCopy(): WorksheetState {
        return new WorksheetState({ featureSets: function(__value0: WorksheetFeatureSetState[]) { let __copy0: WorksheetFeatureSetState[] = []; for (let __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.featureSets), id: this.id, text: this.text });
    }

    equals(other: WorksheetState): boolean {
        if (!(function(left: WorksheetFeatureSetState[], right: WorksheetFeatureSetState[]): boolean { if (left.length != right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureSets, other.featureSets))) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.text)) === "undefined") && !((typeof (other.text)) === "undefined")) ? ((this.text as string) === (other.text as string)) : (((typeof (this.text)) === "undefined") && ((typeof (other.text)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetState {
        let featureSets: WorksheetFeatureSetState[] | undefined;
        let id: WorksheetStateId | undefined;
        let text: string | undefined;
        for (let fieldName in json) {
            if (fieldName == "feature_sets") {
                featureSets = function(json: any[]): WorksheetFeatureSetState[] { let sequence: WorksheetFeatureSetState[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureSetState.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "id") {
                id = WorksheetStateId.parse(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            }
        }
        if (featureSets == null) {
            throw new TypeError('featureSets is required');
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetState({featureSets: featureSets, id: id, text: text});
    }

    toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetState[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.featureSets);
        json["id"] = this.id.toString();
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }

    toString(): string {
        return "WorksheetState(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["feature_sets"] = function (__inArray: WorksheetFeatureSetState[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.featureSets);
        json["id"] = this.id.toString();
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }

    private _featureSets: WorksheetFeatureSetState[];

    private _id: WorksheetStateId;

    private _text?: string;
}

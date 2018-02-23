import { WorksheetFeatureValueDefinition } from "./worksheet_feature_value_definition";

export class WorksheetFeatureDefinition {
    private _displayName?: string;

    private _id: string;

    private _values_?: WorksheetFeatureValueDefinition[];

    constructor(kwds: {id: string, displayName?: string, values_?: WorksheetFeatureValueDefinition[]}) {
        this.id = kwds.id;
        this.displayName = kwds.displayName;
        this.values_ = kwds.values_;
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length < 1) {
            throw new RangeError("expected len(id) to be >= 1, was " + id.length);
        }
        this._id = id;
    }

    get displayName(): string | undefined {
        return this._displayName;
    }

    set displayName(displayName: string | undefined) {
        if (displayName != null) {
            if (displayName.trim().length == 0) {
                throw new RangeError('displayName is blank');
            }
            if (displayName.length < 1) {
                throw new RangeError("expected len(displayName) to be >= 1, was " + displayName.length);
            }
        }
        this._displayName = displayName;
    }

    get values_(): WorksheetFeatureValueDefinition[] | undefined {
        return this._values_;
    }

    set values_(values_: WorksheetFeatureValueDefinition[] | undefined) {
        if (values_ != null) {
            if (values_.length < 1) {
                throw new RangeError("expected len(values_) to be >= 1, was " + values_.length);
            }
        }
        this._values_ = values_;
    }

    deepCopy(): WorksheetFeatureDefinition {
        return new WorksheetFeatureDefinition({ id: this.id, displayName: this.displayName, values_: (this.values_ ? (function(__value0: WorksheetFeatureValueDefinition[]) { let __copy0: WorksheetFeatureValueDefinition[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0].deepCopy()); } return __copy0; }(this.values_)) : undefined) });
    }

    equals(other: WorksheetFeatureDefinition): boolean {
        if (!(this.id === other.id)) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.values_)) === "undefined") && !((typeof (other.values_)) === "undefined")) ? (function(left: WorksheetFeatureValueDefinition[], right: WorksheetFeatureValueDefinition[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }((this.values_ as WorksheetFeatureValueDefinition[]), (other.values_ as WorksheetFeatureValueDefinition[]))) : (((typeof (this.values_)) === "undefined") && ((typeof (other.values_)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureDefinition {
        var id: string | undefined;
        var displayName: string | undefined;
        var values_: WorksheetFeatureValueDefinition[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "values_") {
                values_ = function(json: any[]): WorksheetFeatureValueDefinition[] { var sequence: WorksheetFeatureValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureValueDefinition.fromThryftJsonObject(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureDefinition({id: id, displayName: displayName, values_: values_});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.values_ != null) {
            json["values_"] = function (__inArray: WorksheetFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toJsonObject()); } return __outArray; }(this.values_);
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.values_ != null) {
            json["values_"] = function (__inArray: WorksheetFeatureValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJsonObject()); } return __outArray; }(this.values_);
        }
        return json;
    }
}

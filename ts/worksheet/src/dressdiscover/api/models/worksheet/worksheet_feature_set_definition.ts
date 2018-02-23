export class WorksheetFeatureSetDefinition {
    constructor(kwds: {id: string, displayName?: string, featureIds?: string[]}) {
        this.id = kwds.id;
        if (kwds.displayName != null) {
            this.displayName = kwds.displayName;
        }
        if (kwds.featureIds != null) {
            this.featureIds = kwds.featureIds;
        }
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

    get featureIds(): string[] | undefined {
        return this._featureIds;
    }

    set featureIds(featureIds: string[] | undefined) {
        if (featureIds != null) {
            if (featureIds.length < 1) {
                throw new RangeError("expected len(featureIds) to be >= 1, was " + featureIds.length);
            }
        }
        this._featureIds = featureIds;
    }

    deepCopy(): WorksheetFeatureSetDefinition {
        return new WorksheetFeatureSetDefinition({ id: this.id, displayName: this.displayName, featureIds: (this.featureIds ? (function(__value0: string[]) { let __copy0: string[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.featureIds)) : undefined) });
    }

    equals(other: WorksheetFeatureSetDefinition): boolean {
        if (!(this.id === other.id)) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.featureIds)) === "undefined") && !((typeof (other.featureIds)) === "undefined")) ? (function(left: string[], right: string[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }((this.featureIds as string[]), (other.featureIds as string[]))) : (((typeof (this.featureIds)) === "undefined") && ((typeof (other.featureIds)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureSetDefinition {
        var id: string | undefined;
        var displayName: string | undefined;
        var featureIds: string[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "feature_ids") {
                featureIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureSetDefinition({id: id, displayName: displayName, featureIds: featureIds});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.featureIds != null) {
            json["feature_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.featureIds);
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureSetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.featureIds != null) {
            json["feature_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.featureIds);
        }
        return json;
    }

    private _displayName?: string = undefined;

    private _featureIds?: string[] = undefined;

    private _id: string = "";
}

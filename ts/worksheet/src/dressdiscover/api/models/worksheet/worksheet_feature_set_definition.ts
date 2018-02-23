export class WorksheetFeatureSetDefinition {
    constructor(kwds: {id: string, displayName?: string, extentIds?: string[], featureIds?: string[]}) {
        this._id = WorksheetFeatureSetDefinition._validateId(kwds.id);
        if (kwds.displayName != null) {
            this._displayName = WorksheetFeatureSetDefinition._validateDisplayName(kwds.displayName);
        } else {
            this._displayName = undefined;
        }
        if (kwds.extentIds != null) {
            this._extentIds = WorksheetFeatureSetDefinition._validateExtentIds(kwds.extentIds);
        } else {
            this._extentIds = undefined;
        }
        if (kwds.featureIds != null) {
            this._featureIds = WorksheetFeatureSetDefinition._validateFeatureIds(kwds.featureIds);
        } else {
            this._featureIds = undefined;
        }
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        this._id = WorksheetFeatureSetDefinition._validateId(id);
    }

    get displayName(): string | undefined {
        return this._displayName;
    }

    set displayName(displayName: string | undefined) {
        this._displayName = WorksheetFeatureSetDefinition._validateDisplayName(displayName);
    }

    get extentIds(): string[] | undefined {
        return this._extentIds;
    }

    set extentIds(extentIds: string[] | undefined) {
        this._extentIds = WorksheetFeatureSetDefinition._validateExtentIds(extentIds);
    }

    get featureIds(): string[] | undefined {
        return this._featureIds;
    }

    set featureIds(featureIds: string[] | undefined) {
        this._featureIds = WorksheetFeatureSetDefinition._validateFeatureIds(featureIds);
    }

    private static _validateDisplayName(displayName: string | undefined): string | undefined {
        if (displayName != null) {
            if (displayName.trim().length == 0) {
                throw new RangeError('displayName is blank');
            }
            if (displayName.length < 1) {
                throw new RangeError("expected len(displayName) to be >= 1, was " + displayName.length);
            }
        }
        return displayName;
    }

    private static _validateExtentIds(extentIds: string[] | undefined): string[] | undefined {
        if (extentIds != null) {
            if (extentIds.length < 1) {
                throw new RangeError("expected len(extentIds) to be >= 1, was " + extentIds.length);
            }
        }
        return extentIds;
    }

    private static _validateFeatureIds(featureIds: string[] | undefined): string[] | undefined {
        if (featureIds != null) {
            if (featureIds.length < 1) {
                throw new RangeError("expected len(featureIds) to be >= 1, was " + featureIds.length);
            }
        }
        return featureIds;
    }

    private static _validateId(id: string): string {
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length < 1) {
            throw new RangeError("expected len(id) to be >= 1, was " + id.length);
        }
        return id;
    }

    deepCopy(): WorksheetFeatureSetDefinition {
        return new WorksheetFeatureSetDefinition({ id: this.id, displayName: this.displayName, extentIds: (this.extentIds ? (function(__value0: string[]) { let __copy0: string[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.extentIds)) : undefined), featureIds: (this.featureIds ? (function(__value0: string[]) { let __copy0: string[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.featureIds)) : undefined) });
    }

    equals(other: WorksheetFeatureSetDefinition): boolean {
        if (!(this.id === other.id)) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.extentIds)) === "undefined") && !((typeof (other.extentIds)) === "undefined")) ? (function(left: string[], right: string[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }((this.extentIds as string[]), (other.extentIds as string[]))) : (((typeof (this.extentIds)) === "undefined") && ((typeof (other.extentIds)) === "undefined")))) {
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
        var extentIds: string[] | undefined;
        var featureIds: string[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "extent_ids") {
                extentIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "feature_ids") {
                featureIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureSetDefinition({id: id, displayName: displayName, extentIds: extentIds, featureIds: featureIds});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.extentIds);
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
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.extentIds);
        }
        if (this.featureIds != null) {
            json["feature_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.featureIds);
        }
        return json;
    }

    private _displayName?: string;

    private _extentIds?: string[];

    private _featureIds?: string[];

    private _id: string;
}

export class WorksheetFeatureSetDefinition {
    constructor(kwds: {featureIds: string[], id: string, displayName?: string, extentIds?: string[]}) {
        this._featureIds = WorksheetFeatureSetDefinition._validateFeatureIds(kwds.featureIds);
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
    }

    get featureIds(): string[] {
        return this._featureIds;
    }

    set featureIds(featureIds: string[]) {
        this._featureIds = WorksheetFeatureSetDefinition._validateFeatureIds(featureIds);
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

    private static _validateFeatureIds(featureIds: string[]): string[] {
        if (featureIds == null) {
            throw new RangeError('featureIds is null or undefined');
        }
        if (featureIds.length < 1) {
            throw new RangeError("expected len(featureIds) to be >= 1, was " + featureIds.length);
        }
        return featureIds;
    }

    private static _validateId(id: string): string {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length < 1) {
            throw new RangeError("expected len(id) to be >= 1, was " + id.length);
        }
        return id;
    }

    deepCopy(): WorksheetFeatureSetDefinition {
        return new WorksheetFeatureSetDefinition({ featureIds: function(__value0: string[]) { let __copy0: string[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.featureIds), id: this.id, displayName: this.displayName, extentIds: (this.extentIds ? (function(__value0: string[]) { let __copy0: string[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.extentIds)) : undefined) });
    }

    equals(other: WorksheetFeatureSetDefinition): boolean {
        if (!(function(left: string[], right: string[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }(this.featureIds, other.featureIds))) {
            return false;
        }

        if (!(this.id === other.id)) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.extentIds)) === "undefined") && !((typeof (other.extentIds)) === "undefined")) ? (function(left: string[], right: string[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }((this.extentIds as string[]), (other.extentIds as string[]))) : (((typeof (this.extentIds)) === "undefined") && ((typeof (other.extentIds)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureSetDefinition {
        var featureIds: string[] | undefined;
        var id: string | undefined;
        var displayName: string | undefined;
        var extentIds: string[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "feature_ids") {
                featureIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "extent_ids") {
                extentIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            }
        }
        if (featureIds == null) {
            throw new TypeError('featureIds is required');
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureSetDefinition({featureIds: featureIds, id: id, displayName: displayName, extentIds: extentIds});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.featureIds);
        json["id"] = this.id;
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.extentIds);
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureSetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.featureIds);
        json["id"] = this.id;
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.extentIds);
        }
        return json;
    }

    private _displayName?: string;

    private _extentIds?: string[];

    private _featureIds: string[];

    private _id: string;
}

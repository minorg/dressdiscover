import { WorksheetExtentId } from "./worksheet_extent_id";
import { WorksheetFeatureId } from "./worksheet_feature_id";
import { WorksheetFeatureSetId } from "./worksheet_feature_set_id";

export class WorksheetFeatureSetDefinition {
    constructor(kwds: {featureIds: WorksheetFeatureId[], id: WorksheetFeatureSetId, displayName?: string, extentIds?: WorksheetExtentId[]}) {
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

    get featureIds(): WorksheetFeatureId[] {
        return this._featureIds;
    }

    set featureIds(featureIds: WorksheetFeatureId[]) {
        this._featureIds = WorksheetFeatureSetDefinition._validateFeatureIds(featureIds);
    }

    get id(): WorksheetFeatureSetId {
        return this._id;
    }

    set id(id: WorksheetFeatureSetId) {
        this._id = WorksheetFeatureSetDefinition._validateId(id);
    }

    get displayName(): string | undefined {
        return this._displayName;
    }

    set displayName(displayName: string | undefined) {
        this._displayName = WorksheetFeatureSetDefinition._validateDisplayName(displayName);
    }

    get extentIds(): WorksheetExtentId[] | undefined {
        return this._extentIds;
    }

    set extentIds(extentIds: WorksheetExtentId[] | undefined) {
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

    private static _validateExtentIds(extentIds: WorksheetExtentId[] | undefined): WorksheetExtentId[] | undefined {
        if (extentIds != null) {
            if (extentIds.length < 1) {
                throw new RangeError("expected len(extentIds) to be >= 1, was " + extentIds.length);
            }
        }
        return extentIds;
    }

    private static _validateFeatureIds(featureIds: WorksheetFeatureId[]): WorksheetFeatureId[] {
        if (featureIds == null) {
            throw new RangeError('featureIds is null or undefined');
        }
        if (featureIds.length < 1) {
            throw new RangeError("expected len(featureIds) to be >= 1, was " + featureIds.length);
        }
        return featureIds;
    }

    private static _validateId(id: WorksheetFeatureSetId): WorksheetFeatureSetId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): WorksheetFeatureSetDefinition {
        return new WorksheetFeatureSetDefinition({ featureIds: function(__value0: WorksheetFeatureId[]) { let __copy0: WorksheetFeatureId[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.featureIds), id: this.id, displayName: this.displayName, extentIds: (this.extentIds ? (function(__value0: WorksheetExtentId[]) { let __copy0: WorksheetExtentId[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.extentIds)) : undefined) });
    }

    equals(other: WorksheetFeatureSetDefinition): boolean {
        if (!(function(left: WorksheetFeatureId[], right: WorksheetFeatureId[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }(this.featureIds, other.featureIds))) {
            return false;
        }

        if (!(this.id === other.id)) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.extentIds)) === "undefined") && !((typeof (other.extentIds)) === "undefined")) ? (function(left: WorksheetExtentId[], right: WorksheetExtentId[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }((this.extentIds as WorksheetExtentId[]), (other.extentIds as WorksheetExtentId[]))) : (((typeof (this.extentIds)) === "undefined") && ((typeof (other.extentIds)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureSetDefinition {
        var featureIds: WorksheetFeatureId[] | undefined;
        var id: WorksheetFeatureSetId | undefined;
        var displayName: string | undefined;
        var extentIds: WorksheetExtentId[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "feature_ids") {
                featureIds = function(json: any[]): WorksheetFeatureId[] { var sequence: WorksheetFeatureId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureId.parse(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "id") {
                id = WorksheetFeatureSetId.parse(json[fieldName]);
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "extent_ids") {
                extentIds = function(json: any[]): WorksheetExtentId[] { var sequence: WorksheetExtentId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetExtentId.parse(json[i])); } return sequence; }(json[fieldName]);
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
        json["feature_ids"] = function (__inArray: WorksheetFeatureId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.featureIds);
        json["id"] = this.id.toString();
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: WorksheetExtentId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.extentIds);
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureSetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["feature_ids"] = function (__inArray: WorksheetFeatureId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.featureIds);
        json["id"] = this.id.toString();
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: WorksheetExtentId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.extentIds);
        }
        return json;
    }

    private _displayName?: string;

    private _extentIds?: WorksheetExtentId[];

    private _featureIds: WorksheetFeatureId[];

    private _id: WorksheetFeatureSetId;
}

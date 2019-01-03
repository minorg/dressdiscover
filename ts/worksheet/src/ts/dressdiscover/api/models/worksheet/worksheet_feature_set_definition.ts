import { WorksheetDescription } from "./worksheet_description";
import { WorksheetExtentId } from "./worksheet_extent_id";
import { WorksheetFeatureId } from "./worksheet_feature_id";
import { WorksheetFeatureSetId } from "./worksheet_feature_set_id";

export class WorksheetFeatureSetDefinition {
    constructor(kwds: {featureIds: WorksheetFeatureId[], id: WorksheetFeatureSetId, description?: WorksheetDescription, displayName?: string, extentIds?: WorksheetExtentId[]}) {
        this._featureIds = WorksheetFeatureSetDefinition._validateFeatureIds(kwds.featureIds);
        this._id = WorksheetFeatureSetDefinition._validateId(kwds.id);
        if (kwds.description != null) {
            this._description = WorksheetFeatureSetDefinition._validateDescription(kwds.description);
        } else {
            this._description = undefined;
        }
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

    get description(): WorksheetDescription | undefined {
        return this._description;
    }

    set description(description: WorksheetDescription | undefined) {
        this._description = WorksheetFeatureSetDefinition._validateDescription(description);
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

    private static _validateDescription(description: WorksheetDescription | undefined): WorksheetDescription | undefined {
        if (description != null) {

        }
        return description;
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
        return new WorksheetFeatureSetDefinition({ featureIds: function(__value0: WorksheetFeatureId[]) { let __copy0: WorksheetFeatureId[] = []; for (let __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.featureIds), id: this.id, description: (this.description ? (this.description.deepCopy()) : undefined), displayName: this.displayName, extentIds: (this.extentIds ? (function(__value0: WorksheetExtentId[]) { let __copy0: WorksheetExtentId[] = []; for (let __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.extentIds)) : undefined) });
    }

    equals(other: WorksheetFeatureSetDefinition): boolean {
        if (!(function(left: WorksheetFeatureId[], right: WorksheetFeatureId[]): boolean { if (left.length != right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }(this.featureIds, other.featureIds))) {
            return false;
        }

        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!((!((typeof (this.description)) === "undefined") && !((typeof (other.description)) === "undefined")) ? ((this.description as WorksheetDescription).equals((other.description as WorksheetDescription))) : (((typeof (this.description)) === "undefined") && ((typeof (other.description)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.extentIds)) === "undefined") && !((typeof (other.extentIds)) === "undefined")) ? (function(left: WorksheetExtentId[], right: WorksheetExtentId[]): boolean { if (left.length != right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; }((this.extentIds as WorksheetExtentId[]), (other.extentIds as WorksheetExtentId[]))) : (((typeof (this.extentIds)) === "undefined") && ((typeof (other.extentIds)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureSetDefinition {
        let featureIds: WorksheetFeatureId[] | undefined;
        let id: WorksheetFeatureSetId | undefined;
        let description: WorksheetDescription | undefined;
        let displayName: string | undefined;
        let extentIds: WorksheetExtentId[] | undefined;
        for (let fieldName in json) {
            if (fieldName == "feature_ids") {
                featureIds = function(json: any[]): WorksheetFeatureId[] { let sequence: WorksheetFeatureId[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureId.parse(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "id") {
                id = WorksheetFeatureSetId.parse(json[fieldName]);
            } else if (fieldName == "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "extent_ids") {
                extentIds = function(json: any[]): WorksheetExtentId[] { let sequence: WorksheetExtentId[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetExtentId.parse(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (featureIds == null) {
            throw new TypeError('featureIds is required');
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new WorksheetFeatureSetDefinition({featureIds: featureIds, id: id, description: description, displayName: displayName, extentIds: extentIds});
    }

    toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["feature_ids"] = function (__inArray: WorksheetFeatureId[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.featureIds);
        json["id"] = this.id.toString();
        if (this.description != null) {
            json["description"] = this.description.toJsonObject();
        }
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: WorksheetExtentId[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.extentIds);
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureSetDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["feature_ids"] = function (__inArray: WorksheetFeatureId[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.featureIds);
        json["id"] = this.id.toString();
        if (this.description != null) {
            json["description"] = this.description.toThryftJsonObject();
        }
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: WorksheetExtentId[]): any[] { let __outArray: any[] = []; for (let __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.extentIds);
        }
        return json;
    }

    private _description?: WorksheetDescription;

    private _displayName?: string;

    private _extentIds?: WorksheetExtentId[];

    private _featureIds: WorksheetFeatureId[];

    private _id: WorksheetFeatureSetId;
}

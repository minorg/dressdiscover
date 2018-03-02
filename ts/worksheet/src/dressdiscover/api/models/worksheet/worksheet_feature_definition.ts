import { WorksheetDescription } from "./worksheet_description";
import { WorksheetExtentId } from "./worksheet_extent_id";
import { WorksheetFeatureId } from "./worksheet_feature_id";
import { WorksheetFeatureValueId } from "./worksheet_feature_value_id";

export class WorksheetFeatureDefinition {
    constructor(kwds: {id: WorksheetFeatureId, valueIds: WorksheetFeatureValueId[], description?: WorksheetDescription, displayName?: string, extentIds?: WorksheetExtentId[]}) {
        this._id = WorksheetFeatureDefinition._validateId(kwds.id);
        this._valueIds = WorksheetFeatureDefinition._validateValueIds(kwds.valueIds);
        if (kwds.description != null) {
            this._description = WorksheetFeatureDefinition._validateDescription(kwds.description);
        } else {
            this._description = undefined;
        }
        if (kwds.displayName != null) {
            this._displayName = WorksheetFeatureDefinition._validateDisplayName(kwds.displayName);
        } else {
            this._displayName = undefined;
        }
        if (kwds.extentIds != null) {
            this._extentIds = WorksheetFeatureDefinition._validateExtentIds(kwds.extentIds);
        } else {
            this._extentIds = undefined;
        }
    }

    get id(): WorksheetFeatureId {
        return this._id;
    }

    set id(id: WorksheetFeatureId) {
        this._id = WorksheetFeatureDefinition._validateId(id);
    }

    get valueIds(): WorksheetFeatureValueId[] {
        return this._valueIds;
    }

    set valueIds(valueIds: WorksheetFeatureValueId[]) {
        this._valueIds = WorksheetFeatureDefinition._validateValueIds(valueIds);
    }

    get description(): WorksheetDescription | undefined {
        return this._description;
    }

    set description(description: WorksheetDescription | undefined) {
        this._description = WorksheetFeatureDefinition._validateDescription(description);
    }

    get displayName(): string | undefined {
        return this._displayName;
    }

    set displayName(displayName: string | undefined) {
        this._displayName = WorksheetFeatureDefinition._validateDisplayName(displayName);
    }

    get extentIds(): WorksheetExtentId[] | undefined {
        return this._extentIds;
    }

    set extentIds(extentIds: WorksheetExtentId[] | undefined) {
        this._extentIds = WorksheetFeatureDefinition._validateExtentIds(extentIds);
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

    private static _validateId(id: WorksheetFeatureId): WorksheetFeatureId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    private static _validateValueIds(valueIds: WorksheetFeatureValueId[]): WorksheetFeatureValueId[] {
        if (valueIds == null) {
            throw new RangeError('valueIds is null or undefined');
        }
        if (valueIds.length < 1) {
            throw new RangeError("expected len(valueIds) to be >= 1, was " + valueIds.length);
        }
        return valueIds;
    }

    deepCopy(): WorksheetFeatureDefinition {
        return new WorksheetFeatureDefinition({ id: this.id, valueIds: function(__value0: WorksheetFeatureValueId[]) { let __copy0: WorksheetFeatureValueId[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.valueIds), description: (this.description ? (this.description.deepCopy()) : undefined), displayName: this.displayName, extentIds: (this.extentIds ? (function(__value0: WorksheetExtentId[]) { let __copy0: WorksheetExtentId[] = []; for (var __i0 = 0; __i0 < __value0.length; __i0++) { __copy0.push(__value0[__i0]); } return __copy0; }(this.extentIds)) : undefined) });
    }

    equals(other: WorksheetFeatureDefinition): boolean {
        if (!(this.id === other.id)) {
            return false;
        }

        if (!(function(left: WorksheetFeatureValueId[], right: WorksheetFeatureValueId[]): boolean { if (left.length != right.length) { return false; } for (var elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI] === right[elementI])) { return false; } } return true; }(this.valueIds, other.valueIds))) {
            return false;
        }

        if (!((!((typeof (this.description)) === "undefined") && !((typeof (other.description)) === "undefined")) ? ((this.description as WorksheetDescription).equals((other.description as WorksheetDescription))) : (((typeof (this.description)) === "undefined") && ((typeof (other.description)) === "undefined")))) {
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

    static fromThryftJsonObject(json: any): WorksheetFeatureDefinition {
        var id: WorksheetFeatureId | undefined;
        var valueIds: WorksheetFeatureValueId[] | undefined;
        var description: WorksheetDescription | undefined;
        var displayName: string | undefined;
        var extentIds: WorksheetExtentId[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetFeatureId.parse(json[fieldName]);
            } else if (fieldName == "value_ids") {
                valueIds = function(json: any[]): WorksheetFeatureValueId[] { var sequence: WorksheetFeatureValueId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetFeatureValueId.parse(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName == "display_name") {
                displayName = json[fieldName];
            } else if (fieldName == "extent_ids") {
                extentIds = function(json: any[]): WorksheetExtentId[] { var sequence: WorksheetExtentId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(WorksheetExtentId.parse(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        if (valueIds == null) {
            throw new TypeError('valueIds is required');
        }
        return new WorksheetFeatureDefinition({id: id, valueIds: valueIds, description: description, displayName: displayName, extentIds: extentIds});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        json["value_ids"] = function (__inArray: WorksheetFeatureValueId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.valueIds);
        if (this.description != null) {
            json["description"] = this.description.toJsonObject();
        }
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: WorksheetExtentId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.extentIds);
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        json["value_ids"] = function (__inArray: WorksheetFeatureValueId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.valueIds);
        if (this.description != null) {
            json["description"] = this.description.toThryftJsonObject();
        }
        if (this.displayName != null) {
            json["display_name"] = this.displayName;
        }
        if (this.extentIds != null) {
            json["extent_ids"] = function (__inArray: WorksheetExtentId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.extentIds);
        }
        return json;
    }

    private _description?: WorksheetDescription;

    private _displayName?: string;

    private _extentIds?: WorksheetExtentId[];

    private _id: WorksheetFeatureId;

    private _valueIds: WorksheetFeatureValueId[];
}

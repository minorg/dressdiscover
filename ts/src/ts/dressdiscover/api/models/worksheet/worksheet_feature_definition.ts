import { WorksheetDescription } from "./worksheet_description";
import { WorksheetExtentId } from "./worksheet_extent_id";
import { WorksheetFeatureId } from "./worksheet_feature_id";
import { WorksheetFeatureValueId } from "./worksheet_feature_value_id";

export class WorksheetFeatureDefinition {
    constructor(kwds: {id: WorksheetFeatureId, valueIds: WorksheetFeatureValueId[], description?: WorksheetDescription, displayName?: string, extentIds?: WorksheetExtentId[]}) {
        this.idPrivate = WorksheetFeatureDefinition.validateId(kwds.id);
        this.valueIdsPrivate = WorksheetFeatureDefinition.validateValueIds(kwds.valueIds);
        if (kwds.description != null) {
            this.descriptionPrivate = WorksheetFeatureDefinition.validateDescription(kwds.description);
        } else {
            this.descriptionPrivate = undefined;
        }
        if (kwds.displayName != null) {
            this.displayNamePrivate = WorksheetFeatureDefinition.validateDisplayName(kwds.displayName);
        } else {
            this.displayNamePrivate = undefined;
        }
        if (kwds.extentIds != null) {
            this.extentIdsPrivate = WorksheetFeatureDefinition.validateExtentIds(kwds.extentIds);
        } else {
            this.extentIdsPrivate = undefined;
        }
    }

    get id(): WorksheetFeatureId {
        return this.idPrivate;
    }

    set id(id: WorksheetFeatureId) {
        this.idPrivate = WorksheetFeatureDefinition.validateId(id);
    }

    get valueIds(): WorksheetFeatureValueId[] {
        return this.valueIdsPrivate;
    }

    set valueIds(valueIds: WorksheetFeatureValueId[]) {
        this.valueIdsPrivate = WorksheetFeatureDefinition.validateValueIds(valueIds);
    }

    get description(): WorksheetDescription | undefined {
        return this.descriptionPrivate;
    }

    set description(description: WorksheetDescription | undefined) {
        this.descriptionPrivate = WorksheetFeatureDefinition.validateDescription(description);
    }

    get displayName(): string | undefined {
        return this.displayNamePrivate;
    }

    set displayName(displayName: string | undefined) {
        this.displayNamePrivate = WorksheetFeatureDefinition.validateDisplayName(displayName);
    }

    get extentIds(): WorksheetExtentId[] | undefined {
        return this.extentIdsPrivate;
    }

    set extentIds(extentIds: WorksheetExtentId[] | undefined) {
        this.extentIdsPrivate = WorksheetFeatureDefinition.validateExtentIds(extentIds);
    }

    public deepCopy(): WorksheetFeatureDefinition {
        return new WorksheetFeatureDefinition({ id: this.id, valueIds: (this.valueIds).map((value0) => value0), description: (this.description ? (this.description.deepCopy()) : undefined), displayName: this.displayName, extentIds: (this.extentIds ? ((this.extentIds).map((value0) => value0)) : undefined) });
    }

    public equals(other: WorksheetFeatureDefinition): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        if (!(((left: WorksheetFeatureValueId[], right: WorksheetFeatureValueId[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })(this.valueIds, other.valueIds))) {
            return false;
        }

        if (!((!((typeof (this.description)) === "undefined") && !((typeof (other.description)) === "undefined")) ? ((this.description as WorksheetDescription).equals((other.description as WorksheetDescription))) : (((typeof (this.description)) === "undefined") && ((typeof (other.description)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.displayName)) === "undefined") && !((typeof (other.displayName)) === "undefined")) ? ((this.displayName as string) === (other.displayName as string)) : (((typeof (this.displayName)) === "undefined") && ((typeof (other.displayName)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.extentIds)) === "undefined") && !((typeof (other.extentIds)) === "undefined")) ? (((left: WorksheetExtentId[], right: WorksheetExtentId[]): boolean => { if (left.length !== right.length) { return false; } for (let elementI = 0; elementI < left.length; elementI++) { if (!(left[elementI].equals(right[elementI]))) { return false; } } return true; })((this.extentIds as WorksheetExtentId[]), (other.extentIds as WorksheetExtentId[]))) : (((typeof (this.extentIds)) === "undefined") && ((typeof (other.extentIds)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureDefinition {
        let id: WorksheetFeatureId | undefined;
        let valueIds: WorksheetFeatureValueId[] | undefined;
        let description: WorksheetDescription | undefined;
        let displayName: string | undefined;
        let extentIds: WorksheetExtentId[] | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetFeatureId.parse(json[fieldName]);
            } else if (fieldName === "value_ids") {
                valueIds = (json[fieldName]).map((element: any) => WorksheetFeatureValueId.parse(element));
            } else if (fieldName === "description") {
                description = WorksheetDescription.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "display_name") {
                displayName = json[fieldName];
            } else if (fieldName === "extent_ids") {
                extentIds = (json[fieldName]).map((element: any) => WorksheetExtentId.parse(element));
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        if (valueIds == null) {
            throw new TypeError("valueIds is required");
        }
        return new WorksheetFeatureDefinition({id, valueIds, description, displayName, extentIds});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.id = this.id.toString();
        json.value_ids = (this.valueIds).map((inElement) => inElement.toString());
        if (this.description != null) {
            json.description = this.description.toJsonObject();
        }
        if (this.displayName != null) {
            json.display_name = this.displayName;
        }
        if (this.extentIds != null) {
            json.extent_ids = (this.extentIds).map((inElement) => inElement.toString());
        }
        return json;
    }

    public toString(): string {
        return "WorksheetFeatureDefinition(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.id = this.id.toString();
        json.value_ids = (this.valueIds).map((inElement) => inElement.toString());
        if (this.description != null) {
            json.description = this.description.toThryftJsonObject();
        }
        if (this.displayName != null) {
            json.display_name = this.displayName;
        }
        if (this.extentIds != null) {
            json.extent_ids = (this.extentIds).map((inElement) => inElement.toString());
        }
        return json;
    }

    private static validateDescription(description: WorksheetDescription | undefined): WorksheetDescription | undefined {
        return description;
    }

    private static validateDisplayName(displayName: string | undefined): string | undefined {
        if (displayName != null) {
            if (displayName.trim().length === 0) {
                throw new RangeError("displayName is blank");
            }
            if (displayName.length < 1) {
                throw new RangeError("expected len(displayName) to be >= 1, was " + displayName.length);
            }
        }
        return displayName;
    }

    private static validateExtentIds(extentIds: WorksheetExtentId[] | undefined): WorksheetExtentId[] | undefined {
        if (extentIds != null) {
            if (extentIds.length < 1) {
                throw new RangeError("expected len(extentIds) to be >= 1, was " + extentIds.length);
            }
        }
        return extentIds;
    }

    private static validateId(id: WorksheetFeatureId): WorksheetFeatureId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    private static validateValueIds(valueIds: WorksheetFeatureValueId[]): WorksheetFeatureValueId[] {
        if (valueIds == null) {
            throw new RangeError("valueIds is null or undefined");
        }
        if (valueIds.length < 1) {
            throw new RangeError("expected len(valueIds) to be >= 1, was " + valueIds.length);
        }
        return valueIds;
    }

    private descriptionPrivate?: WorksheetDescription;

    private displayNamePrivate?: string;

    private extentIdsPrivate?: WorksheetExtentId[];

    private idPrivate: WorksheetFeatureId;

    private valueIdsPrivate: WorksheetFeatureValueId[];
}

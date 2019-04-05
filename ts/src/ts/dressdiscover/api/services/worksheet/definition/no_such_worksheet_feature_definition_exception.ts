import { WorksheetFeatureId } from "../../../models/worksheet/worksheet_feature_id";

export class NoSuchWorksheetFeatureDefinitionException {
    constructor(kwds: {id: WorksheetFeatureId}) {
        this.id = NoSuchWorksheetFeatureDefinitionException.validateId(kwds.id);
    }

    public deepCopy(): NoSuchWorksheetFeatureDefinitionException {
        return new NoSuchWorksheetFeatureDefinitionException({ id: this.id });
    }

    public equals(other: NoSuchWorksheetFeatureDefinitionException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): NoSuchWorksheetFeatureDefinitionException {
        let id: WorksheetFeatureId | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetFeatureId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new NoSuchWorksheetFeatureDefinitionException({id});
    }

    public toJsonObject(): {id: string} {
        return {
            id: this.id.toString()
        };
    }

    public toString(): string {
        return "NoSuchWorksheetFeatureDefinitionException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {id: string} {
        return {
            id: this.id.toString()
        };
    }

    private static validateId(id: WorksheetFeatureId): WorksheetFeatureId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    public readonly id: WorksheetFeatureId;
}

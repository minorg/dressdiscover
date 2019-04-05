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

    public toJsonObject(): {[index: string]: string} {
        const json: {[index: string]: string} = {};
        json.id = this.id.toString();
        return json;
    }

    public toString(): string {
        return "NoSuchWorksheetFeatureDefinitionException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {[index: string]: string} {
        const json: {[index: string]: string} = {};
        json.id = this.id.toString();
        return json;
    }

    private static validateId(id: WorksheetFeatureId): WorksheetFeatureId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    public readonly id: WorksheetFeatureId;
}

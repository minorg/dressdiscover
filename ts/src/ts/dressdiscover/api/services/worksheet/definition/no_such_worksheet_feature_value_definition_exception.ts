import { WorksheetFeatureValueId } from "../../../models/worksheet/worksheet_feature_value_id";

export class NoSuchWorksheetFeatureValueDefinitionException {
    constructor(kwds: {id: WorksheetFeatureValueId}) {
        this.id = NoSuchWorksheetFeatureValueDefinitionException.validateId(kwds.id);
    }

    public deepCopy(): NoSuchWorksheetFeatureValueDefinitionException {
        return new NoSuchWorksheetFeatureValueDefinitionException({ id: this.id });
    }

    public equals(other: NoSuchWorksheetFeatureValueDefinitionException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): NoSuchWorksheetFeatureValueDefinitionException {
        let id: WorksheetFeatureValueId | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetFeatureValueId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new NoSuchWorksheetFeatureValueDefinitionException({id});
    }

    public toJsonObject(): {[index: string]: string} {
        const json: {[index: string]: string} = {};
        json.id = this.id.toString();
        return json;
    }

    public toString(): string {
        return "NoSuchWorksheetFeatureValueDefinitionException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {[index: string]: string} {
        const json: {[index: string]: string} = {};
        json.id = this.id.toString();
        return json;
    }

    private static validateId(id: WorksheetFeatureValueId): WorksheetFeatureValueId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    public readonly id: WorksheetFeatureValueId;
}

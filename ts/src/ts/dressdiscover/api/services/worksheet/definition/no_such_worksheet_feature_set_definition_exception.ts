import { WorksheetFeatureSetId } from "../../../models/worksheet/worksheet_feature_set_id";

export class NoSuchWorksheetFeatureSetDefinitionException {
    constructor(kwds: {id: WorksheetFeatureSetId}) {
        this.idPrivate = NoSuchWorksheetFeatureSetDefinitionException.validateId(kwds.id);
    }

    public deepCopy(): NoSuchWorksheetFeatureSetDefinitionException {
        return new NoSuchWorksheetFeatureSetDefinitionException({ id: this.id });
    }

    public equals(other: NoSuchWorksheetFeatureSetDefinitionException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): NoSuchWorksheetFeatureSetDefinitionException {
        let id: WorksheetFeatureSetId | undefined;
        for (const fieldName in json) {
            if (fieldName === "id") {
                id = WorksheetFeatureSetId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError("id is required");
        }
        return new NoSuchWorksheetFeatureSetDefinitionException({id});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.id = this.id.toString();
        return json;
    }

    public toString(): string {
        return "NoSuchWorksheetFeatureSetDefinitionException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.id = this.id.toString();
        return json;
    }

    private static validateId(id: WorksheetFeatureSetId): WorksheetFeatureSetId {
        if (id == null) {
            throw new RangeError("id is null or undefined");
        }
        return id;
    }

    public readonly id: WorksheetFeatureSetId;
}

import { WorksheetFeatureSetId } from "../../models/worksheet/worksheet_feature_set_id";

export class NoSuchWorksheetFeatureSetDefinitionException {
    constructor(kwds: {id: WorksheetFeatureSetId}) {
        this._id = NoSuchWorksheetFeatureSetDefinitionException._validateId(kwds.id);
    }

    get id(): WorksheetFeatureSetId {
        return this._id;
    }

    set id(id: WorksheetFeatureSetId) {
        this._id = NoSuchWorksheetFeatureSetDefinitionException._validateId(id);
    }

    private static _validateId(id: WorksheetFeatureSetId): WorksheetFeatureSetId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): NoSuchWorksheetFeatureSetDefinitionException {
        return new NoSuchWorksheetFeatureSetDefinitionException({ id: this.id });
    }

    equals(other: NoSuchWorksheetFeatureSetDefinitionException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): NoSuchWorksheetFeatureSetDefinitionException {
        let id: WorksheetFeatureSetId | undefined;
        for (let fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetFeatureSetId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new NoSuchWorksheetFeatureSetDefinitionException({id: id});
    }

    toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "NoSuchWorksheetFeatureSetDefinitionException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    private _id: WorksheetFeatureSetId;
}

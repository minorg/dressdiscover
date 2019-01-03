import { WorksheetFeatureId } from "../../models/worksheet/worksheet_feature_id";

export class NoSuchWorksheetFeatureDefinitionException {
    constructor(kwds: {id: WorksheetFeatureId}) {
        this._id = NoSuchWorksheetFeatureDefinitionException._validateId(kwds.id);
    }

    get id(): WorksheetFeatureId {
        return this._id;
    }

    set id(id: WorksheetFeatureId) {
        this._id = NoSuchWorksheetFeatureDefinitionException._validateId(id);
    }

    private static _validateId(id: WorksheetFeatureId): WorksheetFeatureId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): NoSuchWorksheetFeatureDefinitionException {
        return new NoSuchWorksheetFeatureDefinitionException({ id: this.id });
    }

    equals(other: NoSuchWorksheetFeatureDefinitionException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): NoSuchWorksheetFeatureDefinitionException {
        let id: WorksheetFeatureId | undefined;
        for (let fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetFeatureId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new NoSuchWorksheetFeatureDefinitionException({id: id});
    }

    toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "NoSuchWorksheetFeatureDefinitionException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    private _id: WorksheetFeatureId;
}

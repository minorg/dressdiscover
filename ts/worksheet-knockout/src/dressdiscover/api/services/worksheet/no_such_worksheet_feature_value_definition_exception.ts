import { WorksheetFeatureValueId } from "../../models/worksheet/worksheet_feature_value_id";

export class NoSuchWorksheetFeatureValueDefinitionException {
    constructor(kwds: {id: WorksheetFeatureValueId}) {
        this._id = NoSuchWorksheetFeatureValueDefinitionException._validateId(kwds.id);
    }

    get id(): WorksheetFeatureValueId {
        return this._id;
    }

    set id(id: WorksheetFeatureValueId) {
        this._id = NoSuchWorksheetFeatureValueDefinitionException._validateId(id);
    }

    private static _validateId(id: WorksheetFeatureValueId): WorksheetFeatureValueId {
        if (id == null) {
            throw new RangeError('id is null or undefined');
        }
        return id;
    }

    deepCopy(): NoSuchWorksheetFeatureValueDefinitionException {
        return new NoSuchWorksheetFeatureValueDefinitionException({ id: this.id });
    }

    equals(other: NoSuchWorksheetFeatureValueDefinitionException): boolean {
        if (!(this.id.equals(other.id))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): NoSuchWorksheetFeatureValueDefinitionException {
        var id: WorksheetFeatureValueId | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = WorksheetFeatureValueId.parse(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new NoSuchWorksheetFeatureValueDefinitionException({id: id});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    toString(): string {
        return "NoSuchWorksheetFeatureValueDefinitionException(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        return json;
    }

    private _id: WorksheetFeatureValueId;
}

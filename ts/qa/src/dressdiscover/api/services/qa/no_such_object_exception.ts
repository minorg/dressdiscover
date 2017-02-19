import { QaObjectId } from "../../models/qa/qa_object_id";

export class NoSuchObjectException {
    private _id?: QaObjectId;

    constructor(kwds: {id?: QaObjectId}) {
        this.id = kwds.id;
    }

    get id(): QaObjectId | undefined {
        return this._id;
    }

    set id(id: QaObjectId | undefined) {
        if (id != null) {

        }
        this._id = id;
    }

    static fromThryftJSON(json: any): NoSuchObjectException {
        var id: QaObjectId | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = QaObjectId.parse(json[fieldName]);
            }
        }

        return new NoSuchObjectException({id: id});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.id != null) {
            json["id"] = this.id.toString();
        }
        return json;
    }
}

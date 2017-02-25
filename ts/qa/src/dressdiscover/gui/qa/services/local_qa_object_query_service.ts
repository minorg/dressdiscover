import { NoSuchObjectException } from "dressdiscover/api/services/qa/no_such_object_exception";
import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { QaObjectId } from "dressdiscover/api/models/qa/qa_object_id";
import { AsyncToSyncQaObjectQueryService } from "dressdiscover/api/services/qa/async_to_sync_qa_object_query_service";

declare var OBJECTS: any[];

export class LocalQaObjectQueryService extends AsyncToSyncQaObjectQueryService {
    constructor() {
        super();
        for (let objectJson of OBJECTS) {
            const object = QaObject.fromThryftJSON(objectJson);
            this._objects.push(object);
            this._objectsById[object.id.toString()] = object;
        }
    }

    getObjectByIdSync(kwds: { id: QaObjectId }): QaObject {
        const object = this._objectsById[kwds.id.toString()];
        if (object) {
            return object;
        } else {
            throw new NoSuchObjectException(kwds.id);
        }
    }

    getObjectsSync(): QaObject[] {
        return this._objects;
    }

    private _objects: QaObject[] = [];
    private _objectsById: { [objectId: string]: QaObject } = {};
}
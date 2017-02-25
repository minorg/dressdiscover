import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaObjectQueryService } from "./qa_object_query_service";

export abstract class AsyncToSyncQaObjectQueryService implements QaObjectQueryService {
    getObjectByIdAsync(kwds: {id: QaObjectId, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: QaObject) => void}): void {
        try {
            kwds.success(this.getObjectByIdSync({id: kwds.id}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getObjectByIdSync(kwds: {id: QaObjectId}): QaObject;

    getObjectsAsync(kwds: {error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: QaObject[]) => void}): void {
        try {
            kwds.success(this.getObjectsSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getObjectsSync(): QaObject[];
}

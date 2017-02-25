import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaObjectQueryService } from "./qa_object_query_service";

export class LoggingQaObjectQueryService implements QaObjectQueryService {
    constructor(private delegate: LoggingQaObjectQueryService) {
    }

    getObjectByIdAsync(kwds: {id: QaObjectId, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: QaObject) => void}): void {
        this.delegate.getObjectByIdAsync({id: kwds.id, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("getObjectByIdAsync({", "id: ", kwds.id, "}) -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: (returnValue: QaObject) => { console.debug("getObjectByIdSync({", "id: ", kwds.id, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getObjectByIdSync(kwds: {id: QaObjectId}): QaObject {
        try {
            const __returnValue = this.delegate.getObjectByIdSync({id: kwds.id});
            console.debug("getObjectByIdSync({", "id: ", kwds.id, "}) -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getObjectByIdSync({", "id: ", kwds.id, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }

    getObjectsAsync(kwds: {error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: QaObject[]) => void}): void {
        this.delegate.getObjectsAsync({error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("getObjectsAsync() -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: (returnValue: QaObject[]) => { console.debug("getObjectsSync() -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getObjectsSync(): QaObject[] {
        try {
            const __returnValue = this.delegate.getObjectsSync();
            console.debug("getObjectsSync() -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getObjectsSync() -> exception");
            console.warn(e);
            throw e;
        }
    }
}

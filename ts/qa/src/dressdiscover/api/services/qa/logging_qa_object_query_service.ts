import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaObjectQueryService } from "./qa_object_query_service";

export class LoggingQaObjectQueryService implements QaObjectQueryService {
    constructor(private delegate: QaObjectQueryService) {
    }

    getObjectByIdAsync(kwds: {id: QaObjectId, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QaObject) => void}): void {
        this.delegate.getObjectByIdAsync({id: kwds.id, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("getObjectByIdAsync({", "id: ", kwds.id, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: QaObject) => { console.debug("getObjectByIdSync({", "id: ", kwds.id, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
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

    getObjectsAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QaObject[]) => void}): void {
        this.delegate.getObjectsAsync({error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("getObjectsAsync() -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: QaObject[]) => { console.debug("getObjectsSync() -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
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

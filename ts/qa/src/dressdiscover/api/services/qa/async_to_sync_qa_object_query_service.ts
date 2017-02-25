import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaObjectQueryService } from "./qa_object_query_service";

export abstract class AsyncToSyncQaObjectQueryService implements QaObjectQueryService {
    getObjectByIdAsync(kwds: {id: QaObjectId, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QaObject) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getObjectByIdSync({id: kwds.id}));
            } else {
                this.getObjectByIdSync({id: kwds.id});
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getObjectByIdSync(kwds: {id: QaObjectId}): QaObject;

    getObjectsAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QaObject[]) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getObjectsSync());
            } else {
                this.getObjectsSync();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getObjectsSync(): QaObject[];
}

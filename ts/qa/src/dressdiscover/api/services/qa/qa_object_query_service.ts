import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";

export interface QaObjectQueryService {
    getObjectByIdAsync(kwds: {id: QaObjectId, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QaObject) => void}): void;
    getObjectByIdSync(kwds: {id: QaObjectId}): QaObject;

    getObjectsAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QaObject[]) => void}): void;
    getObjectsSync(): QaObject[];
}

import { QaObject } from "dressdiscover/api/models/qa/qa_object";
//import { QaObjectId } from "dressdiscover/api/models/qa/qa_object_id";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class HomeViewModel extends ViewModel {
    constructor(objects: QaObject[]) {
        super();
        this._objects = objects;
    }

    get objects() {
        return this._objects;
    }

    private _objects: QaObject[];
}
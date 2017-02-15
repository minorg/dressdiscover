import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class ObjectsViewModel extends ViewModel {
    constructor(objects: QaObject[], questionSetsById: { [index: string]: QuestionSet }) {
        super();
        this._objects = objects;
        this._questionSetsById = questionSetsById;
    }

    get objects() {
        return this._objects;
    }

    onClickFullSize(object) {
        const el = $("#modal");
        el.html("<img src=\"" + object.image.fullSizeUrl + "\" id=\"full-size\">");
        (el as any).modal("show");
    }

    onClickQuestionSet(object, questionSet) {
        alert(questionSet.id);
    }

    get questionSetsById() {
        return this._questionSetsById;
    }

    private _objects: QaObject[];
    private _questionSetsById: { [index: string]: QuestionSet };
}
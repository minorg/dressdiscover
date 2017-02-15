import { Application } from "dressdiscover/gui/qa/application";
import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class ObjectsViewModel extends ViewModel {
    constructor(public readonly objects: QaObject[], public readonly questionSetsById: { [index: string]: QuestionSet }) {
        super();
    }

    onClickFullSize(object) {
        const el = $("#modal");
        el.html("<img src=\"" + object.image.fullSizeUrl + "\" id=\"full-size\">");
        (el as any).modal("show");
    }

    onClickQuestionSet(object, questionSet) {
        Application.instance.router.goToQuestions(object.id, questionSet.id);
        return false;
    }
}
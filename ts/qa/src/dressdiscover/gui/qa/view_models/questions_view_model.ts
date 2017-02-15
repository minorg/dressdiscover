import * as _ from "underscore";
import { Application } from "dressdiscover/gui/qa/application";
import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { Question } from "dressdiscover/api/models/qa/question";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class QuestionsViewModel extends ViewModel {
    constructor(public readonly object: QaObject, public readonly questionSet: QuestionSet, public readonly questions: Question[]) {
        super();
        _.bind(this.onClickQuestion, this);
    }

    onClickQuestion(object, question, questionSet) {
        Application.instance.router.goToQuestion(object.id, question.id, questionSet.id);
        return false;
    }
}

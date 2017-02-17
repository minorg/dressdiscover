import { Application } from "dressdiscover/gui/qa/application";
import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { Question } from "dressdiscover/api/models/qa/question";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class QuestionsViewModel extends ViewModel {
    constructor(public readonly object: QaObject, public readonly questionSet: QuestionSet, public readonly questions: Question[]) {
        super();
    }

    onClickFirstQuestion() {
        Application.instance.router.goToQuestion(this.object.id, this.questions[0].id, this.questionSet.id)
        return false;
    }

    onClickQuestion(self, question) {
        Application.instance.router.goToQuestion(self.object.id, question.id, self.questionSet.id);
        return false;
    }
}

import { Application } from "dressdiscover/gui/qa/application";
import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { Question } from "dressdiscover/api/models/qa/question";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class QuestionViewModel extends ViewModel {
    constructor(public readonly object: QaObject, public readonly questionSet: QuestionSet, public readonly questions: Question[], public readonly currentQuestion?: Question) {
        super();
        if (currentQuestion) {
            for (this._currentQuestionIndex = 0; this._currentQuestionIndex < questions.length; this._currentQuestionIndex++) {
                if (currentQuestion.id == questions[this._currentQuestionIndex].id) {
                    break;
                }
            }
        }
    }

    get nextQuestionButtonEnabled() {
        return this._currentQuestionIndex && this._currentQuestionIndex + 1 < this.questions.length;
    }
    
    onClickNextQuestionButton() {
        Application.instance.router.goToQuestion(this.object.id, this.questions[this._currentQuestionIndex + 1].id, this.questionSet.id);
        return false;
    }

    onClickQuestionLink(self, question) {
        Application.instance.router.goToQuestion(self.object.id, question.id, self.questionSet.id);
        return false;
    }

    onClickPreviousQuestionButton() {
        Application.instance.router.goToQuestion(this.object.id, this.questions[this._currentQuestionIndex - 1].id, this.questionSet.id);
        return false;
    }

    get previousQuestionButtonEnabled() {
        return this._currentQuestionIndex && this._currentQuestionIndex > 0;
    }

    private _currentQuestionIndex: number | undefined;
}

import * as ko from "knockout";
import * as _ from "underscore";
import { Answer } from "dressdiscover/api/models/qa/answer";
import { Application } from "dressdiscover/gui/qa/application";
import { QaObject } from "dressdiscover/api/models/qa/qa_object";
import { QaUserId } from "dressdiscover/api/models/qa/qa_user_id";
import { Question } from "dressdiscover/api/models/qa/question";
import { QuestionSet } from "dressdiscover/api/models/qa/question_set";
import { QuestionType } from "dressdiscover/api/models/qa/question_type";
import { QuestionValueId } from "dressdiscover/api/models/qa/question_value_id";
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
            this._currentQuestionType = QuestionType[currentQuestion.type_];
        }
    }

    get currentQuestionType() {
        return this._currentQuestionType;
    }

    private _goToNext() {
        if (_.isNumber(this._currentQuestionIndex) && this._currentQuestionIndex + 1 < this.questions.length) {
            Application.instance.router.goToQuestion(this.object.id, this.questions[this._currentQuestionIndex + 1].id, this.questionSet.id);
        } else {
            // TODO: go to answers
        }
    }

    private _goToPreviousQuestion() {
        Application.instance.router.goToQuestion(this.object.id, this.questions[this._currentQuestionIndex - 1].id, this.questionSet.id);
    }

    get nextButtonText() {
        if (_.isNumber(this._currentQuestionIndex) && this._currentQuestionIndex + 1 < this.questions.length) {
            return "Next question";
        } else {
            return "Answers";
        }
    }
    
    onClickNextButton() {
        this._submit()
        this._goToNext();
        return false;
    }

    onClickQuestionLink(self, question) {
        Application.instance.router.goToQuestion(self.object.id, question.id, self.questionSet.id);
        return false;
    }

    onClickPreviousQuestionButton() {
        this._submit();
        this._goToPreviousQuestion();
        return false;
    }

    onClickSubmitButton() {
        this._submit();
        this._goToNext();
    }

    get previousQuestionButtonEnabled() {
        return _.isNumber(this._currentQuestionIndex) && this._currentQuestionIndex > 0;
    }

    private _submit() {
        if (!this.currentQuestion) {
            return;
        }
        var answer: Answer;
        const userId = Application.instance.session.currentUserId as QaUserId;
        switch (this.currentQuestion.type_) {
            case QuestionType.SELECT_MULTIPLE:
            case QuestionType.SELECT_ONE: {
                if (this.selectedValueIds().length == 0) {
                    return;
                }
                var selectedValueIds: QuestionValueId[] = [];
                for (let selectedValueId of this.selectedValueIds()) {
                    selectedValueIds.push(selectedValueId);
                }
                answer = new Answer({ objectId: this.object.id, questionId: this.currentQuestion.id, userId: userId, selectedValues: selectedValueIds });
            }
            break;

            case QuestionType.TEXT: {
                let answerText = this.answerText();
                if (!answerText) {
                    return;
                }
                answer = new Answer({ objectId: this.object.id, questionId: this.currentQuestion.id, userId: userId, text: answerText });
            }
            break;
            default:
                throw new Error("not implemented: " + this.currentQuestionType);
        }
        Application.instance.services.commandService.putAnswerSync({ answer: answer });
    }

    public answerText = ko.observable<string>();
    public selectedValueIds = ko.observableArray<QuestionValueId>();
    private _currentQuestionIndex: number | undefined;
    private _currentQuestionType: string | undefined;
}

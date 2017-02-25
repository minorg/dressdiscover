import * as ko from "knockout";
import * as _ from "underscore";
import { Answer } from "dressdiscover/api/models/qa/answer";
import { AnswerValue } from "dressdiscover/api/models/qa/answer_value";
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
            if (currentQuestion.valueRange) {
                for (var i = currentQuestion.valueRange.start; i < currentQuestion.valueRange.stop; i += currentQuestion.valueRange.step) {
                    this._currentQuestionValueRange.push({ i32: currentQuestion.valueRange.step > 1 ? (i + currentQuestion.valueRange.step / 2) : i, text: i + "-" + (i + currentQuestion.valueRange.step) });
                }
            }
        }
    }

    get currentQuestionType() {
        return this._currentQuestionType;
    }

    get currentQuestionValueRange() {
        return this._currentQuestionValueRange;
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
        this._submit(() => this._goToNext());
        return false;
    }

    onClickQuestionLink(self, question) {
        Application.instance.router.goToQuestion(self.object.id, question.id, self.questionSet.id);
        return false;
    }

    onClickPreviousQuestionButton() {
        this._submit(() => this._goToPreviousQuestion());
        return false;
    }

    onClickSubmitButton() {
        this._submit(() => this._goToNext());
    }

    get previousQuestionButtonEnabled() {
        return _.isNumber(this._currentQuestionIndex) && this._currentQuestionIndex > 0;
    }

    private _submit(complete: () => void) {
        if (!this.currentQuestion) {
            return;
        }
        const values: AnswerValue[] = [];
        switch (this.currentQuestion.type_) {
            case QuestionType.DATE_RANGE: {
                if (this.selectedValueI32s().length == 0) {
                    return;
                }
                for (let selectedValueI32 of this.selectedValueI32s()) {
                    values.push(new AnswerValue({ valueI32: selectedValueI32 }));
                }
            }
            break;
                
            case QuestionType.SELECT_MULTIPLE:
            case QuestionType.SELECT_ONE: {
                if (this.selectedValueIds().length == 0) {
                    return;
                }
                for (let selectedValueId of this.selectedValueIds()) {
                    values.push(new AnswerValue({ valueId: selectedValueId }));
                }
            }
            break;

            case QuestionType.TEXT: {
                let answerText = this.answerText();
                if (!answerText) {
                    return;
                }
                values.push(new AnswerValue({ valueString: answerText }));
            }
            break;
            default:
                throw new Error("not implemented: " + this.currentQuestionType);
        }
        const answer = new Answer({ objectId: this.object.id, questionId: this.currentQuestion.id, userId: Application.instance.session.currentUserId as QaUserId, values: values });
        Application.instance.services.answerCommandService.putAnswerAsync({ answer: answer });
    }

    public answerText = ko.observable<string>();
    public selectedValueI32s = ko.observableArray<number>();
    public selectedValueIds = ko.observableArray<QuestionValueId>();
    private _currentQuestionIndex: number | undefined;
    private _currentQuestionType: string | undefined;
    private _currentQuestionValueRange: { i32: number, text: string }[] = [];
}

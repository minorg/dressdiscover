import { QaObjectId } from "./qa_object_id";
import { QaUserId } from "./qa_user_id";
import { QuestionId } from "./question_id";
import { QuestionValueId } from "./question_value_id";

export class Answer {
    private _objectId: QaObjectId;

    private _questionId: QuestionId;

    private _selectedValues?: QuestionValueId[];

    private _text?: string;

    private _userId: QaUserId;

    constructor(objectId: QaObjectId, questionId: QuestionId, userId: QaUserId, selectedValues?: QuestionValueId[], text?: string) {
        this.objectId = objectId;
        this.questionId = questionId;
        this.userId = userId;
        this.selectedValues = selectedValues;
        this.text = text;
    }

    get objectId(): QaObjectId {
        return this._objectId;
    }

    set objectId(objectId: QaObjectId) {
        this._objectId = objectId;
    }

    get questionId(): QuestionId {
        return this._questionId;
    }

    set questionId(questionId: QuestionId) {
        this._questionId = questionId;
    }

    get userId(): QaUserId {
        return this._userId;
    }

    set userId(userId: QaUserId) {
        this._userId = userId;
    }

    get selectedValues(): QuestionValueId[] | undefined {
        return this._selectedValues;
    }

    set selectedValues(selectedValues: QuestionValueId[] | undefined) {
        if (selectedValues != null) {
            if (selectedValues.length < 1) {
                throw new RangeError("expected len(selectedValues) to be >= 1, was " + selectedValues.length)
            }
        }
        this._selectedValues = selectedValues;
    }

    get text(): string | undefined {
        return this._text;
    }

    set text(text: string | undefined) {
        if (text != null) {
            if (text.trim().length == 0) {
                throw new RangeError('text is blank');
            }
            if (text.length < 1) {
                throw new RangeError("expected len(text) to be >= 1, was " + text.length)
            }
        }
        this._text = text;
    }

    static fromThryftJSON(json: any): Answer {
        var objectId: QaObjectId | undefined;
        var questionId: QuestionId | undefined;
        var userId: QaUserId | undefined;
        var selectedValues: QuestionValueId[] | undefined;
        var text: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "object_id") {
                objectId = QaObjectId.parse(json[fieldName]);
            } else if (fieldName == "question_id") {
                questionId = QuestionId.parse(json[fieldName]);
            } else if (fieldName == "user_id") {
                userId = QaUserId.parse(json[fieldName]);
            } else if (fieldName == "selected_values") {
                selectedValues = function(json: any[]): QuestionValueId[] { var sequence: QuestionValueId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionValueId.parse(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            }
        }
        if (objectId == null) {
            throw new TypeError('objectId is required');
        }
        if (questionId == null) {
            throw new TypeError('questionId is required');
        }
        if (userId == null) {
            throw new TypeError('userId is required');
        }
        return new Answer(objectId, questionId, userId, selectedValues, text);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["object_id"] = this.objectId.toString();
        json["question_id"] = this.questionId.toString();
        json["user_id"] = this.userId.toString();
        if (this.selectedValues != null) {
            json["selected_values"] = function (__inArray: QuestionValueId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.selectedValues);
        }
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }
}

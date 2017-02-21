import { AnswerValue } from "./answer_value";
import { QaObjectId } from "./qa_object_id";
import { QaUserId } from "./qa_user_id";
import { QuestionId } from "./question_id";

export class Answer {
    private _objectId: QaObjectId;

    private _questionId: QuestionId;

    private _userId: QaUserId;

    private _values: AnswerValue[];

    constructor(kwds: {objectId: QaObjectId, questionId: QuestionId, userId: QaUserId, values: AnswerValue[]}) {
        this.objectId = kwds.objectId;
        this.questionId = kwds.questionId;
        this.userId = kwds.userId;
        this.values = kwds.values;
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

    get values(): AnswerValue[] {
        return this._values;
    }

    set values(values: AnswerValue[]) {
        if (values.length < 1) {
            throw new RangeError("expected len(values) to be >= 1, was " + values.length)
        }
        this._values = values;
    }

    static fromThryftJSON(json: any): Answer {
        var objectId: QaObjectId | undefined;
        var questionId: QuestionId | undefined;
        var userId: QaUserId | undefined;
        var values: AnswerValue[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "object_id") {
                objectId = QaObjectId.parse(json[fieldName]);
            } else if (fieldName == "question_id") {
                questionId = QuestionId.parse(json[fieldName]);
            } else if (fieldName == "user_id") {
                userId = QaUserId.parse(json[fieldName]);
            } else if (fieldName == "values") {
                values = function(json: any[]): AnswerValue[] { var sequence: AnswerValue[] = []; for (var i = 0; i < json.length; i++) { sequence.push(AnswerValue.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
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
        if (values == null) {
            throw new TypeError('values is required');
        }
        return new Answer({objectId: objectId, questionId: questionId, userId: userId, values: values});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["object_id"] = this.objectId.toString();
        json["question_id"] = this.questionId.toString();
        json["user_id"] = this.userId.toString();
        json["values"] = function (__inArray: AnswerValue[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values);
        return json;
    }
}

import { Answer } from "./answer";

export class AnswerSet {
    private _answers?: Answer[];

    private _objectId: string;

    private _questionSetId: string;

    private _userId: string;

    constructor(objectId: string, questionSetId: string, userId: string, answers?: Answer[]) {
        this.objectId = objectId;
        this.questionSetId = questionSetId;
        this.userId = userId;
        this.answers = answers;
    }

    get objectId(): string {
        return this._objectId;
    }

    set objectId(objectId: string) {
        if (objectId.trim().length == 0) {
            throw new RangeError('objectId is blank');
        }
        if (objectId.length > 36) {
            throw new RangeError("expected len(objectId) to be <= 36, was " + objectId.length)
        }
        if (objectId.length < 36) {
            throw new RangeError("expected len(objectId) to be >= 36, was " + objectId.length)
        }
        this._objectId = objectId;
    }

    get questionSetId(): string {
        return this._questionSetId;
    }

    set questionSetId(questionSetId: string) {
        if (questionSetId.trim().length == 0) {
            throw new RangeError('questionSetId is blank');
        }
        if (questionSetId.length > 36) {
            throw new RangeError("expected len(questionSetId) to be <= 36, was " + questionSetId.length)
        }
        if (questionSetId.length < 36) {
            throw new RangeError("expected len(questionSetId) to be >= 36, was " + questionSetId.length)
        }
        this._questionSetId = questionSetId;
    }

    get userId(): string {
        return this._userId;
    }

    set userId(userId: string) {
        if (userId.trim().length == 0) {
            throw new RangeError('userId is blank');
        }
        if (userId.length < 1) {
            throw new RangeError("expected len(userId) to be >= 1, was " + userId.length)
        }
        this._userId = userId;
    }

    get answers(): Answer[] | undefined {
        return this._answers;
    }

    set answers(answers: Answer[] | undefined) {
        if (answers != null) {
            if (answers.length < 1) {
                throw new RangeError("expected len(answers) to be >= 1, was " + answers.length)
            }
        }
        this._answers = answers;
    }

    static fromThryftJSON(json: any): AnswerSet {
        var objectId: string | undefined;
        var questionSetId: string | undefined;
        var userId: string | undefined;
        var answers: Answer[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "object_id") {
                objectId = json[fieldName];
            } else if (fieldName == "question_set_id") {
                questionSetId = json[fieldName];
            } else if (fieldName == "user_id") {
                userId = json[fieldName];
            } else if (fieldName == "answers") {
                answers = function(json: any[]): Answer[] { var sequence: Answer[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Answer.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (objectId == null) {
            throw new TypeError('objectId is required');
        }
        if (questionSetId == null) {
            throw new TypeError('questionSetId is required');
        }
        if (userId == null) {
            throw new TypeError('userId is required');
        }
        return new AnswerSet(objectId, questionSetId, userId, answers);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["object_id"] = this.objectId;
        json["question_set_id"] = this.questionSetId;
        json["user_id"] = this.userId;
        if (this.answers != null) {
            json["answers"] = function (__inArray: Answer[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.answers);
        }
        return json;
    }
}

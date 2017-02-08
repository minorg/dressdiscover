import { Question } from "./question";

export class QuestionSet {
    private _id: string;

    private _questions: Question[];

    constructor(id: string, questions: Question[]) {
        this.id = id;
        this.questions = questions;
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length > 36) {
            throw new RangeError("expected len(id) to be <= 36, was " + id.length)
        }
        if (id.length < 36) {
            throw new RangeError("expected len(id) to be >= 36, was " + id.length)
        }
        this._id = id;
    }

    get questions(): Question[] {
        return this._questions;
    }

    set questions(questions: Question[]) {
        if (questions.length < 1) {
            throw new RangeError("expected len(questions) to be >= 1, was " + questions.length)
        }
        this._questions = questions;
    }

    static fromThryftJSON(json: any): QuestionSet {
        var id: string | undefined;
        var questions: Question[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "questions") {
                questions = function(json: any[]): Question[] { var sequence: Question[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Question.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        if (questions == null) {
            throw new TypeError('questions is required');
        }
        return new QuestionSet(id, questions);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        json["questions"] = function (__inArray: Question[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.questions);
        return json;
    }
}

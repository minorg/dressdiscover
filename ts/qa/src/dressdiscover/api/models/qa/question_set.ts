import { Question } from "./question";

export class QuestionSet {
    private _id: string;

    private _questions: Question[];

    private _title: string;

    constructor(id: string, questions: Question[], title: string) {
        this.id = id;
        this.questions = questions;
        this.title = title;
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

    get title(): string {
        return this._title;
    }

    set title(title: string) {
        if (title.trim().length == 0) {
            throw new RangeError('title is blank');
        }
        if (title.length < 1) {
            throw new RangeError("expected len(title) to be >= 1, was " + title.length)
        }
        this._title = title;
    }

    static fromThryftJSON(json: any): QuestionSet {
        var id: string | undefined;
        var questions: Question[] | undefined;
        var title: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "questions") {
                questions = function(json: any[]): Question[] { var sequence: Question[] = []; for (var i = 0; i < json.length; i++) { sequence.push(Question.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "title") {
                title = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        if (questions == null) {
            throw new TypeError('questions is required');
        }
        if (title == null) {
            throw new TypeError('title is required');
        }
        return new QuestionSet(id, questions, title);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        json["questions"] = function (__inArray: Question[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.questions);
        json["title"] = this.title;
        return json;
    }
}

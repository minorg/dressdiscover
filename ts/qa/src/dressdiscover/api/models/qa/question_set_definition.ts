import { QuestionDefinition } from "./question_definition";

export class QuestionSetDefinition {
    private _questions: QuestionDefinition[];

    constructor(questions: QuestionDefinition[]) {
        this.questions = questions;
    }

    get questions(): QuestionDefinition[] {
        return this._questions;
    }

    set questions(questions: QuestionDefinition[]) {
        if (questions.length < 1) {
            throw new RangeError("expected len(questions) to be >= 1, was " + questions.length)
        }
        this._questions = questions;
    }

    static fromThryftJSON(json: any): QuestionSetDefinition {
        var questions: QuestionDefinition[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "questions") {
                questions = function(json: any[]): QuestionDefinition[] { var sequence: QuestionDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionDefinition.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (questions == null) {
            throw new TypeError('questions is required');
        }
        return new QuestionSetDefinition(questions);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["questions"] = function (__inArray: QuestionDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.questions);
        return json;
    }
}

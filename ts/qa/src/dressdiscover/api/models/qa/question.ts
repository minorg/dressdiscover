import { QuestionId } from "./question_id";
import { QuestionValue } from "./question_value";

export class Question {
    private _id: QuestionId;

    private _text: string;

    private _values?: QuestionValue[];

    constructor(id: QuestionId, text: string, values?: QuestionValue[]) {
        this.id = id;
        this.text = text;
        this.values = values;
    }

    get id(): QuestionId {
        return this._id;
    }

    set id(id: QuestionId) {
        this._id = id;
    }

    get text(): string {
        return this._text;
    }

    set text(text: string) {
        if (text.trim().length == 0) {
            throw new RangeError('text is blank');
        }
        if (text.length < 1) {
            throw new RangeError("expected len(text) to be >= 1, was " + text.length)
        }
        this._text = text;
    }

    get values(): QuestionValue[] | undefined {
        return this._values;
    }

    set values(values: QuestionValue[] | undefined) {
        if (values != null) {
            if (values.length < 1) {
                throw new RangeError("expected len(values) to be >= 1, was " + values.length)
            }
        }
        this._values = values;
    }

    static fromThryftJSON(json: any): Question {
        var id: QuestionId | undefined;
        var text: string | undefined;
        var values: QuestionValue[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = QuestionId.parse(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            } else if (fieldName == "values") {
                values = function(json: any[]): QuestionValue[] { var sequence: QuestionValue[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionValue.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        if (text == null) {
            throw new TypeError('text is required');
        }
        return new Question(id, text, values);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        json["text"] = this.text;
        if (this.values != null) {
            json["values"] = function (__inArray: QuestionValue[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values);
        }
        return json;
    }
}

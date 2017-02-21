import { QuestionId } from "./question_id";
import { QuestionType } from "./question_type";
import { QuestionValue } from "./question_value";
import { QuestionValueRange } from "./question_value_range";

export class Question {
    private _id: QuestionId;

    private _text: string;

    private _type_: QuestionType;

    private _valueRange?: QuestionValueRange;

    private _values?: QuestionValue[];

    constructor(kwds: {id: QuestionId, text: string, type_: QuestionType, valueRange?: QuestionValueRange, values?: QuestionValue[]}) {
        this.id = kwds.id;
        this.text = kwds.text;
        this.type_ = kwds.type_;
        this.valueRange = kwds.valueRange;
        this.values = kwds.values;
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

    get type_(): QuestionType {
        return this._type_;
    }

    set type_(type_: QuestionType) {
        this._type_ = type_;
    }

    get valueRange(): QuestionValueRange | undefined {
        return this._valueRange;
    }

    set valueRange(valueRange: QuestionValueRange | undefined) {
        if (valueRange != null) {

        }
        this._valueRange = valueRange;
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
        var type_: QuestionType | undefined;
        var valueRange: QuestionValueRange | undefined;
        var values: QuestionValue[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = QuestionId.parse(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            } else if (fieldName == "type_") {
                type_ = QuestionType[json[fieldName] as string];
            } else if (fieldName == "value_range") {
                valueRange = QuestionValueRange.fromThryftJSON(json[fieldName]);
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
        if (type_ == null) {
            throw new TypeError('type_ is required');
        }
        return new Question({id: id, text: text, type_: type_, valueRange: valueRange, values: values});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        json["text"] = this.text;
        json["type_"] = QuestionType[this.type_];
        if (this.valueRange != null) {
            json["value_range"] = this.valueRange.toThryftJSON();
        }
        if (this.values != null) {
            json["values"] = function (__inArray: QuestionValue[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values);
        }
        return json;
    }
}

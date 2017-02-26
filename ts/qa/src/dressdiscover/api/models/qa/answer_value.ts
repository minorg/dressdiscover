import { QuestionValueId } from "./question_value_id";

export class AnswerValue {
    private _valueI32?: number;

    private _valueId?: QuestionValueId;

    private _valueString?: string;

    constructor(kwds: {valueI32?: number, valueId?: QuestionValueId, valueString?: string}) {
        this.valueI32 = kwds.valueI32;
        this.valueId = kwds.valueId;
        this.valueString = kwds.valueString;
    }

    get valueI32(): number | undefined {
        return this._valueI32;
    }

    set valueI32(valueI32: number | undefined) {
        if (valueI32 != null) {

        }
        this._valueI32 = valueI32;
    }

    get valueId(): QuestionValueId | undefined {
        return this._valueId;
    }

    set valueId(valueId: QuestionValueId | undefined) {
        if (valueId != null) {

        }
        this._valueId = valueId;
    }

    get valueString(): string | undefined {
        return this._valueString;
    }

    set valueString(valueString: string | undefined) {
        if (valueString != null) {
            if (valueString.trim().length == 0) {
                throw new RangeError('valueString is blank');
            }
            if (valueString.length < 1) {
                throw new RangeError("expected len(valueString) to be >= 1, was " + valueString.length)
            }
        }
        this._valueString = valueString;
    }

    static fromThryftJSON(json: any): AnswerValue {
        var valueI32: number | undefined;
        var valueId: QuestionValueId | undefined;
        var valueString: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "value_i32" || fieldName == "1:value_i32") {
                valueI32 = json[fieldName];
            } else if (fieldName == "value_id" || fieldName == "2:value_id") {
                valueId = QuestionValueId.parse(json[fieldName]);
            } else if (fieldName == "value_string" || fieldName == "3:value_string") {
                valueString = json[fieldName];
            }
        }

        return new AnswerValue({valueI32: valueI32, valueId: valueId, valueString: valueString});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.valueI32 != null) {
            json["1:value_i32"] = this.valueI32;
        }
        if (this.valueId != null) {
            json["2:value_id"] = this.valueId.toString();
        }
        if (this.valueString != null) {
            json["3:value_string"] = this.valueString;
        }
        return json;
    }
}

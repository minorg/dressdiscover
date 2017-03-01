import { QuestionValueId } from "./question_value_id";

export class AnswerValue {
    private _valueColor?: string;

    private _valueI32?: number;

    private _valueId?: QuestionValueId;

    private _valueString?: string;

    constructor(kwds: {valueColor?: string, valueI32?: number, valueId?: QuestionValueId, valueString?: string}) {
        this.valueColor = kwds.valueColor;
        this.valueI32 = kwds.valueI32;
        this.valueId = kwds.valueId;
        this.valueString = kwds.valueString;
    }

    get valueColor(): string | undefined {
        return this._valueColor;
    }

    set valueColor(valueColor: string | undefined) {
        if (valueColor != null) {
            if (valueColor.trim().length == 0) {
                throw new RangeError('valueColor is blank');
            }
            if (valueColor.length > 6) {
                throw new RangeError("expected len(valueColor) to be <= 6, was " + valueColor.length)
            }
            if (valueColor.length < 6) {
                throw new RangeError("expected len(valueColor) to be >= 6, was " + valueColor.length)
            }
        }
        this._valueColor = valueColor;
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
        var valueColor: string | undefined;
        var valueI32: number | undefined;
        var valueId: QuestionValueId | undefined;
        var valueString: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "value_color" || fieldName == "4:value_color") {
                valueColor = json[fieldName];
            } else if (fieldName == "value_i32" || fieldName == "1:value_i32") {
                valueI32 = json[fieldName];
            } else if (fieldName == "value_id" || fieldName == "2:value_id") {
                valueId = QuestionValueId.parse(json[fieldName]);
            } else if (fieldName == "value_string" || fieldName == "3:value_string") {
                valueString = json[fieldName];
            }
        }

        return new AnswerValue({valueColor: valueColor, valueI32: valueI32, valueId: valueId, valueString: valueString});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.valueColor != null) {
            json["4:value_color"] = this.valueColor;
        }
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

import { QuestionValueDefinition } from "./question_value_definition";

export class QuestionDefinition {
    private _id: string;

    private _values_?: QuestionValueDefinition[];

    constructor(id: string, values_?: QuestionValueDefinition[]) {
        this.id = id;
        this.values_ = values_;
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        this._id = id;
    }

    get values_(): QuestionValueDefinition[] | undefined {
        return this._values_;
    }

    set values_(values_: QuestionValueDefinition[] | undefined) {
        if (values_ != null) {
            if (values_.length < 1) {
                throw new RangeError("expected len(values_) to be >= 1, was " + values_.length)
            }
        }
        this._values_ = values_;
    }

    static fromThryftJSON(json: any): QuestionDefinition {
        var id: string | undefined;
        var values_: QuestionValueDefinition[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "values_") {
                values_ = function(json: any[]): QuestionValueDefinition[] { var sequence: QuestionValueDefinition[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionValueDefinition.fromThryftJSON(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        return new QuestionDefinition(id, values_);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        if (this.values_ != null) {
            json["values_"] = function (__inArray: QuestionValueDefinition[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toThryftJSON()); } return __outArray; }(this.values_);
        }
        return json;
    }
}

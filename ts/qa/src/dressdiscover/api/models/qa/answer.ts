export class Answer {
    private _questionId: string;

    private _selectedValues?: string[];

    private _text?: string;

    constructor(questionId: string, selectedValues?: string[], text?: string) {
        this.questionId = questionId;
        this.selectedValues = selectedValues;
        this.text = text;
    }

    get questionId(): string {
        return this._questionId;
    }

    set questionId(questionId: string) {
        if (questionId.trim().length == 0) {
            throw new RangeError('questionId is blank');
        }
        if (questionId.length > 36) {
            throw new RangeError("expected len(questionId) to be <= 36, was " + questionId.length)
        }
        if (questionId.length < 36) {
            throw new RangeError("expected len(questionId) to be >= 36, was " + questionId.length)
        }
        this._questionId = questionId;
    }

    get selectedValues(): string[] | undefined {
        return this._selectedValues;
    }

    set selectedValues(selectedValues: string[] | undefined) {
        if (selectedValues != null) {
            if (selectedValues.length < 1) {
                throw new RangeError("expected len(selectedValues) to be >= 1, was " + selectedValues.length)
            }
        }
        this._selectedValues = selectedValues;
    }

    get text(): string | undefined {
        return this._text;
    }

    set text(text: string | undefined) {
        if (text != null) {
            if (text.trim().length == 0) {
                throw new RangeError('text is blank');
            }
            if (text.length < 1) {
                throw new RangeError("expected len(text) to be >= 1, was " + text.length)
            }
        }
        this._text = text;
    }

    static fromThryftJSON(json: any): Answer {
        var questionId: string | undefined;
        var selectedValues: string[] | undefined;
        var text: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "question_id") {
                questionId = json[fieldName];
            } else if (fieldName == "selected_values") {
                selectedValues = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            }
        }
        if (questionId == null) {
            throw new TypeError('questionId is required');
        }
        return new Answer(questionId, selectedValues, text);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["question_id"] = this.questionId;
        if (this.selectedValues != null) {
            json["selected_values"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.selectedValues);
        }
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }
}

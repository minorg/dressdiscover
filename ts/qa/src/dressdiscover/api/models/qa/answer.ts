export class Answer {
    private _objectId: string;

    private _questionId: string;

    private _selectedValues?: string[];

    private _text?: string;

    private _userId: string;

    constructor(objectId: string, questionId: string, userId: string, selectedValues?: string[], text?: string) {
        this.objectId = objectId;
        this.questionId = questionId;
        this.userId = userId;
        this.selectedValues = selectedValues;
        this.text = text;
    }

    get objectId(): string {
        return this._objectId;
    }

    set objectId(objectId: string) {
        if (objectId.trim().length == 0) {
            throw new RangeError('objectId is blank');
        }
        if (objectId.length > 24) {
            throw new RangeError("expected len(objectId) to be <= 24, was " + objectId.length)
        }
        if (objectId.length < 24) {
            throw new RangeError("expected len(objectId) to be >= 24, was " + objectId.length)
        }
        this._objectId = objectId;
    }

    get questionId(): string {
        return this._questionId;
    }

    set questionId(questionId: string) {
        if (questionId.trim().length == 0) {
            throw new RangeError('questionId is blank');
        }
        if (questionId.length > 24) {
            throw new RangeError("expected len(questionId) to be <= 24, was " + questionId.length)
        }
        if (questionId.length < 24) {
            throw new RangeError("expected len(questionId) to be >= 24, was " + questionId.length)
        }
        this._questionId = questionId;
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
        var objectId: string | undefined;
        var questionId: string | undefined;
        var userId: string | undefined;
        var selectedValues: string[] | undefined;
        var text: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "object_id") {
                objectId = json[fieldName];
            } else if (fieldName == "question_id") {
                questionId = json[fieldName];
            } else if (fieldName == "user_id") {
                userId = json[fieldName];
            } else if (fieldName == "selected_values") {
                selectedValues = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            }
        }
        if (objectId == null) {
            throw new TypeError('objectId is required');
        }
        if (questionId == null) {
            throw new TypeError('questionId is required');
        }
        if (userId == null) {
            throw new TypeError('userId is required');
        }
        return new Answer(objectId, questionId, userId, selectedValues, text);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["object_id"] = this.objectId;
        json["question_id"] = this.questionId;
        json["user_id"] = this.userId;
        if (this.selectedValues != null) {
            json["selected_values"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.selectedValues);
        }
        if (this.text != null) {
            json["text"] = this.text;
        }
        return json;
    }
}

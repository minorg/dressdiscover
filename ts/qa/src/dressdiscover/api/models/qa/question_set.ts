export class QuestionSet {
    private _id: string;

    private _questionIds: string[];

    private _title: string;

    constructor(id: string, questionIds: string[], title: string) {
        this.id = id;
        this.questionIds = questionIds;
        this.title = title;
    }

    get id(): string {
        return this._id;
    }

    set id(id: string) {
        if (id.trim().length == 0) {
            throw new RangeError('id is blank');
        }
        if (id.length > 24) {
            throw new RangeError("expected len(id) to be <= 24, was " + id.length)
        }
        if (id.length < 24) {
            throw new RangeError("expected len(id) to be >= 24, was " + id.length)
        }
        this._id = id;
    }

    get questionIds(): string[] {
        return this._questionIds;
    }

    set questionIds(questionIds: string[]) {
        if (questionIds.length < 1) {
            throw new RangeError("expected len(questionIds) to be >= 1, was " + questionIds.length)
        }
        this._questionIds = questionIds;
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
        var questionIds: string[] | undefined;
        var title: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "question_ids") {
                questionIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
            } else if (fieldName == "title") {
                title = json[fieldName];
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        if (questionIds == null) {
            throw new TypeError('questionIds is required');
        }
        if (title == null) {
            throw new TypeError('title is required');
        }
        return new QuestionSet(id, questionIds, title);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        json["question_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.questionIds);
        json["title"] = this.title;
        return json;
    }
}

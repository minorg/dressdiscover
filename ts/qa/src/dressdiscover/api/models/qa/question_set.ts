import { QuestionId } from "./question_id";
import { QuestionSetId } from "./question_set_id";

export class QuestionSet {
    private _description?: string;

    private _id: QuestionSetId;

    private _questionIds: QuestionId[];

    private _title: string;

    constructor(id: QuestionSetId, questionIds: QuestionId[], title: string, description?: string) {
        this.id = id;
        this.questionIds = questionIds;
        this.title = title;
        this.description = description;
    }

    get id(): QuestionSetId {
        return this._id;
    }

    set id(id: QuestionSetId) {
        this._id = id;
    }

    get questionIds(): QuestionId[] {
        return this._questionIds;
    }

    set questionIds(questionIds: QuestionId[]) {
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

    get description(): string | undefined {
        return this._description;
    }

    set description(description: string | undefined) {
        if (description != null) {
            if (description.trim().length == 0) {
                throw new RangeError('description is blank');
            }
            if (description.length < 1) {
                throw new RangeError("expected len(description) to be >= 1, was " + description.length)
            }
        }
        this._description = description;
    }

    static fromThryftJSON(json: any): QuestionSet {
        var id: QuestionSetId | undefined;
        var questionIds: QuestionId[] | undefined;
        var title: string | undefined;
        var description: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = QuestionSetId.parse(json[fieldName]);
            } else if (fieldName == "question_ids") {
                questionIds = function(json: any[]): QuestionId[] { var sequence: QuestionId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionId.parse(json[i])); } return sequence; }(json[fieldName]);
            } else if (fieldName == "title") {
                title = json[fieldName];
            } else if (fieldName == "description") {
                description = json[fieldName];
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
        return new QuestionSet(id, questionIds, title, description);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        json["question_ids"] = function (__inArray: QuestionId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.questionIds);
        json["title"] = this.title;
        if (this.description != null) {
            json["description"] = this.description;
        }
        return json;
    }
}

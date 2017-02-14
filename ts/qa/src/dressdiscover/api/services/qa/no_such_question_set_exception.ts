import { QuestionSetId } from "../../models/qa/question_set_id";

export class NoSuchQuestionSetException {
    private _id?: QuestionSetId;

    constructor(id?: QuestionSetId) {
        this.id = id;
    }

    get id(): QuestionSetId | undefined {
        return this._id;
    }

    set id(id: QuestionSetId | undefined) {
        if (id != null) {

        }
        this._id = id;
    }

    static fromThryftJSON(json: any): NoSuchQuestionSetException {
        var id: QuestionSetId | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = QuestionSetId.parse(json[fieldName]);
            }
        }

        return new NoSuchQuestionSetException(id);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.id != null) {
            json["id"] = this.id.toString();
        }
        return json;
    }
}

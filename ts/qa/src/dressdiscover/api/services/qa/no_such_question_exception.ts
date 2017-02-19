import { QuestionId } from "../../models/qa/question_id";

export class NoSuchQuestionException {
    private _id?: QuestionId;

    constructor(kwds: {id?: QuestionId}) {
        this.id = kwds.id;
    }

    get id(): QuestionId | undefined {
        return this._id;
    }

    set id(id: QuestionId | undefined) {
        if (id != null) {

        }
        this._id = id;
    }

    static fromThryftJSON(json: any): NoSuchQuestionException {
        var id: QuestionId | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = QuestionId.parse(json[fieldName]);
            }
        }

        return new NoSuchQuestionException({id: id});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        if (this.id != null) {
            json["id"] = this.id.toString();
        }
        return json;
    }
}

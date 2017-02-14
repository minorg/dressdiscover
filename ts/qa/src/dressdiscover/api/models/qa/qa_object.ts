import { QaImage } from "./qa_image";
import { QaObjectId } from "./qa_object_id";
import { QuestionSetId } from "./question_set_id";

export class QaObject {
    private _id: QaObjectId;

    private _image: QaImage;

    private _questionSetIds: QuestionSetId[];

    constructor(id: QaObjectId, image: QaImage, questionSetIds: QuestionSetId[]) {
        this.id = id;
        this.image = image;
        this.questionSetIds = questionSetIds;
    }

    get id(): QaObjectId {
        return this._id;
    }

    set id(id: QaObjectId) {
        this._id = id;
    }

    get image(): QaImage {
        return this._image;
    }

    set image(image: QaImage) {
        this._image = image;
    }

    get questionSetIds(): QuestionSetId[] {
        return this._questionSetIds;
    }

    set questionSetIds(questionSetIds: QuestionSetId[]) {
        this._questionSetIds = questionSetIds;
    }

    static fromThryftJSON(json: any): QaObject {
        var id: QaObjectId | undefined;
        var image: QaImage | undefined;
        var questionSetIds: QuestionSetId[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = QaObjectId.parse(json[fieldName]);
            } else if (fieldName == "image") {
                image = QaImage.fromThryftJSON(json[fieldName]);
            } else if (fieldName == "question_set_ids") {
                questionSetIds = function(json: any[]): QuestionSetId[] { var sequence: QuestionSetId[] = []; for (var i = 0; i < json.length; i++) { sequence.push(QuestionSetId.parse(json[i])); } return sequence; }(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        if (image == null) {
            throw new TypeError('image is required');
        }
        if (questionSetIds == null) {
            throw new TypeError('questionSetIds is required');
        }
        return new QaObject(id, image, questionSetIds);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        json["image"] = this.image.toThryftJSON();
        json["question_set_ids"] = function (__inArray: QuestionSetId[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i].toString()); } return __outArray; }(this.questionSetIds);
        return json;
    }
}

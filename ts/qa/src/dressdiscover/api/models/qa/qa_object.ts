import { QaImage } from "./qa_image";

export class QaObject {
    private _id: string;

    private _image: QaImage;

    private _questionSetIds: string[];

    constructor(id: string, image: QaImage, questionSetIds: string[]) {
        this.id = id;
        this.image = image;
        this.questionSetIds = questionSetIds;
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

    get image(): QaImage {
        return this._image;
    }

    set image(image: QaImage) {
        this._image = image;
    }

    get questionSetIds(): string[] {
        return this._questionSetIds;
    }

    set questionSetIds(questionSetIds: string[]) {
        this._questionSetIds = questionSetIds;
    }

    static fromThryftJSON(json: any): QaObject {
        var id: string | undefined;
        var image: QaImage | undefined;
        var questionSetIds: string[] | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
            } else if (fieldName == "image") {
                image = QaImage.fromThryftJSON(json[fieldName]);
            } else if (fieldName == "question_set_ids") {
                questionSetIds = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(json[fieldName]);
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
        json["id"] = this.id;
        json["image"] = this.image.toThryftJSON();
        json["question_set_ids"] = function (__inArray: string[]): any[] { var __outArray: any[] = []; for (var __i = 0; __i < __inArray.length; __i++) { __outArray.push(__inArray[__i]); } return __outArray; }(this.questionSetIds);
        return json;
    }
}

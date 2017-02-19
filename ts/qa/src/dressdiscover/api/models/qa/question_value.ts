import { QaImage } from "./qa_image";
import { QuestionValueId } from "./question_value_id";

export class QuestionValue {
    private _id: QuestionValueId;

    private _image?: QaImage;

    private _text: string;

    constructor(kwds: {id: QuestionValueId, text: string, image?: QaImage}) {
        this.id = kwds.id;
        this.text = kwds.text;
        this.image = kwds.image;
    }

    get id(): QuestionValueId {
        return this._id;
    }

    set id(id: QuestionValueId) {
        this._id = id;
    }

    get text(): string {
        return this._text;
    }

    set text(text: string) {
        if (text.trim().length == 0) {
            throw new RangeError('text is blank');
        }
        if (text.length < 1) {
            throw new RangeError("expected len(text) to be >= 1, was " + text.length)
        }
        this._text = text;
    }

    get image(): QaImage | undefined {
        return this._image;
    }

    set image(image: QaImage | undefined) {
        if (image != null) {

        }
        this._image = image;
    }

    static fromThryftJSON(json: any): QuestionValue {
        var id: QuestionValueId | undefined;
        var text: string | undefined;
        var image: QaImage | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = QuestionValueId.parse(json[fieldName]);
            } else if (fieldName == "text") {
                text = json[fieldName];
            } else if (fieldName == "image") {
                image = QaImage.fromThryftJSON(json[fieldName]);
            }
        }
        if (id == null) {
            throw new TypeError('id is required');
        }
        if (text == null) {
            throw new TypeError('text is required');
        }
        return new QuestionValue({id: id, text: text, image: image});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id.toString();
        json["text"] = this.text;
        if (this.image != null) {
            json["image"] = this.image.toThryftJSON();
        }
        return json;
    }
}

import { QaImage } from "./qa_image";

export class QuestionValue {
    private _id: string;

    private _image?: QaImage;

    private _text: string;

    constructor(id: string, text: string, image?: QaImage) {
        this.id = id;
        this.text = text;
        this.image = image;
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
        var id: string | undefined;
        var text: string | undefined;
        var image: QaImage | undefined;
        for (var fieldName in json) {
            if (fieldName == "id") {
                id = json[fieldName];
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
        return new QuestionValue(id, text, image);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["id"] = this.id;
        json["text"] = this.text;
        if (this.image != null) {
            json["image"] = this.image.toThryftJSON();
        }
        return json;
    }
}

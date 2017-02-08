import { QaImageRights } from "./qa_image_rights";

export class QaImage {
    private _fullSizeUrl: string;

    private _rights: QaImageRights;

    private _thumbnailUrl: string;

    constructor(fullSizeUrl: string, rights: QaImageRights, thumbnailUrl: string) {
        this.fullSizeUrl = fullSizeUrl;
        this.rights = rights;
        this.thumbnailUrl = thumbnailUrl;
    }

    get fullSizeUrl(): string {
        return this._fullSizeUrl;
    }

    set fullSizeUrl(fullSizeUrl: string) {
        if (fullSizeUrl.trim().length == 0) {
            throw new RangeError('fullSizeUrl is blank');
        }
        if (fullSizeUrl.length < 1) {
            throw new RangeError("expected len(fullSizeUrl) to be >= 1, was " + fullSizeUrl.length)
        }
        this._fullSizeUrl = fullSizeUrl;
    }

    get rights(): QaImageRights {
        return this._rights;
    }

    set rights(rights: QaImageRights) {
        this._rights = rights;
    }

    get thumbnailUrl(): string {
        return this._thumbnailUrl;
    }

    set thumbnailUrl(thumbnailUrl: string) {
        if (thumbnailUrl.trim().length == 0) {
            throw new RangeError('thumbnailUrl is blank');
        }
        if (thumbnailUrl.length < 1) {
            throw new RangeError("expected len(thumbnailUrl) to be >= 1, was " + thumbnailUrl.length)
        }
        this._thumbnailUrl = thumbnailUrl;
    }

    static fromThryftJSON(json: any): QaImage {
        var fullSizeUrl: string | undefined;
        var rights: QaImageRights | undefined;
        var thumbnailUrl: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "full_size_url") {
                fullSizeUrl = json[fieldName];
            } else if (fieldName == "rights") {
                rights = QaImageRights.fromThryftJSON(json[fieldName]);
            } else if (fieldName == "thumbnail_url") {
                thumbnailUrl = json[fieldName];
            }
        }
        if (fullSizeUrl == null) {
            throw new TypeError('fullSizeUrl is required');
        }
        if (rights == null) {
            throw new TypeError('rights is required');
        }
        if (thumbnailUrl == null) {
            throw new TypeError('thumbnailUrl is required');
        }
        return new QaImage(fullSizeUrl, rights, thumbnailUrl);
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["full_size_url"] = this.fullSizeUrl;
        json["rights"] = this.rights.toThryftJSON();
        json["thumbnail_url"] = this.thumbnailUrl;
        return json;
    }
}

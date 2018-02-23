import { WorksheetFeatureValueImageRights } from "./worksheet_feature_value_image_rights";

export class WorksheetFeatureValueImage {
    constructor(kwds: {rights: WorksheetFeatureValueImageRights, thumbnailUrl: string, fullSizeUrl?: string}) {
        this.rights = kwds.rights;
        this.thumbnailUrl = kwds.thumbnailUrl;
        if (kwds.fullSizeUrl != null) {
            this.fullSizeUrl = kwds.fullSizeUrl;
        }
    }

    get rights(): WorksheetFeatureValueImageRights {
        return this._rights;
    }

    set rights(rights: WorksheetFeatureValueImageRights) {
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
            throw new RangeError("expected len(thumbnailUrl) to be >= 1, was " + thumbnailUrl.length);
        }
        this._thumbnailUrl = thumbnailUrl;
    }

    get fullSizeUrl(): string | undefined {
        return this._fullSizeUrl;
    }

    set fullSizeUrl(fullSizeUrl: string | undefined) {
        if (fullSizeUrl != null) {
            if (fullSizeUrl.trim().length == 0) {
                throw new RangeError('fullSizeUrl is blank');
            }
            if (fullSizeUrl.length < 1) {
                throw new RangeError("expected len(fullSizeUrl) to be >= 1, was " + fullSizeUrl.length);
            }
        }
        this._fullSizeUrl = fullSizeUrl;
    }

    deepCopy(): WorksheetFeatureValueImage {
        return new WorksheetFeatureValueImage({ rights: this.rights.deepCopy(), thumbnailUrl: this.thumbnailUrl, fullSizeUrl: this.fullSizeUrl });
    }

    equals(other: WorksheetFeatureValueImage): boolean {
        if (!(this.rights.equals(other.rights))) {
            return false;
        }

        if (!(this.thumbnailUrl === other.thumbnailUrl)) {
            return false;
        }

        if (!((!((typeof (this.fullSizeUrl)) === "undefined") && !((typeof (other.fullSizeUrl)) === "undefined")) ? ((this.fullSizeUrl as string) === (other.fullSizeUrl as string)) : (((typeof (this.fullSizeUrl)) === "undefined") && ((typeof (other.fullSizeUrl)) === "undefined")))) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureValueImage {
        var rights: WorksheetFeatureValueImageRights | undefined;
        var thumbnailUrl: string | undefined;
        var fullSizeUrl: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "rights") {
                rights = WorksheetFeatureValueImageRights.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName == "thumbnail_url") {
                thumbnailUrl = json[fieldName];
            } else if (fieldName == "full_size_url") {
                fullSizeUrl = json[fieldName];
            }
        }
        if (rights == null) {
            throw new TypeError('rights is required');
        }
        if (thumbnailUrl == null) {
            throw new TypeError('thumbnailUrl is required');
        }
        return new WorksheetFeatureValueImage({rights: rights, thumbnailUrl: thumbnailUrl, fullSizeUrl: fullSizeUrl});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["rights"] = this.rights.toJsonObject();
        json["thumbnail_url"] = this.thumbnailUrl;
        if (this.fullSizeUrl != null) {
            json["full_size_url"] = this.fullSizeUrl;
        }
        return json;
    }

    toString(): string {
        return "WorksheetFeatureValueImage(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["rights"] = this.rights.toThryftJsonObject();
        json["thumbnail_url"] = this.thumbnailUrl;
        if (this.fullSizeUrl != null) {
            json["full_size_url"] = this.fullSizeUrl;
        }
        return json;
    }

    private _fullSizeUrl?: string = undefined;

    private _rights: WorksheetFeatureValueImageRights = new WorksheetFeatureValueImageRights();

    private _thumbnailUrl: string = "";
}

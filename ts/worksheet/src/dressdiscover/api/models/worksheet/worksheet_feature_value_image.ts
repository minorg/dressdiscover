import { WorksheetRights } from "./worksheet_rights";

export class WorksheetFeatureValueImage {
    constructor(kwds: {rights: WorksheetRights, thumbnailUrl: string, fullSizeUrl?: string}) {
        this._rights = WorksheetFeatureValueImage._validateRights(kwds.rights);
        this._thumbnailUrl = WorksheetFeatureValueImage._validateThumbnailUrl(kwds.thumbnailUrl);
        if (kwds.fullSizeUrl != null) {
            this._fullSizeUrl = WorksheetFeatureValueImage._validateFullSizeUrl(kwds.fullSizeUrl);
        } else {
            this._fullSizeUrl = undefined;
        }
    }

    get rights(): WorksheetRights {
        return this._rights;
    }

    set rights(rights: WorksheetRights) {
        this._rights = WorksheetFeatureValueImage._validateRights(rights);
    }

    get thumbnailUrl(): string {
        return this._thumbnailUrl;
    }

    set thumbnailUrl(thumbnailUrl: string) {
        this._thumbnailUrl = WorksheetFeatureValueImage._validateThumbnailUrl(thumbnailUrl);
    }

    get fullSizeUrl(): string | undefined {
        return this._fullSizeUrl;
    }

    set fullSizeUrl(fullSizeUrl: string | undefined) {
        this._fullSizeUrl = WorksheetFeatureValueImage._validateFullSizeUrl(fullSizeUrl);
    }

    private static _validateFullSizeUrl(fullSizeUrl: string | undefined): string | undefined {
        if (fullSizeUrl != null) {
            if (fullSizeUrl.trim().length == 0) {
                throw new RangeError('fullSizeUrl is blank');
            }
            if (fullSizeUrl.length < 1) {
                throw new RangeError("expected len(fullSizeUrl) to be >= 1, was " + fullSizeUrl.length);
            }
        }
        return fullSizeUrl;
    }

    private static _validateRights(rights: WorksheetRights): WorksheetRights {
        if (rights == null) {
            throw new RangeError('rights is null or undefined');
        }
        return rights;
    }

    private static _validateThumbnailUrl(thumbnailUrl: string): string {
        if (thumbnailUrl == null) {
            throw new RangeError('thumbnailUrl is null or undefined');
        }
        if (thumbnailUrl.trim().length == 0) {
            throw new RangeError('thumbnailUrl is blank');
        }
        if (thumbnailUrl.length < 1) {
            throw new RangeError("expected len(thumbnailUrl) to be >= 1, was " + thumbnailUrl.length);
        }
        return thumbnailUrl;
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
        var rights: WorksheetRights | undefined;
        var thumbnailUrl: string | undefined;
        var fullSizeUrl: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "rights") {
                rights = WorksheetRights.fromThryftJsonObject(json[fieldName]);
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

    private _fullSizeUrl?: string;

    private _rights: WorksheetRights;

    private _thumbnailUrl: string;
}

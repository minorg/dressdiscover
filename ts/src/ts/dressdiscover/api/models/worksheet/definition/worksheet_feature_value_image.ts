import { WorksheetFeatureValueImageUrl } from "./worksheet_feature_value_image_url";
import { WorksheetRights } from "./worksheet_rights";

export class WorksheetFeatureValueImage {
    constructor(kwds: {rights: WorksheetRights, thumbnailUrl: WorksheetFeatureValueImageUrl, fullSizeUrl?: WorksheetFeatureValueImageUrl}) {
        this.rights = WorksheetFeatureValueImage.validateRights(kwds.rights);
        this.thumbnailUrl = WorksheetFeatureValueImage.validateThumbnailUrl(kwds.thumbnailUrl);
        this.fullSizeUrl = (kwds.fullSizeUrl != null) ? kwds.fullSizeUrl : undefined;
    }

    public deepCopy(): WorksheetFeatureValueImage {
        return new WorksheetFeatureValueImage({ rights: this.rights.deepCopy(), thumbnailUrl: this.thumbnailUrl.deepCopy(), fullSizeUrl: (this.fullSizeUrl ? (this.fullSizeUrl.deepCopy()) : undefined) });
    }

    public equals(other: WorksheetFeatureValueImage): boolean {
        if (!(this.rights.equals(other.rights))) {
            return false;
        }

        if (!(this.thumbnailUrl.equals(other.thumbnailUrl))) {
            return false;
        }

        if (!((!((typeof (this.fullSizeUrl)) === "undefined") && !((typeof (other.fullSizeUrl)) === "undefined")) ? ((this.fullSizeUrl as WorksheetFeatureValueImageUrl).equals((other.fullSizeUrl as WorksheetFeatureValueImageUrl))) : (((typeof (this.fullSizeUrl)) === "undefined") && ((typeof (other.fullSizeUrl)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureValueImage {
        let rights: WorksheetRights | undefined;
        let thumbnailUrl: WorksheetFeatureValueImageUrl | undefined;
        let fullSizeUrl: WorksheetFeatureValueImageUrl | undefined;
        for (const fieldName in json) {
            if (fieldName === "rights") {
                rights = WorksheetRights.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "thumbnail_url") {
                thumbnailUrl = WorksheetFeatureValueImageUrl.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "full_size_url") {
                fullSizeUrl = WorksheetFeatureValueImageUrl.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (rights == null) {
            throw new TypeError("rights is required");
        }
        if (thumbnailUrl == null) {
            throw new TypeError("thumbnailUrl is required");
        }
        return new WorksheetFeatureValueImage({rights, thumbnailUrl, fullSizeUrl});
    }

    public toJsonObject(): {full_size_url: {absolute: string | undefined, relative: string | undefined} | undefined, rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, thumbnail_url: {absolute: string | undefined, relative: string | undefined}} {
        return {
            full_size_url: this.fullSizeUrl != null ? this.fullSizeUrl.toJsonObject() : undefined,
            rights: this.rights.toJsonObject(),
            thumbnail_url: this.thumbnailUrl.toJsonObject()
        };
    }

    public toString(): string {
        return "WorksheetFeatureValueImage(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {full_size_url: {absolute: string | undefined, relative: string | undefined} | undefined, rights: {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}}, thumbnail_url: {absolute: string | undefined, relative: string | undefined}} {
        return {
            full_size_url: this.fullSizeUrl != null ? this.fullSizeUrl.toThryftJsonObject() : undefined,
            rights: this.rights.toThryftJsonObject(),
            thumbnail_url: this.thumbnailUrl.toThryftJsonObject()
        };
    }

    private static validateRights(rights: WorksheetRights): WorksheetRights {
        if (rights == null) {
            throw new RangeError("rights is null or undefined");
        }
        return rights;
    }

    private static validateThumbnailUrl(thumbnailUrl: WorksheetFeatureValueImageUrl): WorksheetFeatureValueImageUrl {
        if (thumbnailUrl == null) {
            throw new RangeError("thumbnailUrl is null or undefined");
        }
        return thumbnailUrl;
    }

    public readonly fullSizeUrl?: WorksheetFeatureValueImageUrl;
    public readonly rights: WorksheetRights;
    public readonly thumbnailUrl: WorksheetFeatureValueImageUrl;
}

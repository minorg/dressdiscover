import { WorksheetRights } from "./worksheet_rights";

export class WorksheetFeatureValueImage {
    constructor(kwds: {rights: WorksheetRights, thumbnailUrl: string, fullSizeUrl?: string}) {
        this.rightsPrivate = WorksheetFeatureValueImage.validateRights(kwds.rights);
        this.thumbnailUrlPrivate = WorksheetFeatureValueImage.validateThumbnailUrl(kwds.thumbnailUrl);
        if (kwds.fullSizeUrl != null) {
            this.fullSizeUrlPrivate = WorksheetFeatureValueImage.validateFullSizeUrl(kwds.fullSizeUrl);
        } else {
            this.fullSizeUrlPrivate = undefined;
        }
    }

    get rights(): WorksheetRights {
        return this.rightsPrivate;
    }

    set rights(rights: WorksheetRights) {
        this.rightsPrivate = WorksheetFeatureValueImage.validateRights(rights);
    }

    /**
     * Thumbnail and full size URLs can be relative
     */
    get thumbnailUrl(): string {
        return this.thumbnailUrlPrivate;
    }

    /**
     * Thumbnail and full size URLs can be relative
     */
    set thumbnailUrl(thumbnailUrl: string) {
        this.thumbnailUrlPrivate = WorksheetFeatureValueImage.validateThumbnailUrl(thumbnailUrl);
    }

    get fullSizeUrl(): string | undefined {
        return this.fullSizeUrlPrivate;
    }

    set fullSizeUrl(fullSizeUrl: string | undefined) {
        this.fullSizeUrlPrivate = WorksheetFeatureValueImage.validateFullSizeUrl(fullSizeUrl);
    }

    public deepCopy(): WorksheetFeatureValueImage {
        return new WorksheetFeatureValueImage({ rights: this.rights.deepCopy(), thumbnailUrl: this.thumbnailUrl, fullSizeUrl: this.fullSizeUrl });
    }

    public equals(other: WorksheetFeatureValueImage): boolean {
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

    public static fromThryftJsonObject(json: any): WorksheetFeatureValueImage {
        let rights: WorksheetRights | undefined;
        let thumbnailUrl: string | undefined;
        let fullSizeUrl: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "rights") {
                rights = WorksheetRights.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "thumbnail_url") {
                thumbnailUrl = json[fieldName];
            } else if (fieldName === "full_size_url") {
                fullSizeUrl = json[fieldName];
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

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.rights = this.rights.toJsonObject();
        json.thumbnail_url = this.thumbnailUrl;
        if (this.fullSizeUrl != null) {
            json.full_size_url = this.fullSizeUrl;
        }
        return json;
    }

    public toString(): string {
        return "WorksheetFeatureValueImage(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.rights = this.rights.toThryftJsonObject();
        json.thumbnail_url = this.thumbnailUrl;
        if (this.fullSizeUrl != null) {
            json.full_size_url = this.fullSizeUrl;
        }
        return json;
    }

    private static validateFullSizeUrl(fullSizeUrl: string | undefined): string | undefined {
        if (fullSizeUrl != null) {
            if (fullSizeUrl.trim().length == 0) {
                throw new RangeError("fullSizeUrl is blank");
            }
            if (fullSizeUrl.length < 1) {
                throw new RangeError("expected len(fullSizeUrl) to be >= 1, was " + fullSizeUrl.length);
            }
        }
        return fullSizeUrl;
    }

    private static validateRights(rights: WorksheetRights): WorksheetRights {
        if (rights == null) {
            throw new RangeError("rights is null or undefined");
        }
        return rights;
    }

    private static validateThumbnailUrl(thumbnailUrl: string): string {
        if (thumbnailUrl == null) {
            throw new RangeError("thumbnailUrl is null or undefined");
        }
        if (thumbnailUrl.trim().length == 0) {
            throw new RangeError("thumbnailUrl is blank");
        }
        if (thumbnailUrl.length < 1) {
            throw new RangeError("expected len(thumbnailUrl) to be >= 1, was " + thumbnailUrl.length);
        }
        return thumbnailUrl;
    }

    private fullSizeUrlPrivate?: string;

    private rightsPrivate: WorksheetRights;

    /**
     * Thumbnail and full size URLs can be relative
     */
    private thumbnailUrlPrivate: string;
}

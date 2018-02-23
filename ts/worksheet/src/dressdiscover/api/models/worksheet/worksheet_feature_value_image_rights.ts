export class WorksheetFeatureValueImageRights {
    constructor(kwds: {author: string, license: string, sourceName: string, sourceUrl: string}) {
        this._author = WorksheetFeatureValueImageRights._validateAuthor(kwds.author);
        this._license = WorksheetFeatureValueImageRights._validateLicense(kwds.license);
        this._sourceName = WorksheetFeatureValueImageRights._validateSourceName(kwds.sourceName);
        this._sourceUrl = WorksheetFeatureValueImageRights._validateSourceUrl(kwds.sourceUrl);
    }

    get author(): string {
        return this._author;
    }

    set author(author: string) {
        this._author = WorksheetFeatureValueImageRights._validateAuthor(author);
    }

    get license(): string {
        return this._license;
    }

    set license(license: string) {
        this._license = WorksheetFeatureValueImageRights._validateLicense(license);
    }

    get sourceName(): string {
        return this._sourceName;
    }

    set sourceName(sourceName: string) {
        this._sourceName = WorksheetFeatureValueImageRights._validateSourceName(sourceName);
    }

    get sourceUrl(): string {
        return this._sourceUrl;
    }

    set sourceUrl(sourceUrl: string) {
        this._sourceUrl = WorksheetFeatureValueImageRights._validateSourceUrl(sourceUrl);
    }

    private static _validateAuthor(author: string): string {
        if (author.trim().length == 0) {
            throw new RangeError('author is blank');
        }
        if (author.length < 1) {
            throw new RangeError("expected len(author) to be >= 1, was " + author.length);
        }
        return author;
    }

    private static _validateLicense(license: string): string {
        if (license.trim().length == 0) {
            throw new RangeError('license is blank');
        }
        if (license.length < 1) {
            throw new RangeError("expected len(license) to be >= 1, was " + license.length);
        }
        return license;
    }

    private static _validateSourceName(sourceName: string): string {
        if (sourceName.trim().length == 0) {
            throw new RangeError('sourceName is blank');
        }
        if (sourceName.length < 1) {
            throw new RangeError("expected len(sourceName) to be >= 1, was " + sourceName.length);
        }
        return sourceName;
    }

    private static _validateSourceUrl(sourceUrl: string): string {
        return sourceUrl;
    }

    deepCopy(): WorksheetFeatureValueImageRights {
        return new WorksheetFeatureValueImageRights({ author: this.author, license: this.license, sourceName: this.sourceName, sourceUrl: this.sourceUrl });
    }

    equals(other: WorksheetFeatureValueImageRights): boolean {
        if (!(this.author === other.author)) {
            return false;
        }

        if (!(this.license === other.license)) {
            return false;
        }

        if (!(this.sourceName === other.sourceName)) {
            return false;
        }

        if (!(this.sourceUrl === other.sourceUrl)) {
            return false;
        }

        return true;
    }

    static fromThryftJsonObject(json: any): WorksheetFeatureValueImageRights {
        var author: string | undefined;
        var license: string | undefined;
        var sourceName: string | undefined;
        var sourceUrl: string | undefined;
        for (var fieldName in json) {
            if (fieldName == "author") {
                author = json[fieldName];
            } else if (fieldName == "license") {
                license = json[fieldName];
            } else if (fieldName == "source_name") {
                sourceName = json[fieldName];
            } else if (fieldName == "source_url") {
                sourceUrl = json[fieldName];
            }
        }
        if (author == null) {
            throw new TypeError('author is required');
        }
        if (license == null) {
            throw new TypeError('license is required');
        }
        if (sourceName == null) {
            throw new TypeError('sourceName is required');
        }
        if (sourceUrl == null) {
            throw new TypeError('sourceUrl is required');
        }
        return new WorksheetFeatureValueImageRights({author: author, license: license, sourceName: sourceName, sourceUrl: sourceUrl});
    }

    toJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["author"] = this.author;
        json["license"] = this.license;
        json["source_name"] = this.sourceName;
        json["source_url"] = this.sourceUrl;
        return json;
    }

    toString(): string {
        return "WorksheetFeatureValueImageRights(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    toThryftJsonObject(): any {
        var json: {[index: string]: any} = {};
        json["author"] = this.author;
        json["license"] = this.license;
        json["source_name"] = this.sourceName;
        json["source_url"] = this.sourceUrl;
        return json;
    }

    private _author: string;

    private _license: string;

    private _sourceName: string;

    private _sourceUrl: string;
}

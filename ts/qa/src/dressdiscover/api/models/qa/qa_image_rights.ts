export class QaImageRights {
    private _author: string;

    private _license: string;

    private _sourceName: string;

    private _sourceUrl: string;

    constructor(kwds: {author: string, license: string, sourceName: string, sourceUrl: string}) {
        this.author = kwds.author;
        this.license = kwds.license;
        this.sourceName = kwds.sourceName;
        this.sourceUrl = kwds.sourceUrl;
    }

    get author(): string {
        return this._author;
    }

    set author(author: string) {
        if (author.trim().length == 0) {
            throw new RangeError('author is blank');
        }
        if (author.length < 1) {
            throw new RangeError("expected len(author) to be >= 1, was " + author.length)
        }
        this._author = author;
    }

    get license(): string {
        return this._license;
    }

    set license(license: string) {
        if (license.trim().length == 0) {
            throw new RangeError('license is blank');
        }
        if (license.length < 1) {
            throw new RangeError("expected len(license) to be >= 1, was " + license.length)
        }
        this._license = license;
    }

    get sourceName(): string {
        return this._sourceName;
    }

    set sourceName(sourceName: string) {
        if (sourceName.trim().length == 0) {
            throw new RangeError('sourceName is blank');
        }
        if (sourceName.length < 1) {
            throw new RangeError("expected len(sourceName) to be >= 1, was " + sourceName.length)
        }
        this._sourceName = sourceName;
    }

    get sourceUrl(): string {
        return this._sourceUrl;
    }

    set sourceUrl(sourceUrl: string) {
        this._sourceUrl = sourceUrl;
    }

    static fromThryftJSON(json: any): QaImageRights {
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
        return new QaImageRights({author: author, license: license, sourceName: sourceName, sourceUrl: sourceUrl});
    }

    toThryftJSON(): any {
        var json: {[index: string]: any} = {};
        json["author"] = this.author;
        json["license"] = this.license;
        json["source_name"] = this.sourceName;
        json["source_url"] = this.sourceUrl;
        return json;
    }
}

export class WorksheetRights {
    constructor(kwds: {author: string, license: string, sourceName: string, sourceUrl: string}) {
        this.authorPrivate = WorksheetRights.validateAuthor(kwds.author);
        this.licensePrivate = WorksheetRights.validateLicense(kwds.license);
        this.sourceNamePrivate = WorksheetRights.validateSourceName(kwds.sourceName);
        this.sourceUrlPrivate = WorksheetRights.validateSourceUrl(kwds.sourceUrl);
    }

    public deepCopy(): WorksheetRights {
        return new WorksheetRights({ author: this.author, license: this.license, sourceName: this.sourceName, sourceUrl: this.sourceUrl });
    }

    public equals(other: WorksheetRights): boolean {
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

    public static fromThryftJsonObject(json: any): WorksheetRights {
        let author: string | undefined;
        let license: string | undefined;
        let sourceName: string | undefined;
        let sourceUrl: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "author") {
                author = json[fieldName];
            } else if (fieldName === "license") {
                license = json[fieldName];
            } else if (fieldName === "source_name") {
                sourceName = json[fieldName];
            } else if (fieldName === "source_url") {
                sourceUrl = json[fieldName];
            }
        }
        if (author == null) {
            throw new TypeError("author is required");
        }
        if (license == null) {
            throw new TypeError("license is required");
        }
        if (sourceName == null) {
            throw new TypeError("sourceName is required");
        }
        if (sourceUrl == null) {
            throw new TypeError("sourceUrl is required");
        }
        return new WorksheetRights({author, license, sourceName, sourceUrl});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.author = this.author;
        json.license = this.license;
        json.source_name = this.sourceName;
        json.source_url = this.sourceUrl;
        return json;
    }

    public toString(): string {
        return "WorksheetRights(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.author = this.author;
        json.license = this.license;
        json.source_name = this.sourceName;
        json.source_url = this.sourceUrl;
        return json;
    }

    private static validateAuthor(author: string): string {
        if (author == null) {
            throw new RangeError("author is null or undefined");
        }
        if (author.trim().length === 0) {
            throw new RangeError("author is blank");
        }
        if (author.length < 1) {
            throw new RangeError("expected len(author) to be >= 1, was " + author.length);
        }
        return author;
    }

    private static validateLicense(license: string): string {
        if (license == null) {
            throw new RangeError("license is null or undefined");
        }
        if (license.trim().length === 0) {
            throw new RangeError("license is blank");
        }
        if (license.length < 1) {
            throw new RangeError("expected len(license) to be >= 1, was " + license.length);
        }
        return license;
    }

    private static validateSourceName(sourceName: string): string {
        if (sourceName == null) {
            throw new RangeError("sourceName is null or undefined");
        }
        if (sourceName.trim().length === 0) {
            throw new RangeError("sourceName is blank");
        }
        if (sourceName.length < 1) {
            throw new RangeError("expected len(sourceName) to be >= 1, was " + sourceName.length);
        }
        return sourceName;
    }

    private static validateSourceUrl(sourceUrl: string): string {
        if (sourceUrl == null) {
            throw new RangeError("sourceUrl is null or undefined");
        }
        return sourceUrl;
    }

    public readonly author: string;

    public readonly license: string;

    public readonly sourceName: string;

    public readonly sourceUrl: string;
}

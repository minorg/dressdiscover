import { WorksheetRightsLicense } from "./worksheet_rights_license";
import { WorksheetRightsSource } from "./worksheet_rights_source";

export class WorksheetRights {
    constructor(kwds: {author: string, license: WorksheetRightsLicense, source: WorksheetRightsSource}) {
        this.author = WorksheetRights.validateAuthor(kwds.author);
        this.license = WorksheetRights.validateLicense(kwds.license);
        this.source = WorksheetRights.validateSource(kwds.source);
    }

    public deepCopy(): WorksheetRights {
        return new WorksheetRights({ author: this.author, license: this.license.deepCopy(), source: this.source.deepCopy() });
    }

    public equals(other: WorksheetRights): boolean {
        if (this.author !== other.author) {
            return false;
        }

        if (!(this.license.equals(other.license))) {
            return false;
        }

        if (!(this.source.equals(other.source))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetRights {
        let author: string | undefined;
        let license: WorksheetRightsLicense | undefined;
        let source: WorksheetRightsSource | undefined;
        for (const fieldName in json) {
            if (fieldName === "author") {
                author = json[fieldName];
            } else if (fieldName === "license") {
                license = WorksheetRightsLicense.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "source") {
                source = WorksheetRightsSource.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (author == null) {
            throw new TypeError("author is required");
        }
        if (license == null) {
            throw new TypeError("license is required");
        }
        if (source == null) {
            throw new TypeError("source is required");
        }
        return new WorksheetRights({author, license, source});
    }

    public toJsonObject(): {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}} {
        return {
            author: this.author,
            license: this.license.toJsonObject(),
            source: this.source.toJsonObject()
        };
    }

    public toString(): string {
        return "WorksheetRights(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {author: string, license: {nickname: string, statement: string, uri: string}, source: {name: string, url: string}} {
        return {
            author: this.author,
            license: this.license.toThryftJsonObject(),
            source: this.source.toThryftJsonObject()
        };
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

    private static validateLicense(license: WorksheetRightsLicense): WorksheetRightsLicense {
        if (license == null) {
            throw new RangeError("license is null or undefined");
        }
        return license;
    }

    private static validateSource(source: WorksheetRightsSource): WorksheetRightsSource {
        if (source == null) {
            throw new RangeError("source is null or undefined");
        }
        return source;
    }

    public readonly author: string;
    public readonly license: WorksheetRightsLicense;
    public readonly source: WorksheetRightsSource;
}

export class WorksheetFeatureValueImageUrl {
    constructor(kwds?: {absolute?: string, relative?: string}) {
        if (!kwds) {
            return;
        }
        if (kwds.absolute != null) {
            this.absolute = WorksheetFeatureValueImageUrl.validateAbsolute(kwds.absolute);
        } else {
            this.absolute = undefined;
        }
        if (kwds.relative != null) {
            this.relative = WorksheetFeatureValueImageUrl.validateRelative(kwds.relative);
        } else {
            this.relative = undefined;
        }
    }

    public deepCopy(): WorksheetFeatureValueImageUrl {
        return new WorksheetFeatureValueImageUrl({ absolute: this.absolute, relative: this.relative });
    }

    public equals(other: WorksheetFeatureValueImageUrl): boolean {
        if (!((!((typeof (this.absolute)) === "undefined") && !((typeof (other.absolute)) === "undefined")) ? ((this.absolute as string) === (other.absolute as string)) : (((typeof (this.absolute)) === "undefined") && ((typeof (other.absolute)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.relative)) === "undefined") && !((typeof (other.relative)) === "undefined")) ? ((this.relative as string) === (other.relative as string)) : (((typeof (this.relative)) === "undefined") && ((typeof (other.relative)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetFeatureValueImageUrl {
        let absolute: string | undefined;
        let relative: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "absolute") {
                absolute = json[fieldName];
            } else if (fieldName === "relative") {
                relative = json[fieldName];
            }
        }

        return new WorksheetFeatureValueImageUrl({absolute, relative});
    }

    public toJsonObject(): {[index: string]: string} {
        const json: {[index: string]: string} = {};
        if (this.absolute != null) {
            json.absolute = this.absolute;
        }
        if (this.relative != null) {
            json.relative = this.relative;
        }
        return json;
    }

    public toString(): string {
        return "WorksheetFeatureValueImageUrl(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {[index: string]: string} {
        const json: {[index: string]: string} = {};
        if (this.absolute != null) {
            json.absolute = this.absolute;
        }
        if (this.relative != null) {
            json.relative = this.relative;
        }
        return json;
    }

    private static validateAbsolute(absolute: string | undefined): string | undefined {
        return absolute;
    }

    private static validateRelative(relative: string | undefined): string | undefined {
        if (relative != null) {
            if (relative.trim().length === 0) {
                throw new RangeError("relative is blank");
            }
            if (relative.length < 1) {
                throw new RangeError("expected len(relative) to be >= 1, was " + relative.length);
            }
        }
        return relative;
    }

    public readonly absolute?: string;

    public readonly relative?: string;
}

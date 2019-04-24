export class WorksheetFeatureValueImageUrl {
    constructor(kwds?: {absolute?: string, relative?: string}) {
        if (!kwds) {
            return;
        }
        this.absolute = (kwds.absolute != null) ? kwds.absolute : undefined;
        this.relative = WorksheetFeatureValueImageUrl.validateRelative(kwds.relative);
    }

    public deepCopy(): WorksheetFeatureValueImageUrl {
        return new WorksheetFeatureValueImageUrl({ absolute: this.absolute, relative: this.relative });
    }

    public equals(other: WorksheetFeatureValueImageUrl): boolean {
        if (this.absolute !== other.absolute) {
            return false;
        }

        if (this.relative !== other.relative) {
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

    public toJsonObject(): {absolute: string | undefined, relative: string | undefined} {
        return {
            absolute: this.absolute != null ? this.absolute : undefined,
            relative: this.relative != null ? this.relative : undefined
        };
    }

    public toString(): string {
        return "WorksheetFeatureValueImageUrl(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {absolute: string | undefined, relative: string | undefined} {
        return {
            absolute: this.absolute != null ? this.absolute : undefined,
            relative: this.relative != null ? this.relative : undefined
        };
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

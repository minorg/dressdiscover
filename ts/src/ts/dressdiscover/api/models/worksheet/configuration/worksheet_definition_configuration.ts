import { BundledWorksheetDefinitionConfiguration } from "./bundled_worksheet_definition_configuration";

export class WorksheetDefinitionConfiguration {
    constructor(kwds?: {bundled?: BundledWorksheetDefinitionConfiguration}) {
        if (!kwds) {
            return;
        }
        if (kwds.bundled != null) {
            this.bundledPrivate = WorksheetDefinitionConfiguration.validateBundled(kwds.bundled);
        } else {
            this.bundledPrivate = undefined;
        }
    }

    public deepCopy(): WorksheetDefinitionConfiguration {
        return new WorksheetDefinitionConfiguration({ bundled: (this.bundled ? (this.bundled.deepCopy()) : undefined) });
    }

    public equals(other: WorksheetDefinitionConfiguration): boolean {
        if (!((!((typeof (this.bundled)) === "undefined") && !((typeof (other.bundled)) === "undefined")) ? ((this.bundled as BundledWorksheetDefinitionConfiguration).equals((other.bundled as BundledWorksheetDefinitionConfiguration))) : (((typeof (this.bundled)) === "undefined") && ((typeof (other.bundled)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetDefinitionConfiguration {
        let bundled: BundledWorksheetDefinitionConfiguration | undefined;
        for (const fieldName in json) {
            if (fieldName === "bundled" || fieldName === "1:bundled") {
                bundled = BundledWorksheetDefinitionConfiguration.fromThryftJsonObject(json[fieldName]);
            }
        }

        return new WorksheetDefinitionConfiguration({bundled});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        if (this.bundled != null) {
            json.bundled = this.bundled.toJsonObject();
        }
        return json;
    }

    public toString(): string {
        return "WorksheetDefinitionConfiguration(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        if (this.bundled != null) {
            json["1:bundled"] = this.bundled.toThryftJsonObject();
        }
        return json;
    }

    private static validateBundled(bundled: BundledWorksheetDefinitionConfiguration | undefined): BundledWorksheetDefinitionConfiguration | undefined {
        return bundled;
    }

    public readonly bundled?: BundledWorksheetDefinitionConfiguration;
}

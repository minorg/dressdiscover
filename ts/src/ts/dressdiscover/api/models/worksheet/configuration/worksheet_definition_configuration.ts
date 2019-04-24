import { BundledWorksheetDefinitionConfiguration } from "./bundled_worksheet_definition_configuration";

export class WorksheetDefinitionConfiguration {
    constructor(kwds?: {bundled?: BundledWorksheetDefinitionConfiguration}) {
        if (!kwds) {
            return;
        }
        this.bundled = (kwds.bundled != null) ? kwds.bundled : undefined;
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

    public toJsonObject(): {bundled: {} | undefined} {
        return {
            bundled: this.bundled != null ? this.bundled.toJsonObject() : undefined
        };
    }

    public toString(): string {
        return "WorksheetDefinitionConfiguration(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {"1:bundled": {} | undefined} {
        return {
            "1:bundled": this.bundled != null ? this.bundled.toThryftJsonObject() : undefined
        };
    }

    public readonly bundled?: BundledWorksheetDefinitionConfiguration;
}

import { WorksheetConfiguration } from "../worksheet/configuration/worksheet_configuration";

export class UserSettings {
    constructor(kwds?: {worksheetConfiguration?: WorksheetConfiguration}) {
        if (!kwds) {
            return;
        }
        if (kwds.worksheetConfiguration != null) {
            this.worksheetConfigurationPrivate = UserSettings.validateWorksheetConfiguration(kwds.worksheetConfiguration);
        } else {
            this.worksheetConfigurationPrivate = undefined;
        }
    }

    get worksheetConfiguration(): WorksheetConfiguration | undefined {
        return this.worksheetConfigurationPrivate;
    }

    set worksheetConfiguration(worksheetConfiguration: WorksheetConfiguration | undefined) {
        this.worksheetConfigurationPrivate = UserSettings.validateWorksheetConfiguration(worksheetConfiguration);
    }

    public deepCopy(): UserSettings {
        return new UserSettings({ worksheetConfiguration: (this.worksheetConfiguration ? (this.worksheetConfiguration.deepCopy()) : undefined) });
    }

    public equals(other: UserSettings): boolean {
        if (!((!((typeof (this.worksheetConfiguration)) === "undefined") && !((typeof (other.worksheetConfiguration)) === "undefined")) ? ((this.worksheetConfiguration as WorksheetConfiguration).equals((other.worksheetConfiguration as WorksheetConfiguration))) : (((typeof (this.worksheetConfiguration)) === "undefined") && ((typeof (other.worksheetConfiguration)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): UserSettings {
        let worksheetConfiguration: WorksheetConfiguration | undefined;
        for (const fieldName in json) {
            if (fieldName === "worksheet_configuration" || fieldName === "1:worksheet_configuration") {
                worksheetConfiguration = WorksheetConfiguration.fromThryftJsonObject(json[fieldName]);
            }
        }

        return new UserSettings({worksheetConfiguration});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        if (this.worksheetConfiguration != null) {
            json.worksheet_configuration = this.worksheetConfiguration.toJsonObject();
        }
        return json;
    }

    public toString(): string {
        return "UserSettings(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        if (this.worksheetConfiguration != null) {
            json["1:worksheet_configuration"] = this.worksheetConfiguration.toThryftJsonObject();
        }
        return json;
    }

    private static validateWorksheetConfiguration(worksheetConfiguration: WorksheetConfiguration | undefined): WorksheetConfiguration | undefined {
        return worksheetConfiguration;
    }

    private worksheetConfigurationPrivate?: WorksheetConfiguration;
}

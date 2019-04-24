import { WorksheetConfiguration } from "../worksheet/configuration/worksheet_configuration";

export class UserSettings {
    constructor(kwds?: {worksheetConfiguration?: WorksheetConfiguration}) {
        if (!kwds) {
            return;
        }
        this.worksheetConfiguration = (kwds.worksheetConfiguration != null) ? kwds.worksheetConfiguration : undefined;
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

    public toJsonObject(): {worksheet_configuration: {definition: {bundled: {} | undefined}, state: {google_sheets: {spreadsheet_id: string} | undefined, local_storage: {} | undefined}} | undefined} {
        return {
            worksheet_configuration: this.worksheetConfiguration != null ? this.worksheetConfiguration.toJsonObject() : undefined
        };
    }

    public toString(): string {
        return "UserSettings(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {"1:worksheet_configuration": {"1:definition": {"1:bundled": {} | undefined}, "2:state": {"2:google_sheets": {"1:spreadsheet_id": string} | undefined, "1:local_storage": {} | undefined}} | undefined} {
        return {
            "1:worksheet_configuration": this.worksheetConfiguration != null ? this.worksheetConfiguration.toThryftJsonObject() : undefined
        };
    }

    public readonly worksheetConfiguration?: WorksheetConfiguration;
}

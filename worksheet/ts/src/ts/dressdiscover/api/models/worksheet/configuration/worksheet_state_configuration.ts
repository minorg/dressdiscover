import { GoogleSheetsWorksheetStateConfiguration } from "./google_sheets_worksheet_state_configuration";
import { LocalStorageWorksheetStateConfiguration } from "./local_storage_worksheet_state_configuration";

export class WorksheetStateConfiguration {
    constructor(kwds?: {googleSheets?: GoogleSheetsWorksheetStateConfiguration, localStorage?: LocalStorageWorksheetStateConfiguration}) {
        if (!kwds) {
            return;
        }
        this.googleSheets = (kwds.googleSheets != null) ? kwds.googleSheets : undefined;
        this.localStorage = (kwds.localStorage != null) ? kwds.localStorage : undefined;
    }

    public deepCopy(): WorksheetStateConfiguration {
        return new WorksheetStateConfiguration({ googleSheets: (this.googleSheets ? (this.googleSheets.deepCopy()) : undefined), localStorage: (this.localStorage ? (this.localStorage.deepCopy()) : undefined) });
    }

    public equals(other: WorksheetStateConfiguration): boolean {
        if (!((!((typeof (this.googleSheets)) === "undefined") && !((typeof (other.googleSheets)) === "undefined")) ? ((this.googleSheets as GoogleSheetsWorksheetStateConfiguration).equals((other.googleSheets as GoogleSheetsWorksheetStateConfiguration))) : (((typeof (this.googleSheets)) === "undefined") && ((typeof (other.googleSheets)) === "undefined")))) {
            return false;
        }

        if (!((!((typeof (this.localStorage)) === "undefined") && !((typeof (other.localStorage)) === "undefined")) ? ((this.localStorage as LocalStorageWorksheetStateConfiguration).equals((other.localStorage as LocalStorageWorksheetStateConfiguration))) : (((typeof (this.localStorage)) === "undefined") && ((typeof (other.localStorage)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetStateConfiguration {
        let googleSheets: GoogleSheetsWorksheetStateConfiguration | undefined;
        let localStorage: LocalStorageWorksheetStateConfiguration | undefined;
        for (const fieldName in json) {
            if (fieldName === "google_sheets" || fieldName === "2:google_sheets") {
                googleSheets = GoogleSheetsWorksheetStateConfiguration.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "local_storage" || fieldName === "1:local_storage") {
                localStorage = LocalStorageWorksheetStateConfiguration.fromThryftJsonObject(json[fieldName]);
            }
        }

        return new WorksheetStateConfiguration({googleSheets, localStorage});
    }

    public toJsonObject(): {google_sheets: {spreadsheet_id: string} | undefined, local_storage: {} | undefined} {
        return {
            google_sheets: this.googleSheets != null ? this.googleSheets.toJsonObject() : undefined,
            local_storage: this.localStorage != null ? this.localStorage.toJsonObject() : undefined
        };
    }

    public toString(): string {
        return "WorksheetStateConfiguration(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {"2:google_sheets": {"1:spreadsheet_id": string} | undefined, "1:local_storage": {} | undefined} {
        return {
            "2:google_sheets": this.googleSheets != null ? this.googleSheets.toThryftJsonObject() : undefined,
            "1:local_storage": this.localStorage != null ? this.localStorage.toThryftJsonObject() : undefined
        };
    }

    public readonly googleSheets?: GoogleSheetsWorksheetStateConfiguration;
    public readonly localStorage?: LocalStorageWorksheetStateConfiguration;
}

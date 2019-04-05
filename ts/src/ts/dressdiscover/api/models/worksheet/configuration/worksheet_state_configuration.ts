import { GoogleSheetsWorksheetStateConfiguration } from "./google_sheets_worksheet_state_configuration";
import { LocalStorageWorksheetStateConfiguration } from "./local_storage_worksheet_state_configuration";

export class WorksheetStateConfiguration {
    constructor(kwds?: {googleSheets?: GoogleSheetsWorksheetStateConfiguration, localStorage?: LocalStorageWorksheetStateConfiguration}) {
        if (!kwds) {
            return;
        }
        if (kwds.googleSheets != null) {
            this.googleSheets = WorksheetStateConfiguration.validateGoogleSheets(kwds.googleSheets);
        } else {
            this.googleSheets = undefined;
        }
        if (kwds.localStorage != null) {
            this.localStorage = WorksheetStateConfiguration.validateLocalStorage(kwds.localStorage);
        } else {
            this.localStorage = undefined;
        }
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

    public toJsonObject(): {[index: string]: object} {
        const json: {[index: string]: object} = {};
        if (this.googleSheets != null) {
            json.google_sheets = this.googleSheets.toJsonObject();
        }
        if (this.localStorage != null) {
            json.local_storage = this.localStorage.toJsonObject();
        }
        return json;
    }

    public toString(): string {
        return "WorksheetStateConfiguration(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {[index: string]: object} {
        const json: {[index: string]: object} = {};
        if (this.googleSheets != null) {
            json["2:google_sheets"] = this.googleSheets.toThryftJsonObject();
        }
        if (this.localStorage != null) {
            json["1:local_storage"] = this.localStorage.toThryftJsonObject();
        }
        return json;
    }

    private static validateGoogleSheets(googleSheets: GoogleSheetsWorksheetStateConfiguration | undefined): GoogleSheetsWorksheetStateConfiguration | undefined {
        return googleSheets;
    }

    private static validateLocalStorage(localStorage: LocalStorageWorksheetStateConfiguration | undefined): LocalStorageWorksheetStateConfiguration | undefined {
        return localStorage;
    }

    public readonly googleSheets?: GoogleSheetsWorksheetStateConfiguration;

    public readonly localStorage?: LocalStorageWorksheetStateConfiguration;
}

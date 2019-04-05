export class GoogleSheetsWorksheetStateConfiguration {
    constructor(kwds: {spreadsheetId: string}) {
        this.spreadsheetId = GoogleSheetsWorksheetStateConfiguration.validateSpreadsheetId(kwds.spreadsheetId);
    }

    public deepCopy(): GoogleSheetsWorksheetStateConfiguration {
        return new GoogleSheetsWorksheetStateConfiguration({ spreadsheetId: this.spreadsheetId });
    }

    public equals(other: GoogleSheetsWorksheetStateConfiguration): boolean {
        if (!(this.spreadsheetId === other.spreadsheetId)) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): GoogleSheetsWorksheetStateConfiguration {
        let spreadsheetId: string | undefined;
        for (const fieldName in json) {
            if (fieldName === "spreadsheet_id" || fieldName === "1:spreadsheet_id") {
                spreadsheetId = json[fieldName];
            }
        }
        if (spreadsheetId == null) {
            throw new TypeError("spreadsheetId is required");
        }
        return new GoogleSheetsWorksheetStateConfiguration({spreadsheetId});
    }

    public toJsonObject(): {[index: string]: any} {
        const json: {[index: string]: any} = {};
        json.spreadsheet_id = this.spreadsheetId;
        return json;
    }

    public toString(): string {
        return "GoogleSheetsWorksheetStateConfiguration(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {[index: string]: any} {
        const json: {[index: string]: any} = {};
        json["1:spreadsheet_id"] = this.spreadsheetId;
        return json;
    }

    private static validateSpreadsheetId(spreadsheetId: string): string {
        if (spreadsheetId == null) {
            throw new RangeError("spreadsheetId is null or undefined");
        }
        if (spreadsheetId.trim().length === 0) {
            throw new RangeError("spreadsheetId is blank");
        }
        if (spreadsheetId.length < 1) {
            throw new RangeError("expected len(spreadsheetId) to be >= 1, was " + spreadsheetId.length);
        }
        return spreadsheetId;
    }

    public readonly spreadsheetId: string;
}

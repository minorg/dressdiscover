import { LocalStorageWorksheetStateConfiguration } from "./local_storage_worksheet_state_configuration";

export class WorksheetStateConfiguration {
    constructor(kwds?: {localStorage?: LocalStorageWorksheetStateConfiguration}) {
        if (!kwds) {
            return;
        }
        if (kwds.localStorage != null) {
            this.localStoragePrivate = WorksheetStateConfiguration.validateLocalStorage(kwds.localStorage);
        } else {
            this.localStoragePrivate = undefined;
        }
    }

    public deepCopy(): WorksheetStateConfiguration {
        return new WorksheetStateConfiguration({ localStorage: (this.localStorage ? (this.localStorage.deepCopy()) : undefined) });
    }

    public equals(other: WorksheetStateConfiguration): boolean {
        if (!((!((typeof (this.localStorage)) === "undefined") && !((typeof (other.localStorage)) === "undefined")) ? ((this.localStorage as LocalStorageWorksheetStateConfiguration).equals((other.localStorage as LocalStorageWorksheetStateConfiguration))) : (((typeof (this.localStorage)) === "undefined") && ((typeof (other.localStorage)) === "undefined")))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetStateConfiguration {
        let localStorage: LocalStorageWorksheetStateConfiguration | undefined;
        for (const fieldName in json) {
            if (fieldName === "local_storage" || fieldName === "1:local_storage") {
                localStorage = LocalStorageWorksheetStateConfiguration.fromThryftJsonObject(json[fieldName]);
            }
        }

        return new WorksheetStateConfiguration({localStorage});
    }

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        if (this.localStorage != null) {
            json.local_storage = this.localStorage.toJsonObject();
        }
        return json;
    }

    public toString(): string {
        return "WorksheetStateConfiguration(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        if (this.localStorage != null) {
            json["1:local_storage"] = this.localStorage.toThryftJsonObject();
        }
        return json;
    }

    private static validateLocalStorage(localStorage: LocalStorageWorksheetStateConfiguration | undefined): LocalStorageWorksheetStateConfiguration | undefined {
        return localStorage;
    }

    public readonly localStorage?: LocalStorageWorksheetStateConfiguration;
}

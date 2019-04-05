export class LocalStorageWorksheetStateConfiguration {
    public deepCopy(): LocalStorageWorksheetStateConfiguration {
        return new LocalStorageWorksheetStateConfiguration();
    }

    public equals(other: LocalStorageWorksheetStateConfiguration): boolean {
        return true;
    }

    public static fromThryftJsonObject(json: any): LocalStorageWorksheetStateConfiguration {
        return new LocalStorageWorksheetStateConfiguration;
    }

    public toJsonObject(): {[index: string]: any} {
        return {};
    }

    public toString(): string {
        return "LocalStorageWorksheetStateConfiguration()";
    }

    public toThryftJsonObject(): {[index: string]: any} {
        return {};
    }
}

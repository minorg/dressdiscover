export class BundledWorksheetDefinitionConfiguration {
    public deepCopy(): BundledWorksheetDefinitionConfiguration {
        return new BundledWorksheetDefinitionConfiguration();
    }

    public equals(other: BundledWorksheetDefinitionConfiguration): boolean {
        return true;
    }

    public static fromThryftJsonObject(json: any): BundledWorksheetDefinitionConfiguration {
        return new BundledWorksheetDefinitionConfiguration;
    }

    public toJsonObject(): any {
        return {};
    }

    public toString(): string {
        return "BundledWorksheetDefinitionConfiguration()";
    }

    public toThryftJsonObject(): any {
        return {};
    }
}

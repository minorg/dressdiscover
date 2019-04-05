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

    public toJsonObject(): {[index: string]: any} {
        return {};
    }

    public toString(): string {
        return "BundledWorksheetDefinitionConfiguration()";
    }

    public toThryftJsonObject(): {[index: string]: any} {
        return {};
    }
}

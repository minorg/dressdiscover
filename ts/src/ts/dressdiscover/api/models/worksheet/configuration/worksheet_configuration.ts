import { WorksheetDefinitionConfiguration } from "./worksheet_definition_configuration";
import { WorksheetStateConfiguration } from "./worksheet_state_configuration";

export class WorksheetConfiguration {
    constructor(kwds: {definition: WorksheetDefinitionConfiguration, state: WorksheetStateConfiguration}) {
        this.definition = WorksheetConfiguration.validateDefinition(kwds.definition);
        this.state = WorksheetConfiguration.validateState(kwds.state);
    }

    public deepCopy(): WorksheetConfiguration {
        return new WorksheetConfiguration({ definition: this.definition.deepCopy(), state: this.state.deepCopy() });
    }

    public equals(other: WorksheetConfiguration): boolean {
        if (!(this.definition.equals(other.definition))) {
            return false;
        }

        if (!(this.state.equals(other.state))) {
            return false;
        }

        return true;
    }

    public static fromThryftJsonObject(json: any): WorksheetConfiguration {
        let definition: WorksheetDefinitionConfiguration | undefined;
        let state: WorksheetStateConfiguration | undefined;
        for (const fieldName in json) {
            if (fieldName === "definition" || fieldName === "1:definition") {
                definition = WorksheetDefinitionConfiguration.fromThryftJsonObject(json[fieldName]);
            } else if (fieldName === "state" || fieldName === "2:state") {
                state = WorksheetStateConfiguration.fromThryftJsonObject(json[fieldName]);
            }
        }
        if (definition == null) {
            throw new TypeError("definition is required");
        }
        if (state == null) {
            throw new TypeError("state is required");
        }
        return new WorksheetConfiguration({definition, state});
    }

    public toJsonObject(): {definition: {bundled: {} | undefined}, state: {google_sheets: {spreadsheet_id: string} | undefined, local_storage: {} | undefined}} {
        return {
            definition: this.definition.toJsonObject(),
            state: this.state.toJsonObject()
        };
    }

    public toString(): string {
        return "WorksheetConfiguration(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): {"1:definition": {"1:bundled": {} | undefined}, "2:state": {"2:google_sheets": {"1:spreadsheet_id": string} | undefined, "1:local_storage": {} | undefined}} {
        return {
            "1:definition": this.definition.toThryftJsonObject(),
            "2:state": this.state.toThryftJsonObject()
        };
    }

    private static validateDefinition(definition: WorksheetDefinitionConfiguration): WorksheetDefinitionConfiguration {
        if (definition == null) {
            throw new RangeError("definition is null or undefined");
        }
        return definition;
    }

    private static validateState(state: WorksheetStateConfiguration): WorksheetStateConfiguration {
        if (state == null) {
            throw new RangeError("state is null or undefined");
        }
        return state;
    }

    public readonly definition: WorksheetDefinitionConfiguration;

    public readonly state: WorksheetStateConfiguration;
}

import { WorksheetDefinitionConfiguration } from "./worksheet_definition_configuration";
import { WorksheetStateConfiguration } from "./worksheet_state_configuration";

export class WorksheetConfiguration {
    constructor(kwds: {definition: WorksheetDefinitionConfiguration, state: WorksheetStateConfiguration}) {
        this.definitionPrivate = WorksheetConfiguration.validateDefinition(kwds.definition);
        this.statePrivate = WorksheetConfiguration.validateState(kwds.state);
    }

    get definition(): WorksheetDefinitionConfiguration {
        return this.definitionPrivate;
    }

    set definition(definition: WorksheetDefinitionConfiguration) {
        this.definitionPrivate = WorksheetConfiguration.validateDefinition(definition);
    }

    get state(): WorksheetStateConfiguration {
        return this.statePrivate;
    }

    set state(state: WorksheetStateConfiguration) {
        this.statePrivate = WorksheetConfiguration.validateState(state);
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

    public toJsonObject(): any {
        const json: {[index: string]: any} = {};
        json.definition = this.definition.toJsonObject();
        json.state = this.state.toJsonObject();
        return json;
    }

    public toString(): string {
        return "WorksheetConfiguration(" + JSON.stringify(this.toThryftJsonObject()) + ")";
    }

    public toThryftJsonObject(): any {
        const json: {[index: string]: any} = {};
        json["1:definition"] = this.definition.toThryftJsonObject();
        json["2:state"] = this.state.toThryftJsonObject();
        return json;
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

    private definitionPrivate: WorksheetDefinitionConfiguration;

    private statePrivate: WorksheetStateConfiguration;
}

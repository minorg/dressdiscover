import Backbone = require("backbone");
import { WorksheetFeatureDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
 
export abstract class WorksheetFeatureModel extends Backbone.Model {
    constructor(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState | undefined) {
        super({ id: definition.id });
        this._definition = definition;
        this.set("selected", false);
    }

    abstract get currentState(): WorksheetFeatureState | undefined;

    get definition(): WorksheetFeatureDefinition {
        return this._definition;
    }

    get displayName(): string {
        return this._definition.displayName ? this._definition.displayName : this._definition.id;
    }

    get selected(): boolean {
        return this.get("selected");
    }

    set selected(value: boolean) {
        if (value) {
            console.info("select " + this.id);
        } else {
            console.info("deselect " + this.id);
        }
        this.set("selected", value);
    }

    abstract get outputValues(): string[];

    private _definition: WorksheetFeatureDefinition;
}

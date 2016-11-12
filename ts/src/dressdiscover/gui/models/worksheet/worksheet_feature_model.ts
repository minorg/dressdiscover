import Backbone = require("backbone");
import { WorksheetFeatureDefinition } from "../../../api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureState } from "../../../api/models/worksheet/worksheet_feature_state";
import WorksheetEnumFeatureModel = require("./worksheet_enum_feature_model");
import WorksheetTextFeatureModel = require("./worksheet_text_feature_model");
 
abstract class WorksheetFeatureModel extends Backbone.Model {
    constructor(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState | undefined) {
        super({ id: definition.id });
        this._definition = definition;
        this.set("selected", false);
    }

    static fromDefinition(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState | undefined) {
        if (definition.enum_) {
            return new WorksheetEnumFeatureModel(definition, state);
        } else if (definition.text) {
            return new WorksheetTextFeatureModel(definition, state);
        } else {
            throw new Error("definition without union set");
        }
    }

    get definition(): WorksheetFeatureDefinition {
        return this._definition;
    }

    get selected(): boolean {
        return this.get("selected");
    }

    set selected(value: boolean) {
        this.set("selected", value);
    }

    private _definition: WorksheetFeatureDefinition;
}

export = WorksheetFeatureModel;

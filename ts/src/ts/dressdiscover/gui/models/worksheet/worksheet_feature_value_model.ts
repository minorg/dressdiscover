import Backbone = require("backbone");
import { WorksheetFeatureValueDefinition } from "../../../api/models/worksheet/worksheet_feature_value_definition";
import { WorksheetFeatureValueState } from "../../../api/models/worksheet/worksheet_feature_value_state";

class WorksheetFeatureValueModel extends Backbone.Model {
    constructor(definition: WorksheetFeatureValueDefinition, state: WorksheetFeatureValueState | undefined) {
        super();
        this._definition = definition;
        this.set("id", definition.id);
        if (state) {
            this.set("state", state);
        }
    }

    get definition(): WorksheetFeatureValueDefinition {
        return this._definition;
    }

    get state(): WorksheetFeatureValueState {
        return this.get("state");
    }

    private _definition: WorksheetFeatureValueDefinition;
}

export = WorksheetFeatureValueModel;

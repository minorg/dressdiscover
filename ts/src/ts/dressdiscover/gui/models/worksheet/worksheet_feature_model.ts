import Backbone = require("backbone");
import { WorksheetFeatureDefinition } from "../../../api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureState } from "../../../api/models/worksheet/worksheet_feature_state";

class WorksheetFeatureModel extends Backbone.Model {
    constructor(definition: WorksheetFeatureDefinition, id: string, state: WorksheetFeatureState | undefined) {
        super();
        this._definition = definition;
        this.set("id", id);
        if (state) {
            this.set("state", state);
        }
    }

    get definition(): WorksheetFeatureDefinition {
        return this._definition;
    }

    get state(): WorksheetFeatureState {
        return this.get("state");
    }

    private _definition: WorksheetFeatureDefinition;
}

export = WorksheetFeatureModel;

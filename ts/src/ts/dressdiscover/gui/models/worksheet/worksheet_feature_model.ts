import Backbone = require("backbone");
import { WorksheetFeatureDefinition } from "../../../api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureState } from "../../../api/models/worksheet/worksheet_feature_state";

class WorksheetFeatureModel extends Backbone.Model {
    private _definition: WorksheetFeatureDefinition;

    constructor(definition: WorksheetFeatureDefinition, state: WorksheetFeatureState) {
        super();
        this._definition = definition;
        this.set("state", state);
    }

    get definition(): WorksheetFeatureDefinition {
        return this._definition;
    }

    get state(): WorksheetFeatureState {
        return this.get("state");
    }
}

export = WorksheetFeatureModel;

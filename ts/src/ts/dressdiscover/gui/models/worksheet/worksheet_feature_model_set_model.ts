import Backbone = require("backbone");
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";

class WorksheetFeatureSetModel extends Backbone.Model {
    private _definition: WorksheetFeatureSetDefinition;

    constructor(definition: WorksheetFeatureSetDefinition, state: WorksheetFeatureSetState) {
        super();
        this._definition = definition;
        this.set("state", state);
    }

    get definition(): WorksheetFeatureSetDefinition {
        return this._definition;
    }

    get state(): WorksheetFeatureSetState {
        return this.get("state");
    }
}

export = WorksheetFeatureSetModel;
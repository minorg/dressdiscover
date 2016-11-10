import Backbone = require("backbone");
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";
import WorksheetFeatureCollection = require("./worksheet_feature_collection");

class WorksheetFeatureSetModel extends Backbone.Model {
    constructor(definition: WorksheetFeatureSetDefinition, features: WorksheetFeatureCollection, id: string, state: WorksheetFeatureSetState | undefined) {
        super();
        this._definition = definition;
        this._features = features;
        this.set("id", id);
        if (state) {
            this.set("state", state);
        }
    }

    get definition(): WorksheetFeatureSetDefinition {
        return this._definition;
    }

    get features(): WorksheetFeatureCollection {
        return this._features;   
    }

    get state(): WorksheetFeatureSetState {
        return this.get("state");
    }

    private _definition: WorksheetFeatureSetDefinition;
    private _features: WorksheetFeatureCollection;
}

export = WorksheetFeatureSetModel;
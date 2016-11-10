import Backbone = require("backbone");
import { WorksheetFeatureDefinition } from "../../../api/models/worksheet/worksheet_feature_definition";
import { WorksheetFeatureState } from "../../../api/models/worksheet/worksheet_feature_state";
import WorksheetFeatureValueCollection = require("./worksheet_feature_value_collection");

class WorksheetFeatureModel extends Backbone.Model {
    constructor(definition: WorksheetFeatureDefinition, featureValues: WorksheetFeatureValueCollection | undefined, state: WorksheetFeatureState | undefined) {
        super();
        this._definition = definition;
        this.set("id", definition.id);
        if (featureValues) {
            this.set("featureValues", featureValues);
        }
        if (state) {
            this.set("state", state);
        }
    }

    get definition(): WorksheetFeatureDefinition {
        return this._definition;
    }

    get featureValues(): WorksheetFeatureValueCollection {
        return this.get("featureValues");
    }

    get state(): WorksheetFeatureState {
        return this.get("state");
    }

    private _definition: WorksheetFeatureDefinition;
}

export = WorksheetFeatureModel;

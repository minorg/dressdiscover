import Backbone = require("backbone");
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";
import WorksheetFeatureCollection = require("./worksheet_feature_collection");
import WorksheetFeatureModel = require("./worksheet_feature_model");
import WorksheetFeatureSetCollection = require("./worksheet_feature_set_collection");

class WorksheetFeatureSetModel extends Backbone.Model {
    constructor(definition: WorksheetFeatureSetDefinition, state: WorksheetFeatureSetState | undefined) {
        super({ "id": definition.id });
        this._definition = definition;
        if (definition.childFeatureSets) {
            for (let childFeatureSetDefinition of definition.childFeatureSets.models) {
                this._childFeatureSets.add(new WorksheetFeatureSetModel(childFeatureSetDefinition, state.childFeatureSets ? state.childFeatureSets[childFeatureSetDefinition.id] : undefined));
            }
        }
        if (definition.features) {
            for (let featureDefinition of definition.features.models) {
                this._features.add(WorksheetFeatureModel.fromDefinition(featureDefinition, state.features ? state.features[featureDefinition.id] : undefined));
            }
        }
    }

    get childFeatureSets(): WorksheetFeatureSetCollection {
        return this._childFeatureSets;
    }

    get definition(): WorksheetFeatureSetDefinition {
        return this._definition;
    }

    get features(): WorksheetFeatureCollection {
        return this._features;
    }

    private _childFeatureSets: WorksheetFeatureSetCollection = new WorksheetFeatureSetCollection([]);
    private _definition: WorksheetFeatureSetDefinition;
    private _features: WorksheetFeatureCollection = new WorksheetFeatureCollection([]);
}

export = WorksheetFeatureSetModel;

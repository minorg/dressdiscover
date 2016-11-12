import Backbone = require("backbone");
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";
import WorksheetEnumFeatureModel = require("./worksheet_enum_feature_model");
import WorksheetFeatureCollection = require("./worksheet_feature_collection");
import WorksheetFeatureSetCollection = require("./worksheet_feature_set_collection");
import WorksheetTextFeatureModel = require("./worksheet_text_feature_model");

class WorksheetFeatureSetModel extends Backbone.Model {
    constructor(definition: WorksheetFeatureSetDefinition, state: WorksheetFeatureSetState | undefined) {
        super({ "id": definition.id });
        this._definition = definition;
        if (definition.childFeatureSets) {
            for (let childFeatureSetDefinition of definition.childFeatureSets.models) {
                this._childFeatureSets.add(new WorksheetFeatureSetModel(childFeatureSetDefinition, state && state.childFeatureSets ? state.childFeatureSets[childFeatureSetDefinition.id] : undefined));
            }
        }
        if (definition.features) {
            for (let featureDefinition of definition.features.models) {
                const featureState = state && state.features ? state.features[featureDefinition.id] : undefined;
                if (featureDefinition.enum_) {
                    this._features.add(new WorksheetEnumFeatureModel(featureDefinition, featureState));
                } else if (featureDefinition.text) {
                    this._features.add(new WorksheetTextFeatureModel(featureDefinition, featureState));
                } else {
                    throw new Error("feature definition without union set");
                }
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

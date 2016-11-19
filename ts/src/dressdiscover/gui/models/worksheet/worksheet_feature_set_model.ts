import _ = require("underscore");
import Backbone = require("backbone");
import { WorksheetFeatureSetDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "dressdiscover/api/models/worksheet/worksheet_feature_set_state";
import { WorksheetEnumFeatureModel } from "./worksheet_enum_feature_model";
import { WorksheetFeatureCollection } from "./worksheet_feature_collection";
import { WorksheetFeatureSetCollection } from "./worksheet_feature_set_collection";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
import { WorksheetTextFeatureModel } from "./worksheet_text_feature_model";

export class WorksheetFeatureSetModel extends Backbone.Model {
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

    get currentState(): WorksheetFeatureSetState | undefined {
        if (!this.definition.childFeatureSets && !this.definition.features) {
            return undefined;
        }

        let state = new WorksheetFeatureSetState();
        let usableState = false;
    
        if (this.definition.childFeatureSets) {
            let childFeatureSetStates: { [index: string]: WorksheetFeatureSetState } = {};
            for (let childFeatureSet of this._childFeatureSets.models) {
                let childFeatureSetState = childFeatureSet.currentState;
                if (childFeatureSetState) {
                    childFeatureSetStates[childFeatureSet.id] = childFeatureSetState;
                }
            }
            if (!_.isEmpty(childFeatureSetStates)) {
                state.childFeatureSets = childFeatureSetStates;
                usableState = true;
            }
        }

        if (this.definition.features) {
            let featureStates: { [index: string]: WorksheetFeatureState } = {};
            for (let feature of this._features.models) {
                let featureState = feature.currentState;
                if (featureState) {
                    featureStates[feature.id] = featureState;
                }
            }
            if (!_.isEmpty(featureStates)) {
                state.features = featureStates;
                usableState = true;
            }
        }

        return usableState ? state : undefined;
    }

    get childFeatureSets(): WorksheetFeatureSetCollection {
        return this._childFeatureSets;
    }

    get definition(): WorksheetFeatureSetDefinition {
        return this._definition;
    }

    get displayName(): string {
        return this._definition.displayName ? this._definition.displayName : this._definition.id;
    }

    get features(): WorksheetFeatureCollection {
        return this._features;
    }

    private _childFeatureSets: WorksheetFeatureSetCollection = new WorksheetFeatureSetCollection([]);
    private _definition: WorksheetFeatureSetDefinition;
    private _features: WorksheetFeatureCollection = new WorksheetFeatureCollection([]);
}

import _ = require("underscore");
import Backbone = require("backbone");
import { WorksheetFeatureSetDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "dressdiscover/api/models/worksheet/worksheet_feature_set_state";
import { WorksheetEnumFeature } from "./worksheet_enum_feature";
import { WorksheetFeatureCollection } from "./worksheet_feature_collection";
import { WorksheetFeatureSetCollection } from "./worksheet_feature_set_collection";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";
import { WorksheetTextFeature } from "./worksheet_text_feature";

export class WorksheetFeatureSet extends Backbone.Model {
    constructor(kwds: {definition: WorksheetFeatureSetDefinition, parentFeatureSet: WorksheetFeatureSet | undefined, state: WorksheetFeatureSetState | undefined}) {
        super({ "id": kwds.definition.id });
        this._definition = kwds.definition;
        this._parentFeatureSet = kwds.parentFeatureSet;
        if (kwds.definition.childFeatureSets) {
            for (let childFeatureSetDefinition of kwds.definition.childFeatureSets.models) {
                this._childFeatureSets.add(new WorksheetFeatureSet({
                    definition: childFeatureSetDefinition,
                    parentFeatureSet: this,
                    state: kwds.state && kwds.state.childFeatureSets ? kwds.state.childFeatureSets[childFeatureSetDefinition.id] : undefined
                }));
            }
        }
        if (kwds.definition.features) {
            for (let featureDefinition of kwds.definition.features.models) {
                const featureState = kwds.state && kwds.state.features ? kwds.state.features[featureDefinition.id] : undefined;
                const featureKwds = { definition: featureDefinition, parentFeatureSet: this, state: featureState };
                if (featureDefinition.enum_) {
                    this._features.add(new WorksheetEnumFeature(featureKwds));
                } else if (featureDefinition.text) {
                    this._features.add(new WorksheetTextFeature(featureKwds));
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

    get parentFeatureSet(): WorksheetFeatureSet | undefined {
        return this._parentFeatureSet;
    }

    private _childFeatureSets: WorksheetFeatureSetCollection = new WorksheetFeatureSetCollection([]);
    private _definition: WorksheetFeatureSetDefinition;
    private _features: WorksheetFeatureCollection = new WorksheetFeatureCollection([]);
    private _parentFeatureSet: WorksheetFeatureSet | undefined;
}

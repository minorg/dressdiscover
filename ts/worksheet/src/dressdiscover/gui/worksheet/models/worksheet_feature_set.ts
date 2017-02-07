import _ = require("underscore");
import Backbone = require("backbone");
import { WorksheetFeatureSetDefinition } from "dressdiscover/api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "dressdiscover/api/models/worksheet/worksheet_feature_set_state";
import { WorksheetFeature } from "dressdiscover/gui/worksheet/models/worksheet_feature";
import { WorksheetFeatureCollection } from "./worksheet_feature_collection";
import { WorksheetFeatureSetCollection } from "./worksheet_feature_set_collection";
import { WorksheetFeatureState } from "dressdiscover/api/models/worksheet/worksheet_feature_state";

export class WorksheetFeatureSet extends Backbone.Model {
    constructor(kwds: {
        allFeatures: WorksheetFeature[],
        definition: WorksheetFeatureSetDefinition,
        parentFeatureSet: WorksheetFeatureSet | undefined,
        parentsChildNumber: number | undefined,
        state: WorksheetFeatureSetState | undefined
    }) {
        super({ "id": kwds.definition.id });
        this._definition = kwds.definition;
        this._parentFeatureSet = kwds.parentFeatureSet;
        this._parentsChildNumber = kwds.parentsChildNumber;
        if (kwds.definition.childFeatureSets) {
            let childNumber = 0;
            for (let childFeatureSetDefinition of kwds.definition.childFeatureSets.models) {
                this._childFeatureSets.add(new WorksheetFeatureSet({
                    allFeatures: kwds.allFeatures,
                    definition: childFeatureSetDefinition,
                    parentFeatureSet: this,
                    parentsChildNumber: childNumber++,
                    state: kwds.state && kwds.state.childFeatureSets ? kwds.state.childFeatureSets[childFeatureSetDefinition.id] : undefined
                }));
            }
        }
        if (kwds.definition.features) {
            for (let featureDefinition of kwds.definition.features.models) {
                let feature = new WorksheetFeature({
                    allFeatures: kwds.allFeatures,
                    allFeaturesIndex: kwds.allFeatures.length,
                    definition: featureDefinition,
                    parentFeatureSet: this,
                    state: kwds.state && kwds.state.features ? kwds.state.features[featureDefinition.id] : undefined
                });
                this._features.add(feature);
                kwds.allFeatures.push(feature);
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
    private _parentsChildNumber: number | undefined;
}

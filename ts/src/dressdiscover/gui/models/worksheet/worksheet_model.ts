import _ = require("underscore");
import Backbone = require("backbone");
import { Services } from "dressdiscover/gui/services/services";
import { WorksheetDefinition } from "dressdiscover/api/models/worksheet/worksheet_definition";
import { WorksheetFeatureModel } from "./worksheet_feature_model";
import { WorksheetFeatureSetCollection } from "./worksheet_feature_set_collection";
import { WorksheetFeatureSetModel } from "./worksheet_feature_set_model";
import { WorksheetFeatureSetState } from "dressdiscover/api/models/worksheet/worksheet_feature_set_state";
import { WorksheetState } from "dressdiscover/api/models/worksheet/worksheet_state";

export class WorksheetModel extends Backbone.Model {
    constructor(kwds: { accessionNumber: string, definition: WorksheetDefinition, initialState: WorksheetState }) {
        super();
        this._accessionNumber = kwds.accessionNumber;

        const rootFeatureSets: WorksheetFeatureSetModel[] = [];
        for (let rootFeatureSetDefinition of kwds.definition.rootFeatureSets.models) {
            rootFeatureSets.push(new WorksheetFeatureSetModel(rootFeatureSetDefinition, kwds.initialState.rootFeatureSets ? kwds.initialState.rootFeatureSets[rootFeatureSetDefinition.id] : undefined));
        }
        this._rootFeatureSets = new WorksheetFeatureSetCollection(rootFeatureSets);

        {
            for (let featureSet of this.rootFeatureSets.models) {
                const selectedFeature = this.__getSelectedFeature(featureSet);
                if (selectedFeature) {
                    this._selectedFeature = selectedFeature;
                    break;
                }
            }

            if (!this._selectedFeature) {
                for (let featureSet of this.rootFeatureSets.models) {
                    const selectedFeature = this.__getFirstFeature(featureSet);
                    if (selectedFeature) {
                        this._selectedFeature = selectedFeature;
                        selectedFeature.selected = true;
                        break;
                    }
                }
            }

            if (!this._selectedFeature) {
                throw new Error("should never happen");
            }
        }
    }

    get accessionNumber(): string {
        return this._accessionNumber;
    }

    static fetchFromService(kwds: { accessionNumber: string }): WorksheetModel {
        const definition = Services.instance.worksheetQueryService.getWorksheetDefinitionSync();
        const initialState = Services.instance.worksheetQueryService.getWorksheetStateSync({ accessionNumber: kwds.accessionNumber });
        return new WorksheetModel({ accessionNumber: kwds.accessionNumber, definition: definition, initialState: initialState });
    }
   
    get currentState(): WorksheetState | undefined {
        let rootFeatureSetStates: { [index: string]: WorksheetFeatureSetState } = {};
        for (let featureSet of this.rootFeatureSets.models) {
            let featureSetState = featureSet.currentState;
            if (featureSetState) {
                rootFeatureSetStates[featureSet.id] = featureSetState;
            }
        }
        if (!_.isEmpty(rootFeatureSetStates)) {
            return new WorksheetState({ accessionNumber: this.accessionNumber, rootFeatureSets: rootFeatureSetStates });
        } else {
            return undefined;
        }
    }

    putToService() {
        let currentState = this.currentState;
        if (currentState) {
            Services.instance.worksheetCommandService.putWorksheetStateSync({ state: currentState as WorksheetState });
        }
    }

    get rootFeatureSets(): WorksheetFeatureSetCollection {
        return this._rootFeatureSets;
    }

    get selectedFeature(): WorksheetFeatureModel {
        return this._selectedFeature;
    }

    set selectedFeature(value: WorksheetFeatureModel) {
        this._selectedFeature = value;
    }

    private __getSelectedFeature(featureSet: WorksheetFeatureSetModel): WorksheetFeatureModel | undefined {
        if (featureSet.features) {
            for (let feature of featureSet.features.models) {
                if (feature.selected) {
                    return feature;
                }
            }
        }

        if (featureSet.childFeatureSets) {
            for (let childFeatureSet of featureSet.childFeatureSets.models) {
                const selectedFeature = this.__getSelectedFeature(childFeatureSet);
                if (selectedFeature) {
                    return selectedFeature;
                }
            }
        }

        return undefined;    
    }

    private __getFirstFeature(featureSet: WorksheetFeatureSetModel): WorksheetFeatureModel | undefined {
        if (featureSet.features && featureSet.features.length > 0) {
            return featureSet.features.at(1);
        }

        if (featureSet.childFeatureSets) {
            for (let childFeatureSet of featureSet.childFeatureSets.models) {
                const firstFeature = this.__getFirstFeature(childFeatureSet);
                if (firstFeature) {
                    return firstFeature;
                }
            }
        }

        return undefined;
    }

    private _accessionNumber: string;
    private _rootFeatureSets: WorksheetFeatureSetCollection;
    private _selectedFeature: WorksheetFeatureModel;
}

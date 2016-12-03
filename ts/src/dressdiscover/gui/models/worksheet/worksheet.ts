import Backbone = require("backbone");
import { Services } from "dressdiscover/gui/services/services";
import { WorksheetDefinition } from "dressdiscover/api/models/worksheet/worksheet_definition";
import { WorksheetFeature } from "./worksheet_feature";
import { WorksheetFeatureSet } from "./worksheet_feature_set";
import { WorksheetState } from "dressdiscover/api/models/worksheet/worksheet_state";

export class Worksheet extends Backbone.Model {
    constructor(kwds: { accessionNumber: string, definition: WorksheetDefinition, state: WorksheetState }) {
        super();
        this._accessionNumber = kwds.accessionNumber;
        this._rootFeatureSet = new WorksheetFeatureSet({
            allFeatures: this._allFeatures,
            definition: kwds.definition.rootFeatureSet,
            parentFeatureSet: undefined,
            parentsChildNumber: undefined,
            state: kwds.state.rootFeatureSet
        });

        {
            let selectedFeature = this.__getSelectedFeature(this.rootFeatureSet);
            if (selectedFeature) {
                this._selectedFeature = selectedFeature;
            } else {
                selectedFeature = this.__getFirstFeature(this.rootFeatureSet);
                if (selectedFeature) {
                    this._selectedFeature = selectedFeature;
                    selectedFeature.selected = true;
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

    static fetchFromService(kwds: { accessionNumber: string }): Worksheet {
        const definition = Services.instance.worksheetQueryService.getWorksheetDefinitionSync();
        const state = Services.instance.worksheetQueryService.getWorksheetStateSync({ accessionNumber: kwds.accessionNumber });
        return new Worksheet({ accessionNumber: kwds.accessionNumber, definition: definition, state: state });
    }
   
    get currentState(): WorksheetState | undefined {
        const rootFeatureSetState = this.rootFeatureSet.currentState;
        if (rootFeatureSetState) {
            return new WorksheetState({ accessionNumber: this.accessionNumber, rootFeatureSet: rootFeatureSetState });
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

    get rootFeatureSet(): WorksheetFeatureSet {
        return this._rootFeatureSet;
    }

    get selectedFeature(): WorksheetFeature {
        return this._selectedFeature;
    }

    set selectedFeature(value: WorksheetFeature) {
        this._selectedFeature = value;
    }

    private __getSelectedFeature(featureSet: WorksheetFeatureSet): WorksheetFeature | undefined {
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

    private __getFirstFeature(featureSet: WorksheetFeatureSet): WorksheetFeature | undefined {
        if (featureSet.features && featureSet.features.length > 0) {
            return featureSet.features.at(0);
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
    private _allFeatures: WorksheetFeature[] = [];
    private _rootFeatureSet: WorksheetFeatureSet;
    private _selectedFeature: WorksheetFeature;
}

import _ = require("underscore");
import Backbone = require("backbone");
import { Services } from "dressdiscover/gui/services/services";
import { WorksheetFeatureModel } from "./worksheet_feature_model";
import { WorksheetFeatureSetCollection } from "./worksheet_feature_set_collection";
import { WorksheetFeatureSetModel } from "./worksheet_feature_set_model";
import { WorksheetFeatureSetState } from "dressdiscover/api/models/worksheet/worksheet_feature_set_state";
import { WorksheetState } from "dressdiscover/api/models/worksheet/worksheet_state";

export class WorksheetModel extends Backbone.Model {
    get currentState(): WorksheetState | undefined {
        let rootFeatureSetStates: { [index: string]: WorksheetFeatureSetState } = {};
        for (let featureSet of this.rootFeatureSets.models) {
            let featureSetState = featureSet.currentState;
            if (featureSetState) {
                rootFeatureSetStates[featureSet.id] = featureSetState;
            }
        }
        if (!_.isEmpty(rootFeatureSetStates)) {
            return new WorksheetState({ rootFeatureSets: rootFeatureSetStates });
        } else {
            return undefined;
        }
    }

    fetchFromService(): void {
        const worksheetDefinition = Services.instance.worksheetQueryService.getWorksheetDefinitionSync();
        const worksheetState = Services.instance.worksheetQueryService.getWorksheetStateSync();
        const rootFeatureSets: WorksheetFeatureSetModel[] = [];
        for (let rootFeatureSetDefinition of worksheetDefinition.rootFeatureSets.models) {
            rootFeatureSets.push(new WorksheetFeatureSetModel(rootFeatureSetDefinition, worksheetState.rootFeatureSets ? worksheetState.rootFeatureSets[rootFeatureSetDefinition.id] : undefined));
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
                        break;
                    }
                }
            }

            if (!this._selectedFeature) {
                throw new Error("should never happen");
            }
        }

        //Services.instance.worksheetQueryService.getWorksheetDefinitionAsync({
        //    error: function (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null): any {
        //        console.error(textStatus);
        //    },
        //    success: function (worksheetDefinition: WorksheetDefinition): void {
        //        Services.instance.worksheetQueryService.getWorksheetStateAsync({
        //            error: function (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null): any {
        //                console.error(textStatus);
        //            },
        //            success: function (worksheetState: WorksheetState): void {
        //            }
        //        });
        //    }
        //});
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

    private _rootFeatureSets: WorksheetFeatureSetCollection;
    private _selectedFeature: WorksheetFeatureModel;
}

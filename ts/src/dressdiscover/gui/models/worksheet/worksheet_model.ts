//import { WorksheetDefinition } from "../../../api/models/worksheet/worksheet_definition";
//import { WorksheetState } from "../../../api/models/worksheet/worksheet_state";
import Services = require("../../services/services");
import Backbone = require("backbone");
import WorksheetFeatureModel = require("./worksheet_feature_model");
import WorksheetFeatureSetCollection = require("./worksheet_feature_set_collection");
import WorksheetFeatureSetModel = require("./worksheet_feature_set_model");

class WorksheetModel extends Backbone.Model {
    fetchFromService(): void {
        const worksheetDefinition = Services.instance.worksheetQueryService.getWorksheetDefinitionSync();
        const worksheetState = Services.instance.worksheetQueryService.getWorksheetStateSync();
        const rootFeatureSets: WorksheetFeatureSetModel[] = [];
        for (let rootFeatureSetDefinition of worksheetDefinition.rootFeatureSets.models) {
            rootFeatureSets.push(new WorksheetFeatureSetModel(rootFeatureSetDefinition, worksheetState.rootFeatureSets ? worksheetState.rootFeatureSets[rootFeatureSetDefinition.id] : undefined));
        }
        this._rootFeatureSets = new WorksheetFeatureSetCollection(rootFeatureSets);

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

    get rootFeatureSets(): WorksheetFeatureSetCollection {
        return this._rootFeatureSets;
    }

    get selectedFeature(): WorksheetFeatureModel {
        for (let featureSet of this.rootFeatureSets.models) {
            const selectedFeature = this.__getSelectedFeature(featureSet);
            if (selectedFeature) {
                return selectedFeature;
            }
        }

        for (let featureSet of this.rootFeatureSets.models) {
            const selectedFeature = this.__getFirstFeature(featureSet);
            if (selectedFeature) {
                return selectedFeature;
            }
        }

        throw new Error("should never happen");
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
     

    private _rootFeatureSets: WorksheetFeatureSetCollection;
}

export = WorksheetModel;

import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import { WorksheetFeatureSetState } from "../../../api/models/worksheet/worksheet_feature_set_state";
import Services = require("../../services/services");
import Backbone = require("backbone");
import WorksheetFeatureCollection = require("./worksheet_feature_collection");
import WorksheetFeatureSetCollection = require("./worksheet_feature_set_collection");
import WorksheetFeatureModel = require("./worksheet_feature_model");
import WorksheetFeatureSetModel = require("./worksheet_feature_set_model");


class WorksheetModel extends Backbone.Model {
    fetchFromService(): void {
        const modelThis = this;
        Services.instance.worksheetQueryService.getWorksheetFeatureSetDefinitionsAsync({
            error: function (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null): any {
                console.error(textStatus);
            },
            success: function (returnValue: { [index: string]: WorksheetFeatureSetDefinition }): void {
                const definitions = returnValue;
                Services.instance.worksheetQueryService.getWorksheetFeatureSetStatesAsync({
                    error: function (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null): any {
                        console.error(textStatus);
                    },
                    success: function (returnValue: { [index: string]: WorksheetFeatureSetState }): void {
                        const featureSets: WorksheetFeatureSetModel[] = [];
                        const state = returnValue;
                        for (var featureSetId in definitions) {
                            const featureSetDefinition = definitions[featureSetId];
                            const featureSetState = state[featureSetId];
                            const featureModels: WorksheetFeatureModel[] = [];
                            for (var featureId in featureSetDefinition.features) {
                                featureModels.push(new WorksheetFeatureModel(featureSetDefinition.features[featureId], featureId, featureSetState.features[featureId]));
                            }
                            featureSets.push(new WorksheetFeatureSetModel(featureSetDefinition, new WorksheetFeatureCollection(featureModels), featureSetId, featureSetState));
                        }
                        modelThis._featureSets = new WorksheetFeatureSetCollection(featureSets);
                    }
                });
            }
        });
    }

    get featureSets(): WorksheetFeatureSetCollection {
        return this.featureSets;
    }

    private _featureSets: WorksheetFeatureSetCollection;
}

export = WorksheetModel;

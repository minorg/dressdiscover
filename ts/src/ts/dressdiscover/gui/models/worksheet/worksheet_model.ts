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
            success: function (returnValue: Backbone.Collection<WorksheetFeatureSetDefinition>): void {
                const featureSetDefinitions = returnValue.models;
                Services.instance.worksheetQueryService.getWorksheetFeatureSetStatesAsync({
                    error: function (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null): any {
                        console.error(textStatus);
                    },
                    success: function (returnValue: { [index: string]: WorksheetFeatureSetState }): void {
                        const featureSets: WorksheetFeatureSetModel[] = [];
                        const state = returnValue;
                        for (let featureSetDefinition of featureSetDefinitions) {
                            var featureSetState = state[featureSetDefinition.id];
                            const featureModels: WorksheetFeatureModel[] = [];
                            for (let featureDefinition of featureSetDefinition.features.models) {
                                featureModels.push(new WorksheetFeatureModel(featureDefinition, featureSetState ? featureSetState.features[featureId] : undefined));
                            }
                            featureSets.push(new WorksheetFeatureSetModel(featureSetDefinition, new WorksheetFeatureCollection(featureModels), featureSetState));
                        }
                        modelThis._featureSets = new WorksheetFeatureSetCollection(featureSets);
                    }
                });
            }
        });
    }

    get featureSets(): WorksheetFeatureSetCollection {
        return this._featureSets;
    }

    private _featureSets: WorksheetFeatureSetCollection;
}

export = WorksheetModel;

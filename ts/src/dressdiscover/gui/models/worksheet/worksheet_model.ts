﻿//import { WorksheetDefinition } from "../../../api/models/worksheet/worksheet_definition";
//import { WorksheetState } from "../../../api/models/worksheet/worksheet_state";
import Services = require("../../services/services");
import Backbone = require("backbone");
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

    private _rootFeatureSets: WorksheetFeatureSetCollection;
}

export = WorksheetModel;
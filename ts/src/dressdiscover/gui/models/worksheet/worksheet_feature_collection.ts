﻿import Backbone = require("backbone");
import WorksheetFeatureModel = require("./worksheet_feature_model");

class WorksheetFeatureCollection extends Backbone.Collection<WorksheetFeatureModel> {
    constructor(models: WorksheetFeatureModel[]) {
        super(models);
        this.on("change:selected", (changedModel: WorksheetFeatureModel) => {
            if (!changedModel.selected) {
                return;
            }
            console.debug("select " + changedModel.id);
            for (let otherModel of this.models) {
                if (otherModel === changedModel) {
                    continue;
                } else if (otherModel.selected) {
                    console.debug("deselect " + otherModel.id);
                    otherModel.selected = false;
                }
            }
        });
    }
}

export = WorksheetFeatureCollection;
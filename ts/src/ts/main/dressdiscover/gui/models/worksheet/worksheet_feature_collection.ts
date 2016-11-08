/// <reference path="../../../../../gen/index.ts" />

import Backbone = require("backbone");
import WorksheetFeatureModel = require("./worksheet_feature_model");

class WorksheetFeatureCollection extends Backbone.Collection<WorksheetFeatureModel> {
    constructor(models: WorksheetFeatureModel[]) {
        super(models);
    }
}

export = WorksheetFeatureCollection;

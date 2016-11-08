/// <reference path="../../../../../gen/index.ts" />

import Backbone = require("backbone");

class WorksheetFeatureModel extends Backbone.Model {
    private _definition: dressdiscover.api.models.worksheet.WorksheetFeatureDefinition;

    constructor(definition: dressdiscover.api.models.worksheet.WorksheetFeatureDefinition, state: dressdiscover.api.models.worksheet.WorksheetFeatureState) {
        super();
        this._definition = definition;
        this.set("state", state);
    }

    get definition(): dressdiscover.api.models.worksheet.WorksheetFeatureDefinition {
        return this._definition;
    }

    get state(): dressdiscover.api.models.worksheet.WorksheetFeatureState {
        return this.get("state");
    }
}

export = WorksheetFeatureModel;

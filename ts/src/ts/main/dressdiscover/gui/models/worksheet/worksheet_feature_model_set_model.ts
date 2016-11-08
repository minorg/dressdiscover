/// <reference path="../../../../../gen/index.ts" />

import Backbone = require("backbone");

class WorksheetFeatureSetModel extends Backbone.Model {
    private _definition: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition;

    constructor(definition: dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition, state: dressdiscover.api.models.worksheet.WorksheetFeatureSetState) {
        super();
        this._definition = definition;
        this.set("state", state);
    }

    get definition(): dressdiscover.api.models.worksheet.WorksheetFeatureSetDefinition {
        return this._definition;
    }

    get state(): dressdiscover.api.models.worksheet.WorksheetFeatureSetState {
        return this.get("state");
    }
}

export = WorksheetFeatureSetModel;
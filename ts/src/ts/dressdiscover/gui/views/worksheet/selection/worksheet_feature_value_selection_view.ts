import Backbone = require("backbone");
import Mustache = require("mustache");
//import _ = require("underscore");
import WorksheetFeatureValueModel = require("../../../models/worksheet/worksheet_feature_value_model");

declare function require(moduleName: string): any;

class WorksheetFeatureValueSelectionView extends Backbone.View<WorksheetFeatureValueModel> {
    template: string;

    constructor(options: { model: WorksheetFeatureValueModel }) {
        super(options);
        this.template = require("raw!./worksheet_feature_value_selection_view.html");
    }

    render() {
        this.$el.html(Mustache.render(this.template, this.model.definition.toJSON()));
        return this;
    }
}

export = WorksheetFeatureValueSelectionView;

import Backbone = require("backbone");
import Mustache = require("mustache");
//import _ = require("underscore");
import WorksheetFeatureModel = require("../../../models/worksheet/worksheet_feature_model");
import WorksheetFeatureValueSelectionView = require("./worksheet_feature_value_selection_view");

declare function require(moduleName: string): any;

class WorksheetFeatureSelectionView extends Backbone.View<WorksheetFeatureModel> {
    template: string;

    constructor(options: { model: WorksheetFeatureModel }) {
        super(options);
        this.template = require("raw!./worksheet_feature_selection_view.html");
    }

    render() {
        this.$el.html(Mustache.render(this.template, this.model.definition.toJSON()));
        if (this.model.definition.featureValues) {
            const featureValuesEl = this.$el.find("#feature-values");
            for (let featureValueModel of this.model.featureValues.models) {
                featureValuesEl.append(new WorksheetFeatureValueSelectionView({ model: featureValueModel }).render().el);
            }
        }
        return this;
    }
}

export = WorksheetFeatureSelectionView;

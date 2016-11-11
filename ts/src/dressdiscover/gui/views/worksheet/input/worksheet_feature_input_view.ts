import Backbone = require("backbone");
//import _ = require("underscore");
import WorksheetFeatureModel = require("../../../models/worksheet/worksheet_feature_model");
import WorksheetFeatureValueInputView = require("./worksheet_feature_value_input_view");

declare function require(moduleName: string): any;

class WorksheetFeatureInputView extends Backbone.View<WorksheetFeatureModel> {
    template: string;

    constructor(options: { model: WorksheetFeatureModel }) {
        super(options);
        this.template = require("raw!./worksheet_feature_input_view.html");
    }

    render() {
        this.$el.html(Mustache.render(this.template, this.model.definition.toJSON()));
        if (this.model.definition.featureValues) {
            const featureValuesEl = this.$el.find("#feature-values");
            for (let featureValueModel of this.model.featureValues.models) {
                featureValuesEl.append(new WorksheetFeatureValueInputView({ model: featureValueModel }).render().el);
            }
        }
        return this;
    }
}

export = WorksheetFeatureInputView;

import Backbone = require("backbone");
import Mustache = require("mustache");
//import _ = require("underscore");
import WorksheetFeatureValueModel = require("../../../models/worksheet/worksheet_feature_value_model");

declare function require(moduleName: string): any;

class WorksheetFeatureValueInputView extends Backbone.View<WorksheetFeatureValueModel> {
    template: string;

    constructor(options: { model: WorksheetFeatureValueModel }) {
        super(options);
        this.template = require("raw!./worksheet_feature_value_input_view.html");
    }

    render() {
        var scope: any = this.model.definition.toJSON();
        scope['image'] = scope['image'].toJSON();
        this.$el.html(Mustache.render(this.template, scope));
        return this;
    }
}

export = WorksheetFeatureValueInputView;

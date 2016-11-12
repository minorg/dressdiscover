import Backbone = require("backbone");
//import _ = require("underscore");
import WorksheetEnumFeatureValueModel = require("../../../models/worksheet/worksheet_enum_feature_value_model");

declare function require(moduleName: string): any;

class WorksheetEnumFeatureValueInputView extends Backbone.View<WorksheetEnumFeatureValueModel> {
    template: string;

    constructor(options: { model: WorksheetEnumFeatureValueModel }) {
        super(options);
        this.template = require("raw!./worksheet_enum_feature_value_input_view.html");
    }

    render() {
        var scope: any = this.model.definition.toJSON();
        scope['image'] = scope['image'].toJSON();
        this.$el.html(Mustache.render(this.template, scope));
        return this;
    }
}

export = WorksheetEnumFeatureValueInputView;

import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureValueModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_model";

declare function require(moduleName: string): any;

export class WorksheetEnumFeatureValueInputView extends Marionette.ItemView<WorksheetEnumFeatureValueModel> {
    constructor(options: any) {
        super(_.extend(options, { template: _.template(require("raw!./worksheet_enum_feature_value_input_view.html")) }));
    }

    //render() {
    //    var scope: any = this.model.definition.toJSON();
    //    scope['image'] = scope['image'].toJSON();
    //    this.$el.html(Mustache.render(this.template, scope));
    //    return this;
    //}
}

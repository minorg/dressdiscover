﻿import _ = require("underscore");
import Backbone = require("backbone");
import Marionette = require("backbone.marionette");
import { WorksheetEnumFeatureValueModel } from "dressdiscover/gui/models/worksheet/worksheet_enum_feature_value_model";
import { WorksheetEnumFeatureValueInputView } from "./worksheet_enum_feature_value_input_view";

declare function require(moduleName: string): any;

export class WorksheetEnumFeatureInputView extends Marionette.CollectionView<WorksheetEnumFeatureValueModel, WorksheetEnumFeatureValueInputView> {
    constructor(options: any) {
        super(_.extend(options, {
            el: "#feature-values",
            collection: options.model.featureValues ? options.model.featureValues : new Backbone.Collection<WorksheetEnumFeatureValueModel>(),
            childView: WorksheetEnumFeatureValueInputView,
            template: _.template(require("raw!./worksheet_enum_feature_input_view.html"))
        }));
    }

    //render() {
    //    this.$el.html(Mustache.render(this.template, this.model.definition.toJSON()));
    //    //if (this.model.definition.featureValues) {
    //    //    const featureValuesEl = this.$el.find("#feature-values");
    //    //    for (let featureValueModel of this.model.featureValues.models) {
    //    //        featureValuesEl.append(new WorksheetFeatureValueInputView({ model: featureValueModel }).render().el);
    //    //    }
    //    //}
    //    return this;
    //}
}
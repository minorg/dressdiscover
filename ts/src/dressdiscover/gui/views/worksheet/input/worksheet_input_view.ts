﻿import Marionette = require("backbone.marionette");
//import WorksheetFeatureModel = require("../../../models/worksheet/worksheet_feature_model");
import WorksheetModel = require("../../../models/worksheet/worksheet_model");
//import WorksheetFeatureInputView = require("./worksheet_feature_input_view");

class WorksheetInputView extends Marionette.View<WorksheetModel> {
    constructor(options: {model: WorksheetModel}) {
        super(options);
    }

    render() {
        // TODO: keep selected feature model when change:selected is fired
        // If it's not set then use the first feature of the first feature set
        //var selectedFeatureModel: WorksheetFeatureModel | undefined = undefined;
        //for (let featureSetModel of this.model.rootFeatureSets.models) {
        //    for (let featureModel of featureSetModel.features.models) {
        //        if (!featureModel.selected) {
        //            continue;
        //        }
        //        selectedFeatureModel = featureModel;
        //        break;
        //    }
        //    if (selectedFeatureModel) {
        //        break;
        //    }
        //}
        //if (selectedFeatureModel) {
        //    console.debug("feature " + selectedFeatureModel.id + " selected");
        //} else {
        //    console.debug("no feature selected, selecting first");
        //    selectedFeatureModel = this.model.featureSets.at(0).features.at(1);
        //    selectedFeatureModel.selected = true;
        //}
        //this.$el.append(new WorksheetFeatureInputView({ model: selectedFeatureModel }).render().el);
        return this;
    }
}

export = WorksheetInputView;
import Backbone = require("backbone");
import WorksheetFeatureModel = require("../../../models/worksheet/worksheet_feature_model");
import WorksheetModel = require("../../../models/worksheet/worksheet_model");
import WorksheetFeatureInputView = require("./worksheet_feature_input_view");

class WorksheetInputView extends Backbone.View<WorksheetModel> {
    constructor(options: {model: WorksheetModel}) {
        super(options);
    }

    render() {
        if (this.model.featureSets.length == 0) {
            return this;
        }

        console.debug("re-rendering input");
        var selectedFeatureModel: WorksheetFeatureModel | undefined = undefined;
        for (let featureSetModel of this.model.featureSets.models) {
            for (let featureModel of featureSetModel.features.models) {
                if (!featureModel.selected) {
                    continue;
                }
                selectedFeatureModel = featureModel;
                break;
            }
            if (selectedFeatureModel) {
                break;
            }
        }
        if (selectedFeatureModel) {
            console.debug("feature " + selectedFeatureModel.id + " selected");
        } else {
            console.debug("no feature selected, selecting first");
            selectedFeatureModel = this.model.featureSets.at(0).features.at(1);
            selectedFeatureModel.selected = true;
        }
        this.$el.append(new WorksheetFeatureInputView({ model: selectedFeatureModel }).render().el);
        return this;
    }
}

export = WorksheetInputView;

import Backbone = require("backbone");
import WorksheetModel = require("../../../models/worksheet/worksheet_model");
import WorksheetFeatureSelectionView = require("./worksheet_feature_selection_view");

class WorksheetSelectionView extends Backbone.View<WorksheetModel> {
    constructor(options: {model: WorksheetModel}) {
        super(options);
    }

    render() {
        if (this.model.featureSets.length == 0) {
            return this;
        }

        const featureModel = this.model.featureSets.at(0).features.at(1);
        this.$el.append(new WorksheetFeatureSelectionView({ model: featureModel }).render().el);
        
        return this;
    }
}

export = WorksheetSelectionView;

import Backbone = require("backbone");
import WorksheetModel = require("../../../models/worksheet/worksheet_model");
import WorksheetFeatureSetNavigationView = require("./worksheet_feature_set_navigation_view");
//import _ = require("underscore");

declare function require(moduleName: string): any;

class WorksheetNavigationView extends Backbone.View<WorksheetModel> {
    template: string;

    constructor(options: {model: WorksheetModel}) {
        super(options);
        this.template = require("raw!./worksheet_navigation_view.html");
    }

    render() {
        this.$el.html(this.template);

        const featureSetsEl = this.$el.find("#feature-sets");
        for (let featureSetModel of this.model.rootFeatureSets.models) {
            featureSetsEl.append(new WorksheetFeatureSetNavigationView({ model: featureSetModel }).render().el);
        }

        //const collapseEl = this.$el.find("#worksheet-navigation");
        //collapseEl
        //    .on("shown.bs.collapse", () => {
        //        alert("Show");
        //        $(this).parent().find(".glyphicon-plus").removeClass("glyphicon-plus").addClass("glyphicon-minus");
        //        return true;
        //    })
        //    .on("hidden.bs.collapse", () => {
        //        alert("Hide");
        //        $(this).parent().find(".glyphicon-minus").removeClass("glyphicon-minus").addClass("glyphicon-plus");
        //        return true;
        //    });

        return this;
    }
}

export = WorksheetNavigationView;

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
        for (let featureSetModel of this.model.featureSets.models) {
            featureSetsEl.append(new WorksheetFeatureSetNavigationView({ model: featureSetModel }).render().el);
        }

        this.$el.find('h4.panel-title').on('click', (e) => {
	   		// remove "open" class from all headers in this group
	   		$(this).closest('.accordion-group').find('h4.panel-title').removeClass('open');
            $(this).closest('.accordion-group').find('.collapse').removeClass("in");
	   		// then set the one clicked on to open
	   		$(this).addClass('open');
            $(this).parent().next(".collapse").addClass("in");
	    });

        return this;
    }
}

export = WorksheetNavigationView;

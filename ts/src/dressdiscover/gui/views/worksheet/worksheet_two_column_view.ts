import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_navigation_event";
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";
import { WorksheetInputView } from "./input/worksheet_input_view";
import { WorksheetSidebarView } from "./worksheet_sidebar_view";

declare function require(moduleName: string): any;

export class WorksheetTwoColumnView extends Marionette.LayoutView<WorksheetModel> {
    constructor(options: any) {
        super(_.extend(options, {
            regions: {
                leftColumn: "#left-column",
                rightColumn: "#right-column"
            },
            template: _.template(require("raw!./worksheet_two_column_view.html"))
        }));
    }

    initialize() {
        this.model.fetchFromService();

        this.listenTo(AppRadio.channel, WorksheetFeatureNavigationEvent.NAME, this.onFeatureNavigation);
    }

    onFeatureNavigation(event: WorksheetFeatureNavigationEvent) {
        this.model.selectedFeature.selected = false;
        this.model.selectedFeature = event.feature;

        let region = this.getRegion("rightColumn");
        region.reset();
        region.show(WorksheetInputView.create(event.feature));
    }

    onBeforeShow() {
        this.showChildView("leftColumn", new WorksheetSidebarView({ model: this.model }));
        this.showChildView("rightColumn", WorksheetInputView.create(this.model.selectedFeature));
    }
}

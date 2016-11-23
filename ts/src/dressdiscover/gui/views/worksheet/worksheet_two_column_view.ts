import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_navigation_event";
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";
import { WorksheetInputView } from "./input/worksheet_input_view";
import { WorksheetSidebarView } from "./worksheet_sidebar_view";

declare function require(moduleName: string): any;

export class WorksheetTwoColumnView extends Marionette.LayoutView<Worksheet> {
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
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureNavigationEvent.NAME, this.onFeatureNavigation);
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

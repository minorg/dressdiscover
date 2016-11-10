import Backbone = require("backbone");

import WorksheetModel = require("../../models/worksheet/worksheet_model");
import WorksheetNavigationView = require("./navigation/worksheet_navigation_view");
import WorksheetSelectionView = require("./selection/worksheet_selection_view");

declare function require(moduleName: string): any;

class WorksheetView extends Backbone.View<WorksheetModel> {
    template: string;

    constructor(options?: any) {
        super(options);
        this.model = new WorksheetModel();
        this.setElement($('#content'), true);
        this.template = require("raw!./worksheet_view.html");

        this.model.fetchFromService();
    }

    render() {
        this.$el.html(this.template);

        const leftColumnEl: JQuery = $("#left-column");
        leftColumnEl.empty();
        leftColumnEl.append(new WorksheetNavigationView({ model: this.model }).render().el);

        const rightColumnEl: JQuery = $("#right-column");
        rightColumnEl.empty();
        leftColumnEl.append(new WorksheetSelectionView({ model: this.model }).render().el);

        return this;
    }
}

export = WorksheetView;

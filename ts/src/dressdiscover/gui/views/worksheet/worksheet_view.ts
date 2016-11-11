import Backbone = require("backbone");

import WorksheetModel = require("../../models/worksheet/worksheet_model");
import WorksheetInputView = require("./input/worksheet_input_view");
import WorksheetNavigationView = require("./navigation/worksheet_navigation_view");
import "./worksheet_view.less";

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
        console.debug("re-rendering worksheet view");

        this.$el.html(this.template);

        const leftColumnEl: JQuery = $("#left-column");
        leftColumnEl.empty();
        leftColumnEl.append(new WorksheetNavigationView({ model: this.model }).render().el);

        const rightColumnEl: JQuery = $("#right-column");
        rightColumnEl.empty();
        rightColumnEl.append(new WorksheetInputView({ model: this.model }).render().el);

        return this;
    }
}

export = WorksheetView;

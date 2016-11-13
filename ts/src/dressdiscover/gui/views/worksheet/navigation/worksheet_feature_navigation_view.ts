import _ = require("underscore");
import Marionette = require("backbone.marionette");
import WorksheetFeatureModel = require("../../../models/worksheet/worksheet_feature_model");

declare function require(moduleName: string): any;

class WorksheetFeatureNavigationView extends Marionette.ItemView<WorksheetFeatureModel> {
    constructor(options: any) {
        options.className = "list-group-item";
        options.template = _.template(require("raw!./worksheet_feature_navigation_view.html"));
        options.tagName = "li";
        super(options);
        //_.bindAll(this, "onClick");
    }

    //onClick(): void {
    //    this.model.selected = true;
    //}

    //render() {
    //    this.$el.attr("role", "presentation");
    //    this.$el.addClass("list-group-item");
    //    this.$el.html(Mustache.render(this.template, this.model.definition.toJSON()));
    //    this.$el.find("a").on("click", this.onClick);
    //    return this;
    //}

    serializeData(): any {
        return { "displayName": this.model.definition.displayName, "id": this.model.definition.id };
    }
}

export = WorksheetFeatureNavigationView;

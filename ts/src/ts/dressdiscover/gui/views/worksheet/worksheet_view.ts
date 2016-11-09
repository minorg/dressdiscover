import Backbone = require("backbone");
import Mustache = require("mustache");
import * as $ from "jquery";
import { WorksheetFeatureSetDefinition } from "../../../api/models/worksheet/worksheet_feature_set_definition";
import WorksheetModel = require("../../models/worksheet/worksheet_model");
import Services = require("../../services/services");
import "bootstrap-drawer/dist/css/bootstrap-drawer.css";
import "bootstrap-drawer/dist/js/drawer.min.js";

declare function require(moduleName: string): any;

class WorksheetView extends Backbone.View<WorksheetModel> {
    template: string;

    constructor(options?: any) {
        super(options);
        this.model = new WorksheetModel();
        this.setElement($('#content'), true);
        this.template = require("raw!./worksheet_view.html");
    }

    render() {
        Services.instance.worksheetQueryService.getWorksheetFeatureSetDefinitionsAsync({
            error: function(jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null): any {

            },
            success: function (return_value: { [index: string]: WorksheetFeatureSetDefinition }):void {

            }
        });
        this.$el
            .html(Mustache.render(this.template, this.model.toJSON()));
//            .toggleClass('completed', this.model.get('completed'));
        //this.input = this.$('.todo-input');
        return this;
    }
}

export = WorksheetView;

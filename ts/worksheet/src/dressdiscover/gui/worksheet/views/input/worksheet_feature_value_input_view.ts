import _ = require("underscore");
import { Application } from "dressdiscover/gui/worksheet/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureValue } from "dressdiscover/gui/worksheet/models/worksheet_feature_value";
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/worksheet/events/worksheet_feature_input_event";
import { WorksheetFeatureValueFullSizeImageView } from "dressdiscover/gui/worksheet/views/input/worksheet_feature_value_full_size_image_view";
import "../../../../../../node_modules/magnify/dist/css/magnify.css";
import "../../../../../../node_modules/magnify/dist/js/jquery.magnify.js";
import "./worksheet_feature_value_input_view.less";

declare function require(moduleName: string): any;

export class WorksheetFeatureValueInputView extends Marionette.ItemView<WorksheetFeatureValue> {
    constructor(options?: any) {    
        super(_.extend(options, {
            events: {
                "click a.display-name": "onClickSelect",
                "click a.full-size": "onClickFullSize",
                "click a.thumbnail": "onClickSelect",
                "click div.checkbox": "onClickSelect"
            },
            template: _.template(require("raw!./worksheet_feature_value_input_view.html")),
        }));
        this.listenTo(this.model, "change:selected", this.onModelChangeSelected);
    }

    initialize() {
        this.ui = { checkbox: "input", image: "img" };
    }

    onClickFullSize() {
        Application.instance.modalRegion.show(new WorksheetFeatureValueFullSizeImageView({ model: this.model }));
    }

    onClickSelect() {
        this.model.selected = !this.model.selected;
        this.ui.checkbox[0].checked = this.model.selected;
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureInputEvent.NAME, new WorksheetFeatureInputEvent({ feature: this.model.parentFeature }));
    }

    onModelChangeSelected() {
        this.ui.checkbox[0].checked = this.model.selected;
    }

    serializeData(): any {
        let data = this.model.definition.toJSON();
        data["displayName"] = this.model.displayName;
        if (this.model.definition.image) {
            data["image"] = this.model.definition.image.toJSON();
            data["image"]["rights"] = this.model.definition.image.rights.toJSON();
        } else {
            data["image"] = null;
        }
        return data;
    }

    onRender() {
        this.ui.checkbox[0].checked = this.model.selected;
        this.ui.image.magnify();
    }
}

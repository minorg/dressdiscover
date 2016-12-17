import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureValue } from "dressdiscover/gui/models/worksheet/worksheet_feature_value";
import "./worksheet_feature_value_full_size_image_view.less";

declare function require(moduleName: string): any;

export class WorksheetFeatureValueFullSizeImageView extends Marionette.ItemView<WorksheetFeatureValue> {
    constructor(options?: any) {    
        super(_.extend(options, {
            events: {
                "click #close-button": "onClickCloseButton",
            },
            template: _.template(require("raw!./worksheet_feature_value_full_size_image_view.html"))
        }));
    }

    onClickCloseButton() {
        Application.instance.modalRegion.empty();
    }

    serializeData(): any {
        return { "displayName": this.model.displayName, "url": this.model.definition.image.fullSizeUrl };
    }
}

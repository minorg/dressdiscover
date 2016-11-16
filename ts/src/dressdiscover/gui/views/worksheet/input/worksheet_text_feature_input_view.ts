import _ = require("underscore");
import Marionette = require("backbone.marionette");
import { WorksheetTextFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_text_feature_model";
import "../../../../../../node_modules/backbone.stickit/backbone.stickit.js";

declare function require(moduleName: string): any;

export class WorksheetTextFeatureInputView extends Marionette.ItemView<WorksheetTextFeatureModel> {
    bindings = {
        "#text": {
            observe: "text",
            onSet: "onSet"
        }
    };

    constructor(options: any) {
        super(_.extend(options, {
            template: _.template(require("raw!./worksheet_text_feature_input_view.html"))
        }));
    }

    onBeforeDestroy() {
        (this as any).unstickit();
    }

    onRender() {
        (this as any).stickit();
    }

    onSet(value: string) {
        for (var key in this.model.attributes) {
            console.info(key + ' = ' + this.model.attributes[key]);
        }
        console.info("Set to " + value);
        return value;
    }

    serializeData(): any {
        return { "displayName": this.model.definition.displayName, "id": this.model.definition.id };
    }
}

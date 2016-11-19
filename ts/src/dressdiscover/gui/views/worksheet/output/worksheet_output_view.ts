import _ = require("underscore");
import { AppRadio } from "dressdiscover/gui/app_radio";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetFeatureModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_model";
import { WorksheetFeatureSetModel } from "dressdiscover/gui/models/worksheet/worksheet_feature_set_model";
import { WorksheetModel } from "dressdiscover/gui/models/worksheet/worksheet_model";

declare function require(moduleName: string): any;

export class WorksheetOutputView extends Marionette.ItemView<WorksheetModel> {
    constructor(options?: any) {
        super(_.extend(options, {
            template: _.template(require("raw!./worksheet_output_view.html"))
        }));
    }

    initialize() {
        this.listenTo(AppRadio.channel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
    }

    onFeatureInput(event: WorksheetFeatureInputEvent) {
        this.render();
    }

    serializeData(): any {
        let output = this.__calculateOutput();
        if (!_.isEmpty(output)) {
            return { output: output };
        } else {
            return { output: undefined };
        }
    }

    private __calculateOutput(): { [index: string]: string[] } {
        let output: { [index: string]: string[] } = {};
        for (let rootFeatureSet of this.model.rootFeatureSets.models) {
            _.extend(output, this.__calculateFeatureSetOutput(rootFeatureSet));
        }
        console.info("output: " + JSON.stringify(output));
        return output;
    }

    private __calculateFeatureSetOutput(featureSet: WorksheetFeatureSetModel): { [index: string]: string[] } {
        let output: { [index: string]: string[] } = {};
        for (let childFeatureSet of featureSet.childFeatureSets.models) {
            let childOutput = this.__calculateFeatureSetOutput(childFeatureSet);
            //for (var key in childOutput) {
            //    output[featureSet.displayName + " &lt; " + key] = childOutput[key];
            //}
            output = _.extend(output, childOutput);
        }
        for (let feature of featureSet.features.models) {
            let childOutput = this.__calculateFeatureOutput(feature);
            //for (var key in childOutput) {
            //    output[featureSet.displayName + " &lt; " + key] = childOutput[key];
            //}    
            output = _.extend(output, childOutput);
        }
        return output;
    }

    private __calculateFeatureOutput(feature: WorksheetFeatureModel): { [index: string]: string[] } {
        let values = feature.outputValues;
        if (values.length == 0) {
            return {};
        }
        let output: { [index: string]: string[] } = {};
        output[feature.displayName] = values;
        return output;
    }
}

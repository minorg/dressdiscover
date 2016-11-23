import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";

declare function require(moduleName: string): any;

export class WorksheetOutputView extends Marionette.ItemView<Worksheet> {
    constructor(options?: any) {
        super(_.extend(options, {
            template: _.template(require("raw!./worksheet_output_view.html"))
        }));
    }

    initialize() {
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
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

    private __calculateFeatureSetOutput(featureSet: WorksheetFeatureSet): { [index: string]: string[] } {
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

    private __calculateFeatureOutput(feature: WorksheetFeature): { [index: string]: string[] } {
        let values = feature.outputValues;
        if (values.length == 0) {
            return {};
        }
        let output: { [index: string]: string[] } = {};
        output[feature.displayName] = values;
        return output;
    }
}

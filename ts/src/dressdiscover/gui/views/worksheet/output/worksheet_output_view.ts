import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_navigation_event";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";

declare function require(moduleName: string): any;

interface WorksheetFeatureOutput {
    feature: WorksheetFeature;
    featureValues: string[];
}

interface WorksheetOutput {
    [featureDisplayName: string]: WorksheetFeatureOutput;
}

export class WorksheetOutputView extends Marionette.ItemView<Worksheet> {
    constructor(options?: any) {
        super(_.extend(options, {
            events: {
                "click .feature-name a": "onFeatureNameClick"
            },
            template: _.template(require("raw!./worksheet_output_view.html"))
        }));
    }

    initialize() {
        this._output = this.__calculateOutput()
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
    }

    onFeatureInput(event: WorksheetFeatureInputEvent) {
        this.render();
    }

    onFeatureNameClick(event: any) {
        const featureDisplayName = event.target.innerText;
        const feature = this._output[featureDisplayName].feature;
        Application.instance.radio.globalChannel.trigger(WorksheetFeatureNavigationEvent.NAME, new WorksheetFeatureNavigationEvent({ feature: feature }));
    }

    serializeData(): any {
        if (!_.isEmpty(this._output)) {
            return { output: this._output };
        } else {
            return { output: undefined };
        }
    }

    private __calculateOutput(): WorksheetOutput {
        let output: WorksheetOutput = {};
        for (let rootFeatureSet of this.model.rootFeatureSets.models) {
            _.extend(output, this.__calculateFeatureSetOutput(rootFeatureSet));
        }
        console.info("output: " + JSON.stringify(output));
        return output;
    }

    private __calculateFeatureSetOutput(featureSet: WorksheetFeatureSet): WorksheetOutput {
        let output: WorksheetOutput = {};
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

    private __calculateFeatureOutput(feature: WorksheetFeature): WorksheetOutput {
        let values = feature.outputValues;
        if (values.length == 0) {
            return {};
        }
        let output: WorksheetOutput = {};
        output[feature.id] = { feature: feature, featureValues: values };
        return output;
    }

    private _output: WorksheetOutput;
}

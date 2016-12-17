import _ = require("underscore");
import { Application } from "dressdiscover/gui/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_input_event";
import { WorksheetFeature } from "dressdiscover/gui/models/worksheet/worksheet_feature";
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/events/worksheet/worksheet_feature_navigation_event";
import { WorksheetFeatureSet } from "dressdiscover/gui/models/worksheet/worksheet_feature_set";
import { Worksheet } from "dressdiscover/gui/models/worksheet/worksheet";
import "./worksheet_output_view.less";

declare function require(moduleName: string): any;

interface WorksheetFeatureOutput {
    feature: WorksheetFeature;
    values: string[];
}

interface WorksheetOutput {
    [featureDisplayName: string]: WorksheetFeatureOutput;
}

export class WorksheetOutputView extends Marionette.ItemView<Worksheet> {
    constructor(options?: any) {
        super(_.extend(options, {
            events: {
                "click .feature-name a": "onClickFeatureName",
                "click #csv": "onClickCsv"
            },
            id: "output",
            template: _.template(require("raw!./worksheet_output_view.html"))
        }));
    }

    initialize() {
        this._output = this.__calculateOutput();
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
    }

    onClickCsv() {
        let csv: string = "Feature name,Feature value\n";
        for (var outputKey in this._output) {
            for (let outputValue of this._output[outputKey].values) {
                csv += this.__escapeCsv(outputKey) + "," + this.__escapeCsv(outputValue) + "\n";
            }
        }
        this.__download(csv, this.model.accessionNumber + ".csv", "text/csv");
    }

    onClickFeatureName(event: any) {
        Application.instance.radio.globalChannel.trigger(
            WorksheetFeatureNavigationEvent.NAME,
            new WorksheetFeatureNavigationEvent({ feature: this._output[event.target.innerText].feature })
        );
    }

    onFeatureInput(event: WorksheetFeatureInputEvent) {
        this._output = this.__calculateOutput();
        this.render();
    }

    serializeData(): any {
        if (!_.isEmpty(this._output)) {
            return { output: this._output };
        } else {
            return { output: undefined };
        }
    }

    private __calculateOutput(): WorksheetOutput {
        const output = this.__calculateFeatureSetOutput(this.model.rootFeatureSet);
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
        output[feature.displayName] = { feature: feature, values: values };
        return output;
    }

    // Adapted from https://stackoverflow.com/questions/14964035/how-to-export-javascript-array-info-to-csv-on-client-side
    private __download(content: string, fileName: string, mimeType: string): boolean {
        var a = document.createElement('a');
        mimeType = mimeType || 'application/octet-stream';

        if (navigator.msSaveBlob) { // IE10
            return navigator.msSaveBlob(new Blob([content], { type: mimeType }), fileName);
        } else if ('download' in a) { //html5 A[download]
            a.href = 'data:' + mimeType + ',' + encodeURIComponent(content);
            a.setAttribute('download', fileName);
            document.body.appendChild(a);
            a.click();
            document.body.removeChild(a);
            return true;
        } else { //do iframe dataURL download (old ch+FF):
            var f = document.createElement('iframe');
            document.body.appendChild(f);
            f.src = 'data:' + mimeType + ',' + encodeURIComponent(content);

            setTimeout(function () {
                document.body.removeChild(f);
            }, 333);
            return true;
        }
    }

    private __escapeCsv(cell: string): string {
        return '"' + cell.replace(/"/g, '""') + '"';
    }

    private _output: WorksheetOutput;
}

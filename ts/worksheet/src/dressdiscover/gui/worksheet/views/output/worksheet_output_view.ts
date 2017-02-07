import _ = require("underscore");
import { Application } from "dressdiscover/gui/worksheet/application";
import Marionette = require("backbone.marionette");
import { WorksheetFeatureInputEvent } from "dressdiscover/gui/worksheet/events/worksheet_feature_input_event";
import { WorksheetFeature } from "dressdiscover/gui/worksheet/models/worksheet_feature";
import { WorksheetFeatureNavigationEvent } from "dressdiscover/gui/worksheet/events/worksheet_feature_navigation_event";
import { WorksheetFeatureSet } from "dressdiscover/gui/worksheet/models/worksheet_feature_set";
import { Worksheet } from "dressdiscover/gui/worksheet/models/worksheet";
import * as Clipboard from "Clipboard";
import "../../../../../../node_modules/clipboard-js/clipboard.js";
import "./worksheet_output_view.less";

declare function require(moduleName: string): any;

interface WorksheetFeatureOutput {
    feature: WorksheetFeature;
    values: string[];
}

interface WorksheetOutput {
    [featureDisplayName: string]: WorksheetFeatureOutput;
}

interface WorksheetOutputFormat {
    fileExtension: string;

    format(model: Worksheet, output: WorksheetOutput): string;

    mimeType: string;
}

class WorksheetCsvOutputFormat implements WorksheetOutputFormat {
    get fileExtension() {
        return "csv";
    }

    format(model: Worksheet, output: WorksheetOutput): string {
        let csv: string = "Feature name,Feature value\n";
        for (var outputKey in output) {
            for (let outputValue of output[outputKey].values) {
                csv += WorksheetCsvOutputFormat.__escapeCsv(outputKey) + "," + WorksheetCsvOutputFormat.__escapeCsv(outputValue) + "\n";
            }
        }
        return csv;
    }

    get mimeType() {
        return "text/csv";
    }

    private static __escapeCsv(cell: string): string {
        return '"' + cell.replace(/"/g, '""') + '"';
    }
}

class WorksheetJsonOutputFormat implements WorksheetOutputFormat {
    get fileExtension() {
        return "json";
    }

    format(model: Worksheet, output: WorksheetOutput): string {
        const currentState = model.currentState;
        if (currentState) {
            return JSON.stringify(currentState.toThryftJSON());
        } else {
            return JSON.stringify({});
        }
    }

    get mimeType() {
        return "application/json";
    }
}

class WorksheetTsvOutputFormat implements WorksheetOutputFormat {
    get fileExtension() {
        return "tsv";
    }

    format(model: Worksheet, output: WorksheetOutput): string {
        let tsv: string = "Feature name\tFeature value\n";
        for (var outputKey in output) {
            for (let outputValue of output[outputKey].values) {
                tsv += WorksheetTsvOutputFormat.__escapeTsv(outputKey) + "\t" + WorksheetTsvOutputFormat.__escapeTsv(outputValue) + "\n";
            }
        }
        return tsv;
    }

    get mimeType() {
        return "text/tsv";
    }

    private static __escapeTsv(cell: string): string {
        return '"' + cell.replace(/"/g, '""') + '"';
    }
}

export class WorksheetOutputView extends Marionette.ItemView<Worksheet> {
    constructor(options?: any) {
        super(_.extend(options, {
            events: {
                "click .feature-name a": "onClickFeatureName",
                "click #download": "onClickDownload",
                "click #email": "onClickEmail"
            },
            id: "output",
            template: _.template(require("raw!./worksheet_output_view.html"))
        }));
    }

    initialize() {
        this._output = this.__calculateOutput();
        this.listenTo(Application.instance.radio.globalChannel, WorksheetFeatureInputEvent.NAME, this.onFeatureInput);
        this.ui = { formatSelect: "#format" };
    }

    onBeforeShow() {
        const this_ = this;
        this._clipboard = new Clipboard("#copy", {
            text: (elem) => {
                return this_.__getSelectedOutputFormat().format(this.model, this._output);
            }
        });
    }

    onClickDownload() {
        const outputFormat = this.__getSelectedOutputFormat();
        this.__download(outputFormat.format(this.model, this._output), this.model.accessionNumber + "." + outputFormat.fileExtension, outputFormat.mimeType);
    }

    onClickEmail() {
        const output = this.__getSelectedOutputFormat().format(this.model, this._output);
        window.open("mailto:?to=&subject=" + encodeURIComponent(this.model.accessionNumber) + "&body=" + encodeURIComponent(output));
    }

    onClickFeatureName(event: any) {
        Application.instance.radio.globalChannel.trigger(
            WorksheetFeatureNavigationEvent.NAME,
            new WorksheetFeatureNavigationEvent({ feature: this._output[event.target.innerText].feature })
        );
    }

    onDestroy() {
        this._clipboard.destroy();
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

    private __getSelectedOutputFormat(): WorksheetOutputFormat {
        return this._outputFormats[this.ui.formatSelect.val()];
    }

    private _clipboard: Clipboard;
    private _output: WorksheetOutput;
    private _outputFormats: { [name: string]: WorksheetOutputFormat } = {
        "CSV": new WorksheetCsvOutputFormat(),
        "JSON": new WorksheetJsonOutputFormat(),
        "TSV": new WorksheetTsvOutputFormat()
    };
}

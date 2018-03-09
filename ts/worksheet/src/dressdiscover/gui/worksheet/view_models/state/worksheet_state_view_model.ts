import * as ClipboardJS from 'clipboard';
import { WorksheetFeatureSetState } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Application } from 'dressdiscover/gui/worksheet/application';
import { CsvExporter } from 'dressdiscover/gui/worksheet/exporters/string/csv_exporter';
import { JsonExporter } from 'dressdiscover/gui/worksheet/exporters/string/json_exporter';
import { StringExporter } from 'dressdiscover/gui/worksheet/exporters/string/string_exporter';
import {
    WorksheetFeatureSetDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet_feature_set_definition_wrapper';
import { WorksheetFeatureSetStateTable } from 'dressdiscover/gui/worksheet/models/worksheet_feature_set_state_table';
import { AbstractStateViewModel } from 'dressdiscover/gui/worksheet/view_models/state/abstract_state_view_model';
import * as ko from 'knockout';
import _ = require('lodash');

class SelectableFeatureSet  {
    constructor(readonly definition: WorksheetFeatureSetDefinitionWrapper, selected: boolean) {
        this.selected(selected);
    }

    onToggle() {
        this.selected(!this.selected());
        return false;
    }

    readonly selected = ko.observable<boolean>();
}

export class WorksheetStateViewModel extends AbstractStateViewModel {
    constructor(kwds: { currentStateMark: WorksheetStateMark }) {
        super(kwds);

        if (this.currentStateMark.review) {
            this.nextButtonEnabled = ko.observable<boolean>(false);
            this.previousButtonEnabled = ko.observable<boolean>(true);

            const worksheetState = this.worksheetState();
            for (let featureSetState of worksheetState.featureSets) {
                this.featureSetStateTables.push(new WorksheetFeatureSetStateTable({
                    featureSetDefinition: this.worksheetDefinition.getFeatureSetById(featureSetState.id),
                    featureSetState: featureSetState,
                    includeFeatureDescriptions: false,
                    worksheetStateId: worksheetState.id
                }));
            }
        } else {
            this.nextButtonEnabled = ko.pureComputed<boolean>({
                owner: this,
                read: () => _.some(this.selectableFeatureSets, (featureSet) => featureSet.selected())
            });
            this.previousButtonEnabled = ko.observable<boolean>(true);

            const worksheetState = this.worksheetState();
            this.selectableFeatureSets = _.map(this.worksheetDefinition.featureSets,
                (featureSetDefinition) =>
                    new SelectableFeatureSet(
                        featureSetDefinition,
                        _.some(worksheetState.featureSets, (featureSetState) => featureSetState.id.equals(featureSetDefinition.id)
                    ))
            );
        }

        const self = this;
        new ClipboardJS("#copy-button", {
            text: (elem) => {
                return self.selectedStringExporter().export(self.worksheetDefinition.definition, self.worksheetState());
            }
        });

        this.selectedStringExporter =  ko.observable<StringExporter>(this.stringExporters[0]);

        const text = this.worksheetState().text;
        if (text) {
            this.text(text);
        }
        this.text.subscribe((newText) => {
            self.save();
        });
    }

    onClickDownloadButton() {
        const content = this.selectedStringExporter().export(this.worksheetDefinition.definition, this.worksheetState());

        var a = document.createElement('a')
        const fileName = this.worksheetState().id + '.' + this.selectedStringExporter().fileExtension;
        const mimeType = this.selectedStringExporter().mimeType;

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

    onClickEmailButton() {
        const content = this.selectedStringExporter().export(this.worksheetDefinition.definition, this.worksheetState());
        window.open("mailto:?to=&subject=" + encodeURIComponent(this.worksheetState().id.toString()) + "&body=" + encodeURIComponent(content));
    }

    onClickNextButton() {
        this.save();
        super.onClickNextButton();
    }

    onClickPreviousButton() {
        if (this.currentStateMark.review) {
            super.onClickPreviousButton();
        } else {
            this.save();
            Application.instance.router.setLocation(this.hrefs.root);
        }
    }

    save() {
        const existingFeatureSetStatesById: { [index: string]: WorksheetFeatureSetState } = {};
        for (let featureSetState of this.worksheetState().featureSets) {
            existingFeatureSetStatesById[featureSetState.id.toString()] = featureSetState;
        }

        this.worksheetState().featureSets = [];
        for (let selectableFeatureSet of this.selectableFeatureSets) {
            if (selectableFeatureSet.selected()) {
                let featureSetState = existingFeatureSetStatesById[selectableFeatureSet.definition.id.toString()];
                if (!featureSetState) {
                    featureSetState = new WorksheetFeatureSetState({ features: [], id: selectableFeatureSet.definition.id });
                }
                this.worksheetState().featureSets.push(featureSetState);
            }
        }

        this.worksheetState().text = undefined;
        let text = this.text();
        if (text) {
            text = text.trim();
            if (text.length > 0) {
                this.worksheetState().text = text;
            }
        }

        this.worksheetState.notifySubscribers(this.worksheetState());
    }

    readonly stringExporters: StringExporter[] = [new CsvExporter(), new JsonExporter()];
    readonly selectedStringExporter: KnockoutObservable<StringExporter>;
    readonly nextButtonEnabled: KnockoutObservable<boolean>;
    readonly previousButtonEnabled: KnockoutObservable<boolean>;
    readonly featureSetStateTables: WorksheetFeatureSetStateTable[] = [];
    readonly selectableFeatureSets: SelectableFeatureSet[] = [];
    readonly text = ko.observable<string>();
}
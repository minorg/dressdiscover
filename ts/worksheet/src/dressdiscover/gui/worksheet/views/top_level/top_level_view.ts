import '../../../../../../node_modules/cookieconsent/build/cookieconsent.min.css';
import '../../../../../../node_modules/cookieconsent/build/cookieconsent.min.js';
import '../../../../../../node_modules/icheck/icheck.min.js';

import { TopLevelViewModel } from 'dressdiscover/gui/worksheet/view_models/top_level/top_level_view_model';
import { View } from 'dressdiscover/gui/worksheet/views/view';
import * as ko from 'knockout';


export class TopLevelView<ViewModelT extends TopLevelViewModel> extends View<ViewModelT> {
    constructor(kwds: {
        contentHtmlFileName: string,
        templateHtmlFileNames?: string[],
        title: string,
        viewModel: ViewModelT
    }) {
        super({ viewModel: kwds.viewModel });
        this._contentHtml = View._requireHtml(kwds.contentHtmlFileName);
        if (kwds.templateHtmlFileNames) {
            for (let templateHtmlFileName of kwds.templateHtmlFileNames) {
                this._contentHtml = View._requireHtml(templateHtmlFileName) + this._contentHtml;
            }
        }
        this._frameHtml = View._requireHtml("top_level/top_level_view.html");
        for (let templateHtmlFileName of ["top_level/alert_template.html", "top_level/navbar_template.html"]) {
            this._frameHtml = View._requireHtml(templateHtmlFileName) + this._frameHtml;
        }
        this._title = kwds.title;
    }

    show(ready?: () => void) {
        const self = this;
        const frameEl = $("#app");
        frameEl.html(this._frameHtml).ready(() => {
            document.title = "DressDiscover Worksheet" + (self._title.length > 0 ? (": " + self._title) : "");
            ko.cleanNode(frameEl[0]);
            const contentEl = $("#content");
            contentEl.html(self._contentHtml);
            contentEl.ready(() => {
                ko.applyBindings(self.viewModel, frameEl[0]);

                (window as any).cookieconsent.initialise({
                    container: document.getElementById("app"),
                    palette: {
                        popup: { background: '#D9EDF7', text: '#3a87ad', link: '#2d6987' },
                        button: { background: '#2fa4e7', border: '#bce8f1', text: 'white' },
                        highlight: { background: '#f8e71c', border: '#bce8f1', text: '#2d6987' },
                    },
                    law: {
                        regionalLaw: false,
                    },
                    revokable: true
                });

                if (ready) {
                    ready();
                }
            });
        });
    }

    private _contentHtml: string;
    private _frameHtml: string;
    private _title: string;
}

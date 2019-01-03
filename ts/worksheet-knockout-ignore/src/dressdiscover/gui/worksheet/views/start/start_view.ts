import { StartViewModel } from 'dressdiscover/gui/worksheet/view_models/start/start_view_model';
import { TopLevelView } from 'dressdiscover/gui/worksheet/views/top_level/top_level_view';
import * as Hammer from 'hammerjs';

export class StartView extends TopLevelView<StartViewModel> {
    constructor() {
        super({
            contentHtmlFileName: "start/start_view.html",
            viewModel: new StartViewModel()
        });
    }

    show(ready?: () => void) {
        super.show(() => {
            const hammer = new Hammer($("#content")[0]);

            const self = this;
            hammer.on("swiperight", (ev) => {
                self.viewModel.onClickStartButton();
            });

            if (ready) {
                ready();
            }
        });
    }
}
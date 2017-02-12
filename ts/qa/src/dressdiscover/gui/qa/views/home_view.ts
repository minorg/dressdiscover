import { TopLevelView } from "dressdiscover/gui/qa/views/top_level_view";
import { ViewModel } from "dressdiscover/gui/qa/view_models/view_model";

export class HomeView extends TopLevelView<ViewModel> {
    constructor() {
        super("home_view.html", new ViewModel());
    }
}

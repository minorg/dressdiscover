import { TopLevelView } from "dressdiscover/gui/qa/views/top_level_view";
import { HomeViewModel } from "dressdiscover/gui/qa/view_models/home_view_model";

export class HomeView extends TopLevelView<HomeViewModel> {
    constructor() {
        super("home_view.html", new HomeViewModel());
    }
}

import * as Backbone from "backbone";
import { HomeContentView } from "dressdiscover/gui/views/home/home_content_view";
import { TopLevelView } from "dressdiscover/gui/views/top_level_view";

export class HomeTopLevelView extends TopLevelView<Backbone.Model> {
    onRender() {
        super.onRender();
        this.showChildView("content", new HomeContentView());
    }
}

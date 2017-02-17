import { TopLevelView } from "dressdiscover/gui/qa/views/top_level_view";
import { ObjectsViewModel } from "dressdiscover/gui/qa/view_models/objects_view_model";
import "./objects_view.less";
import "./templates/image_rights_template.less";

export class ObjectsView extends TopLevelView<ObjectsViewModel> {
    constructor(viewModel: ObjectsViewModel) {
        super("objects_view.html", ["templates/image_rights_template.html"], viewModel);
    }
}

import { TopLevelView } from "dressdiscover/gui/qa/views/top_level_view";
import { QuestionsViewModel } from "dressdiscover/gui/qa/view_models/questions_view_model";
import "./questions_view.less";
import "./templates/questions_list_template.less";

export class QuestionsView extends TopLevelView<QuestionsViewModel> {
    constructor(viewModel: QuestionsViewModel) {
        super("questions_view.html", ["templates/questions_list_template.html"], viewModel);
    }
}

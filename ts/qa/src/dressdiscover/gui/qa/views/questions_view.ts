import { TopLevelView } from "dressdiscover/gui/qa/views/top_level_view";
import { QuestionsViewModel } from "dressdiscover/gui/qa/view_models/questions_view_model";

export class QuestionsView extends TopLevelView<QuestionsViewModel> {
    constructor(viewModel: QuestionsViewModel) {
        super("questions_view.html", [], viewModel);
    }
}

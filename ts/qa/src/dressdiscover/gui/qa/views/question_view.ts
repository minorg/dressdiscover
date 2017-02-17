import { TopLevelView } from "dressdiscover/gui/qa/views/top_level_view";
import { QuestionViewModel } from "dressdiscover/gui/qa/view_models/question_view_model";
import "./question_view.less";

export class QuestionView extends TopLevelView<QuestionViewModel> {
    constructor(viewModel: QuestionViewModel) {
        super("question_view.html", [], viewModel);
    }
}

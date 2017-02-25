import { QuestionSet } from "../../models/qa/question_set";
import { QuestionSetId } from "../../models/qa/question_set_id";
import { QuestionSetQueryService } from "./question_set_query_service";

export abstract class AsyncToSyncQuestionSetQueryService implements QuestionSetQueryService {
    getQuestionSetsAsync(kwds: {ids: QuestionSetId[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QuestionSet[]) => void}): void {
        try {
            kwds.success(this.getQuestionSetsSync({ids: kwds.ids}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getQuestionSetsSync(kwds: {ids: QuestionSetId[]}): QuestionSet[];
}

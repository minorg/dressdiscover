import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionQueryService } from "./question_query_service";

export abstract class AsyncToSyncQuestionQueryService implements QuestionQueryService {
    getQuestionsAsync(kwds: {ids: QuestionId[], error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: Question[]) => void}): void {
        try {
            kwds.success(this.getQuestionsSync({ids: kwds.ids}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getQuestionsSync(kwds: {ids: QuestionId[]}): Question[];
}

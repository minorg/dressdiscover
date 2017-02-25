import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionQueryService } from "./question_query_service";

export abstract class AsyncToSyncQuestionQueryService implements QuestionQueryService {
    getQuestionsAsync(kwds: {ids: QuestionId[], error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: Question[]) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getQuestionsSync({ids: kwds.ids}));
            } else {
                this.getQuestionsSync({ids: kwds.ids});
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getQuestionsSync(kwds: {ids: QuestionId[]}): Question[];
}

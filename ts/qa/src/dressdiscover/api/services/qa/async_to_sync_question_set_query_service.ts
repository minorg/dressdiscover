import { QuestionSet } from "../../models/qa/question_set";
import { QuestionSetId } from "../../models/qa/question_set_id";
import { QuestionSetQueryService } from "./question_set_query_service";

export abstract class AsyncToSyncQuestionSetQueryService implements QuestionSetQueryService {
    getQuestionSetsAsync(kwds: {ids: QuestionSetId[], error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QuestionSet[]) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getQuestionSetsSync({ids: kwds.ids}));
            } else {
                this.getQuestionSetsSync({ids: kwds.ids});
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getQuestionSetsSync(kwds: {ids: QuestionSetId[]}): QuestionSet[];
}

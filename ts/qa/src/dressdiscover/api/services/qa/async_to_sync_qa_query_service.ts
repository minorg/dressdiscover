import { AnswerSet } from "../../models/qa/answer_set";
import { QaObject } from "../../models/qa/qa_object";
import { QaQueryService } from "./qa_query_service";
import { QuestionSet } from "../../models/qa/question_set";

export abstract class AsyncToSyncQaQueryService implements QaQueryService {
    getAnswerSetAsync(kwds: {objectId: string, questionSetId: string, userId: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: AnswerSet) => void}): void {
        kwds.success(this.getAnswerSetSync({objectId: kwds.objectId, questionSetId: kwds.questionSetId, userId: kwds.userId}));
    }

    abstract getAnswerSetSync(kwds: {objectId: string, questionSetId: string, userId: string}): AnswerSet;

    getObjectsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject[]) => void}): void {
        try {
            kwds.success(this.getObjectsSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getObjectsSync(): QaObject[];

    getQuestionSetsAsync(kwds: {ids: string[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QuestionSet[]) => void}): void {
        try {
            kwds.success(this.getQuestionSetsSync({ids: kwds.ids}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getQuestionSetsSync(kwds: {ids: string[]}): QuestionSet[];
}

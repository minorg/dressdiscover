import { Answer } from "../../models/qa/answer";
import { QaObject } from "../../models/qa/qa_object";
import { QaQueryService } from "./qa_query_service";
import { QuestionSet } from "../../models/qa/question_set";

export abstract class AsyncToSyncQaQueryService implements QaQueryService {
    getAnswersAsync(kwds: {objectId: string, questionSetId: string, questionIds?: string[], userId?: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: Answer[]) => void}): void {
        try {
            kwds.success(this.getAnswersSync({objectId: kwds.objectId, questionSetId: kwds.questionSetId, questionIds: kwds.questionIds, userId: kwds.userId}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getAnswersSync(kwds: {objectId: string, questionSetId: string, questionIds?: string[], userId?: string}): Answer[];

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

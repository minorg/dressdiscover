import { Answer } from "../../models/qa/answer";
import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaQueryService } from "./qa_query_service";
import { QaUserId } from "../../models/qa/qa_user_id";
import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionSet } from "../../models/qa/question_set";
import { QuestionSetId } from "../../models/qa/question_set_id";

export abstract class AsyncToSyncQaQueryService implements QaQueryService {
    getAnswersAsync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: Answer[]) => void}): void {
        try {
            kwds.success(this.getAnswersSync({objectId: kwds.objectId, questionSetId: kwds.questionSetId, questionIds: kwds.questionIds, userId: kwds.userId}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getAnswersSync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId}): Answer[];

    getObjectByIdAsync(kwds: {id: QaObjectId, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject) => void}): void {
        try {
            kwds.success(this.getObjectByIdSync({id: kwds.id}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getObjectByIdSync(kwds: {id: QaObjectId}): QaObject;

    getObjectsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject[]) => void}): void {
        try {
            kwds.success(this.getObjectsSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getObjectsSync(): QaObject[];

    getQuestionSetsAsync(kwds: {ids: QuestionSetId[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QuestionSet[]) => void}): void {
        try {
            kwds.success(this.getQuestionSetsSync({ids: kwds.ids}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getQuestionSetsSync(kwds: {ids: QuestionSetId[]}): QuestionSet[];

    getQuestionsAsync(kwds: {ids: QuestionId[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: Question[]) => void}): void {
        try {
            kwds.success(this.getQuestionsSync({ids: kwds.ids}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getQuestionsSync(kwds: {ids: QuestionId[]}): Question[];
}

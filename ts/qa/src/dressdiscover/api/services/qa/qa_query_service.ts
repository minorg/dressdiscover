import { Answer } from "../../models/qa/answer";
import { QaObject } from "../../models/qa/qa_object";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaUserId } from "../../models/qa/qa_user_id";
import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionSet } from "../../models/qa/question_set";
import { QuestionSetId } from "../../models/qa/question_set_id";

export interface QaQueryService {
    getAnswersAsync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: Answer[]) => void}): void;
    getAnswersSync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId}): Answer[];

    getObjectByIdAsync(kwds: {id: QaObjectId, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject) => void}): void;
    getObjectByIdSync(kwds: {id: QaObjectId}): QaObject;

    getObjectsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject[]) => void}): void;
    getObjectsSync(): QaObject[];

    getQuestionSetsAsync(kwds: {ids: QuestionSetId[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QuestionSet[]) => void}): void;
    getQuestionSetsSync(kwds: {ids: QuestionSetId[]}): QuestionSet[];

    getQuestionsAsync(kwds: {ids: QuestionId[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: Question[]) => void}): void;
    getQuestionsSync(kwds: {ids: QuestionId[]}): Question[];
}

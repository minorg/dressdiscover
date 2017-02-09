import { AnswerSet } from "../../models/qa/answer_set";
import { QaObject } from "../../models/qa/qa_object";
import { QuestionSet } from "../../models/qa/question_set";

export interface QaQueryService {
    getAnswerSetAsync(kwds: {objectId: string, questionSetId: string, userId: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: AnswerSet) => void}): void;
    getAnswerSetSync(kwds: {objectId: string, questionSetId: string, userId: string}): AnswerSet;

    getObjectsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject[]) => void}): void;
    getObjectsSync(): QaObject[];

    getQuestionSetsAsync(kwds: {ids: string[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QuestionSet[]) => void}): void;
    getQuestionSetsSync(kwds: {ids: string[]}): QuestionSet[];
}

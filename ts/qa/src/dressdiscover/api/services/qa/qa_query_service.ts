import { Answer } from "../../models/qa/answer";
import { QaObject } from "../../models/qa/qa_object";
import { QuestionSet } from "../../models/qa/question_set";

export interface QaQueryService {
    getAnswersAsync(kwds: {objectId: string, questionSetId: string, questionIds?: string[], userId?: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: Answer[]) => void}): void;
    getAnswersSync(kwds: {objectId: string, questionSetId: string, questionIds?: string[], userId?: string}): Answer[];

    getObjectsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject[]) => void}): void;
    getObjectsSync(): QaObject[];

    getQuestionSetsAsync(kwds: {ids: string[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QuestionSet[]) => void}): void;
    getQuestionSetsSync(kwds: {ids: string[]}): QuestionSet[];
}

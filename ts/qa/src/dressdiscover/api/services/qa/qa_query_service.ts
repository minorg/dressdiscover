import { QaObject } from "../../models/qa/qa_object";
import { QuestionSet } from "../../models/qa/question_set";

export interface QaQueryService {
    getObjectsAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: QaObject[]) => void}): void;
    getObjectsSync(): QaObject[];

    getQuestionSetsAsync(kwds: {ids: string[], error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: {[index: string]: QuestionSet}) => void}): void;
    getQuestionSetsSync(kwds: {ids: string[]}): {[index: string]: QuestionSet};
}

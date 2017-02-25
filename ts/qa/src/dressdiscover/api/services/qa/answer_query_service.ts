import { Answer } from "../../models/qa/answer";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaUserId } from "../../models/qa/qa_user_id";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionSetId } from "../../models/qa/question_set_id";

export interface AnswerQueryService {
    getAnswersAsync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: Answer[]) => void}): void;
    getAnswersSync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId}): Answer[];
}

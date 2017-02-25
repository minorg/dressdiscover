import { Answer } from "../../models/qa/answer";
import { AnswerQueryService } from "./answer_query_service";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaUserId } from "../../models/qa/qa_user_id";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionSetId } from "../../models/qa/question_set_id";

export abstract class AsyncToSyncAnswerQueryService implements AnswerQueryService {
    getAnswersAsync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: Answer[]) => void}): void {
        try {
            kwds.success(this.getAnswersSync({objectId: kwds.objectId, questionSetId: kwds.questionSetId, questionIds: kwds.questionIds, userId: kwds.userId}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getAnswersSync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId}): Answer[];
}

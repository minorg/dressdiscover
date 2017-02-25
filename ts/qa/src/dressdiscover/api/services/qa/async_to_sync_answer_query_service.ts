import { Answer } from "../../models/qa/answer";
import { AnswerQueryService } from "./answer_query_service";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaUserId } from "../../models/qa/qa_user_id";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionSetId } from "../../models/qa/question_set_id";

export abstract class AsyncToSyncAnswerQueryService implements AnswerQueryService {
    getAnswersAsync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: Answer[]) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getAnswersSync({objectId: kwds.objectId, questionSetId: kwds.questionSetId, questionIds: kwds.questionIds, userId: kwds.userId}));
            } else {
                this.getAnswersSync({objectId: kwds.objectId, questionSetId: kwds.questionSetId, questionIds: kwds.questionIds, userId: kwds.userId});
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getAnswersSync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId}): Answer[];
}

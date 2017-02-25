import { Answer } from "../../models/qa/answer";
import { AnswerQueryService } from "./answer_query_service";
import { QaObjectId } from "../../models/qa/qa_object_id";
import { QaUserId } from "../../models/qa/qa_user_id";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionSetId } from "../../models/qa/question_set_id";

export class LoggingAnswerQueryService implements AnswerQueryService {
    constructor(private delegate: LoggingAnswerQueryService) {
    }

    getAnswersAsync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: Answer[]) => void}): void {
        this.delegate.getAnswersAsync({objectId: kwds.objectId, questionSetId: kwds.questionSetId, questionIds: kwds.questionIds, userId: kwds.userId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("getAnswersAsync({", "objectId: ", kwds.objectId, "questionSetId: ", kwds.questionSetId, "questionIds: ", kwds.questionIds, "userId: ", kwds.userId, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: Answer[]) => { console.debug("getAnswersSync({", "objectId: ", kwds.objectId, "questionSetId: ", kwds.questionSetId, "questionIds: ", kwds.questionIds, "userId: ", kwds.userId, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getAnswersSync(kwds: {objectId: QaObjectId, questionSetId: QuestionSetId, questionIds?: QuestionId[], userId?: QaUserId}): Answer[] {
        try {
            const __returnValue = this.delegate.getAnswersSync({objectId: kwds.objectId, questionSetId: kwds.questionSetId, questionIds: kwds.questionIds, userId: kwds.userId});
            console.debug("getAnswersSync({", "objectId: ", kwds.objectId, "questionSetId: ", kwds.questionSetId, "questionIds: ", kwds.questionIds, "userId: ", kwds.userId, "}) -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getAnswersSync({", "objectId: ", kwds.objectId, "questionSetId: ", kwds.questionSetId, "questionIds: ", kwds.questionIds, "userId: ", kwds.userId, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }
}

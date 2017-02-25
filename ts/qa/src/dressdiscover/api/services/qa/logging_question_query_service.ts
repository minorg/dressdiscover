import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionQueryService } from "./question_query_service";

export class LoggingQuestionQueryService implements QuestionQueryService {
    constructor(private delegate: LoggingQuestionQueryService) {
    }

    getQuestionsAsync(kwds: {ids: QuestionId[], error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: Question[]) => void}): void {
        this.delegate.getQuestionsAsync({ids: kwds.ids, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("getQuestionsAsync({", "ids: ", kwds.ids, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: Question[]) => { console.debug("getQuestionsSync({", "ids: ", kwds.ids, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getQuestionsSync(kwds: {ids: QuestionId[]}): Question[] {
        try {
            const __returnValue = this.delegate.getQuestionsSync({ids: kwds.ids});
            console.debug("getQuestionsSync({", "ids: ", kwds.ids, "}) -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getQuestionsSync({", "ids: ", kwds.ids, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }
}

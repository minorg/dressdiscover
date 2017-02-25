import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";
import { QuestionQueryService } from "./question_query_service";

export class LoggingQuestionQueryService implements QuestionQueryService {
    constructor(private delegate: LoggingQuestionQueryService) {
    }

    getQuestionsAsync(kwds: {ids: QuestionId[], error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: Question[]) => void}): void {
        this.delegate.getQuestionsAsync({ids: kwds.ids, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("getQuestionsAsync({", "ids: ", kwds.ids, "}) -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: (returnValue: Question[]) => { console.debug("getQuestionsSync({", "ids: ", kwds.ids, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
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

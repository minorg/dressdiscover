import { QuestionSet } from "../../models/qa/question_set";
import { QuestionSetId } from "../../models/qa/question_set_id";
import { QuestionSetQueryService } from "./question_set_query_service";

export class LoggingQuestionSetQueryService implements QuestionSetQueryService {
    constructor(private delegate: LoggingQuestionSetQueryService) {
    }

    getQuestionSetsAsync(kwds: {ids: QuestionSetId[], error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QuestionSet[]) => void}): void {
        this.delegate.getQuestionSetsAsync({ids: kwds.ids, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("getQuestionSetsAsync({", "ids: ", kwds.ids, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: QuestionSet[]) => { console.debug("getQuestionSetsSync({", "ids: ", kwds.ids, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getQuestionSetsSync(kwds: {ids: QuestionSetId[]}): QuestionSet[] {
        try {
            const __returnValue = this.delegate.getQuestionSetsSync({ids: kwds.ids});
            console.debug("getQuestionSetsSync({", "ids: ", kwds.ids, "}) -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getQuestionSetsSync({", "ids: ", kwds.ids, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }
}

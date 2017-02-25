import { QuestionSet } from "../../models/qa/question_set";
import { QuestionSetId } from "../../models/qa/question_set_id";

export interface QuestionSetQueryService {
    getQuestionSetsAsync(kwds: {ids: QuestionSetId[], error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: QuestionSet[]) => void}): void;
    getQuestionSetsSync(kwds: {ids: QuestionSetId[]}): QuestionSet[];
}

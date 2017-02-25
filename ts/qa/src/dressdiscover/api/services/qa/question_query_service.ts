import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";

export interface QuestionQueryService {
    getQuestionsAsync(kwds: {ids: QuestionId[], error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: Question[]) => void}): void;
    getQuestionsSync(kwds: {ids: QuestionId[]}): Question[];
}

import { Question } from "../../models/qa/question";
import { QuestionId } from "../../models/qa/question_id";

export interface QuestionQueryService {
    getQuestionsAsync(kwds: {ids: QuestionId[], error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: Question[]) => void}): void;
    getQuestionsSync(kwds: {ids: QuestionId[]}): Question[];
}

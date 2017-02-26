import { Answer } from "../../models/qa/answer";

export interface AnswerCommandService {
    deleteAnswersAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: () => void}): void;
    deleteAnswersSync(): void;

    putAnswerAsync(kwds: {answer: Answer, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: () => void}): void;
    putAnswerSync(kwds: {answer: Answer}): void;
}

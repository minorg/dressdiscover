import { Answer } from "../../models/qa/answer";

export interface AnswerCommandService {
    putAnswerAsync(kwds: {answer: Answer, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: () => void}): void;
    putAnswerSync(kwds: {answer: Answer}): void;
}

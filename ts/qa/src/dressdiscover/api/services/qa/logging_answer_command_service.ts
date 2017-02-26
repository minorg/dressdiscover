import { Answer } from "../../models/qa/answer";
import { AnswerCommandService } from "./answer_command_service";

export class LoggingAnswerCommandService implements AnswerCommandService {
    constructor(private delegate: AnswerCommandService) {
    }

    putAnswerAsync(kwds: {answer: Answer, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: () => void}): void {
        this.delegate.putAnswerAsync({answer: kwds.answer, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("putAnswerAsync({", "answer: ", kwds.answer, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: () => { console.debug("putAnswerSync({", "answer: ", kwds.answer, "}) -> success"); if (kwds.success) { kwds.success(); } }});
    }

    putAnswerSync(kwds: {answer: Answer}): void {
        try {
            this.delegate.putAnswerSync({answer: kwds.answer});
            console.debug("putAnswerSync({", "answer: ", kwds.answer, "}) -> success");
        } catch (e) {
            console.warn("putAnswerSync({", "answer: ", kwds.answer, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }
}

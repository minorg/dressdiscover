import { Answer } from "../../models/qa/answer";
import { AnswerCommandService } from "./answer_command_service";

export class LoggingAnswerCommandService implements AnswerCommandService {
    constructor(private delegate: LoggingAnswerCommandService) {
    }

    putAnswerAsync(kwds: {answer: Answer, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: success?: () => void}): void {
        this.delegate.putAnswerAsync({answer: kwds.answer, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("putAnswerAsync({", "answer: ", kwds.answer, "}) -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: () => { console.debug("putAnswerSync({", "answer: ", kwds.answer, "}) -> success"); if (kwds.success) { kwds.success(); } }});
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

import { Answer } from "../../models/qa/answer";
import { QaCommandService } from "./qa_command_service";

export abstract class AsyncToSyncQaCommandService implements QaCommandService {
    putAnswerAsync(kwds: {answer: Answer, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void {
        try {
            this.putAnswerSync({answer: kwds.answer});
            kwds.success();
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract putAnswerSync(kwds: {answer: Answer}): void;
}

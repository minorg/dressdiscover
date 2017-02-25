import { Answer } from "../../models/qa/answer";
import { AnswerCommandService } from "./answer_command_service";

export abstract class AsyncToSyncAnswerCommandService implements AnswerCommandService {
    putAnswerAsync(kwds: {answer: Answer, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: () => void}): void {
        try {
            this.putAnswerSync({answer: kwds.answer})
            if (kwds.success) {
                kwds.success();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract putAnswerSync(kwds: {answer: Answer}): void;
}

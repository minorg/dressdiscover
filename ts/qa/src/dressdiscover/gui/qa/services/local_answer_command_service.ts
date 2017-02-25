import { Answer } from "dressdiscover/api/models/qa/answer";
import { AsyncToSyncAnswerCommandService } from "dressdiscover/api/services/qa/async_to_sync_answer_command_service";

export class LocalAnswerCommandService extends AsyncToSyncAnswerCommandService {
    putAnswerSync(kwds: { answer: Answer }): void {
        console.info("put answer: " + JSON.stringify(kwds.answer.toThryftJSON()));
    }
}
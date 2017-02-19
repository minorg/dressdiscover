import { Answer } from "dressdiscover/api/models/qa/answer";
import { AsyncToSyncQaCommandService } from "dressdiscover/api/services/qa/async_to_sync_qa_command_service";

export class LocalQaCommandService extends AsyncToSyncQaCommandService {
    putAnswerSync(kwds: { answer: Answer }): void {
        console.info("put answer: " + JSON.stringify(kwds.answer.toThryftJSON()));
    }
}
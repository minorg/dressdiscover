import { LocalQaCommandService } from "dressdiscover/gui/qa/services/local_qa_command_service";
import { LocalQaQueryService } from "dressdiscover/gui/qa/services/local_qa_query_service";
import { QaCommandService } from "dressdiscover/api/services/qa/qa_command_service";
import { QaQueryService } from "dressdiscover/api/services/qa/qa_query_service";

export class Services {
    get commandService() {
        return this._commandService;
    }

    get queryService() {
        return this._queryService;
    }

    private _commandService: QaCommandService = new LocalQaCommandService();
    private _queryService: QaQueryService = new LocalQaQueryService();
}

import { LocalQaQueryService } from "dressdiscover/gui/qa/services/local_qa_query_service";
import { QaQueryService } from "dressdiscover/api/services/qa/qa_query_service";

export class Services {
    get queryService() {
        return this._queryService;
    }

    private _queryService: QaQueryService = new LocalQaQueryService();
}

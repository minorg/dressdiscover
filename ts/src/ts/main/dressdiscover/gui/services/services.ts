import LocalWorksheetCommandService = require("./worksheet/local_worksheet_command_service");
import LocalWorksheetQueryService = require("./worksheet/local_worksheet_query_service");

import * as x from "../../api/services/worksheet/worksheet_command_service";

class Services {
    static get instance(): Services {
        return Services._instance;
    }

    constructor() {
    }

    get worksheetCommandService(): WorksheetCommandService {
        return this._worksheetCommandService;
    }

    get worksheetQueryService(): dressdiscover.api.services.worksheet.WorksheetQueryService {
        return this._worksheetQueryService;
    }

    private _worksheetCommandService: dressdiscover.api.services.worksheet.WorksheetCommandService = new LocalWorksheetCommandService;
    private _worksheetQueryService: dressdiscover.api.services.worksheet.WorksheetQueryService = new LocalWorksheetQueryService;
    private static _instance: Services = new Services();
}

export = Services;

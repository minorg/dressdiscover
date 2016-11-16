﻿import { LocalWorksheetCommandService } from "./worksheet/local_worksheet_command_service";
import { LocalWorksheetQueryService } from "./worksheet/local_worksheet_query_service";
import { WorksheetCommandService } from "dressdiscover/api/services/worksheet/worksheet_command_service";
import { WorksheetQueryService } from "dressdiscover/api/services/worksheet/worksheet_query_service";

export class Services {
    static get instance(): Services {
        return Services._instance;
    }

    get worksheetCommandService(): WorksheetCommandService {
        return this._worksheetCommandService;
    }

    get worksheetQueryService(): WorksheetQueryService {
        return this._worksheetQueryService;
    }

    private _worksheetCommandService: WorksheetCommandService = new LocalWorksheetCommandService;
    private _worksheetQueryService: WorksheetQueryService = new LocalWorksheetQueryService;
    private static _instance: Services = new Services();
}

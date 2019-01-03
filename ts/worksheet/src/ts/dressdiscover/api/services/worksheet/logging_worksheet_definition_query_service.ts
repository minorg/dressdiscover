import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetDefinitionQueryService } from "./worksheet_definition_query_service";

export class LoggingWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    constructor(private delegate: WorksheetDefinitionQueryService) {
    }

    getWorksheetDefinition(): Promise<WorksheetDefinition> {
        return this.delegate.getWorksheetDefinition()
        .then((__returnValue) => { console.debug("getWorksheetDefinition() -> ", __returnValue); return __returnValue; })
        .catch((e) => { console.warn("getWorksheetDefinition() -> exception"); console.warn(e); throw e })
    }
}

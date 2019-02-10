import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetDefinitionQueryService } from "./worksheet_definition_query_service";

export class LoggingWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    constructor(private delegate: WorksheetDefinitionQueryService) {
    }

    public getWorksheetDefinition(): Promise<WorksheetDefinition> {
        return this.delegate.getWorksheetDefinition()
        .then((returnValue) => { console.debug("getWorksheetDefinition() -> ", returnValue); return returnValue; })
        .catch((e) => { console.warn("getWorksheetDefinition() -> exception"); console.warn(e); throw e; });
    }
}

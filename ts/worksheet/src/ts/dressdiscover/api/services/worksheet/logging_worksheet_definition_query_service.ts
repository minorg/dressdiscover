import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetDefinitionQueryService } from "./worksheet_definition_query_service";

export class LoggingWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    constructor(private delegate: WorksheetDefinitionQueryService) {
    }

    getWorksheetDefinitionAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetDefinition) => void}): void {
        this.delegate.getWorksheetDefinitionAsync({error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("getWorksheetDefinitionAsync() -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: WorksheetDefinition) => { console.debug("getWorksheetDefinitionAsync() -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getWorksheetDefinitionSync(): WorksheetDefinition {
        try {
            const __returnValue = this.delegate.getWorksheetDefinitionSync();
            console.debug("getWorksheetDefinitionSync() -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getWorksheetDefinitionSync() -> exception");
            console.warn(e);
            throw e;
        }
    }
}

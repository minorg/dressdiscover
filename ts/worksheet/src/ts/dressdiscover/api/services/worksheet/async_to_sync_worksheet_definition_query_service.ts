import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetDefinitionQueryService } from "./worksheet_definition_query_service";

export abstract class AsyncToSyncWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    getWorksheetDefinitionAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetDefinition) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getWorksheetDefinitionSync());
            } else {
                this.getWorksheetDefinitionSync();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getWorksheetDefinitionSync(): WorksheetDefinition;
}

import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetQueryService } from "./worksheet_query_service";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export abstract class AsyncToSyncWorksheetQueryService implements WorksheetQueryService {
    getWorksheetAccessionNumbersAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: string[]) => void}): void {
        try {
            kwds.success(this.getWorksheetAccessionNumbersSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetAccessionNumbersSync(): string[];

    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetDefinition) => void}): void {
        try {
            kwds.success(this.getWorksheetDefinitionSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetDefinitionSync(): WorksheetDefinition;

    getWorksheetStateAsync(kwds: {accessionNumber: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetState) => void}): void {
        try {
            kwds.success(this.getWorksheetStateSync({accessionNumber: kwds.accessionNumber}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState;
}

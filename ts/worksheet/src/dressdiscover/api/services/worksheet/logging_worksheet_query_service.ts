import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetQueryService } from "./worksheet_query_service";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export class LoggingWorksheetQueryService implements WorksheetQueryService {
    constructor(private delegate: LoggingWorksheetQueryService) {
    }

    getWorksheetAccessionNumbersAsync(kwds: {error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: string[]) => void}): void {
        this.delegate.getWorksheetAccessionNumbersAsync({error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("getWorksheetAccessionNumbersAsync() -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: (returnValue: string[]) => { console.debug("getWorksheetAccessionNumbersSync() -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getWorksheetAccessionNumbersSync(): string[] {
        try {
            const __returnValue = this.delegate.getWorksheetAccessionNumbersSync();
            console.debug("getWorksheetAccessionNumbersSync() -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getWorksheetAccessionNumbersSync() -> exception");
            console.warn(e);
            throw e;
        }
    }

    getWorksheetDefinitionAsync(kwds: {error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: WorksheetDefinition) => void}): void {
        this.delegate.getWorksheetDefinitionAsync({error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("getWorksheetDefinitionAsync() -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: (returnValue: WorksheetDefinition) => { console.debug("getWorksheetDefinitionSync() -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
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

    getWorksheetStateAsync(kwds: {accessionNumber: string, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: (returnValue: WorksheetState) => void}): void {
        this.delegate.getWorksheetStateAsync({accessionNumber: kwds.accessionNumber, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("getWorksheetStateAsync({", "accessionNumber: ", kwds.accessionNumber, "}) -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: (returnValue: WorksheetState) => { console.debug("getWorksheetStateSync({", "accessionNumber: ", kwds.accessionNumber, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState {
        try {
            const __returnValue = this.delegate.getWorksheetStateSync({accessionNumber: kwds.accessionNumber});
            console.debug("getWorksheetStateSync({", "accessionNumber: ", kwds.accessionNumber, "}) -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("getWorksheetStateSync({", "accessionNumber: ", kwds.accessionNumber, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }
}

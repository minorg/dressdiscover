import { WorksheetCommandService } from "./worksheet_command_service";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export class LoggingWorksheetCommandService implements WorksheetCommandService {
    constructor(private delegate: LoggingWorksheetCommandService) {
    }

    deleteWorksheetStateAsync(kwds: {accessionNumber: string, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: success?: () => void}): void {
        this.delegate.deleteWorksheetStateAsync({accessionNumber: kwds.accessionNumber, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("deleteWorksheetStateAsync({", "accessionNumber: ", kwds.accessionNumber, "}) -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: () => { console.debug("deleteWorksheetStateSync({", "accessionNumber: ", kwds.accessionNumber, "}) -> success"); if (kwds.success) { kwds.success(); } }});
    }

    deleteWorksheetStateSync(kwds: {accessionNumber: string}): void {
        try {
            this.delegate.deleteWorksheetStateSync({accessionNumber: kwds.accessionNumber});
            console.debug("deleteWorksheetStateSync({", "accessionNumber: ", kwds.accessionNumber, "}) -> success");
        } catch (e) {
            console.warn("deleteWorksheetStateSync({", "accessionNumber: ", kwds.accessionNumber, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }

    putWorksheetStateAsync(kwds: {state: WorksheetState, error?: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success?: success?: () => void}): void {
        this.delegate.putWorksheetStateAsync({state: kwds.state, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => { console.warn("putWorksheetStateAsync({", "state: ", kwds.state, "}) -> ", textStatus); console.warn(errorThrown); if (kwds.error) { kwds.error(jqXHR, textStatus, errorThrown); } }, success: () => { console.debug("putWorksheetStateSync({", "state: ", kwds.state, "}) -> success"); if (kwds.success) { kwds.success(); } }});
    }

    putWorksheetStateSync(kwds: {state: WorksheetState}): void {
        try {
            this.delegate.putWorksheetStateSync({state: kwds.state});
            console.debug("putWorksheetStateSync({", "state: ", kwds.state, "}) -> success");
        } catch (e) {
            console.warn("putWorksheetStateSync({", "state: ", kwds.state, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }
}

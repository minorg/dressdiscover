import { WorksheetCommandService } from "./worksheet_command_service";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export class LoggingWorksheetCommandService implements WorksheetCommandService {
    constructor(private delegate: WorksheetCommandService) {
    }

    deleteWorksheetStateAsync(kwds: {accessionNumber: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        this.delegate.deleteWorksheetStateAsync({accessionNumber: kwds.accessionNumber, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("deleteWorksheetStateAsync({", "accessionNumber: ", kwds.accessionNumber, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: () => { console.debug("deleteWorksheetStateAsync({", "accessionNumber: ", kwds.accessionNumber, "}) -> success"); if (kwds.success) { kwds.success(); } }});
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

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        this.delegate.putWorksheetStateAsync({state: kwds.state, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("putWorksheetStateAsync({", "state: ", kwds.state, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: () => { console.debug("putWorksheetStateAsync({", "state: ", kwds.state, "}) -> success"); if (kwds.success) { kwds.success(); } }});
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

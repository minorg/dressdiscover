import { WorksheetCommandService } from "./worksheet_command_service";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export abstract class AsyncToSyncWorksheetCommandService implements WorksheetCommandService {
    deleteWorksheetStateAsync(kwds: {accessionNumber: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void {
        try {
            this.deleteWorksheetStateSync({accessionNumber: kwds.accessionNumber});
            kwds.success();
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract deleteWorksheetStateSync(kwds: {accessionNumber: string}): void;

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void {
        try {
            this.putWorksheetStateSync({state: kwds.state});
            kwds.success();
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract putWorksheetStateSync(kwds: {state: WorksheetState}): void;
}

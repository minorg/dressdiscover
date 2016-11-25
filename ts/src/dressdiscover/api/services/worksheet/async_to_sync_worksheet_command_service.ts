import { WorksheetCommandService } from "./worksheet_command_service";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export abstract class AsyncToSyncWorksheetCommandService implements WorksheetCommandService {
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

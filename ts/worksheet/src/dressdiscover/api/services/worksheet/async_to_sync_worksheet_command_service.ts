import { WorksheetCommandService } from "./worksheet_command_service";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export abstract class AsyncToSyncWorksheetCommandService implements WorksheetCommandService {
    deleteWorksheetStateAsync(kwds: {accessionNumber: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        try {
            this.deleteWorksheetStateSync({accessionNumber: kwds.accessionNumber})
            if (kwds.success) {
                kwds.success();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract deleteWorksheetStateSync(kwds: {accessionNumber: string}): void;

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        try {
            this.putWorksheetStateSync({state: kwds.state})
            if (kwds.success) {
                kwds.success();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract putWorksheetStateSync(kwds: {state: WorksheetState}): void;
}

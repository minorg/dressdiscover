import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export abstract class AsyncToSyncWorksheetStateQueryService implements WorksheetStateQueryService {
    getWorksheetAccessionNumbersAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string[]) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getWorksheetAccessionNumbersSync());
            } else {
                this.getWorksheetAccessionNumbersSync();
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getWorksheetAccessionNumbersSync(): string[];

    getWorksheetStateAsync(kwds: {accessionNumber: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.getWorksheetStateSync({accessionNumber: kwds.accessionNumber}));
            } else {
                this.getWorksheetStateSync({accessionNumber: kwds.accessionNumber});
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState;
}

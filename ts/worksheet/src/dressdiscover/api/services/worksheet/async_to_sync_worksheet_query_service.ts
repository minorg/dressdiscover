import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetQueryService } from "./worksheet_query_service";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export abstract class AsyncToSyncWorksheetQueryService implements WorksheetQueryService {
    getWorksheetAccessionNumbersAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: string[]) => void}): void {
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

    getWorksheetDefinitionAsync(kwds: {error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: WorksheetDefinition) => void}): void {
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

    getWorksheetStateAsync(kwds: {accessionNumber: string, error?: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success?: (returnValue: WorksheetState) => void}): void {
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

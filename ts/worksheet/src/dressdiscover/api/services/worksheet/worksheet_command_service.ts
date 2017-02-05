import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetCommandService {
    deleteWorksheetStateAsync(kwds: {accessionNumber: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void;
    deleteWorksheetStateSync(kwds: {accessionNumber: string}): void;

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void;
    putWorksheetStateSync(kwds: {state: WorksheetState}): void;
}

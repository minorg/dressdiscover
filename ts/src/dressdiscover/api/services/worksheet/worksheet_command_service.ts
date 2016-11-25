import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetCommandService {
    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: () => void}): void;
    putWorksheetStateSync(kwds: {state: WorksheetState}): void;
}

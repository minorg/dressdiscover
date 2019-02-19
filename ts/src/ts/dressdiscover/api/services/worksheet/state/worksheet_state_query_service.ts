import { WorksheetState } from "../../../models/worksheet/state/worksheet_state";
import { WorksheetStateId } from "../../../models/worksheet/state/worksheet_state_id";

export interface WorksheetStateQueryService {
    /**
     * getWorksheetState
     * @param {WorksheetStateId} id
     * @return {WorksheetState}
     * @throws {AuthorizationException}
     * @throws {IoException}
     * @throws {NoSuchWorksheetStateException}
     */
    getWorksheetState(kwds: {id: WorksheetStateId}): Promise<WorksheetState>;

    /**
     * getWorksheetStateIds
     * @return {WorksheetStateId[]}
     * @throws {AuthorizationException}
     * @throws {IoException}
     */
    getWorksheetStateIds(): Promise<WorksheetStateId[]>;
}

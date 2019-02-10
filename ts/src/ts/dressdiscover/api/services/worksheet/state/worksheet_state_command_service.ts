import { WorksheetState } from "../../../models/worksheet/state/worksheet_state";
import { WorksheetStateId } from "../../../models/worksheet/state/worksheet_state_id";

export interface WorksheetStateCommandService {
    /**
     * deleteWorksheetState
     * @param {WorksheetStateId} id
     * @throws {IoException}
     */
    deleteWorksheetState(kwds: {id: WorksheetStateId}): Promise<void>;

    /**
     * putWorksheetState
     * @param {WorksheetState} state
     * @throws {IoException}
     */
    putWorksheetState(kwds: {state: WorksheetState}): Promise<void>;

    /**
     * renameWorksheetState
     * @param {WorksheetStateId} new_id
     * @param {WorksheetStateId} old_id
     * @throws {DuplicateWorksheetStateException}
     * @throws {IoException}
     * @throws {NoSuchWorksheetStateException}
     */
    renameWorksheetState(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId}): Promise<void>;
}

import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export interface WorksheetStateCommandService {
    /**
     * deleteWorksheetState
     * @param {WorksheetStateId} id
     * @throws {IoException}
     */
    deleteWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;

    /**
     * deleteWorksheetState
     * @param {WorksheetStateId} id
     * @throws {IoException}
     */
    deleteWorksheetStateSync(kwds: {id: WorksheetStateId}): void;

    /**
     * putWorksheetState
     * @param {WorksheetState} state
     * @throws {IoException}
     */
    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;

    /**
     * putWorksheetState
     * @param {WorksheetState} state
     * @throws {IoException}
     */
    putWorksheetStateSync(kwds: {state: WorksheetState}): void;

    /**
     * renameWorksheetState
     * @param {WorksheetStateId} new_id
     * @param {WorksheetStateId} old_id
     * @throws {DuplicateWorksheetStateException}
     * @throws {IoException}
     * @throws {NoSuchWorksheetStateException}
     */
    renameWorksheetStateAsync(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void;

    /**
     * renameWorksheetState
     * @param {WorksheetStateId} new_id
     * @param {WorksheetStateId} old_id
     * @throws {DuplicateWorksheetStateException}
     * @throws {IoException}
     * @throws {NoSuchWorksheetStateException}
     */
    renameWorksheetStateSync(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId}): void;
}

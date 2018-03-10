import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export interface WorksheetStateQueryService {
    /**
     * getWorksheetState
     * @param {WorksheetStateId} id
     * @return {WorksheetState}
     * @throws {IoException}
     * @throws {NoSuchWorksheetStateException}
     */
    getWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetState) => void}): void;
    /**
     * getWorksheetState
     * @param {WorksheetStateId} id
     * @return {WorksheetState}
     * @throws {IoException}
     * @throws {NoSuchWorksheetStateException}
     */
    getWorksheetStateSync(kwds: {id: WorksheetStateId}): WorksheetState;

    /**
     * getWorksheetStateIds
     * @return {WorksheetStateId[]}
     * @throws {IoException}
     */
    getWorksheetStateIdsAsync(kwds: {error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: WorksheetStateId[]) => void}): void;
    /**
     * getWorksheetStateIds
     * @return {WorksheetStateId[]}
     * @throws {IoException}
     */
    getWorksheetStateIdsSync(): WorksheetStateId[];
}

import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateCommandService } from "./worksheet_state_command_service";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export class LoggingWorksheetStateCommandService implements WorksheetStateCommandService {
    constructor(private delegate: WorksheetStateCommandService) {
    }

    deleteWorksheetStateAsync(kwds: {id: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        this.delegate.deleteWorksheetStateAsync({id: kwds.id, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("deleteWorksheetStateAsync({", "id: ", kwds.id, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: () => { console.debug("deleteWorksheetStateAsync({", "id: ", kwds.id, "}) -> success"); if (kwds.success) { kwds.success(); } }});
    }

    deleteWorksheetStateSync(kwds: {id: WorksheetStateId}): void {
        try {
            this.delegate.deleteWorksheetStateSync({id: kwds.id});
            console.debug("deleteWorksheetStateSync({", "id: ", kwds.id, "}) -> success");
        } catch (e) {
            console.warn("deleteWorksheetStateSync({", "id: ", kwds.id, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }

    putWorksheetStateAsync(kwds: {state: WorksheetState, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        this.delegate.putWorksheetStateAsync({state: kwds.state, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("putWorksheetStateAsync({", "state: ", kwds.state, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: () => { console.debug("putWorksheetStateAsync({", "state: ", kwds.state, "}) -> success"); if (kwds.success) { kwds.success(); } }});
    }

    putWorksheetStateSync(kwds: {state: WorksheetState}): void {
        try {
            this.delegate.putWorksheetStateSync({state: kwds.state});
            console.debug("putWorksheetStateSync({", "state: ", kwds.state, "}) -> success");
        } catch (e) {
            console.warn("putWorksheetStateSync({", "state: ", kwds.state, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }

    renameWorksheetStateAsync(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: () => void}): void {
        this.delegate.renameWorksheetStateAsync({newId: kwds.newId, oldId: kwds.oldId, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("renameWorksheetStateAsync({", "newId: ", kwds.newId, "oldId: ", kwds.oldId, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: () => { console.debug("renameWorksheetStateAsync({", "newId: ", kwds.newId, "oldId: ", kwds.oldId, "}) -> success"); if (kwds.success) { kwds.success(); } }});
    }

    renameWorksheetStateSync(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId}): void {
        try {
            this.delegate.renameWorksheetStateSync({newId: kwds.newId, oldId: kwds.oldId});
            console.debug("renameWorksheetStateSync({", "newId: ", kwds.newId, "oldId: ", kwds.oldId, "}) -> success");
        } catch (e) {
            console.warn("renameWorksheetStateSync({", "newId: ", kwds.newId, "oldId: ", kwds.oldId, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }
}

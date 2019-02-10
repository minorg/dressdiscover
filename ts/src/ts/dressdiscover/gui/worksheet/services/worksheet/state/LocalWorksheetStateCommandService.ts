import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { DuplicateWorksheetStateException } from 'dressdiscover/api/services/worksheet/duplicate_worksheet_state_exception';
import { NoSuchWorksheetStateException } from 'dressdiscover/api/services/worksheet/no_such_worksheet_state_exception';
import { WorksheetStateCommandService } from 'dressdiscover/api/services/worksheet/worksheet_state_command_service';
import {
    LocalWorksheetStateQueryService,
} from 'dressdiscover/gui/worksheet/services/worksheet/state/LocalWorksheetStateQueryService';

export class LocalWorksheetStateCommandService implements WorksheetStateCommandService {
    deleteWorksheetState(kwds: { id: WorksheetStateId; }): Promise<void> {
        localStorage.removeItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.id));
        return new Promise((resolve, reject) => resolve());
    }

    putWorksheetState(kwds: { state: WorksheetState; }): Promise<void> {
        localStorage.setItem(LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.state.id), JSON.stringify(kwds.state.toThryftJsonObject()));
        return new Promise((resolve, reject) => resolve());
    }

    renameWorksheetState(kwds: { newId: WorksheetStateId; oldId: WorksheetStateId; }): Promise<void> {
        return new Promise((resolve, reject) => {
            const newKey = LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.newId);
            const oldKey = LocalWorksheetStateQueryService.getWorksheetStateItemKey(kwds.oldId);

            if (localStorage.getItem(newKey)) {
                reject(new DuplicateWorksheetStateException({ id: kwds.newId }));
                return;
            }

            const oldJsonString = localStorage.getItem(oldKey);
            if (!oldJsonString) {
                reject(new NoSuchWorksheetStateException({ id: kwds.oldId }));
                return;
            }

            // Change the id in the value, too
            const value = WorksheetState.fromThryftJsonObject(JSON.parse(oldJsonString));
            value.id = kwds.newId;

            localStorage.removeItem(oldKey);
            localStorage.setItem(newKey, JSON.stringify(value.toThryftJsonObject()));
            resolve();
        });
    }
}

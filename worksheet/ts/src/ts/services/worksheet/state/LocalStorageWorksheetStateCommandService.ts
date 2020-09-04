import {WorksheetState} from "~/models/worksheet/state/WorksheetState";
import {WorksheetStateId} from "~/models/worksheet/state/WorksheetStateId";
import {DuplicateWorksheetStateException} from "~/services/worksheet/state/DuplicateWorksheetStateException";
import {NoSuchWorksheetStateException} from "~/services/worksheet/state/NoSuchWorksheetStateException";
import {WorksheetStateCommandService} from "~/services/worksheet/state/WorksheetStateCommandService";
import {LocalStorageWorksheetStateQueryService} from "~/services/worksheet/state/LocalStorageWorksheetStateQueryService";

export class LocalStorageWorksheetStateCommandService
  implements WorksheetStateCommandService {
  deleteWorksheetState(kwds: {id: WorksheetStateId}): Promise<void> {
    localStorage.removeItem(
      LocalStorageWorksheetStateQueryService.getWorksheetStateItemKey(kwds.id)
    );
    return new Promise((resolve, reject) => resolve());
  }

  putWorksheetState(kwds: {state: WorksheetState}): Promise<void> {
    localStorage.setItem(
      LocalStorageWorksheetStateQueryService.getWorksheetStateItemKey(
        kwds.state.id
      ),
      JSON.stringify(kwds.state.toThryftJsonObject())
    );
    return new Promise((resolve, reject) => resolve());
  }

  renameWorksheetState(kwds: {
    newId: WorksheetStateId;
    oldId: WorksheetStateId;
  }): Promise<void> {
    return new Promise((resolve, reject) => {
      const newKey = LocalStorageWorksheetStateQueryService.getWorksheetStateItemKey(
        kwds.newId
      );
      const oldKey = LocalStorageWorksheetStateQueryService.getWorksheetStateItemKey(
        kwds.oldId
      );

      if (localStorage.getItem(newKey)) {
        reject(new DuplicateWorksheetStateException({id: kwds.newId}));
        return;
      }

      const oldJsonString = localStorage.getItem(oldKey);
      if (!oldJsonString) {
        reject(new NoSuchWorksheetStateException({id: kwds.oldId}));
        return;
      }

      // Change the id in the value, too
      const value = WorksheetState.fromThryftJsonObject(
        JSON.parse(oldJsonString)
      );
      value.id = kwds.newId;

      localStorage.removeItem(oldKey);
      localStorage.setItem(newKey, JSON.stringify(value.toThryftJsonObject()));
      resolve();
    });
  }
}

import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { Services } from 'dressdiscover/gui/worksheet/services/Services';
import { ILogger } from 'dressdiscover/gui/worksheet/util/logging/ILogger';
import { action, observable, runInAction } from 'mobx';

export class WorksheetStateStore {
    constructor(private readonly logger: ILogger, private readonly services: Services) {
    }

    @observable error: Error | undefined;
    @observable worksheetStateIds: WorksheetStateId[] | undefined;

    @action
    async deleteWorksheetState(kwds: { id: WorksheetStateId }) {
        try {
            await this.services.worksheetStateCommandService.deleteWorksheetState(kwds);
        } catch (e) {
            this.logger.error("error deleting worksheet state: " + e);
            runInAction(() => {
                this.error = e;
            });
            return;
        }

        this.getWorksheetStateIds();
    }

    @action
    async getWorksheetStateIds() {
        if (this.worksheetStateIds) {
            this.logger.debug("already have worksheet state IDs");
            return;
        }

        let worksheetStateIds: WorksheetStateId[];
        try {
            worksheetStateIds = await this.services.worksheetStateQueryService.getWorksheetStateIds();
        } catch (e) {
            this.logger.error("error getting worksheet state id's: " + e);
            runInAction(() => {
                this.error = e;
            });
            return;
        }
        runInAction(() => {
            this.worksheetStateIds = worksheetStateIds;
        });
    }

    @action
    async renameWorksheetState(kwds: { newId: WorksheetStateId, oldId: WorksheetStateId }) {
        try {
            await this.services.worksheetStateCommandService.renameWorksheetState(kwds);
        } catch (e) {
            this.logger.error("error renaming worksheet state: " + e);
            runInAction(() => {
                this.error = e;
            });
            return;
        }

        this.getWorksheetStateIds();
    }
}

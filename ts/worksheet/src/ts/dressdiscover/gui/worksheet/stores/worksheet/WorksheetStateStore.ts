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
        const self = this;
        try {
            await this.services.worksheetStateCommandService.deleteWorksheetState(kwds);
        } catch (e) {
            self.logger.error("error deleting worksheet state: " + e);
            runInAction(() => {
                self.error = e;
            });
            return;
        }

        runInAction(() => {
            self.worksheetStateIds = undefined;
            self.getWorksheetStateIds();
        });
    }

    @action
    async getWorksheetStateIds() {
        if (this.worksheetStateIds) {
            this.logger.debug("already have worksheet state IDs");
            return;
        }

        const self = this;
        let worksheetStateIds: WorksheetStateId[];
        try {
            worksheetStateIds = await this.services.worksheetStateQueryService.getWorksheetStateIds();
        } catch (e) {
            self.logger.error("error getting worksheet state id's: " + e);
            runInAction(() => {
                this.error = e;
            });
            return;
        }

        runInAction(() => {
            self.worksheetStateIds = worksheetStateIds;
        });
    }

    @action
    async renameWorksheetState(kwds: { newId: WorksheetStateId, oldId: WorksheetStateId }) {
        const self = this;
        try {
            await this.services.worksheetStateCommandService.renameWorksheetState(kwds);
        } catch (e) {
            self.logger.error("error renaming worksheet state: " + e);
            runInAction(() => {
                self.error = e;
            });
            return;
        }

        runInAction(() => {
            self.worksheetStateIds = undefined;
            self.getWorksheetStateIds();
        });
    }
}

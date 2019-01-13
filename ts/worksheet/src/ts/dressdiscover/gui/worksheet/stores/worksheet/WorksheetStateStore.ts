import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { Services } from 'dressdiscover/gui/worksheet/services/Services';
import { ILogger } from 'dressdiscover/gui/worksheet/util/logging/ILogger';
import { action, observable, runInAction } from 'mobx';

export class WorksheetStateStore {
    constructor(private readonly logger: ILogger, private readonly services: Services) {
    }

    @observable error: Error | undefined;
    @observable worksheetStatesById: { [index: string]: WorksheetState } = {};
    @observable worksheetStateIds: WorksheetStateId[] | undefined;

    @action
    async deleteWorksheetState(kwds: { id: WorksheetStateId }) {
        const self = this;
        try {
            await this.services.worksheetStateCommandService.deleteWorksheetState(kwds);
        } catch (e) {
            self.setError(e);
            return;
        }

        runInAction(() => {
            self.worksheetStatesById = {};
            self.worksheetStateIds = undefined;
            self.getWorksheetStateIds();
        });
    }

    @action
    async getWorksheetState(kwds: { id: WorksheetStateId }) {
        let worksheetState: WorksheetState;
        const self = this;
        try {
            worksheetState = await this.services.worksheetStateQueryService.getWorksheetState(kwds);
        } catch (e) {
            self.setError(e);
            return;
        }
    }

    @action
    async getWorksheetStateIds() {
        // if (this.worksheetStateIds) {
        //     this.logger.debug("already have worksheet state IDs");
        //     return;
        // }

        const self = this;
        let worksheetStateIds: WorksheetStateId[];
        try {
            worksheetStateIds = await this.services.worksheetStateQueryService.getWorksheetStateIds();
        } catch (e) {
            self.setError(e);
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
            self.setError(e);
            return;
        }

        runInAction(() => {
            self.worksheetStatesById = {};
            self.worksheetStateIds = undefined;
            self.getWorksheetStateIds();
        });
    }

    private setError(e: Error) {
        this.logger.error("error making remote call: " + e);
        const self = this;
        runInAction(() => {
            self.error = e;
        });
    }
}

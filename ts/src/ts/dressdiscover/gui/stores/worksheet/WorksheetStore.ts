import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/definition/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/state/worksheet_state_id';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { ILogger } from 'dressdiscover/gui/util/logging/ILogger';
import { action, observable, runInAction } from 'mobx';

import { WorksheetDefinitionWrapper } from '../../models/worksheet/definition/WorksheetDefinitionWrapper';

export class WorksheetStore {
    constructor(private readonly currentUserStore: CurrentUserStore, private readonly logger: ILogger) {
    }

    @observable exception?: Exception;
    @observable worksheetDefinition?: WorksheetDefinitionWrapper;
    @observable worksheetStatesById?: { [index: string]: WorksheetState };
    @observable worksheetStateIds?: WorksheetStateId[];

    @action
    clearException() {
        this.exception = undefined;
    }

    @action
    async deleteWorksheetState(kwds: { id: WorksheetStateId }) {
        const self = this;
        try {
            await this.services.worksheetStateCommandService.deleteWorksheetState(kwds);
        } catch (e) {
            self.setException(e);
            return;
        }

        this.clearException();

        runInAction("deleteWorksheetState continuation", () => {
            if (this.worksheetStatesById) {
                delete this.worksheetStatesById[kwds.id.toString()];
            }
            self.getWorksheetStateIds();
        });
    }

    @action
    async getWorksheetDefinition() {
        let worksheetDefinition: WorksheetDefinition;
        const self = this;
        try {
            worksheetDefinition = await this.services.worksheetDefinitionQueryService.getWorksheetDefinition();
        } catch (e) {
            self.setException(e);
            return;
        }

        self.clearException();

        runInAction("getWorksheetDefinition continuation", () => {
            this.worksheetDefinition = new WorksheetDefinitionWrapper(worksheetDefinition);
        });
    }

    @action
    async getWorksheetState(kwds: { id: WorksheetStateId }) {
        let worksheetState: WorksheetState;
        const self = this;
        try {
            worksheetState = await this.services.worksheetStateQueryService.getWorksheetState(kwds);
        } catch (e) {
            self.setException(e);
            return;
        }

        self.clearException();

        runInAction("getWorksheetState continuation", () => {
            if (!self.worksheetStatesById) {
                self.worksheetStatesById = {};
            }
            self.worksheetStatesById[kwds.id.toString()] = worksheetState;
        });
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
            self.setException(e);
            return;
        }

        self.clearException();

        runInAction("getWorksheetStateIds continuation", () => {
            self.worksheetStateIds = worksheetStateIds;
        });
    }

    @action
    async putWorksheetState(kwds: { state: WorksheetState }) {
        const self = this;
        try {
            await this.services.worksheetStateCommandService.putWorksheetState(kwds);
        } catch (e) {
            self.setException(e);
            return;
        }

        self.clearException();

        runInAction("putWorksheetState continuation", () => {
            if (!self.worksheetStatesById) {
                self.worksheetStatesById = {};
            }
            self.worksheetStatesById[kwds.state.id.toString()] = kwds.state;
        });
    }

    @action
    async renameWorksheetState(kwds: { newId: WorksheetStateId, oldId: WorksheetStateId }) {
        const self = this;
        try {
            await this.services.worksheetStateCommandService.renameWorksheetState(kwds);
        } catch (e) {
            self.setException(e);
            return;
        }

        self.clearException();

        runInAction("renameWorksheetState continuation", () => {
            self.getWorksheetStateIds();
        });
    }

    private get services() {
        return this.currentUserStore.currentUserServices;
    }

    private setException(e: Exception) {
        this.logger.error("exception making remote call: " + e);
        const self = this;
        runInAction(() => {
            self.exception = e;
        });
    }
}

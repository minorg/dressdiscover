import { WorksheetDefinition } from 'dressdiscover/api/models/worksheet/worksheet_definition';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { Services } from 'dressdiscover/gui/worksheet/services/Services';
import { ILogger } from 'dressdiscover/gui/worksheet/util/logging/ILogger';
import { action, observable, runInAction } from 'mobx';

import { WorksheetDefinitionWrapper } from '../../models/worksheet/WorksheetDefinitionWrapper';

export class WorksheetStore {
    constructor(private readonly logger: ILogger, private readonly services: Services) {
    }

    @observable error: Error | undefined;
    @observable worksheetDefinition: WorksheetDefinitionWrapper | undefined;
    @observable worksheetStatesById: { [index: string]: WorksheetState } | undefined;
    @observable worksheetStateIds: WorksheetStateId[] | undefined;

    @action
    clearError() {
        this.error = undefined;
    }

    @action
    async deleteWorksheetState(kwds: { id: WorksheetStateId }) {
        const self = this;
        try {
            await this.services.worksheetStateCommandService.deleteWorksheetState(kwds);
        } catch (e) {
            self.setError(e);
            return;
        }

        this.clearError();

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
            self.setError(e);
            return;
        }

        self.clearError();

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
            self.setError(e);
            return;
        }

        self.clearError();

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
            self.setError(e);
            return;
        }

        self.clearError();

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
            self.setError(e);
            return;
        }

        self.clearError();

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
            self.setError(e);
            return;
        }

        self.clearError();

        runInAction("renameWorksheetState continuation", () => {
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

import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetQueryService {
    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetDefinition) => void}): void;
    getWorksheetDefinitionSync(): WorksheetDefinition;

    getWorksheetStateAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetState) => void}): void;
    getWorksheetStateSync(): WorksheetState;
}

export class JsonRpcWorksheetQueryService implements WorksheetQueryService {
    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetDefinition) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_definition',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            error: function(jqXHR: any, textStatus: any, errorThrown: any) {
                kwds.error(jqXHR as JQueryXHR, textStatus as string, errorThrown as string);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    kwds.success(WorksheetDefinition.fromThryftJSON(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });
    }

    getWorksheetDefinitionSync(): WorksheetDefinition {
        var returnValue: WorksheetDefinition = new WorksheetDefinition();

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_definition',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            error: function(jqXHR: any, textStatus: any, errorThrown: any) {
                throw new Error(errorThrown);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    returnValue = WorksheetDefinition.fromThryftJSON(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });

        return returnValue;
    }

    getWorksheetStateAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetState) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            error: function(jqXHR: any, textStatus: any, errorThrown: any) {
                kwds.error(jqXHR as JQueryXHR, textStatus as string, errorThrown as string);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    kwds.success(WorksheetState.fromThryftJSON(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });
    }

    getWorksheetStateSync(): WorksheetState {
        var returnValue: WorksheetState = new WorksheetState();

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            error: function(jqXHR: any, textStatus: any, errorThrown: any) {
                throw new Error(errorThrown);
            },
            mimeType: 'application/json',
            type: 'POST',
            success: function(__response: any) {
                if (typeof __response.result !== "undefined") {
                    returnValue = WorksheetState.fromThryftJSON(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });

        return returnValue;
    }
}

export abstract class AsyncToSyncWorksheetQueryService implements WorksheetQueryService {
    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetDefinition) => void}): void {
        try {
            kwds.success(this.getWorksheetDefinitionSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetDefinitionSync(): WorksheetDefinition;

    getWorksheetStateAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetState) => void}): void {
        try {
            kwds.success(this.getWorksheetStateSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetStateSync(): WorksheetState;
}

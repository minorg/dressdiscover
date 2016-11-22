import * as Backbone from "backbone";
import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetState } from "../../models/worksheet/worksheet_state";

export interface WorksheetQueryService {
    getWorksheetAccessionNumbersAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: string[]) => void}): void;
    getWorksheetAccessionNumbersSync(): string[];

    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetDefinition) => void}): void;
    getWorksheetDefinitionSync(): WorksheetDefinition;

    getWorksheetStateAsync(kwds: {accessionNumber: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetState) => void}): void;
    getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState;
}

export class JsonRpcWorksheetQueryService implements WorksheetQueryService {
    getWorksheetAccessionNumbersAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: string[]) => void}): void {
        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_accession_numbers',
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
                    kwds.success(function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(__response.result));
                } else {
                    kwds.error(null, __response.error.message, null);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });
    }

    getWorksheetAccessionNumbersSync(): string[] {
        var returnValue: string[] = [];

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_accession_numbers',
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
                    returnValue = function(json: any[]): string[] { var sequence: string[] = []; for (var i = 0; i < json.length; i++) { sequence.push(json[i]); } return sequence; }(__response.result);
                } else {
                    throw new Error(__response.error);
                }
            },
            url: '/api/jsonrpc/worksheet_query',
        });

        return returnValue;
    }

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

    getWorksheetStateAsync(kwds: {accessionNumber: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetState) => void}): void {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["accession_number"] = kwds.accessionNumber;

        $.ajax({
            async: true,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
                params: __jsonrpc_params,
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

    getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState {
        var __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["accession_number"] = kwds.accessionNumber;

        var returnValue: WorksheetState = new WorksheetState();

        $.ajax({
            async: false,
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
                params: __jsonrpc_params,
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
    getWorksheetAccessionNumbersAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: string[]) => void}): void {
        try {
            kwds.success(this.getWorksheetAccessionNumbersSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetAccessionNumbersSync(): string[];

    getWorksheetDefinitionAsync(kwds: {error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetDefinition) => void}): void {
        try {
            kwds.success(this.getWorksheetDefinitionSync());
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetDefinitionSync(): WorksheetDefinition;

    getWorksheetStateAsync(kwds: {accessionNumber: string, error: (jqXHR: JQueryXHR | null, textStatus: string, errorThrown: string | null) => any, success: (returnValue: WorksheetState) => void}): void {
        try {
            kwds.success(this.getWorksheetStateSync({accessionNumber: kwds.accessionNumber}));
        } catch (e) {
            kwds.error(null, e.message, e);
        }
    }

    abstract getWorksheetStateSync(kwds: {accessionNumber: string}): WorksheetState;
}

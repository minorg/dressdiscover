import * as $ from "jquery"
import { DuplicateWorksheetStateException } from "./duplicate_worksheet_state_exception";
import { IoException } from "../io_exception";
import { NoSuchWorksheetStateException } from "./no_such_worksheet_state_exception";
import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateCommandService } from "./worksheet_state_command_service";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export class JsonRpcWorksheetStateCommandService implements WorksheetStateCommandService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this._endpointUrl = kwds.endpointUrl;
        this._methodEndpoints = !!kwds.methodEndpoints;
    }

    deleteWorksheetState(kwds: {id: WorksheetStateId}): Promise<void> {
        const __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["id"] = kwds.id.toString();

        return $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'delete_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            }),
            dataType: 'json',
            mimeType: 'application/json',
            type: 'POST',
            url: this._endpointUrl + (this._methodEndpoints ? "/delete_worksheet_state" : "")
        })
        .then(
            (data) => {
                if (typeof data.result !== "undefined") {
                    return;
                }

                if (data.error["@class"] && data.error.data) {
                    const __error_class = data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                        throw  IoException.fromThryftJsonObject(data.error.data);
                    } else {
                        throw  new Error(data.error.message);
                    }
                } else {
                    throw  new Error(data.error.message);
                }
            },
            (__jqXHR, __textStatus, errorThrown) => {
                throw new Error(errorThrown);
            }
        );
    }

    putWorksheetState(kwds: {state: WorksheetState}): Promise<void> {
        const __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["state"] = kwds.state.toThryftJsonObject();

        return $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'put_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            }),
            dataType: 'json',
            mimeType: 'application/json',
            type: 'POST',
            url: this._endpointUrl + (this._methodEndpoints ? "/put_worksheet_state" : "")
        })
        .then(
            (data) => {
                if (typeof data.result !== "undefined") {
                    return;
                }

                if (data.error["@class"] && data.error.data) {
                    const __error_class = data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                        throw  IoException.fromThryftJsonObject(data.error.data);
                    } else {
                        throw  new Error(data.error.message);
                    }
                } else {
                    throw  new Error(data.error.message);
                }
            },
            (__jqXHR, __textStatus, errorThrown) => {
                throw new Error(errorThrown);
            }
        );
    }

    renameWorksheetState(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId}): Promise<void> {
        const __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["new_id"] = kwds.newId.toString();
        __jsonrpc_params["old_id"] = kwds.oldId.toString();

        return $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'rename_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            }),
            dataType: 'json',
            mimeType: 'application/json',
            type: 'POST',
            url: this._endpointUrl + (this._methodEndpoints ? "/rename_worksheet_state" : "")
        })
        .then(
            (data) => {
                if (typeof data.result !== "undefined") {
                    return;
                }

                if (data.error["@class"] && data.error.data) {
                    const __error_class = data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.worksheet.duplicate_worksheet_state_exception.DuplicateWorksheetStateException') {
                        throw  DuplicateWorksheetStateException.fromThryftJsonObject(data.error.data);
                    } else if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                        throw  IoException.fromThryftJsonObject(data.error.data);
                    } else if (__error_class == 'dressdiscover.api.services.worksheet.no_such_worksheet_state_exception.NoSuchWorksheetStateException') {
                        throw  NoSuchWorksheetStateException.fromThryftJsonObject(data.error.data);
                    } else {
                        throw  new Error(data.error.message);
                    }
                } else {
                    throw  new Error(data.error.message);
                }
            },
            (__jqXHR, __textStatus, errorThrown) => {
                throw new Error(errorThrown);
            }
        );
    }

    private readonly _endpointUrl: string;
    private readonly _methodEndpoints: boolean;
}

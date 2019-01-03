import axios from "axios";
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

        return axios.post(
            this._endpointUrl + (this._methodEndpoints ? "/delete_worksheet_state" : ""),
            {
                jsonrpc: '2.0',
                method: 'delete_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            },
            {
                withCredentials: false
            }
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return;
                }

                if (response.data.error["@class"] && response.data.error.data) {
                    const __error_class = response.data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                        throw IoException.fromThryftJsonObject(response.data.error.data);
                    } else {
                        throw new Error(response.data.error.message);
                    }
                } else {
                    throw new Error(response.data.error.message);
                }
            },
            (error) => {
                if (error.response) {
                    throw new Error("HTTP error status response from the server");
                } else if (error.request) {
                    throw new Error("no response received from the server");
                } else {
                    throw error;
                }
            }
        );
    }

    putWorksheetState(kwds: {state: WorksheetState}): Promise<void> {
        const __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["state"] = kwds.state.toThryftJsonObject();

        return axios.post(
            this._endpointUrl + (this._methodEndpoints ? "/put_worksheet_state" : ""),
            {
                jsonrpc: '2.0',
                method: 'put_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            },
            {
                withCredentials: false
            }
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return;
                }

                if (response.data.error["@class"] && response.data.error.data) {
                    const __error_class = response.data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                        throw IoException.fromThryftJsonObject(response.data.error.data);
                    } else {
                        throw new Error(response.data.error.message);
                    }
                } else {
                    throw new Error(response.data.error.message);
                }
            },
            (error) => {
                if (error.response) {
                    throw new Error("HTTP error status response from the server");
                } else if (error.request) {
                    throw new Error("no response received from the server");
                } else {
                    throw error;
                }
            }
        );
    }

    renameWorksheetState(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId}): Promise<void> {
        const __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["new_id"] = kwds.newId.toString();
        __jsonrpc_params["old_id"] = kwds.oldId.toString();

        return axios.post(
            this._endpointUrl + (this._methodEndpoints ? "/rename_worksheet_state" : ""),
            {
                jsonrpc: '2.0',
                method: 'rename_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            },
            {
                withCredentials: false
            }
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return;
                }

                if (response.data.error["@class"] && response.data.error.data) {
                    const __error_class = response.data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.worksheet.duplicate_worksheet_state_exception.DuplicateWorksheetStateException') {
                        throw DuplicateWorksheetStateException.fromThryftJsonObject(response.data.error.data);
                    } else if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
                        throw IoException.fromThryftJsonObject(response.data.error.data);
                    } else if (__error_class == 'dressdiscover.api.services.worksheet.no_such_worksheet_state_exception.NoSuchWorksheetStateException') {
                        throw NoSuchWorksheetStateException.fromThryftJsonObject(response.data.error.data);
                    } else {
                        throw new Error(response.data.error.message);
                    }
                } else {
                    throw new Error(response.data.error.message);
                }
            },
            (error) => {
                if (error.response) {
                    throw new Error("HTTP error status response from the server");
                } else if (error.request) {
                    throw new Error("no response received from the server");
                } else {
                    throw error;
                }
            }
        );
    }

    private readonly _endpointUrl: string;
    private readonly _methodEndpoints: boolean;
}

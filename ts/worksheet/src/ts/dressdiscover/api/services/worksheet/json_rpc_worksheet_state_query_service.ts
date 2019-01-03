import axios from "axios";
import { IoException } from "../io_exception";
import { NoSuchWorksheetStateException } from "./no_such_worksheet_state_exception";
import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export class JsonRpcWorksheetStateQueryService implements WorksheetStateQueryService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this._endpointUrl = kwds.endpointUrl;
        this._methodEndpoints = !!kwds.methodEndpoints;
    }

    getWorksheetState(kwds: {id: WorksheetStateId}): Promise<WorksheetState> {
        const __jsonrpc_params: {[index: string]: any} = {};
        __jsonrpc_params["id"] = kwds.id.toString();

        return axios.post(
            this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_state" : ""),
            {
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
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
                    return WorksheetState.fromThryftJsonObject(response.data.result);
                }

                if (response.data.error["@class"] && response.data.error.data) {
                    const __error_class = response.data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
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

    getWorksheetStateIds(): Promise<WorksheetStateId[]> {
        return axios.post(
            this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_state_ids" : ""),
            {
                jsonrpc: '2.0',
                method: 'get_worksheet_state_ids',
                params: {},
                id: '1234'
            },
            {
                withCredentials: false
            }
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return function(json: any[]): WorksheetStateId[] { let sequence: WorksheetStateId[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetStateId.parse(json[i])); } return sequence; }(response.data.result);
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

    private readonly _endpointUrl: string;
    private readonly _methodEndpoints: boolean;
}

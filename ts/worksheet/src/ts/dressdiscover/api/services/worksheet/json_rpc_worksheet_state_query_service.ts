import * as $ from "jquery"
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

        return $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state',
                params: __jsonrpc_params,
                id: '1234'
            }),
            dataType: 'json',
            mimeType: 'application/json',
            type: 'POST',
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_state" : "")
        })
        .then(
            (data) => {
                if (typeof data.result !== "undefined") {
                    return WorksheetState.fromThryftJsonObject(data.result);
                }

                if (data.error["@class"] && data.error.data) {
                    const __error_class = data.error["@class"];
                    if (__error_class == 'dressdiscover.api.services.io_exception.IoException') {
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

    getWorksheetStateIds(): Promise<WorksheetStateId[]> {
        return $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_state_ids',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            mimeType: 'application/json',
            type: 'POST',
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_state_ids" : "")
        })
        .then(
            (data) => {
                if (typeof data.result !== "undefined") {
                    return function(json: any[]): WorksheetStateId[] { let sequence: WorksheetStateId[] = []; for (let i = 0; i < json.length; i++) { sequence.push(WorksheetStateId.parse(json[i])); } return sequence; }(data.result);
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

    private readonly _endpointUrl: string;
    private readonly _methodEndpoints: boolean;
}

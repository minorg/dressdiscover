import axios from "axios";
import { IoException } from "../../io_exception";
import { NoSuchWorksheetStateException } from "./no_such_worksheet_state_exception";
import { WorksheetState } from "../../../models/worksheet/state/worksheet_state";
import { WorksheetStateId } from "../../../models/worksheet/state/worksheet_state_id";
import { WorksheetStateQueryService } from "./worksheet_state_query_service";

export class JsonRpcWorksheetStateQueryService implements WorksheetStateQueryService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this.endpointUrl = kwds.endpointUrl;
        this.methodEndpoints = !!kwds.methodEndpoints;
    }

    public getWorksheetState(kwds: {id: WorksheetStateId}): Promise<WorksheetState> {
        const jsonrpcParams: {[index: string]: any} = {};
        jsonrpcParams.id = kwds.id.toString();

        return axios.post(
            this.endpointUrl + (this.methodEndpoints ? "/get_worksheet_state" : ""),
            {
                id: "1234",
                jsonrpc: "2.0",
                method: "get_worksheet_state",
                params: jsonrpcParams,
            },
            {
                withCredentials: false,
            },
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return WorksheetState.fromThryftJsonObject(response.data.result);
                }

                if (response.data.error["@class"] && response.data.error.data) {
                    const errorClass = response.data.error["@class"];
                    if (errorClass === "dressdiscover.api.services.io_exception.IoException") {
                        throw IoException.fromThryftJsonObject(response.data.error.data);
                    } else if (errorClass === "dressdiscover.api.services.worksheet.state.no_such_worksheet_state_exception.NoSuchWorksheetStateException") {
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
            },
        );
    }

    public getWorksheetStateIds(): Promise<WorksheetStateId[]> {
        return axios.post(
            this.endpointUrl + (this.methodEndpoints ? "/get_worksheet_state_ids" : ""),
            {
                id: "1234",
                jsonrpc: "2.0",
                method: "get_worksheet_state_ids",
                params: {},
            },
            {
                withCredentials: false,
            },
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return (response.data.result).map((element: any) => WorksheetStateId.parse(element));
                }

                if (response.data.error["@class"] && response.data.error.data) {
                    const errorClass = response.data.error["@class"];
                    if (errorClass === "dressdiscover.api.services.io_exception.IoException") {
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
            },
        );
    }

    private readonly endpointUrl: string;
    private readonly methodEndpoints: boolean;
}

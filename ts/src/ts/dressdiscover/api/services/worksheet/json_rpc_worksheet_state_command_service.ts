import axios from "axios";
import { DuplicateWorksheetStateException } from "./duplicate_worksheet_state_exception";
import { IoException } from "../io_exception";
import { NoSuchWorksheetStateException } from "./no_such_worksheet_state_exception";
import { WorksheetState } from "../../models/worksheet/worksheet_state";
import { WorksheetStateCommandService } from "./worksheet_state_command_service";
import { WorksheetStateId } from "../../models/worksheet/worksheet_state_id";

export class JsonRpcWorksheetStateCommandService implements WorksheetStateCommandService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this.endpointUrl = kwds.endpointUrl;
        this.methodEndpoints = !!kwds.methodEndpoints;
    }

    public deleteWorksheetState(kwds: {id: WorksheetStateId}): Promise<void> {
        const jsonrpcParams: {[index: string]: any} = {};
        jsonrpcParams.id = kwds.id.toString();

        return axios.post(
            this.endpointUrl + (this.methodEndpoints ? "/delete_worksheet_state" : ""),
            {
                id: "1234",
                jsonrpc: "2.0",
                method: "delete_worksheet_state",
                params: jsonrpcParams,
            },
            {
                withCredentials: false,
            },
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return;
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

    public putWorksheetState(kwds: {state: WorksheetState}): Promise<void> {
        const jsonrpcParams: {[index: string]: any} = {};
        jsonrpcParams.state = kwds.state.toThryftJsonObject();

        return axios.post(
            this.endpointUrl + (this.methodEndpoints ? "/put_worksheet_state" : ""),
            {
                id: "1234",
                jsonrpc: "2.0",
                method: "put_worksheet_state",
                params: jsonrpcParams,
            },
            {
                withCredentials: false,
            },
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return;
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

    public renameWorksheetState(kwds: {newId: WorksheetStateId, oldId: WorksheetStateId}): Promise<void> {
        const jsonrpcParams: {[index: string]: any} = {};
        jsonrpcParams.new_id = kwds.newId.toString();
        jsonrpcParams.old_id = kwds.oldId.toString();

        return axios.post(
            this.endpointUrl + (this.methodEndpoints ? "/rename_worksheet_state" : ""),
            {
                id: "1234",
                jsonrpc: "2.0",
                method: "rename_worksheet_state",
                params: jsonrpcParams,
            },
            {
                withCredentials: false,
            },
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return;
                }

                if (response.data.error["@class"] && response.data.error.data) {
                    const errorClass = response.data.error["@class"];
                    if (errorClass === "dressdiscover.api.services.worksheet.duplicate_worksheet_state_exception.DuplicateWorksheetStateException") {
                        throw DuplicateWorksheetStateException.fromThryftJsonObject(response.data.error.data);
                    } else if (errorClass === "dressdiscover.api.services.io_exception.IoException") {
                        throw IoException.fromThryftJsonObject(response.data.error.data);
                    } else if (errorClass === "dressdiscover.api.services.worksheet.no_such_worksheet_state_exception.NoSuchWorksheetStateException") {
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

    private readonly endpointUrl: string;
    private readonly methodEndpoints: boolean;
}

import axios from "axios";
import { IoException } from "../io_exception";
import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetDefinitionQueryService } from "./worksheet_definition_query_service";

export class JsonRpcWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this.endpointUrl = kwds.endpointUrl;
        this.methodEndpoints = !!kwds.methodEndpoints;
    }

    public getWorksheetDefinition(): Promise<WorksheetDefinition> {
        return axios.post(
            this.endpointUrl + (this.methodEndpoints ? "/get_worksheet_definition" : ""),
            {
                id: "1234",
                jsonrpc: "2.0",
                method: "get_worksheet_definition",
                params: {},
            },
            {
                withCredentials: false,
            },
        )
        .then(
            (response) => {
                if (typeof response.data.result !== "undefined") {
                    return WorksheetDefinition.fromThryftJsonObject(response.data.result);
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

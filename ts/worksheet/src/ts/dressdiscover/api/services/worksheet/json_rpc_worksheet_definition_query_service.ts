import axios from "axios";
import { IoException } from "../io_exception";
import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetDefinitionQueryService } from "./worksheet_definition_query_service";

export class JsonRpcWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this._endpointUrl = kwds.endpointUrl;
        this._methodEndpoints = !!kwds.methodEndpoints;
    }

    getWorksheetDefinition(): Promise<WorksheetDefinition> {
        return axios.post(
            this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_definition" : ""),
            {
                jsonrpc: '2.0',
                method: 'get_worksheet_definition',
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
                    return WorksheetDefinition.fromThryftJsonObject(response.data.result);
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

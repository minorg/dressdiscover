import * as $ from "jquery"
import { IoException } from "../io_exception";
import { WorksheetDefinition } from "../../models/worksheet/worksheet_definition";
import { WorksheetDefinitionQueryService } from "./worksheet_definition_query_service";

export class JsonRpcWorksheetDefinitionQueryService implements WorksheetDefinitionQueryService {
    constructor(kwds: { endpointUrl: string, methodEndpoints?: boolean }) {
        this._endpointUrl = kwds.endpointUrl;
        this._methodEndpoints = !!kwds.methodEndpoints;
    }

    getWorksheetDefinition(): Promise<WorksheetDefinition> {
        return $.ajax({
            async: true,
            contentType: "application/json",
            data: JSON.stringify({
                jsonrpc: '2.0',
                method: 'get_worksheet_definition',
                params: {},
                id: '1234'
            }),
            dataType: 'json',
            mimeType: 'application/json',
            type: 'POST',
            url: this._endpointUrl + (this._methodEndpoints ? "/get_worksheet_definition" : "")
        })
        .then(
            (data) => {
                if (typeof data.result !== "undefined") {
                    return WorksheetDefinition.fromThryftJsonObject(data.result);
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

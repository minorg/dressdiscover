import { WorksheetPingQueryService } from "./worksheet_ping_query_service";

export abstract class AsyncToSyncWorksheetPingQueryService implements WorksheetPingQueryService {
    pingAsync(kwds: {message: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string) => void}): void {
        if (kwds.success) {
            kwds.success(this.pingSync({message: kwds.message}));
        } else {
            this.pingSync({message: kwds.message});
        }
    }

    abstract pingSync(kwds: {message: string}): string;
}

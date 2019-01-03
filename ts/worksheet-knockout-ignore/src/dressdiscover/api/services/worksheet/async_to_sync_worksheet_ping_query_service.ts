import { WorksheetPingQueryService } from "./worksheet_ping_query_service";

export abstract class AsyncToSyncWorksheetPingQueryService implements WorksheetPingQueryService {
    pingAsync(kwds: {message: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string) => void}): void {
        try {
            if (kwds.success) {
                kwds.success(this.pingSync({message: kwds.message}));
            } else {
                this.pingSync({message: kwds.message});
            }
        } catch (e) {
            if (kwds.error) {
                kwds.error({textStatus: e.message, errorThrown: e});
            }
        }
    }

    abstract pingSync(kwds: {message: string}): string;
}

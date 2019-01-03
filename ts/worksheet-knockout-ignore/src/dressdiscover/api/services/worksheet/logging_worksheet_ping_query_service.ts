import { WorksheetPingQueryService } from "./worksheet_ping_query_service";

export class LoggingWorksheetPingQueryService implements WorksheetPingQueryService {
    constructor(private delegate: WorksheetPingQueryService) {
    }

    pingAsync(kwds: {message: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string) => void}): void {
        this.delegate.pingAsync({message: kwds.message, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => { console.warn("pingAsync({", "message: ", kwds.message, "}) -> ", errorKwds.textStatus); console.warn(errorKwds.errorThrown); if (kwds.error) { kwds.error(errorKwds); } }, success: (returnValue: string) => { console.debug("pingAsync({", "message: ", kwds.message, "}) -> ", returnValue); if (kwds.success) { kwds.success(returnValue); } }});
    }

    pingSync(kwds: {message: string}): string {
        try {
            const __returnValue = this.delegate.pingSync({message: kwds.message});
            console.debug("pingSync({", "message: ", kwds.message, "}) -> ", __returnValue);
            return __returnValue;
        } catch (e) {
            console.warn("pingSync({", "message: ", kwds.message, "}) -> exception");
            console.warn(e);
            throw e;
        }
    }
}

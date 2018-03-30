export interface WorksheetPingQueryService {
    /**
     * ping
     * @param {string} message
     * @return {string}
     * @throws {IoException}
     */
    pingAsync(kwds: {message: string, error: (errorKwds: {textStatus: string, errorThrown: any, [index: string]: any}) => any, success: (returnValue: string) => void}): void;

    /**
     * ping
     * @param {string} message
     * @return {string}
     * @throws {IoException}
     */
    pingSync(kwds: {message: string}): string;
}
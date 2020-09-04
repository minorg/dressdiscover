import { AuthorizationException } from 'dressdiscover/gui/services/authorization_exception';
import { IoException } from 'dressdiscover/gui/services/io_exception';

export type GapiException = AuthorizationException | IoException;

export function convertGapiErrorToException(reason: any): GapiException {
    const error = reason.result.error;
    if (error.code === 401) {
        return new AuthorizationException({ causeMessage: error.message });
    } else {
        return new IoException({ causeMessage: JSON.stringify(error) });
    }
}

import { AuthorizationException } from 'dressdiscover/api/services/authorization_exception';
import { IoException } from 'dressdiscover/api/services/io_exception';

export type GapiException = AuthorizationException | IoException;

export function convertGapiErrorToException(reason: any): GapiException {
    throw new EvalError();
}

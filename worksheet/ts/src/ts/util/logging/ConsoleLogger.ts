import { ILogger } from '~/util/logging/ILogger';

export class ConsoleLogger implements ILogger {
  debug(msg: any) {
    console.debug(msg);
  }

  info(msg: any) {
    console.info(msg)
  }

  warn(msg: any) {
    console.warn(msg)
  }

  error(msg: any) {
    console.error(msg)
  }
}

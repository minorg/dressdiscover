import { ConsoleLogger } from 'dressdiscover/cms/gui/util/logging/ConsoleLogger';
import { Logger } from 'dressdiscover/cms/gui/util/logging/Logger';
import * as React from 'react';


export const LoggerContext = React.createContext<Logger>(new ConsoleLogger());

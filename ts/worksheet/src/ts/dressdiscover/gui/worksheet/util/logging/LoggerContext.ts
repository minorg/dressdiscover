import * as React from 'react';

import { ConsoleLogger } from './ConsoleLogger';
import { ILogger } from './ILogger';

export const LoggerContext = React.createContext<ILogger>(new ConsoleLogger());

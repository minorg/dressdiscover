import { Application } from 'dressdiscover/gui/worksheet/Application';
import { CurrentUserStore } from 'dressdiscover/gui/worksheet/stores/current_user/CurrentUserStore';
import { ConsoleLogger } from 'dressdiscover/gui/worksheet/util/logging/ConsoleLogger';
import { LoggerContext } from 'dressdiscover/gui/worksheet/util/logging/LoggerContext';
import { createBrowserHistory } from 'history';
import * as mobx from 'mobx';
import { Provider as StoresProvider } from 'mobx-react';
import { RouterStore, syncHistoryWithStore } from 'mobx-react-router';
import * as React from 'react';
import * as ReactDOM from 'react-dom';
import { Router } from 'react-router';

import { WorksheetStore } from './stores/worksheet/WorksheetStore';

// Logger
const logger = new ConsoleLogger();

// mobx global configuration
mobx.configure({ enforceActions: "always" });

// Stores
const currentUserStore = new CurrentUserStore(logger);
const routerStore = new RouterStore();
const syncedHistory = syncHistoryWithStore(createBrowserHistory(), routerStore);
const stores = {
  currentUserStore: currentUserStore,
  routerStore,
  worksheetStore: new WorksheetStore(currentUserStore, logger)
};

ReactDOM.render(
  <LoggerContext.Provider value={logger}>
    <StoresProvider {...stores}>
      <Router history={syncedHistory}>
        <Application />
      </Router>
    </StoresProvider>
  </LoggerContext.Provider>,
  document.getElementById('root')
);

import { Application } from 'dressdiscover/gui/worksheet/Application';
import { CurrentUserStore } from 'dressdiscover/gui/worksheet/store';
import { ConsoleLogger } from 'dressdiscover/gui/worksheet/util/logging/ConsoleLogger';
import { LoggerContext } from 'dressdiscover/gui/worksheet/util/logging/LoggerContext';
import { createBrowserHistory } from 'history';
import * as mobx from 'mobx';
import { Provider as StoresProvider } from 'mobx-react';
import { RouterStore, syncHistoryWithStore } from 'mobx-react-router';
import * as React from 'react';
import * as ReactDOM from 'react-dom';
import { Router } from 'react-router';


// Logger
const logger = new ConsoleLogger();


// mobx global configuration
mobx.configure({ enforceActions: "always" });

// Router store
const browserHistory = createBrowserHistory();
const routerStore = new RouterStore();
const syncedHistory = syncHistoryWithStore(browserHistory, routerStore);
const stores = {
  currentUserStore: new CurrentUserStore(logger),
  routerStore
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
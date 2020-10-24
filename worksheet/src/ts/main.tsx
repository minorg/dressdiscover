import {Application} from '~/Application';
import {CurrentUserStore} from '~/stores/current_user/CurrentUserStore';
import {ConsoleLogger} from '~/util/logging/ConsoleLogger';
import {LoggerContext} from '~/util/logging/LoggerContext';
import {createBrowserHistory} from 'history';
import * as mobx from 'mobx';
import {Provider as StoresProvider} from 'mobx-react';
import {RouterStore, syncHistoryWithStore} from 'mobx-react-router';
import * as React from 'react';
import * as ReactDOM from 'react-dom';
import {Router} from 'react-router';
import Hammer from 'hammerjs';

// Logger
const logger = new ConsoleLogger();

// mobx global configuration
mobx.configure({enforceActions: "always"});

// Stores
const currentUserStore = new CurrentUserStore(logger);
const routerStore = new RouterStore();
const syncedHistory = syncHistoryWithStore(createBrowserHistory(), routerStore);
const stores = {
    currentUserStore,
    routerStore
};

delete Hammer.defaults.cssProps.userSelect;

ReactDOM.render(
    <LoggerContext.Provider value={logger}>
        <StoresProvider {...stores}>
            <Router history={syncedHistory}>
                <Application/>
            </Router>
        </StoresProvider>
    </LoggerContext.Provider>,
    document.getElementById('root')
);

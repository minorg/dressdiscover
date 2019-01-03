import { Home } from 'dressdiscover/gui/worksheet/component';
import * as React from 'react';
import { Route, Switch } from 'react-router';

import { Hrefs } from './Hrefs';

export class Routes extends React.Component {
  render() {
    return (
      <Switch>
        <Route path={Hrefs.loginFailure} component={Home} />
        <Route path={Hrefs.loginSuccess} component={Home} />
        <Route path={Hrefs.logoutSuccess} component={Home} />
        <Route path={Hrefs.home} component={Home} />
      </Switch>
    );
  }
}

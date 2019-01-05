import { Home } from 'dressdiscover/gui/worksheet/components/home/Home';
import * as React from 'react';
import { Route, Switch } from 'react-router';

import { Credits } from './components/static/Credits';
import { Privacy } from './components/static/Privacy';
import { WorksheetStart } from './components/worksheet/WorksheetStart';
import { Hrefs } from './Hrefs';

export class Routes extends React.Component {
  render() {
    return (
      <Switch>
        <Route path={Hrefs.credits} component={Credits} />
        <Route exact path={Hrefs.home} component={Home} />
        <Route exact path={Hrefs.loginFailure} component={Home} />
        <Route exact path={Hrefs.loginSuccess} component={Home} />
        <Route exact path={Hrefs.logoutSuccess} component={Home} />
        <Route exact path={Hrefs.privacy} component={Privacy} />
        <Route exact path={Hrefs.worksheetStart} component={WorksheetStart} />
      </Switch>
    );
  }
}

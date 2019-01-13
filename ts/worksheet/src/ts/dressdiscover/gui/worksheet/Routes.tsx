import { Home } from 'dressdiscover/gui/worksheet/components/home/Home';
import * as React from 'react';
import { Route, Switch } from 'react-router';

import { Credits } from './components/static/Credits';
import { Privacy } from './components/static/Privacy';
import { WorksheetFeatureSetStateComponent } from './components/worksheet/WorksheetFeatureSetStateComponent';
import { WorksheetFeatureStateComponent } from './components/worksheet/WorksheetFeatureStateComponent';
import { WorksheetStart } from './components/worksheet/WorksheetStart';
import { WorksheetStateComponent } from './components/worksheet/WorksheetStateComponent';
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
        <Route exact path="/worksheet/:worksheetStateId" component={WorksheetStateComponent} />
        <Route exact path="/worksheet/:worksheetStateId/feature_set/:featureSetId/" component={WorksheetFeatureSetStateComponent}/>
        <Route exact path="/worksheet/:worksheetStateId/feature_set/:featureSetId/feature/:featureId" component={WorksheetFeatureStateComponent}/>
      </Switch>
    );
  }
}

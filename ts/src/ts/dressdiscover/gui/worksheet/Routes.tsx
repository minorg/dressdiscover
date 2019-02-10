import { NoRoute } from 'dressdiscover/gui/worksheet/components/error/NoRoute';
import { Home } from 'dressdiscover/gui/worksheet/components/home/Home';
import { LogoutCallback } from 'dressdiscover/gui/worksheet/components/login/LogoutCallback';
import { Credits } from 'dressdiscover/gui/worksheet/components/static/Credits';
import { Privacy } from 'dressdiscover/gui/worksheet/components/static/Privacy';
import {
  WorksheetFeatureSetStateEditOrReview,
} from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetFeatureSetStateEditOrReview';
import { WorksheetFeatureStateEdit } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetFeatureStateEdit';
import { WorksheetStart } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStart';
import { WorksheetStateEdit } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateEdit';
import { WorksheetStateReview } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateReview';
import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import * as React from 'react';
import { Route, Switch } from 'react-router';

import { Login } from './components/login/Login';
import { LoginCallback } from './components/login/LoginCallback';
import { Logout } from './components/login/Logout';

export class Routes extends React.Component {
  render() {
    return (
      <Switch>
        <Route path={Hrefs.credits} component={Credits} />
        <Route exact path={Hrefs.home} component={Home} />
        <Route exact path={Hrefs.login} component={Login} />
        <Route exact path={Hrefs.loginCallback} component={LoginCallback} />
        <Route exact path={Hrefs.logout} component={Logout} />
        <Route exact path={Hrefs.logoutCallback} component={LogoutCallback} />
        <Route exact path={Hrefs.privacy} component={Privacy} />
        <Route exact path={Hrefs.worksheetStart} component={WorksheetStart} />
        <Route exact path="/worksheet/state/:worksheetStateId/edit" component={WorksheetStateEdit} />
        <Route exact path="/worksheet/state/:worksheetStateId/review" component={WorksheetStateReview} />
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/edit" component={WorksheetFeatureSetStateEditOrReview} />
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/review" component={WorksheetFeatureSetStateEditOrReview} />
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/feature/:featureId/edit" component={WorksheetFeatureStateEdit} />
        <Route component={NoRoute} />
      </Switch>
    );
  }
}

import { NoRoute } from 'dressdiscover/gui/components/error/NoRoute';
import { Home } from 'dressdiscover/gui/components/home/Home';
import { LogoutCallback } from 'dressdiscover/gui/components/login/LogoutCallback';
import { About } from 'dressdiscover/gui/components/static/About';
import { Credits } from 'dressdiscover/gui/components/static/Credits';
import { Privacy } from 'dressdiscover/gui/components/static/Privacy';
import { UserSettingsComponent } from 'dressdiscover/gui/components/user/UserSettingsComponent';
import { WorksheetStart } from 'dressdiscover/gui/components/worksheet/start/WorksheetStart';
import {
  WorksheetFeatureSetStateEditOrReview,
} from 'dressdiscover/gui/components/worksheet/state/WorksheetFeatureSetStateEditOrReview';
import { WorksheetFeatureStateEdit } from 'dressdiscover/gui/components/worksheet/state/WorksheetFeatureStateEdit';
import { WorksheetStateEdit } from 'dressdiscover/gui/components/worksheet/state/WorksheetStateEdit';
import { WorksheetStateReview } from 'dressdiscover/gui/components/worksheet/state/WorksheetStateReview';
import { Hrefs } from 'dressdiscover/gui/Hrefs';
import * as React from 'react';
import { Route, Switch } from 'react-router';

import { Login } from './components/login/Login';
import { LoginCallback } from './components/login/LoginCallback';
import { Logout } from './components/login/Logout';

export class Routes extends React.Component {
  render() {
    return (
      <Switch>
        <Route exact path={Hrefs.about} component={About} />
        <Route exact path={Hrefs.credits} component={Credits} />
        <Route exact path={Hrefs.home} component={Home} />
        <Route exact path={Hrefs.login} component={Login} />
        <Route exact path={Hrefs.loginCallback} component={LoginCallback} />
        <Route exact path={Hrefs.logout} component={Logout} />
        <Route exact path={Hrefs.logoutCallback} component={LogoutCallback} />
        <Route exact path={Hrefs.privacy} component={Privacy} />
        <Route exact path={Hrefs.userSettings} component={UserSettingsComponent}></Route>
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

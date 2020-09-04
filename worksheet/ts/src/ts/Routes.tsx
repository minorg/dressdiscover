import { NoRoute } from '~/components/error/NoRoute';
import { Home } from '~/components/home/Home';
import { LogoutCallback } from '~/components/login/LogoutCallback';
import { About } from '~/components/static/About';
import { Credits } from '~/components/static/Credits';
import { Privacy } from '~/components/static/Privacy';
import { UserSettingsComponent } from '~/components/user/UserSettingsComponent';
import { WorksheetStart } from '~/components/worksheet/start/WorksheetStart';
import {
  WorksheetFeatureSetStateEditOrReview,
} from '~/components/worksheet/state/WorksheetFeatureSetStateEditOrReview';
import { WorksheetFeatureStateEdit } from '~/components/worksheet/state/WorksheetFeatureStateEdit';
import { WorksheetStateEdit } from '~/components/worksheet/state/WorksheetStateEdit';
import { WorksheetStateReview } from '~/components/worksheet/state/WorksheetStateReview';
import { Hrefs } from '~/Hrefs';
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

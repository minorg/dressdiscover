import { Home } from 'dressdiscover/gui/worksheet/components/home/Home';
import * as React from 'react';
import { Route, Switch } from 'react-router';

import { NoRoute } from './components/error/NoRoute';
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
        <Route exact path="/worksheet/state/:worksheetStateId/edit" component={WorksheetStateEdit} />
        <Route exact path="/worksheet/state/:worksheetStateId/review" component={WorksheetStateReview} />
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/edit" component={NoRoute}/>
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/review" component={NoRoute}/>
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/feature/:featureId/edit" component={NoRoute}/>
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/feature/:featureId/review" component={NoRoute}/>
        <Route component={NoRoute}/>
      </Switch>
    );
  }
}

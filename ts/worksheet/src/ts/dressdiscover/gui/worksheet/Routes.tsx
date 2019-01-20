import { NoRoute } from 'dressdiscover/gui/worksheet/components/error/NoRoute';
import { Home } from 'dressdiscover/gui/worksheet/components/home/Home';
import { Credits } from 'dressdiscover/gui/worksheet/components/static/Credits';
import { Privacy } from 'dressdiscover/gui/worksheet/components/static/Privacy';
import {
  WorksheetFeatureSetStateEditOrReview,
} from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetFeatureSetStateEditOrReview';
import { WorksheetStart } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStart';
import { WorksheetStateEdit } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateEdit';
import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import * as React from 'react';
import { Route, Switch } from 'react-router';

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
        <Route exact path="/worksheet/state/:worksheetStateId/review" component={NoRoute} />
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/edit" component={WorksheetFeatureSetStateEditOrReview}/>
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/feature/:featureId/edit" component={NoRoute}/>
        <Route exact path="/worksheet/state/:worksheetStateId/feature_set/:featureSetId/feature/:featureId/review" component={NoRoute}/>
        <Route component={NoRoute}/>
      </Switch>
    );
  }
}

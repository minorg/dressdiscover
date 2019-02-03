import { NoRoute } from 'dressdiscover/gui/worksheet/components/error/NoRoute';
import { Home } from 'dressdiscover/gui/worksheet/components/home/Home';
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
import { inject } from 'mobx-react';
import * as queryString from 'query-string';
import * as React from 'react';
import { Redirect, Route, RouteComponentProps, Switch } from 'react-router';

import { FatalErrorModal } from './components/error/FatalErrorModal';
import { CurrentUserStore } from './stores/current_user/CurrentUserStore';

interface Props {
  currentUserStore?: CurrentUserStore;
}

@inject("currentUserStore")
export class Routes extends React.Component<Props> {
  constructor(props: Props) {
    super(props);
    this.renderLoginRedirect = this.renderLoginRedirect.bind(this);
    this.renderLogoutRedirect = this.renderLogoutRedirect.bind(this);
  }

  render() {
    return (
      <Switch>
        <Route path={Hrefs.credits} component={Credits} />
        <Route exact path={Hrefs.home} component={Home} />
        <Route exact path={Hrefs.loginRedirect} render={this.renderLoginRedirect} />
        <Route exact path={Hrefs.logoutRedirect} render={this.renderLogoutRedirect} />
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

  renderLoginRedirect(props: RouteComponentProps<any>): React.ReactNode {
    const parsedQuery = queryString.parse(props.location.search);

    const code = parsedQuery.code;
    if (code && typeof(code) === "string") {
      this.props.currentUserStore!.loginUser(code);
      return <Redirect to={Hrefs.home} />;
    }

    const error = parsedQuery.error;
    if (error && typeof (error) === "string") {
      return <FatalErrorModal error={new Error(error)} />;
    }

    return <FatalErrorModal error={new Error("login error")}></FatalErrorModal>;
  }

  renderLogoutRedirect() {
    this.props.currentUserStore!.logoutCurrentUser();
    return <Redirect to={Hrefs.home}/>;
  }
}

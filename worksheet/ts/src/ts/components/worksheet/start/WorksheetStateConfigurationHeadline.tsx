import {Hrefs} from "~/Hrefs";
import {CurrentUserStore} from "~/stores/current_user/CurrentUserStore";
import {inject} from "mobx-react";
import * as React from "react";
import {Link} from "react-router-dom";

@inject("currentUserStore")
export class WorksheetStateConfigurationHeadline extends React.Component<{
  currentUserStore?: CurrentUserStore;
}> {
  render() {
    const {currentUserStore} = this.props;

    const currentUser = currentUserStore!.currentUser;
    const worksheetStateConfiguration = currentUserStore!.currentUserServices
      .configuration.state;

    const localStorageText = "storage on this browser / machine";

    if (!currentUser) {
      return (
        <React.Fragment>
          {localStorageText} (<Link to={Hrefs.login}>Login</Link> to change to a
          Google Sheet)
        </React.Fragment>
      );
    }

    let text: string;
    if (worksheetStateConfiguration.googleSheets) {
      text = "Google Sheet";
    } else if (worksheetStateConfiguration.localStorage) {
      text = localStorageText;
    } else {
      throw new EvalError();
    }

    return (
      <React.Fragment>
        {text} (<Link to={Hrefs.userSettings}>Change</Link>)
      </React.Fragment>
    );
  }
}

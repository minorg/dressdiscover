import { Hrefs } from 'dressdiscover/gui/Hrefs';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import * as React from 'react';
import { Link } from 'react-router-dom';

@inject("currentUserStore")
export class WorksheetStateConfigurationHeadline extends React.Component<{currentUserStore?: CurrentUserStore}> {
    render() {
        const { currentUserStore } = this.props;

        const currentUser = currentUserStore!.currentUser;
        const worksheetStateConfiguration = currentUserStore!.currentUserServices.configuration.state;

        let text: string;
        if (worksheetStateConfiguration.googleSheets) {
            text = "Google Sheet";
        } else if (worksheetStateConfiguration.localStorage) {
            text = "storage on this browser / machine";
        } else {
            throw new EvalError();
        }

        return <React.Fragment>{text}{currentUser ? <React.Fragment> (<Link to={Hrefs.userSettings}>Change</Link>)</React.Fragment> : null}</React.Fragment>;
    }
}
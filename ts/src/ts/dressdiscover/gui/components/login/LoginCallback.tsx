import { GenericErrorHandler } from 'dressdiscover/gui/components/error/GenericErrorHandler';
import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import { inject, observer } from 'mobx-react';
import * as queryString from 'query-string';
import * as React from 'react';
import * as ReactLoader from 'react-loader';
import { Redirect, RouteComponentProps } from 'react-router';

import { Hrefs } from '../../Hrefs';
import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';

interface Props extends RouteComponentProps<any> {
    currentUserStore: CurrentUserStore;
}

interface State {
    error?: string;
}

@inject("currentUserStore")
@observer
export class LoginCallback extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.state = {};
    }

    componentDidMount() {
        const { currentUserStore } = this.props;

        const parsedQueryString = queryString.parse(this.props.location.hash.substring(1));

        const accessToken = parsedQueryString.access_token;
        const expiresIn = parsedQueryString.expires_in;
        // const refreshToken = parsedQueryString.refresh_token;
        if (accessToken && typeof (accessToken) === "string" && expiresIn) {
            currentUserStore.login(new CurrentUserSession({
                accessToken,
                expiresAt: new Date(new Date().getTime() + parseInt(expiresIn as string, 10) * 1000)
            }));
            return;
        }

        let error = parsedQueryString.error;
        if (!error || typeof (error) !== "string") {
            error = "Login error";
        }
        this.setState((prevState) => ({ error: error as string }));
    }

    render() {
        const { currentUserStore } = this.props;

        if (currentUserStore.currentUser) {
            return <Redirect to={Hrefs.home}></Redirect>;
        } else if (this.state.error || currentUserStore.exception) {
            return <GenericErrorHandler exception={currentUserStore.exception} error={this.state.error}></GenericErrorHandler>;
        }

        return <ReactLoader loaded={false} />;
    }
}

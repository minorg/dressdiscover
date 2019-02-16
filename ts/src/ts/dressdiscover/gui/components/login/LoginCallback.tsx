import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import { inject } from 'mobx-react';
import * as queryString from 'query-string';
import * as React from 'react';
import * as ReactLoader from 'react-loader';
import { Redirect, RouteComponentProps } from 'react-router';

import { Hrefs } from '../../Hrefs';
import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';
import { FatalErrorModal } from '../error/FatalErrorModal';

interface Props extends RouteComponentProps<any> {
    currentUserStore: CurrentUserStore;
}

@inject("currentUserStore")
export class LoginCallback extends React.Component<Props> {
    componentDidMount() {
        const { currentUserStore } = this.props;

        const parsedQueryString = queryString.parse(this.props.location.hash.substring(1));

        const accessToken = parsedQueryString.access_token;
        if (accessToken && typeof (accessToken) === "string") {
            const expiresIn = parsedQueryString.expires_in;
            if (expiresIn) {
                currentUserStore.setCurrentUserSession(new CurrentUserSession({ accessToken, expiresAt: new Date(new Date().getTime() + parseInt(expiresIn as string, 10) * 1000) }));
                return;
            }
        }

        let error = parsedQueryString.error;
        if (!error || typeof (error) !== "string") {
            error = "Login error";
        }
        currentUserStore.setError(new Error(error));
    }

    render() {
        const { currentUserStore, history } = this.props;

        if (currentUserStore.currentUser) {
            return <Redirect to={Hrefs.home}></Redirect>;
        } else if (currentUserStore.error) {
            return <FatalErrorModal error={currentUserStore.error} onExit={() => history.push(Hrefs.home)}></FatalErrorModal>;
        } else {
            return <ReactLoader loaded={false}/>;
        }
    }
}

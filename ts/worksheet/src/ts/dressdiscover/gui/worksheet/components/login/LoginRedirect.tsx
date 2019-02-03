import { inject } from 'mobx-react';
import * as queryString from 'query-string';
import * as React from 'react';
import { Redirect, RouteComponentProps } from 'react-router';

import { Hrefs } from '../../Hrefs';
import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';
import { FatalErrorModal } from '../error/FatalErrorModal';

interface Props extends RouteComponentProps {
    currentUserStore?: CurrentUserStore;
}

@inject("currentUserStore")
export class LoginRedirect extends React.Component<Props> {
    render() {
        const parsedQueryString = queryString.parse(this.props.location.hash.substring(1));

        const accessToken = parsedQueryString.access_token;
        if (accessToken && typeof (accessToken) === "string") {
            this.props.currentUserStore!.loginUser({ googleAccessToken: accessToken as string });
            return <Redirect to={Hrefs.home}></Redirect>;
        }

        const onModalExit = () => { this.props.history.push(Hrefs.home); };

        const error = parsedQueryString.error;
        if (error && typeof (error) === "string") {
            return <FatalErrorModal error={new Error(error)} onExit={onModalExit}></FatalErrorModal>;
        }

        return <FatalErrorModal error={new Error("login error")} onExit={onModalExit}></FatalErrorModal>;
    }
}

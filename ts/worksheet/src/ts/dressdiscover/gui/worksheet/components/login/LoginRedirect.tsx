import { inject } from 'mobx-react';
import * as queryString from 'query-string';
import * as React from 'react';
import { Redirect, RouteComponentProps } from 'react-router';

import { Hrefs } from '../../Hrefs';
import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';

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

        return <div></div>;
    }
}

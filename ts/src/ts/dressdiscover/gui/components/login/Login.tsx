import { Hrefs } from 'dressdiscover/gui/Hrefs';
import { Secrets } from 'dressdiscover/gui/Secrets';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import * as queryString from 'query-string';
import * as React from 'react';

@inject("currentUserStore")
export class Login extends React.Component<{ currentUserStore: CurrentUserStore }> {
    componentDidMount() {
        const query = queryString.stringify({
            // access_type: "offline",
            client_id: Secrets.GOOGLE_CLIENT_ID,
            redirect_uri: window.location.protocol + "//" + window.location.host + Hrefs.loginCallback,
            response_type: "token",
            scope: "email openid profile https://www.googleapis.com/auth/drive.file"
        });

        const url = "https://accounts.google.com/o/oauth2/v2/auth?" + query;

        window.location.replace(url);
    }

    render() {
        return <div></div>;
    }
}

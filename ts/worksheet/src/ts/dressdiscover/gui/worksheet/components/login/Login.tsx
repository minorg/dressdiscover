import * as queryString from 'query-string';
import * as React from 'react';

import { Hrefs } from '../../Hrefs';

export class Login extends React.Component {
    componentDidMount() {
        const query = queryString.stringify({
            client_id: "768033890505-b9u6s293d52k4f1v4bav9fif7feoe4b4.apps.googleusercontent.com",
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

import * as queryString from 'query-string';
import * as React from 'react';
import { Redirect } from 'react-router';

import { Hrefs } from '../../Hrefs';

export class Login extends React.Component {
    render() {
        const query = queryString.stringify({
            client_id: "768033890505-b9u6s293d52k4f1v4bav9fif7feoe4b4.apps.googleusercontent.com",
            redirect_uri: window.location.protocol + "//" + window.location.host + Hrefs.loginRedirect,
            response_type: "token",
            scope: "https://www.googleapis.com/auth/userinfo.email https://www.googleapis.com/auth/userinfo.profile https://www.googleapis.com/auth/drive.file"
        });

        return (
            <Redirect to={"https://accounts.google.com/o/oauth2/v2/auth?" + query} />);
    }
}
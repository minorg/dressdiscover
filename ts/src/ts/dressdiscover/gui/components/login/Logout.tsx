import { inject } from 'mobx-react';
import * as React from 'react';

import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';

@inject("currentUserStore")
export class Logout extends React.Component<{ currentUserStore: CurrentUserStore }> {
    componentDidMount() {
        // this.auth0WebAuth.logout({ returnTo: window.location.protocol + "//" + window.location.host + Hrefs.logoutCallback });
    }

    render() {
        return <div></div>;
    }
}

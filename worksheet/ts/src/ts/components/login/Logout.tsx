import { Hrefs } from '~/Hrefs';
import { inject } from 'mobx-react';
import * as React from 'react';
import { Redirect } from 'react-router';

import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';

@inject("currentUserStore")
export class Logout extends React.Component<{ currentUserStore: CurrentUserStore }> {
    render() {
        return <Redirect to={Hrefs.logoutCallback}/>;
    }
}

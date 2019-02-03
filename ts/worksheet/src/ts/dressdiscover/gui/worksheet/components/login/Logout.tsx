import { inject } from 'mobx-react';
import * as React from 'react';
import { Redirect } from 'react-router';

import { Hrefs } from '../../Hrefs';
import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';

interface Props {
    currentUserStore?: CurrentUserStore;
}

@inject("currentUserStore")
export class Logout extends React.Component<Props> {
    render() {
        this.props.currentUserStore!.logoutCurrentUser();
        return <Redirect to={Hrefs.home}/>;
    }
}

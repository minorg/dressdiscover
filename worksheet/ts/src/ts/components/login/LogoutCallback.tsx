import { CurrentUserStore } from '~/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import * as React from 'react';
import { Redirect } from 'react-router';

import { Hrefs } from '../../Hrefs';

@inject("currentUserStore")
export class LogoutCallback extends React.Component<{ currentUserStore: CurrentUserStore }> {
    render() {
        const { currentUserStore } = this.props;

        currentUserStore.logout();

        return <Redirect to={Hrefs.home}></Redirect>;
    }
}

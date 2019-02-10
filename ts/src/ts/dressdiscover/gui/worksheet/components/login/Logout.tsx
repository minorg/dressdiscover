import { inject } from 'mobx-react';
import * as React from 'react';

import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';

@inject("currentUserStore")
export class Logout extends React.Component<{ currentUserStore: CurrentUserStore }> {
    componentDidMount() {
        this.props.currentUserStore.startLogout();
    }

    render() {
        return <div></div>;
    }
}

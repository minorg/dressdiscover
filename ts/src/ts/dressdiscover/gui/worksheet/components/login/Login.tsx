import { CurrentUserStore } from 'dressdiscover/gui/worksheet/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import * as React from 'react';

@inject("currentUserStore")
export class Login extends React.Component<{ currentUserStore: CurrentUserStore }> {
    componentDidMount() {
        this.props.currentUserStore.startLogin();
    }

    render() {
        return <div></div>;
    }
}

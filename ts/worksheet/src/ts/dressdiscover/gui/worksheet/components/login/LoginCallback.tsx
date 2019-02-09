import { inject } from 'mobx-react';
import * as React from 'react';
import { Redirect, RouteComponentProps } from 'react-router';

import { Hrefs } from '../../Hrefs';
import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';
import { FatalErrorModal } from '../error/FatalErrorModal';

interface Props extends RouteComponentProps<any> {
    currentUserStore: CurrentUserStore;
}

@inject("currentUserStore")
export class LoginCallback extends React.Component<Props> {
    render() {
        const { currentUserStore, history } = this.props;

        currentUserStore.handleLoginCallback();

        const error = currentUserStore.error;
        if (error) {
            return <FatalErrorModal error={new Error(error.toString())} onExit={() => { history.push(Hrefs.home); }}></FatalErrorModal>;
        }

        return <Redirect to={Hrefs.home}></Redirect>;
    }
}

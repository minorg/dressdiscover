import { CurrentUserSession } from 'dressdiscover/gui/models/current_user/CurrentUserSession';
import { inject, observer } from 'mobx-react';
import * as queryString from 'query-string';
import * as React from 'react';
import * as ReactLoader from 'react-loader';
import { Redirect, RouteComponentProps } from 'react-router';

import { Hrefs } from '../../Hrefs';
import { CurrentUserStore } from '../../stores/current_user/CurrentUserStore';
import { FatalErrorModal } from '../error/FatalErrorModal';

interface Props extends RouteComponentProps<any> {
    currentUserStore: CurrentUserStore;
}

interface State {
    error?: string;
}

@inject("currentUserStore")
@observer
export class LoginCallback extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.state = {};
    }

    componentDidMount() {
        const { currentUserStore } = this.props;

        const parsedQueryString = queryString.parse(this.props.location.hash.substring(1));

        const accessToken = parsedQueryString.access_token;
        const expiresIn = parsedQueryString.expires_in;
        // const refreshToken = parsedQueryString.refresh_token;
        if (accessToken && typeof (accessToken) === "string" && expiresIn) {
            currentUserStore.login(new CurrentUserSession({
                accessToken,
                expiresAt: new Date(new Date().getTime() + parseInt(expiresIn as string, 10) * 1000)
            }));
            return;
        }

        let error = parsedQueryString.error;
        if (!error || typeof (error) !== "string") {
            error = "Login error";
        }
        this.setState((prevState) => { error })
    }

    render() {
        const { currentUserStore, history } = this.props;

        if (currentUserStore.currentUser) {
            return <Redirect to={Hrefs.home}></Redirect>;
        } else if (this.state.error || currentUserStore.exception) {
            const onModalExit = () => history.push(Hrefs.home);
            if (this.state.error) {
                return <FatalErrorModal message={this.state.error} onExit={onModalExit}/>;
            } else if (currentUserStore.exception) {
                return <FatalErrorModal exception={currentUserStore.exception} onExit={onModalExit} />;
            }
        }

        return <ReactLoader loaded={false} />;
    }
}

import './Application.scss';

import { FatalErrorModal } from '~/components/error/FatalErrorModal';
import { Routes } from '~/Routes';
import { Secrets } from '~/Secrets';
import { convertGapiErrorToException, GapiException } from '~/services/GapiException';
import { CurrentUserStore } from '~/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import * as React from 'react';

@inject("currentUserStore")
export class Application extends React.Component<{ currentUserStore?: CurrentUserStore }, { error?: GapiException, gapiLoaded: boolean }> {
  constructor(props: {}) {
    super(props);
    this.state = { gapiLoaded: false };
  }

  componentDidMount() {
    gapi.load("client", () => {
      gapi.client.load('drive', 'v3', () => {
        gapi.client.load('oauth2', 'v2', () => {
          gapi.client.load('sheets', 'v4', () => {
            gapi.client.init({
              apiKey: Secrets.GOOGLE_API_KEY
            })
              .then(() => {
                const currentUser = this.props.currentUserStore!.currentUser;
                if (currentUser) {
                  // Current user was loaded from cache. Make sure the access token is set here.
                  gapi.client.setToken({ access_token: currentUser.session.accessToken });
                }
                this.setState((prevState) => ({ gapiLoaded: true }));
              },
                (reason: any) => this.setState((prevState) => ({ error: convertGapiErrorToException(reason) }))
              )
          });
        });
      });
    });
  }

  render() {
    if (this.state.error) {
      return <FatalErrorModal message={JSON.stringify(this.state.error)}></FatalErrorModal>
    } else if (this.state.gapiLoaded) {
      return <Routes />;
    } else {
      return (<div></div>);
    }
  }
}

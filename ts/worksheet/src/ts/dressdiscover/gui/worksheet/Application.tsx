import './Application.scss';

import { Routes } from 'dressdiscover/gui/worksheet/Routes';
import * as React from 'react';



export class Application extends React.Component<{}, { gapiLoaded: boolean }> {
  constructor(props: {}) {
    super(props);
    this.state = { gapiLoaded: false };
  }

  componentDidMount() {
    gapi.load("client", () => {
      gapi.client.load('sheets', 'v4', () => {
        this.setState((prevState) => ({ gapiLoaded: true }));
      });
  });
}

  render() {
    if (!this.state.gapiLoaded) {
      return (<div></div>);
    }

    return <Routes />;
  }
}

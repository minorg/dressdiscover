import { Hrefs } from 'dressdiscover/gui/Hrefs';
import * as React from 'react';
import { Redirect } from 'react-router';

import { FatalErrorModal } from './FatalErrorModal';

interface Props {
  error: any;
}

export class GenericErrorHandler extends React.Component<Props> {
  render() {
    if (this.props.error.response) {
        if (this.props.error.response.status == 401) {
            return <Redirect to={Hrefs.home}></Redirect>;
        }
    // } else if (this.props.error.request) {
    //   // The request was made but no response was received
    //   // `error.request` is an instance of XMLHttpRequest in the browser and an instance of
    //   // http.ClientRequest in node.js
    //   console.log(error.request);
    }

    return <FatalErrorModal error={this.props.error}/>;
  }
}

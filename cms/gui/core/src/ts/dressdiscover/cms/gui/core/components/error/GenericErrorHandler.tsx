import { Hrefs } from 'dressdiscover/cms/gui/core/Hrefs';
import * as React from 'react';
import { Redirect } from 'react-router';

import { FatalErrorModal } from './FatalErrorModal';
import { Exception } from 'dressdiscover/cms/gui/core/Exception';

interface Props {
  error?: any;
  exception?: Exception;
  onClosed?: () => void;
}

export class GenericErrorHandler extends React.Component<Props> {
  render() {
    const { error, exception } = this.props;

    if (error) {
      if (error.response) {
        if (error.response.status === 401) {
          return <Redirect to={Hrefs.home}></Redirect>;
        }
        // } else if (this.props.error.request) {
        //   // The request was made but no response was received
        //   // `error.request` is an instance of XMLHttpRequest in the browser and an instance of
        //   // http.ClientRequest in node.js
        //   console.log(error.request);
      }

      return <FatalErrorModal error={this.props.error} />;
    } else if (exception) {
      return <FatalErrorModal exception={this.props.exception} />;
    } else {
      throw new RangeError();
    }
  }
}
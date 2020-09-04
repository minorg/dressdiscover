import { AuthorizationException } from 'dressdiscover/gui/services/authorization_exception';
import { AuthorizationExceptionModal } from 'dressdiscover/gui/components/error/AuthorizationExceptionModal';
import { FatalErrorModal } from 'dressdiscover/gui/components/error/FatalErrorModal';
import { History } from 'history';
import * as React from 'react';

interface Props {
  error?: any;
  exception?: Exception;
  history: History;
}

export class GenericErrorHandler extends React.Component<Props> {
  render() {
    const { error, exception, history } = this.props;

    if (error) {
      return <FatalErrorModal error={this.props.error} />;
    } else if (exception) {
      if (exception instanceof AuthorizationException) {
        return <AuthorizationExceptionModal exception={exception} history={history} />;
      }

      return <FatalErrorModal exception={this.props.exception} />;
    } else {
      throw new RangeError();
    }
  }
}

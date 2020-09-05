import {AuthorizationException} from "~/services/AuthorizationException";
import {AuthorizationExceptionModal} from "~/components/error/AuthorizationExceptionModal";
import {FatalErrorModal} from "~/components/error/FatalErrorModal";
import {History} from "history";
import * as React from "react";
import {Exception} from "~/Exception";

interface Props {
  error?: any;
  exception?: Exception;
  history: History;
}

export class GenericErrorHandler extends React.Component<Props> {
  render() {
    const {error, exception, history} = this.props;

    if (error) {
      return <FatalErrorModal error={this.props.error} />;
    } else if (exception) {
      if (exception instanceof AuthorizationException) {
        return (
          <AuthorizationExceptionModal
            exception={exception}
            history={history}
          />
        );
      }

      return <FatalErrorModal exception={this.props.exception} />;
    } else {
      throw new RangeError();
    }
  }
}

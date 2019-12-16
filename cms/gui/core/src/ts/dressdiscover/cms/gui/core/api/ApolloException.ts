import { ApolloError } from "apollo-boost";
import { Exception } from "dressdiscover/cms/gui/Exception";
import { get } from "lodash";
import { Environment } from "dressdiscover/cms/gui/Environment";

export class ApolloException extends Exception {
  constructor(readonly apolloError: ApolloError) {
    super();
  }

  get httpStatusCode(): number | undefined {
    throw new EvalError("pull off graphQLErrors")
  }

  get message() {
    const errors = get(this.apolloError, "networkError.result.errors");
    if (errors && errors.length > 0 && Environment.development) {
      return errors.map((error: Exception) => error.message).join("/n");
    }
    return this.apolloError.message;
  }
}

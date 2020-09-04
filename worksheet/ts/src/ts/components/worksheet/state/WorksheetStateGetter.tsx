import {WorksheetDefinition} from "~/models/worksheet/definition/WorksheetDefinition";
import {WorksheetState} from "~/models/worksheet/state/WorksheetState";
import {WorksheetStateMark} from "~/models/worksheet/state/WorksheetStateMark";
import {GenericErrorHandler} from "~/components/error/GenericErrorHandler";
import {WorksheetDefinitionWrapper} from "~/models/worksheet/definition/WorksheetDefinitionWrapper";
import {WorksheetStateWrapper} from "~/models/worksheet/state/WorksheetStateWrapper";
import {CurrentUserStore} from "~/stores/current_user/CurrentUserStore";
import {History} from "history";
import {inject, observer} from "mobx-react";
import * as React from "react";
import * as ReactLoader from "react-loader";
import {Exception} from "~/Exception";

interface Props {
  currentUserStore?: CurrentUserStore;
  history: History;
  render: (worksheetState: WorksheetStateWrapper) => React.ReactNode;
  worksheetStateMark: WorksheetStateMark;
}

interface State {
  exception?: Exception;
  worksheetDefinition?: WorksheetDefinition;
  worksheetState?: WorksheetState;
}

@inject("currentUserStore")
@observer
export class WorksheetStateGetter extends React.Component<Props, State> {
  constructor(props: Props) {
    super(props);
    this.state = {};
  }

  async componentDidMount() {
    await this.getWorksheetState();
  }

  // async componentDidUpdate(prevProps: Props) {
  //     if (!this.props.worksheetStateMark.equals(prevProps.worksheetStateMark)) {
  //         await this.getWorksheetState();
  //     }
  // }

  private async getWorksheetState() {
    const {currentUserStore} = this.props;
    const worksheetStateId = this.props.worksheetStateMark.worksheetStateId;
    const self = this;
    const services = currentUserStore!.currentUserServices;

    try {
      const worksheetDefinition = await services.worksheetDefinitionQueryService.getWorksheetDefinition();
      this.setState((prevState) => ({worksheetDefinition}));
    } catch (exception) {
      self.setState((prevState) => ({exception}));
      return;
    }

    try {
      const worksheetState = await services.worksheetStateQueryService.getWorksheetState(
        {id: worksheetStateId}
      );
      this.setState((prevState) => ({worksheetState}));
    } catch (exception) {
      self.setState((prevState) => ({exception}));
      return;
    }
  }

  render() {
    const {exception, worksheetDefinition, worksheetState} = this.state;

    if (exception) {
      return (
        <GenericErrorHandler
          exception={exception}
          history={this.props.history}
        ></GenericErrorHandler>
      );
    }

    if (!worksheetDefinition) {
      return <ReactLoader loaded={false} />;
    }

    if (!worksheetState) {
      return <ReactLoader loaded={false} />;
    }

    return this.props.render(
      new WorksheetStateWrapper(
        this.props.worksheetStateMark,
        new WorksheetDefinitionWrapper(worksheetDefinition),
        worksheetState
      )
    );
  }
}

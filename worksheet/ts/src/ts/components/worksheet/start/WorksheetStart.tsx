import "./WorksheetStart.scss";

import * as classnames from "classnames";
import {GenericErrorHandler} from "~/components/error/GenericErrorHandler";
import {Frame} from "~/components/frame/Frame";
import {Headline} from "~/components/frame/Headline";
import {ActiveNavbarItem} from "~/components/navbar/ActiveNavbarItem";
import {ExistingWorksheetStates} from "~/components/worksheet/start/ExistingWorksheetStates";
import {NewWorksheetState} from "~/components/worksheet/start/NewWorksheetState";
import {Hrefs} from "~/Hrefs";
import {CurrentUserStore} from "~/stores/current_user/CurrentUserStore";
import * as _ from "lodash";
import {inject, observer} from "mobx-react";
import * as React from "react";
import * as ReactLoader from "react-loader";
import {Redirect, RouteComponentProps} from "react-router";
import {Col, Container, Row} from "reactstrap";
import {Exception} from "~/Exception";

interface Props extends RouteComponentProps<any> {
  currentUserStore: CurrentUserStore;
}

interface State {
  exception?: Exception;
  existingWorksheetStateIds?: string[];
  newWorksheetStateId?: string;
}

@inject("currentUserStore")
@observer
export class WorksheetStart extends React.Component<Props, State> {
  constructor(props: Props) {
    super(props);
    this.onDeleteWorksheetState = this.onDeleteWorksheetState.bind(this);
    this.onRenameWorksheetState = this.onRenameWorksheetState.bind(this);
    this.onStartNewWorksheet = this.onStartNewWorksheet.bind(this);
    this.state = {};
  }

  componentDidMount() {
    this.getExistingWorksheetStateIds(this.props);
  }

  componentWillReceiveProps(props: Props) {
    this.getExistingWorksheetStateIds(props);
  }

  private async getExistingWorksheetStateIds(props: Props) {
    const {currentUserStore} = props;
    const self = this;
    try {
      const existingWorksheetStateIds = await currentUserStore.currentUserServices.worksheetStateQueryService.getWorksheetStateIds();
      this.setState((prevState) => ({existingWorksheetStateIds}));
    } catch (e) {
      self.setState((prevState) => ({exception: e}));
    }
  }

  async onDeleteWorksheetState(kwds: {id: string}) {
    await this.props.currentUserStore.currentUserServices.worksheetStateCommandService.deleteWorksheetState(
      kwds
    );
    this.getExistingWorksheetStateIds(this.props);
  }

  async onRenameWorksheetState(kwds: {oldId: string; newId: string}) {
    await this.props.currentUserStore.currentUserServices.worksheetStateCommandService.renameWorksheetState(
      kwds
    );
    this.getExistingWorksheetStateIds(this.props);
  }

  async onStartNewWorksheet(kwds: {newWorksheetStateId: string}) {
    const mtime = new Date();
    await this.props.currentUserStore.currentUserServices.worksheetStateCommandService.putWorksheetState(
      {
        state: {
          ctime: mtime,
          featureSets: [],
          id: kwds.newWorksheetStateId,
          mtime,
        },
      }
    );
    this.setState((prevState) => Object.assign({}, prevState, kwds));
  }

  render() {
    const {
      exception,
      existingWorksheetStateIds,
      newWorksheetStateId,
    } = this.state;

    if (exception) {
      return (
        <GenericErrorHandler
          exception={exception}
          history={this.props.history}
        ></GenericErrorHandler>
      );
    } else if (!existingWorksheetStateIds) {
      return <ReactLoader loaded={false} />;
    } else if (newWorksheetStateId) {
      return (
        <Redirect
          to={Hrefs.worksheetState({worksheetStateId: newWorksheetStateId})}
        ></Redirect>
      );
    }

    return (
      <Frame activeNavItem={ActiveNavbarItem.Worksheets} id="worksheet">
        <Container fluid>
          <Row>
            <Col md="12">
              <Headline>Worksheet</Headline>
            </Col>
          </Row>
          <Row>
            <Col
              className={classnames([
                "d-lg-block",
                "d-md-none",
                "d-sm-none",
                "d-xs-none",
                "d-xl-block",
              ])}
              lg={{offset: 1, size: 4}}
            >
              <p className="lead">
                The worksheet consists of a series of screens, with different
                features depending on the type of object. For example, clothing
                can be described in terms of material, neckline, sleeve type,
                and so on.
              </p>
              <p>
                Each feature option is represented by an image in a grid. Each
                image represents a concept from the Art and Architecture
                Thesaurus (AAT), Europeana Fashion Thesaurus, or CostumeCore
                vocabularies, with images primarily from Wikimedia Commons.
              </p>
              <hr />
              <br />
              <div className="w-100 text-center">
                <img className="img-fluid" src="../img/start-cropped.jpg"></img>
              </div>
            </Col>
            <Col className="text-left" lg="7" xs="12">
              <Container fluid>
                <Row>
                  <Col xs="12">
                    <NewWorksheetState
                      existingWorksheetStateIds={existingWorksheetStateIds}
                      onSubmit={this.onStartNewWorksheet}
                    ></NewWorksheetState>
                    <div className="w-100 text-center">
                      <p>
                        Select <b>Worksheets</b> from the top navigation to
                        return to this page at any time.
                      </p>
                    </div>
                  </Col>
                </Row>
                {!_.isEmpty(existingWorksheetStateIds) ? (
                  <React.Fragment>
                    <Row className="mb-5"></Row>
                    <Row>
                      <Col xs="12">
                        <ExistingWorksheetStates
                          onDeleteWorksheetState={this.onDeleteWorksheetState}
                          onRenameWorksheetState={this.onRenameWorksheetState}
                          worksheetStateIds={existingWorksheetStateIds}
                        />
                      </Col>
                    </Row>
                  </React.Fragment>
                ) : null}
              </Container>
            </Col>
          </Row>
        </Container>
      </Frame>
    );
  }
}

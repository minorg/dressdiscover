import './WorksheetStart.scss';

import * as classnames from 'classnames';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/state/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/state/worksheet_state_mark';
import { GenericErrorHandler } from 'dressdiscover/gui/components/error/GenericErrorHandler';
import { Frame } from 'dressdiscover/gui/components/frame/Frame';
import { Headline } from 'dressdiscover/gui/components/frame/Headline';
import { ActiveNavbarItem } from 'dressdiscover/gui/components/navbar/ActiveNavbarItem';
import { Hrefs } from 'dressdiscover/gui/Hrefs';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import * as _ from 'lodash';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import * as ReactLoader from 'react-loader';
import { Redirect } from 'react-router';
import { Col, Container, Row } from 'reactstrap';

interface Props {
    currentUserStore: CurrentUserStore;
}

@inject("currentUserStore")
@observer
export class WorksheetStart extends React.Component<Props, { newWorksheetStateId?: WorksheetStateId }> {
    constructor(props: Props) {
        super(props);
        this.onStartNewWorksheet = this.onStartNewWorksheet.bind(this);
        this.state = {};
    }

    componentDidMount() {
        this.props.worksheetStore.getWorksheetStateIds();
    }

    async onStartNewWorksheet(kwds: { newWorksheetStateId: WorksheetStateId }) {
        await this.props.worksheetStore.putWorksheetState({ state: new WorksheetState({ featureSets: [], id: kwds.newWorksheetStateId }) });
        this.setState((prevState) => Object.assign({}, prevState, kwds));
    }

    render() {
        const { worksheetStore } = this.props;

        if (worksheetStore.exception) {
            return <GenericErrorHandler exception={worksheetStore.exception}></GenericErrorHandler>;
        } else if (!worksheetStore.worksheetStateIds) {
            return <ReactLoader loaded={false} />;
        } else if (this.state.newWorksheetStateId) {
            return <Redirect to={Hrefs.worksheetState(new WorksheetStateMark({ worksheetStateId: this.state.newWorksheetStateId }))}></Redirect>;
        }

        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Worksheets}
                id="worksheet"
            >
                <Container fluid>
                    <Row>
                        <Col md="12">
                            <Headline>Worksheet</Headline>
                        </Col>
                    </Row>
                    <Row>
                        <Col className={classnames(["d-lg-block", "d-md-none", "d-sm-none", "d-xs-none", "d-xl-block"])} lg={{ offset: 1, size: 4 }}>
                            <p className="lead">The worksheet consists of a series of screens, with different features depending on the type of object. For example, clothing can be described in terms of material, neckline, sleeve type, and so on.</p>
                            <p>Each feature option is represented by an image in a grid. Each image represents a concept from the Art and Architecture Thesaurus (AAT), Europeana Fashion Thesaurus, or CostumeCore vocabularies, with images primarily from Wikimedia Commons.</p>
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
                                        <NewWorksheetState existingWorksheetStateIds={worksheetStore.worksheetStateIds} onSubmit={this.onStartNewWorksheet}></NewWorksheetState>
                                        <div className="w-100 text-center">
                                            <p>Select <b>Worksheets</b> from the top navigation to return to this page at any time.</p>
                                        </div>
                                    </Col>
                                </Row>
                                {!_.isEmpty(worksheetStore.worksheetStateIds) ? (
                                    <React.Fragment>
                                        <Row className="mb-5"></Row>
                                        <Row>
                                            <Col xs="12">
                                                <ExistingWorksheetStates worksheetStates={worksheetStates}></ExistingWorksheetStates>
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

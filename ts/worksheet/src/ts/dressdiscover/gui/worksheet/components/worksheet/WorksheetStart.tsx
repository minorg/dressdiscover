import * as classnames from 'classnames';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { GenericErrorHandler } from 'dressdiscover/gui/worksheet/components/error/GenericErrorHandler';
import { WorksheetStateStore } from 'dressdiscover/gui/worksheet/stores/worksheet/WorksheetStateStore';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import { Redirect } from 'react-router';
import { Col, Container, Row } from 'reactstrap';

import { Hrefs } from '../../Hrefs';
import { Frame } from '../frame/Frame';
import { ActiveNavbarItem } from '../navbar/ActiveNavbarItem';
import { NewWorksheetCard } from './NewWorksheetCard';
import { WorksheetStatesTable } from './WorksheetStatesTable';

interface Props {
    worksheetStateStore: WorksheetStateStore;
}

interface State {
    newWorksheetStateId?: WorksheetStateId;
}

@inject("worksheetStateStore")
@observer
export class WorksheetStart extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.state = {};
    }

    componentDidMount() {
        this.props.worksheetStateStore.getWorksheetStateIds();
    }

    onStartNewWorksheet(kwds: { newWorksheetStateId: WorksheetStateId }) {
        this.setState((prevState) => Object.assign({}, prevState, kwds));
    }

    render() {
        if (this.props.worksheetStateStore.error) {
            return <GenericErrorHandler error={this.props.worksheetStateStore.error}></GenericErrorHandler>;
        } else if (this.state.newWorksheetStateId) {
            return <Redirect to={Hrefs.worksheetState(new WorksheetStateMark({ worksheetStateId: this.state.newWorksheetStateId }))}></Redirect>;
        }

        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Worksheet}
                headline="Worksheet"
                id="worksheet"
            >
                <Container fluid>
                    <Row>&nbsp;</Row>
                    <Row>
                        <Col className={classnames(["d-lg-block", "d-md-none", "d-sm-none", "d-xs-none", "d-xl-block", "text-center"])} lg={{ offset: 1, size: 4 }} >
                            <img className="img-fluid" src="../img/start.jpg"></img>
                        </Col>
                        <Col className="text-left" lg="7" xs="12">
                            <Container fluid>
                                <Row>
                                    <Col xs="12">
                                        <NewWorksheetCard onSubmit={this.onStartNewWorksheet.bind(this)}></NewWorksheetCard>
                                    </Col>
                                </Row>
                            </Container>
                        </Col>
                    </Row>
                    {(this.props.worksheetStateStore.worksheetStateIds && this.props.worksheetStateStore.worksheetStateIds.length) ? (
                        <React.Fragment>
                            <Row className="mb-5"></Row>
                            <Row>
                                <Col xs="12">
                                    <WorksheetStatesTable></WorksheetStatesTable>
                                </Col>
                            </Row>
                        </React.Fragment>
                    ) : null}
                </Container>
            </Frame>
        );
    }
}

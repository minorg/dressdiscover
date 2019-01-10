import './WorksheetStart.scss';

import * as classnames from 'classnames';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { GenericErrorHandler } from 'dressdiscover/gui/worksheet/components/error/GenericErrorHandler';
import { WorksheetStateStore } from 'dressdiscover/gui/worksheet/stores/worksheet/WorksheetStateStore';
import * as invariant from 'invariant';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import { Redirect } from 'react-router';
import { Link } from 'react-router-dom';
import { Button, Card, CardBody, CardHeader, CardTitle, Col, Container, Input, Row, Table } from 'reactstrap';

import { Hrefs } from '../../Hrefs';
import { Frame } from '../frame/Frame';
import { ActiveNavbarItem } from '../navbar/ActiveNavbarItem';


interface NewWorksheetCardProps {
    onSubmit: (kwds: { newWorksheetStateId: WorksheetStateId }) => void;
}

class NewWorksheetCard extends React.Component<NewWorksheetCardProps, { newWorksheetStateId: string; }> {
    constructor(props: NewWorksheetCardProps) {
        super(props);
        this.state = { newWorksheetStateId: '' };
    }

    onChangeNewWorksheetStateId(event: any) {
        const value = event.target.value;
        this.setState((prevState) => Object.assign({}, prevState, { newWorksheetStateId: value }));
    }

    onKeypressNewWorksheetStateId(event: any) {
        if (event.charCode != 13) {
            return true;
        }
        this.onSubmit();
        return false;
    }

    onSubmit() {
        if (!this.state.newWorksheetStateId) {
            return;
        }
        this.props.onSubmit({ newWorksheetStateId: WorksheetStateId.parse(this.state.newWorksheetStateId) });
    }

    render() {
        return (
            <Card>
                <CardHeader>
                    <CardTitle className={classnames(["mb-0", "text-center"])}>Start a new worksheet</CardTitle>
                </CardHeader>
                <CardBody>
                    <Container fluid>
                        <Row>
                            <Col xs="10">
                                <Input autoFocus className="form-control" onChange={this.onChangeNewWorksheetStateId.bind(this)} onKeyPress={this.onKeypressNewWorksheetStateId.bind(this)} placeholder="Object id or accession number (optional)" type="text" value={this.state.newWorksheetStateId} />
                            </Col>
                            <Col xs="2">
                                <Button color="primary" onClick={this.onSubmit.bind(this)}>Create</Button>
                            </Col>
                        </Row>
                    </Container>
                </CardBody>
            </Card>);
    }
}

class WorksheetStatesCard extends React.Component {
    render() {
        return (
            <Card>
                <CardHeader>
                    <CardTitle className={classnames(["mb-0", "text-center"])}>Existing worksheets</CardTitle>
                </CardHeader>
                <CardBody>
                    <Container fluid>
                        <Row>
                            <Col xs="12">
                                <WorksheetStatesTable></WorksheetStatesTable>
                            </Col>
                        </Row>
                    </Container>
                </CardBody>
            </Card>
        );
    }
}

@inject("worksheetStateStore")
@observer
class WorksheetStatesTable extends React.Component<{ worksheetStateStore?: WorksheetStateStore }> {
    render() {
        return (
            <Table className="table table-bordered w-100 worksheet-states">
                <tbody>
                    {this.props.worksheetStateStore!.worksheetStateIds!.map(worksheetStateId =>
                        <WorksheetStatesTableRow onDeleteWorksheetState={this.props.worksheetStateStore!.deleteWorksheetState.bind(this.props.worksheetStateStore)} onRenameWorksheetState={this.props.worksheetStateStore!.renameWorksheetState.bind(this.props.worksheetStateStore)} worksheetStateId={worksheetStateId}></WorksheetStatesTableRow>
                    )}
                </tbody>
            </Table>
        );
    }
}

interface WorksheetStatesTableRowProps {
    onDeleteWorksheetState: (kwds: { id: WorksheetStateId }) => void;
    onRenameWorksheetState: (kwds: { oldId: WorksheetStateId, newId: WorksheetStateId }) => void;
    worksheetStateId: WorksheetStateId;
}

interface WorksheetStatesTableRowState {
    deleting: boolean;
    newId: string;
    renaming: boolean;
}

class WorksheetStatesTableRow extends React.Component<WorksheetStatesTableRowProps, WorksheetStatesTableRowState> {
    private readonly START_STATE: WorksheetStatesTableRowState = { deleting: false, newId: '', renaming: false };

    constructor(props: WorksheetStatesTableRowProps) {
        super(props);
        this.state = this.START_STATE;
    }

    onClickCancelButton() {
        this.setState(prevState =>
            Object.assign({}, this.START_STATE));
    }

    onChangeNewId(event: any) {
        const value = event.target.value;
        this.setState(prevState => Object.assign({}, prevState, { newId: value }));
    }

    onClickDeleteButton() {
        this.setState(prevState => Object.assign({}, prevState, { deleting: true, newId: '', renaming: false }));
    }

    async onClickDeleteConfirmButton() {
        invariant(this.state.deleting, "deleting state");
        await this.props.onDeleteWorksheetState({ id: this.props.worksheetStateId });
        this.setState(prevState => Object.assign({}, this.START_STATE));
    }

    onClickRenameButton() {
        this.setState(prevState => Object.assign({}, prevState, { deleting: false, newId: this.props.worksheetStateId.toString(), renaming: true }));
    }

    onClickRenameConfirmButton() {
        if (!this.state.newId) {
            return;
        } else if (this.state.newId == this.props.worksheetStateId.toString()) {
            this.setState(prevState => Object.assign({}, this.START_STATE));
            return;
        }
        this.props.onRenameWorksheetState({ oldId: this.props.worksheetStateId, newId: WorksheetStateId.parse(this.state.newId as string) });
    }

    onKeypressNewId(event: any) {
        if (event.charCode !== 13) {
            return false;
        }
        if (this.renameConfirmButtonEnabled) {
            this.onClickRenameConfirmButton();
        } else {
            this.onClickCancelButton();
        }
        return false;
    }

    get renameConfirmButtonEnabled(): boolean {
        return !!this.state.newId;
    }

    render() {
        if (this.state.deleting) {
            return (
                <tr>
                    <td className="id leftmost">
                        {this.props.worksheetStateId.toString()}
                    </td>
                    <td className="inner prompt text-danger">
                        <span>Delete?</span>
                    </td>
                    <td className="cancel inner">
                        <Button className="cancel-delete-button" color="primary" onClick={this.onClickCancelButton.bind(this)} size="sm">No</Button>
                    </td>
                    <td className="confirm rightmost">
                        <Button className="confirm-delete-button" color="danger" onClick={this.onClickDeleteConfirmButton.bind(this)} size="sm">Yes</Button>
                    </td>
                </tr>);
        } else if (this.state.renaming) {
            return (
                <tr>
                    <td className="id leftmost">
                        <Input autoFocus className="form-control rename-input w-100" onChange={this.onChangeNewId.bind(this)} onKeyPress={this.onKeypressNewId.bind(this)} placeholder="Rename list" value={this.state.newId} style={{ display: "inline-block", width: 'auto' }} type="text" />
                    </td>
                    <td className="inner prompt">&nbsp;</td>
                    <td className="cancel inner">
                        <Button className="cancel-rename-button" color="primary" onClick={this.onClickCancelButton.bind(this)}>Cancel</Button>
                    </td>
                    <td className="confirm rightmost">
                        <Button className={classnames({ "confirm-rename-button": true, invisible: !this.renameConfirmButtonEnabled, visible: this.renameConfirmButtonEnabled })} color="danger" onClick={this.onClickRenameConfirmButton.bind(this)}>Confirm</Button>
                    </td>
                    <td>&nbsp;</td>
                </tr>);
        } else {
            return (
                <tr>
                    <td className="id leftmost">
                        <Link to={Hrefs.worksheetState(new WorksheetStateMark({ worksheetStateId: this.props.worksheetStateId }))} title="Open this worksheet">{this.props.worksheetStateId.toString()}</Link>
                    </td>
                    <td className="inner prompt">&nbsp;</td>
                    <td className="delete-button inner">
                        <Button onClick={this.onClickDeleteButton.bind(this)} title="Delete this worksheet"><i className="fas fa-trash-alt"></i></Button>
                    </td>
                    <td className="rename-button rightmost">
                        <Button onClick={this.onClickRenameButton.bind(this)} title="Rename this worksheet"><i className="fas fa-pencil-alt"></i></Button>
                    </td>
                </tr>
            );
        }
    }
}

interface WorksheetStartProps {
    worksheetStateStore: WorksheetStateStore;
}

@inject("worksheetStateStore")
@observer
export class WorksheetStart extends React.Component<WorksheetStartProps, { newWorksheetStateId?: WorksheetStateId }> {
    constructor(props: WorksheetStartProps) {
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
                                {(this.props.worksheetStateStore.worksheetStateIds && this.props.worksheetStateStore.worksheetStateIds.length) ? (
                                    <React.Fragment>
                                        <Row className="mb-5"></Row>
                                        <Row>
                                            <Col xs="12">
                                                <WorksheetStatesCard></WorksheetStatesCard>
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

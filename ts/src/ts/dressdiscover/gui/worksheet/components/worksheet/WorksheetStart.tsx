import './WorksheetStart.scss';

import * as classnames from 'classnames';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/state/worksheet_state';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/state/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/state/worksheet_state_mark';
import { GenericErrorHandler } from 'dressdiscover/gui/worksheet/components/error/GenericErrorHandler';
import { Headline } from 'dressdiscover/gui/worksheet/components/frame/Headline';
import { WorksheetStore } from 'dressdiscover/gui/worksheet/stores/worksheet/WorksheetStore';
import * as invariant from 'invariant';
import * as _ from 'lodash';
import { inject, observer } from 'mobx-react';
import * as React from 'react';
import Hammer from 'react-hammerjs';
import * as ReactLoader from 'react-loader';
import { Redirect } from 'react-router';
import { Link } from 'react-router-dom';
import { Button, Card, CardBody, CardHeader, CardTitle, Col, Container, Input, Row, Table } from 'reactstrap';

import { Hrefs } from '../../Hrefs';
import { Frame } from '../frame/Frame';
import { ActiveNavbarItem } from '../navbar/ActiveNavbarItem';


interface NewWorksheetStateProps {
    existingWorksheetStateIds: WorksheetStateId[];
    onSubmit: (kwds: { newWorksheetStateId: WorksheetStateId }) => void;
}

class NewWorksheetState extends React.Component<NewWorksheetStateProps, { newWorksheetStateId: string; }> {
    constructor(props: NewWorksheetStateProps) {
        super(props);
        this.onChangeNewWorksheetStateId = this.onChangeNewWorksheetStateId.bind(this);
        this.onKeypressNewWorksheetStateId = this.onKeypressNewWorksheetStateId.bind(this);
        this.onSubmit = this.onSubmit.bind(this);
        this.state = { newWorksheetStateId: '' };
    }

    onChangeNewWorksheetStateId(event: React.ChangeEvent<HTMLInputElement>) {
        const value = event.target.value;
        this.setState((prevState) => Object.assign({}, prevState, { newWorksheetStateId: value }));
    }

    onKeypressNewWorksheetStateId(event: React.KeyboardEvent) {
        if (event.charCode !== 13) {
            return;
        }
        event.stopPropagation();
        this.onSubmit();
    }

    onSubmit() {
        let newWorksheetStateIdStem = this.state.newWorksheetStateId;
        if (!newWorksheetStateIdStem) {
            const currentDate = new Date();
            newWorksheetStateIdStem = "New object " + currentDate.getFullYear() + "-" + currentDate.getMonth() + "-" + currentDate.getDay();
        }
        let newWorksheetStateIdSuffix = 0;
        let newWorksheetStateId = newWorksheetStateIdStem;
        while (this.props.existingWorksheetStateIds.some((existingWorksheetStateId) => existingWorksheetStateId.toString() === newWorksheetStateId)) {
            newWorksheetStateId = newWorksheetStateIdStem + " (" + (++newWorksheetStateIdSuffix) + ")";
        }

        this.props.onSubmit({ newWorksheetStateId: WorksheetStateId.parse(newWorksheetStateId) });
    }

    render() {
        return (
            <Hammer onSwipeRight={this.onSubmit}>
                <div>
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
                    </Card>
                </div>
            </Hammer>);
    }
}

interface ExistingWorksheetStateProps {
    onDeleteWorksheetState: (kwds: { id: WorksheetStateId }) => void;
    onRenameWorksheetState: (kwds: { oldId: WorksheetStateId, newId: WorksheetStateId }) => void;
    worksheetStateId: WorksheetStateId;
}

interface ExistingWorksheetStateState {
    deleting: boolean;
    newId: string;
    renaming: boolean;
}

class ExistingWorksheetState extends React.Component<ExistingWorksheetStateProps, ExistingWorksheetStateState> {
    private readonly START_STATE: ExistingWorksheetStateState = { deleting: false, newId: '', renaming: false };

    constructor(props: ExistingWorksheetStateProps) {
        super(props);
        this.onClickCancelButton = this.onClickCancelButton.bind(this);
        this.onChangeNewId = this.onChangeNewId.bind(this);
        this.onClickDeleteButton = this.onClickDeleteButton.bind(this);
        this.onClickDeleteConfirmButton = this.onClickDeleteConfirmButton.bind(this);
        this.onClickRenameButton = this.onClickRenameButton.bind(this);
        this.onClickRenameConfirmButton = this.onClickRenameConfirmButton.bind(this);
        this.onKeypressNewId = this.onKeypressNewId.bind(this);
        this.state = this.START_STATE;
    }

    onClickCancelButton() {
        this.setState(prevState =>
            Object.assign({}, this.START_STATE));
    }

    onChangeNewId(event: React.ChangeEvent<HTMLInputElement>) {
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
        } else if (this.state.newId === this.props.worksheetStateId.toString()) {
            this.setState(prevState => Object.assign({}, this.START_STATE));
            return;
        }
        this.props.onRenameWorksheetState({ oldId: this.props.worksheetStateId, newId: WorksheetStateId.parse(this.state.newId as string) });
    }

    onKeypressNewId(event: React.KeyboardEvent) {
        if (event.charCode !== 13) {
            return;
        }
        if (this.renameConfirmButtonEnabled) {
            this.onClickRenameConfirmButton();
        } else {
            this.onClickCancelButton();
        }
        event.stopPropagation();
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

class ExistingWorksheetStates extends React.Component<{ worksheetStore: WorksheetStore }> {
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
                                <Table className="table table-bordered w-100 worksheet-states">
                                    <tbody>
                                        {this.props.worksheetStore!.worksheetStateIds!.map(worksheetStateId =>
                                            <ExistingWorksheetState key={worksheetStateId.toString()} onDeleteWorksheetState={this.props.worksheetStore.deleteWorksheetState.bind(this.props.worksheetStore)} onRenameWorksheetState={this.props.worksheetStore!.renameWorksheetState.bind(this.props.worksheetStore)} worksheetStateId={worksheetStateId}></ExistingWorksheetState>
                                        )}
                                    </tbody>
                                </Table>
                            </Col>
                        </Row>
                    </Container>
                </CardBody>
            </Card>
        );
    }
}


interface WorksheetStartProps {
    worksheetStore: WorksheetStore;
}

@inject("worksheetStore")
@observer
export class WorksheetStart extends React.Component<WorksheetStartProps, { newWorksheetStateId?: WorksheetStateId }> {
    constructor(props: WorksheetStartProps) {
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
        if (this.props.worksheetStore.error) {
            return <GenericErrorHandler error={this.props.worksheetStore.error}></GenericErrorHandler>;
        } else if (!this.props.worksheetStore.worksheetStateIds) {
            return <ReactLoader loaded={false} />;
        } else if (this.state.newWorksheetStateId) {
            return <Redirect to={Hrefs.worksheetState(new WorksheetStateMark({ worksheetStateId: this.state.newWorksheetStateId }))}></Redirect>;
        }

        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Worksheet}
                id="worksheet"
            >
                <Container fluid>
                    <Row>
                        <Col md="12">
                            <Headline>Worksheet</Headline>
                        </Col>
                    </Row>
                    <Row>
                        <Col className={classnames(["d-lg-block", "d-md-none", "d-sm-none", "d-xs-none", "d-xl-block", "text-center"])} lg={{ offset: 1, size: 4 }} >
                            <img className="img-fluid" src="../img/start.jpg"></img>
                        </Col>
                        <Col className="text-left" lg="7" xs="12">
                            <Container fluid>
                                <Row>
                                    <Col xs="12">
                                        <NewWorksheetState existingWorksheetStateIds={this.props.worksheetStore.worksheetStateIds} onSubmit={this.onStartNewWorksheet}></NewWorksheetState>
                                    </Col>
                                </Row>
                                {!_.isEmpty(this.props.worksheetStore.worksheetStateIds) ? (
                                    <React.Fragment>
                                        <Row className="mb-5"></Row>
                                        <Row>
                                            <Col xs="12">
                                                <ExistingWorksheetStates worksheetStore={this.props.worksheetStore!}></ExistingWorksheetStates>
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

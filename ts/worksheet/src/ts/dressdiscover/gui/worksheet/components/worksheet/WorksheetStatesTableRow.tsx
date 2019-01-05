import * as classnames from 'classnames';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import * as invariant from 'invariant';
import * as React from 'react';
import { Link } from 'react-router-dom';
import { Button, Input } from 'reactstrap';

interface Props {
    onDeleteWorksheetState: (kwds: { id: WorksheetStateId }) => void;
    onRenameWorksheetState: (kwds: { oldId: WorksheetStateId, newId: WorksheetStateId }) => void;
    worksheetStateId: WorksheetStateId;
}

interface State {
    deleting: boolean;
    newId?: string;
    renaming: boolean;
}

export class WorksheetStatesTableRow extends React.Component<Props, State> {
    onClickCancelButton() {
        this.setState(prevState =>
            Object.assign({}, prevState, {
                deleting: false,
                newId: undefined,
                renaming: false
            }));
    }

    onChangeNewId(event: any) {
        const value = event.target.value;
        this.setState(prevState => Object.assign({}, prevState, { newId: value }));
    }

    onClickDeleteButton() {
        this.setState(prevState => Object.assign({}, prevState, { deleting: true, renaming: false }));
    }

    onClickDeleteConfirmButton() {
        invariant(this.state.deleting);
        this.props.onDeleteWorksheetState({ id: this.props.worksheetStateId });
    }

    onClickRenameButton() {
        this.setState(prevState => Object.assign({}, prevState, { deleting: false, renaming: true }));
    }

    onClickRenameConfirmButton() {
        if (!this.state.newId) {
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
        return (
            <tr>
                <td className="align-middle w-80">
                    {this.state.renaming ? (
                        <React.Fragment>
                            <Input className="form-control rename-input" onChange={this.onChangeNewId.bind(this)} onKeyPress={this.onKeypressNewId.bind(this)} placeholder="Rename list" value={this.state.newId} style={{ display: "inline-block", width: 'auto' }} type="text" />
                            <Button className="cancel-rename-button" color="default" onClick={this.onClickCancelButton.bind(this)}>Cancel</Button>
                            <Button className={classnames({ "confirm-rename-button": true, invisible: !this.renameConfirmButtonEnabled, visible: !this.onClickRenameConfirmButton })} color="danger" onClick={this.onClickRenameConfirmButton}>Confirm</Button>
                        </React.Fragment>
                    ) : (
                            <React.Fragment>
                                <Link to={Hrefs.worksheetState(new WorksheetStateMark({ worksheetStateId: this.props.worksheetStateId }))} title="Open this worksheet">{this.props.worksheetStateId.toString()}</Link>
                                <div className={classnames({ "float-right": true, invisible: !this.state.deleting, visible: !!this.state.deleting })}>Delete?</div>
                                <Button className="confirm-delete-button" color="danger" onClick={this.onClickDeleteConfirmButton.bind(this)} size="sm">Yes</Button>
                                <Button className="cancel-delete-button" color="default" onClick={this.onClickCancelButton.bind(this)} size="sm">No</Button>
                            </React.Fragment>
                        )}
                </td>
                <td className="delete-button text-center">
                    <Button onClick={this.onClickDeleteButton.bind(this)} title="Delete this worksheet"><i className="fas fa-trash-alt"></i></Button>
                </td>
                <td className="rename-button text-center">
                    <Button onClick={this.onClickRenameButton.bind(this)} title="Rename this worksheet"><i className="fas fa-pencil-alt"></i></Button>
                </td>
            </tr>);
    }
}
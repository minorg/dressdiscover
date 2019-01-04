import * as classnames from 'classnames';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import * as React from 'react';
import { Button, Input, Table } from 'reactstrap';

interface Props {
    worksheetStates: WorksheetState[];
}

interface State {
    deleting: boolean;
    newId?: string;
    renaming: boolean;
}

export class WorksheetStatesTable extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.state = {deleting: false, renaming: false};
    }

    onChangeNewId(event: any) {
        this.setState((prevState) => {
            return {
                ...prevState,
                newId: event.target.value
            }
        });
    }

    onClickDeleteButton() {
        this.setState((prevState) => {
            return {
                ...prevState,
                deleting: true,
                renaming: false
            }
        });
    }

    onClickDeleteCancelButton() {
        this.deleting(null);
    }

    onClickDeleteConfirmButton() {
        if (!this.deleting()) {
            return;
        }
        const self = this;
        Application.instance.services.worksheetStateCommandService.deleteWorksheetStateAsync({
            error: Application.instance.errorHandler.handleAsyncError,
            id: this.id(),
            success: () => {
                self.parent.refreshExistingWorksheetStates();
            }
        })
    }

    onClickRenameButton() {
        this.setState((prevState) => {
            return {
                ...prevState,
                deleting: false,
                renaming: true
            }
        });
    }

    onClickRenameCancelButton() {
    }

    onClickRenameConfirmButton() {
    }

    onKeypressNewId(event: any) {
        if (event.keyCode !== 13) {
            return false;
        }
        if (this.renameConfirmButtonEnabled) {
            this.onClickRenameConfirmButton();
        } else {
            this.onClickRenameCancelButton();
        }
        return false;
    }

    render() {
        return (
            <Table className="table table-bordered table-striped w-100">
                <tbody>
                    {this.props.worksheetStates.map((worksheetState) => {
                        <tr>
                            <td className="align-middle w-80">
                                {this.state.renaming ? (
                                    <React.Fragment>
                                        <Input className="form-control rename-input" onChange={this.onChangeNewId.bind(this)} onKeyPress={this.onKeypressNewId.bind(this)} placeholder="Rename list" value={this.state.newId} style={{ display: "inline-block", width: 'auto' }} type="text" />
                                        <Button className="cancel-rename-button" color="default" onClick={this.onClickRenameCancelButton.bind(this)}>Cancel</Button>
                                        <Button className={classnames({ "confirm-rename-button": true, invisible: !this.renameConfirmButtonEnabled, visible: !this.onClickRenameConfirmButton })} color="danger" onClick={this.onClickRenameConfirmButton}>Confirm</Button>
                                    </React.Fragment>
                                ) : (
                                        null
                                    )}
                            </td>
                            <td className="delete-button text-center">
                                <Button onClick={this.onClickDeleteButton.bind(this)} title="Delete this worksheet"><i className="fas fa-trash-alt"></i></Button>
                            </td>
                            <td className="rename-button text-center">
                                <Button onClick={this.onClickRenameButton.bind(this)} title="Rename this worksheet"><i className="fas fa-pencil-alt"></i></Button>
                            </td>
                        </tr>
                    })}
                </tbody>
            </Table>
        );
    }

    get renameConfirmButtonEnabled(): boolean {
        return !!this.state.newId;
    }
}
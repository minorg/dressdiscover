import * as classnames from "classnames";
import {Hrefs} from "~/Hrefs";
import * as invariant from "invariant";
import * as React from "react";
import {Link} from "react-router-dom";
import {Button, Input} from "reactstrap";

export type OnDeleteWorksheetStateCallback = (kwds: {id: string}) => void;
export type OnRenameWorksheetStateCallback = (kwds: {
  oldId: string;
  newId: string;
}) => void;

interface Props {
  onDeleteWorksheetState: OnDeleteWorksheetStateCallback;
  onRenameWorksheetState: OnRenameWorksheetStateCallback;
  worksheetStateId: string;
}

interface State {
  deleting: boolean;
  newId: string;
  renaming: boolean;
}

export class ExistingWorksheetState extends React.Component<Props, State> {
  private readonly START_STATE: State = {
    deleting: false,
    newId: "",
    renaming: false,
  };

  constructor(props: Props) {
    super(props);
    this.onClickCancelButton = this.onClickCancelButton.bind(this);
    this.onChangeNewId = this.onChangeNewId.bind(this);
    this.onClickDeleteButton = this.onClickDeleteButton.bind(this);
    this.onClickDeleteConfirmButton = this.onClickDeleteConfirmButton.bind(
      this
    );
    this.onClickRenameButton = this.onClickRenameButton.bind(this);
    this.onClickRenameConfirmButton = this.onClickRenameConfirmButton.bind(
      this
    );
    this.onKeypressNewId = this.onKeypressNewId.bind(this);
    this.state = this.START_STATE;
  }

  onClickCancelButton() {
    this.setState((prevState) => Object.assign({}, this.START_STATE));
  }

  onChangeNewId(event: React.ChangeEvent<HTMLInputElement>) {
    const value = event.target.value;
    this.setState((prevState) => Object.assign({}, prevState, {newId: value}));
  }

  onClickDeleteButton() {
    this.setState((prevState) =>
      Object.assign({}, prevState, {deleting: true, newId: "", renaming: false})
    );
  }

  async onClickDeleteConfirmButton() {
    invariant(this.state.deleting, "deleting state");
    await this.props.onDeleteWorksheetState({id: this.props.worksheetStateId});
    this.setState((prevState) => Object.assign({}, this.START_STATE));
  }

  onClickRenameButton() {
    this.setState((prevState) =>
      Object.assign({}, prevState, {
        deleting: false,
        newId: this.props.worksheetStateId.toString(),
        renaming: true,
      })
    );
  }

  onClickRenameConfirmButton() {
    if (!this.state.newId) {
      return;
    } else if (this.state.newId === this.props.worksheetStateId.toString()) {
      this.setState((prevState) => Object.assign({}, this.START_STATE));
      return;
    }
    this.props.onRenameWorksheetState({
      oldId: this.props.worksheetStateId,
      newId: this.state.newId as string,
    });
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
    const {worksheetStateId} = this.props;

    if (this.state.deleting) {
      return (
        <tr>
          <td className="id leftmost">{worksheetStateId.toString()}</td>
          <td className="inner prompt text-danger">
            <span>Delete?</span>
          </td>
          <td className="cancel inner">
            <Button
              className="cancel-delete-button"
              color="primary"
              onClick={this.onClickCancelButton}
              size="sm"
            >
              No
            </Button>
          </td>
          <td className="confirm rightmost">
            <Button
              className="confirm-delete-button"
              color="danger"
              onClick={this.onClickDeleteConfirmButton}
              size="sm"
            >
              Yes
            </Button>
          </td>
        </tr>
      );
    } else if (this.state.renaming) {
      return (
        <tr>
          <td className="id leftmost">
            <Input
              autoFocus
              className="form-control rename-input w-100"
              onChange={this.onChangeNewId}
              onKeyPress={this.onKeypressNewId}
              placeholder="Rename list"
              value={this.state.newId}
              style={{display: "inline-block", width: "auto"}}
              type="text"
            />
          </td>
          <td className="inner prompt">&nbsp;</td>
          <td className="cancel inner">
            <Button
              className="cancel-rename-button"
              color="primary"
              onClick={this.onClickCancelButton}
            >
              Cancel
            </Button>
          </td>
          <td className="confirm rightmost">
            <Button
              className={classnames({
                "confirm-rename-button": true,
                invisible: !this.renameConfirmButtonEnabled,
                visible: this.renameConfirmButtonEnabled,
              })}
              color="danger"
              onClick={this.onClickRenameConfirmButton}
            >
              Confirm
            </Button>
          </td>
          <td>&nbsp;</td>
        </tr>
      );
    } else {
      return (
        <tr>
          <td className="id leftmost">
            <Link
              to={Hrefs.worksheetState({worksheetStateId})}
              title="Open this worksheet"
            >
              {worksheetStateId.toString()}
            </Link>
          </td>
          <td className="inner prompt">&nbsp;</td>
          <td className="delete-button inner">
            <Button
              onClick={this.onClickDeleteButton}
              title="Delete this worksheet"
            >
              <i className="fas fa-trash-alt"></i>
            </Button>
          </td>
          <td className="rename-button rightmost">
            <Button
              onClick={this.onClickRenameButton}
              title="Rename this worksheet"
            >
              <i className="fas fa-pencil-alt"></i>
            </Button>
          </td>
        </tr>
      );
    }
  }
}

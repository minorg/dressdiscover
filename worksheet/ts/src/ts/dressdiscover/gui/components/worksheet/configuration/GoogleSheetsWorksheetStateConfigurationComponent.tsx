import * as classnames from 'classnames';
import {
    GoogleSheetsWorksheetStateConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/google_sheets_worksheet_state_configuration';
import { GenericErrorHandler } from 'dressdiscover/gui/components/error/GenericErrorHandler';
import { CurrentUser } from 'dressdiscover/gui/models/current_user/CurrentUser';
import { convertGapiErrorToException, GapiException } from 'dressdiscover/gui/services/GapiException';
import { History } from 'history';
import * as React from 'react';
import * as ReactLoader from 'react-loader';
import {
    Button,
    Card,
    CardBody,
    CardHeader,
    CardTitle,
    Col,
    Container,
    Form,
    Input,
    Modal,
    ModalBody,
    ModalHeader,
    Row,
    Table,
} from 'reactstrap';

class DeleteExistingFileConfirmationModal extends React.Component<{ existingFile: gapi.client.drive.File, onCancel: () => void, onConfirm: () => void }, { isOpen: boolean }> {
    constructor(props: any) {
        super(props);
        this.state = { isOpen: true };
    }

    render() {
        const { existingFile, onCancel, onConfirm } = this.props;

        const onCancelWrapper = () => {
            this.setState((prevState) => ({ isOpen: false }));
            onCancel();
        };

        const onConfirmWrapper = () => {
            this.setState((prevState) => ({ isOpen: false }));
            onConfirm();
        };

        return (
            <Modal isOpen={this.state.isOpen}>
                <ModalHeader>Are you sure you want to delete the sheet '{existingFile.name}'?</ModalHeader>
                <ModalBody>
                    <Container fluid>
                        <Row>
                            <Col className="text-center" md="6">
                                <Button color="danger" onClick={onConfirmWrapper}>Delete</Button>
                            </Col>
                            <Col className="text-center" md="6">
                                <Button color="default" onClick={onCancelWrapper}>Cancel</Button>
                            </Col>
                        </Row>
                    </Container>
                </ModalBody>
            </Modal>
        );
    }
}

interface Props {
    currentUser: CurrentUser;
    googleSheetsWorksheetStateConfiguration?: GoogleSheetsWorksheetStateConfiguration;
    history: History;
    onChange: (newGoogleSheetsWorksheetStateConfiguration: GoogleSheetsWorksheetStateConfiguration) => void;
}

interface State {
    exception?: GapiException;
    deletingExistingFile?: gapi.client.drive.File;
    existingFiles?: gapi.client.drive.File[];
    newSheetName: string;
}

export class GoogleSheetsWorksheetStateConfigurationComponent extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.onChangeNewSheetName = this.onChangeNewSheetName.bind(this);
        this.onClickCancelDeleteExistingFile = this.onClickCancelDeleteExistingFile.bind(this);
        this.onClickConfirmDeleteExistingFile = this.onClickConfirmDeleteExistingFile.bind(this);
        this.onClickNewSheetButton = this.onClickNewSheetButton.bind(this);
        this.state = { newSheetName: "" };
    }

    componentDidMount() {
        this.refreshExistingFiles();
    }

    onClickCancelDeleteExistingFile() {
        this.setState((prevState) => ({ deletingExistingFile: undefined }));
    }

    onClickConfirmDeleteExistingFile() {
        const { deletingExistingFile: file } = this.state;
        if (!file) {
            return;
        }

        gapi.client.drive.files.delete({ fileId: file.id as string })
            .then((response) => {
                this.refreshExistingFiles();
            }, (reason: any) => {
                this.setState((prevState) => ({ deletingExistingFile: undefined, exception: convertGapiErrorToException(reason), newSheetName: prevState.newSheetName }));
            });
    }

    onClickDeleteExistingFile(file: gapi.client.drive.File) {
        this.setState((prevState) => ({ deletingExistingFile: file }));
    }

    onClickExistingFile(file: gapi.client.drive.File) {
        this.props.onChange(new GoogleSheetsWorksheetStateConfiguration({ spreadsheetId: file.id as string }));
    }

    onChangeNewSheetName(changeEvent: React.ChangeEvent<HTMLInputElement>) {
        const value = changeEvent.target.value;
        this.setState((prevState) => ({ newSheetName: value }));
    }

    onClickNewSheetButton() {
        const { newSheetName } = this.state;
        if (!newSheetName || !newSheetName.length) {
            return;
        }

        gapi.client.drive.files.create({
            resource: {
                mimeType: 'application/vnd.google-apps.spreadsheet',
                name: newSheetName,
            }
        }).then(() => {
            // Set state synchronously to avoid races with refreshExistingFiles.
            this.setState({ existingFiles: undefined, newSheetName: "" });
            this.refreshExistingFiles();
        }, (reason: any) => {
            this.setState((prevState) => ({ exception: convertGapiErrorToException(reason) }));
        });
    }

    render() {
        const { googleSheetsWorksheetStateConfiguration } = this.props;
        const { exception, deletingExistingFile, existingFiles } = this.state;
        if (exception) {
            return <GenericErrorHandler exception={exception} history={this.props.history}></GenericErrorHandler>;
        } else if (deletingExistingFile) {
            return <DeleteExistingFileConfirmationModal existingFile={deletingExistingFile} onCancel={this.onClickCancelDeleteExistingFile} onConfirm={this.onClickConfirmDeleteExistingFile} />;
        } else if (!existingFiles) {
            return <ReactLoader loaded={false}></ReactLoader>;
        }

        return (
            <Container fluid>
                {existingFiles.length ? (
                    <React.Fragment>
                        <Row>
                            <Col md="6">
                                <Card>
                                    <CardHeader>
                                        <CardTitle className={classnames(["mb-0", "text-center"])}>Select an existing Sheet</CardTitle>
                                    </CardHeader>
                                    <CardBody>
                                        <Table className="table table-bordered w-100">
                                            <tbody>
                                                {existingFiles.map((existingFile) => {
                                                    const selected: boolean = !!googleSheetsWorksheetStateConfiguration && googleSheetsWorksheetStateConfiguration.spreadsheetId === existingFile.id;
                                                    const tdStyle: React.CSSProperties | undefined = selected ? { borderWidth: "4px" } : undefined;
                                                    return (
                                                        <tr key={existingFile.id}>
                                                            <td className={classnames({ "border-success": selected })} style={tdStyle}>
                                                                <Button
                                                                    className="w-100"
                                                                    color="secondary"
                                                                    onClick={() => this.onClickExistingFile(existingFile)}
                                                                >
                                                                    {existingFile.name}
                                                                </Button>
                                                            </td>
                                                            <td className="align-middle text-center" style={{ width: "10%" }}>
                                                                <Button onClick={() => this.onClickDeleteExistingFile(existingFile)} title="Delete this Sheet"><i className="fas fa-trash-alt"></i></Button>
                                                            </td>
                                                        </tr>
                                                    );
                                                }
                                                )}
                                            </tbody>
                                        </Table>
                                    </CardBody>
                                </Card>
                            </Col>
                        </Row>
                        <Row>&nbsp;</Row>
                    </React.Fragment>
                ) : null}
                <Row>
                    <Col className="text-center" md="6">
                        <Form inline>
                            <Input type="text" onChange={this.onChangeNewSheetName} placeholder="New sheet name" style={{ width: "32em" }} value={this.state.newSheetName}></Input>
                            <Button className="ml-4" disabled={!this.state.newSheetName.length} color="primary" onClick={this.onClickNewSheetButton}>Create a new Sheet</Button>
                        </Form>
                    </Col>
                </Row>
            </Container>
        );
    }

    private refreshExistingFiles() {
        // Assumes the token has already been set in CurrentUserStore.
        // const { currentUser } = this.props;
        // invariant(currentUser.identityProvider === UserIdentityProvider.GOOGLE_OAUTH2, "unexpected identity provider");
        // const accessToken = currentUser.session.accessToken;
        // invariant(accessToken, "no access token set");

        gapi.client.drive.files.list({})
            .then((response) => {
                const files = response.result.files;
                this.setState((prevState) => ({ deletingExistingFile: undefined, existingFiles: files ? files : [], newSheetName: prevState.newSheetName }));
            }, (reason: any) => {
                this.setState((prevState) => ({ deletingExistingFile: undefined, exception: convertGapiErrorToException(reason), newSheetName: prevState.newSheetName }));
            });
    }
}

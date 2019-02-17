import * as classnames from 'classnames';
import { UserIdentityProvider } from 'dressdiscover/api/models/user/user_identity_provider';
import {
    GoogleSheetsWorksheetStateConfiguration,
} from 'dressdiscover/api/models/worksheet/configuration/google_sheets_worksheet_state_configuration';
import { FatalErrorModal } from 'dressdiscover/gui/components/error/FatalErrorModal';
import { CurrentUser } from 'dressdiscover/gui/models/current_user/CurrentUser';
import * as invariant from 'invariant';
import * as React from 'react';
import * as ReactLoader from 'react-loader';
import { Button, Card, CardBody, CardHeader, CardTitle, Col, Container, Form, Input, Row, Table } from 'reactstrap';

interface Props {
    currentUser: CurrentUser;
    googleSheetsWorksheetStateConfiguration?: GoogleSheetsWorksheetStateConfiguration;
    onChange: (newGoogleSheetsWorksheetStateConfiguration: GoogleSheetsWorksheetStateConfiguration) => void;
}

interface State {
    error?: any | null;
    existingFiles?: gapi.client.drive.File[];
    newSheetName: string;
}

export class GoogleSheetsWorksheetStateConfigurationComponent extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.onChangeNewSheetName = this.onChangeNewSheetName.bind(this);
        this.onClickNewSheetButton = this.onClickNewSheetButton.bind(this);
        this.state = { newSheetName: "" };
    }

    componentDidMount() {
        this.refreshExistingFiles();
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
            this.setState((prevState) => ({ error: reason }));
        });
    }

    render() {
        const { googleSheetsWorksheetStateConfiguration } = this.props;
        const { error, existingFiles } = this.state;
        if (error) {
            return <FatalErrorModal message={JSON.stringify(error)}></FatalErrorModal>;
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
                                                    const tdStyle: React.CSSProperties | undefined = selected ? {borderWidth: "4px"} : undefined;
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
        const { currentUser } = this.props;
        invariant(currentUser.identityProvider === UserIdentityProvider.GOOGLE_OAUTH2, "unexpected identity provider");
        const accessToken = currentUser.session.accessToken;
        invariant(accessToken, "no access token set");

        gapi.client.setToken({ access_token: accessToken as string });

        gapi.client.drive.files.list({})
            .then((response) => {
                const files = response.result.files;
                this.setState((prevState) => ({ existingFiles: files ? files : [] }));
            }, (reason: any) => {
                this.setState((prevState) => ({ error: reason }));
            });
    }
}

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
    error?: any;
    existingFiles?: gapi.client.drive.File[];
    newSheetName?: string;
}

export class GoogleSheetsWorksheetStateConfigurationComponent extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.onChangeNewSheetName = this.onChangeNewSheetName.bind(this);
        this.onClickNewSheetButton = this.onClickNewSheetButton.bind(this);
        this.state = {};
    }

    componentDidMount() {
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

    onChangeNewSheetName(changeEvent: React.ChangeEvent<HTMLInputElement>) {
        const value = changeEvent.target.value;
        this.setState((prevState) => ({ newSheetName: value }));
    }

    onClickNewSheetButton() {
        const { newSheetName } = this.state;
        if (!newSheetName || !newSheetName.length) {
            return;
        }
    }

    render() {
        const { error, existingFiles } = this.state;
        if (error) {
            return <FatalErrorModal message={JSON.stringify(error)}></FatalErrorModal>;
        } else if (!existingFiles) {
            return <ReactLoader loaded={false}></ReactLoader>;
        }

        return (
            <Container fluid>
                {existingFiles.length ? (
                    <Row>
                        <Col md="12">
                            <Card>
                                <CardHeader>
                                    <CardTitle className={classnames(["mb-0", "text-center"])}>Existing worksheets</CardTitle>
                                </CardHeader>
                                <CardBody>
                                    <Container fluid>
                                        <Row>
                                            <Col xs="12">
                                                <Table className="table table-bordered w-100">
                                                    <tbody>
                                                        {existingFiles.map((existingFile) =>
                                                            <tr key={existingFile.id}><td>{existingFile.name}</td></tr>
                                                        )}
                                                    </tbody>
                                                </Table>
                                            </Col>
                                        </Row>
                                    </Container>
                                </CardBody>
                            </Card>
                        </Col>
                    </Row>
                ) : null}
                <Row>
                    <Col className="text-center" md="12">
                        <Form inline>
                            <Input type="text" onChange={this.onChangeNewSheetName} placeholder="New sheet name" value={this.state.newSheetName}></Input>
                            <Button color="primary" onClick={this.onClickNewSheetButton}>Create a new Sheet</Button>
                        </Form>
                    </Col>
                </Row>
            </Container>
        );
    }
}

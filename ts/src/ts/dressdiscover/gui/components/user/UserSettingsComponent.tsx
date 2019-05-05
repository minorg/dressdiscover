import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { WorksheetConfiguration } from 'dressdiscover/api/models/worksheet/configuration/worksheet_configuration';
import { Frame } from 'dressdiscover/gui/components/frame/Frame';
import { Headline } from 'dressdiscover/gui/components/frame/Headline';
import {
    WorksheetConfigurationComponent,
} from 'dressdiscover/gui/components/worksheet/configuration/WorksheetConfigurationComponent';
import { Hrefs } from 'dressdiscover/gui/Hrefs';
import {
    DefaultWorksheetConfiguration,
} from 'dressdiscover/gui/models/worksheet/configuration/DefaultWorksheetConfiguration';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import * as React from 'react';
import { Redirect, RouteComponentProps } from 'react-router';
import { Button, Col, Container, Nav, NavItem, NavLink, TabContent, TabPane } from 'reactstrap';
import Row from 'reactstrap/lib/Row';

interface Props extends RouteComponentProps<any> {
    currentUserStore: CurrentUserStore;
}

interface State {
    unsavedWorksheetConfiguration?: WorksheetConfiguration;
}

@inject("currentUserStore")
export class UserSettingsComponent extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.onChangeWorksheetConfiguration = this.onChangeWorksheetConfiguration.bind(this);
        this.onClickSaveButton = this.onClickSaveButton.bind(this);
        this.state = {};
    }

    onChangeWorksheetConfiguration(newWorksheetConfiguration: WorksheetConfiguration) {
        this.setState((prevState) => ({ unsavedWorksheetConfiguration: newWorksheetConfiguration }));
    }

    onClickSaveButton() {
        const { unsavedWorksheetConfiguration } = this.state;
        if (!unsavedWorksheetConfiguration) {
            return;
        }
        this.props.currentUserStore.setCurrentUserSettings(new UserSettings({ worksheetConfiguration: unsavedWorksheetConfiguration }));
        this.setState((prevState) => ({ unsavedWorksheetConfiguration: undefined }));
    }

    render() {
        const { currentUserStore } = this.props;
        const currentUser = currentUserStore.currentUser;
        if (!currentUser) {
            return <Redirect to={Hrefs.home}></Redirect>;
        }

        let { unsavedWorksheetConfiguration: worksheetConfiguration } = this.state;
        if (!worksheetConfiguration && currentUser.settings) {
            worksheetConfiguration = currentUser.settings.worksheetConfiguration;
        }
        if (!worksheetConfiguration) {
            worksheetConfiguration = DefaultWorksheetConfiguration.instance;
        }

        return (
            <Frame id="user-settings">
                <Container fluid>
                    <Row>
                        <Col md="12">
                            <Headline>Settings</Headline>
                        </Col>
                    </Row>
                    <Row>
                        <Col md="12">
                            <Nav tabs>
                                <NavItem>
                                    <NavLink className="active">
                                        Worksheet Settings
                                    </NavLink>
                                </NavItem>
                            </Nav>
                            <br />
                            <TabContent activeTab="worksheet">
                                <TabPane tabId="worksheet">
                                    <WorksheetConfigurationComponent
                                        history={this.props.history}
                                        onChange={this.onChangeWorksheetConfiguration}
                                        worksheetConfiguration={worksheetConfiguration}
                                    />
                                </TabPane>
                            </TabContent>
                        </Col>
                    </Row>
                    {this.state.unsavedWorksheetConfiguration ?
                        <React.Fragment>
                            <hr />
                            <Row>
                                <Col md="12">
                                    <div className="float-left"><Button color="primary" onClick={this.onClickSaveButton} size="lg">Save</Button></div>
                                </Col>
                            </Row>
                        </React.Fragment>
                        : null}
                </Container>
            </Frame >);
    }
}

import {WorksheetConfiguration} from '~/models/worksheet/configuration/worksheet_configuration';
import {Frame} from '~/components/frame/Frame';
import {Headline} from '~/components/frame/Headline';
import {WorksheetConfigurationComponent,} from '~/components/worksheet/configuration/WorksheetConfigurationComponent';
import {Hrefs} from '~/Hrefs';
import {DefaultWorksheetConfiguration,} from '~/models/worksheet/configuration/DefaultWorksheetConfiguration';
import {CurrentUserStore} from '~/stores/current_user/CurrentUserStore';
import {inject} from 'mobx-react';
import * as React from 'react';
import {Redirect, RouteComponentProps} from 'react-router';
import {Button, Col, Container, Nav, NavItem, NavLink, TabContent, TabPane} from 'reactstrap';
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
        this.props.currentUserStore.setCurrentUserSettings({ worksheetConfiguration: unsavedWorksheetConfiguration });
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

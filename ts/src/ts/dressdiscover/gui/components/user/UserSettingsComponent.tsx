import { UserSettings } from 'dressdiscover/api/models/user/user_settings';
import { WorksheetConfiguration } from 'dressdiscover/api/models/worksheet/configuration/worksheet_configuration';
import { Frame } from 'dressdiscover/gui/components/frame/Frame';
import { Headline } from 'dressdiscover/gui/components/frame/Headline';
import {
    WorksheetConfigurationComponent,
} from 'dressdiscover/gui/components/worksheet/configuration/WorksheetConfigurationComponent';
import { Hrefs } from 'dressdiscover/gui/Hrefs';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { inject } from 'mobx-react';
import * as React from 'react';
import { Redirect } from 'react-router';
import { Col, Container } from 'reactstrap';
import Row from 'reactstrap/lib/Row';

@inject("currentUserStore")
export class UserSettingsComponent extends React.Component<{ currentUserStore: CurrentUserStore }> {
    render() {
        const { currentUserStore } = this.props;
        const currentUser = currentUserStore.currentUser;
        if (!currentUser) {
            return <Redirect to={Hrefs.home}></Redirect>;
        }

        const onChangeWorksheetConfiguration = (newWorksheetConfiguration?: WorksheetConfiguration) => {
            currentUserStore.setCurrentUserSettings(new UserSettings({ worksheetConfiguration: newWorksheetConfiguration }));
        };

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
                            <WorksheetConfigurationComponent
                                onChange={onChangeWorksheetConfiguration}
                                worksheetConfiguration={currentUser.settings ? currentUser.settings.worksheetConfiguration : undefined}
                            />
                        </Col>
                    </Row>
                </Container>
            </Frame>);
    }
}

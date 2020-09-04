import { AuthorizationException } from '~/services/authorization_exception';
import { Hrefs } from '~/Hrefs';
import { CurrentUserStore } from '~/stores/current_user/CurrentUserStore';
import { History } from 'history';
import { inject } from 'mobx-react';
import * as React from 'react';
import { Button, Col, Container, Modal, ModalBody, ModalHeader, Row } from 'reactstrap';

@inject("currentUserStore")
export class AuthorizationExceptionModal extends React.Component<{ currentUserStore?: CurrentUserStore, history: History, exception: AuthorizationException }> {
    render() {
        const onClickAnonymous = () => {
            const { currentUserStore, history } = this.props;
            currentUserStore!.logout();
            history.push(Hrefs.home);
        };

        return (
            <div>
                <Modal backdrop="static" centered={true} keyboard={false} isOpen={true}>
                    <ModalHeader>Authorization exception</ModalHeader>
                    <ModalBody>
                        <Container fluid>
                            <Row>
                                <Col xs="12">
                                    <p>You have configured the application to use access-controlled storage, such as Google Sheets, but you are currently logged out. Please login to continue.</p>
                                </Col>
                            </Row>
                            <Row>
                                <Col xs="12">
                                    <a className="btn btn-primary w-100" href={Hrefs.login}>Login</a>
                                </Col>
                            </Row>
                            <Row>&nbsp;</Row>
                            <Row>
                                <Col xs="12">
                                    <Button className="w-100" color="danger" onClick={onClickAnonymous}>Continue without logging in, storing worksheets locally</Button>
                                </Col>
                            </Row>
                        </Container>
                    </ModalBody>
                </Modal>
            </div>
        );
    }
}

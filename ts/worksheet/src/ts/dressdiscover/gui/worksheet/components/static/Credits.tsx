import { Frame } from 'dressdiscover/gui/worksheet/components/frame/Frame';
import { ActiveNavbarItem } from 'dressdiscover/gui/worksheet/components/navbar/ActiveNavbarItem';
import * as React from 'react';
import { Col, Container, Row } from 'reactstrap';
import Card from 'reactstrap/lib/Card';
import CardBody from 'reactstrap/lib/CardBody';

export class Credits extends React.Component {
    render() {
        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Home}
                headline="Credits"
                id="credits"
            >
                <Container fluid>
                    <Row />
                    <Row>
                        <Col sm={{ size: 8, offset: 2 }}>
                            <Card>
                                <CardBody>
                                    <Container fluid>
                                        <p>
                                            <h4>Content</h4>
                                            <a href="http://www.ardenkirkland.com">Arden Kirkland</a>
                                        </p>
                                        <br />
                                        <p>
                                            <h4>Development</h4>
                                            <a href="https://minorgordon.net">Minor Gordon</a>
                                        </p>
                                    </Container>
                                </CardBody>
                            </Card>
                        </Col>
                    </Row>
                </Container>
            </Frame>
        );
    }
}

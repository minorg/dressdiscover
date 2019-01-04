import { Hrefs } from 'dressdiscover/gui/worksheet/Hrefs';
import * as React from 'react';
import { Link } from 'react-router-dom';
import { Col, Container, Row } from 'reactstrap';

export class Footer extends React.Component {
    render() {
        return (
            <footer>
                <Container fluid>
                    <Row>&nbsp;</Row>
                    <Row>
                        <Col className="text-center" md="12">
                            <Link to={Hrefs.contact}>Contact</Link>&nbsp;|&nbsp;
                            <Link to={Hrefs.credits}>Credits</Link>&nbsp;|&nbsp;
                            <Link to={Hrefs.privacy}>Privacy</Link>&nbsp;|&nbsp;
                            <Link to={Hrefs.gitHub} >GitHub</Link>
                        </Col>
                    </Row>
                    <Row>&nbsp;</Row>
                    <Row>
                        <Col className="text-center" md="12">
                            <p className="muted">&copy; Copyright 2018,&nbsp;
                        <a href="https://minorgordon.net">Minor Gordon</a>. All rights reserved</p>
                        </Col>
                    </Row>
                </Container>
            </footer>
        );
    }
}

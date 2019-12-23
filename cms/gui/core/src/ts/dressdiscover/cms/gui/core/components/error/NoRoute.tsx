import {Frame} from 'dressdiscover/cms/gui/core/components/frame/Frame';
import * as React from 'react';
import {RouteComponentProps} from 'react-router';
import {Col, Container, Row} from 'reactstrap';

export const NoRoute: React.FunctionComponent<RouteComponentProps> = ({location}) => (
    <Frame documentTitle="Not Found">
        <Container fluid>
            <Row>
                <Col className="text-center" xs="12">
                    <h3>Not Found: <code>{location.pathname}</code></h3>
                </Col>
            </Row>
        </Container>
    </Frame>
);

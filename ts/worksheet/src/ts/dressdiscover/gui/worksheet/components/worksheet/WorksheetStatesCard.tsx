import * as classnames from 'classnames';
import * as React from 'react';
import { Card, CardBody, CardHeader, CardTitle, Col, Container, Row } from 'reactstrap';

import { WorksheetStatesTable } from './WorksheetStatesTable';

export class WorksheetStatesCard extends React.Component {
    render() {
        return (
            <Card>
                <CardHeader>
                    <CardTitle className={classnames(["mb-0", "text-center"])}>Existing worksheets</CardTitle>
                </CardHeader>
                <CardBody>
                    <Container fluid>
                        <Row>
                            <Col xs="12">
                                <WorksheetStatesTable></WorksheetStatesTable>
                            </Col>
                        </Row>
                    </Container>
                </CardBody>
            </Card>
        );
    }
}
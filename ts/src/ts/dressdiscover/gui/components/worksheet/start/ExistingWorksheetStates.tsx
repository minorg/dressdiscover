import * as classnames from 'classnames';
import {
    ExistingWorksheetState,
    OnDeleteWorksheetStateCallback,
    OnRenameWorksheetStateCallback,
} from 'dressdiscover/gui/components/worksheet/start/ExistingWorksheetState';
import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';
import * as React from 'react';
import { Card, CardBody, CardHeader, CardTitle, Col, Container, Row, Table } from 'reactstrap';

export class ExistingWorksheetStates extends React.Component<{
    onDeleteWorksheetState: OnDeleteWorksheetStateCallback;
    onRenameWorksheetState: OnRenameWorksheetStateCallback;
    worksheetStates: WorksheetStateWrapper[];
}> {
    render() {
        const { worksheetStates, ...passThroughProps } = this.props;

        return (
            <Card>
                <CardHeader>
                    <CardTitle className={classnames(["mb-0", "text-center"])}>Existing worksheets</CardTitle>
                </CardHeader>
                <CardBody>
                    <Container fluid>
                        <Row>
                            <Col xs="12">
                                <Table className="table table-bordered w-100 worksheet-states">
                                    <tbody>
                                        {worksheetStates.map((worksheetState) =>
                                            <ExistingWorksheetState key={worksheetState.id.toString()} worksheetState={worksheetState} {...passThroughProps}></ExistingWorksheetState>
                                        )}
                                    </tbody>
                                </Table>
                            </Col>
                        </Row>
                    </Container>
                </CardBody>
            </Card>
        );
    }
}

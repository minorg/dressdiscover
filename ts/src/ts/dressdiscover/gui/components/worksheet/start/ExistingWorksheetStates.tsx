import * as classnames from 'classnames';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/state/worksheet_state_id';
import {
    ExistingWorksheetState,
    OnDeleteWorksheetStateCallback,
    OnRenameWorksheetStateCallback,
} from 'dressdiscover/gui/components/worksheet/start/ExistingWorksheetState';
import * as React from 'react';
import { Card, CardBody, CardHeader, CardTitle, Col, Container, Row, Table } from 'reactstrap';

export class ExistingWorksheetStates extends React.Component<{
    onDeleteWorksheetState: OnDeleteWorksheetStateCallback;
    onRenameWorksheetState: OnRenameWorksheetStateCallback;
    worksheetStateIds: WorksheetStateId[];
}> {
    render() {
        const { worksheetStateIds, ...passThroughProps } = this.props;

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
                                        {worksheetStateIds.map((worksheetStateId) =>
                                            <ExistingWorksheetState key={worksheetStateId.toString()} worksheetStateId={worksheetStateId} {...passThroughProps}></ExistingWorksheetState>
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

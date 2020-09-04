import * as classnames from 'classnames';
import { WorksheetStateId } from '~/models/worksheet/state/WorksheetStateId';
import {
    ExistingWorksheetState,
    OnDeleteWorksheetStateCallback,
    OnRenameWorksheetStateCallback,
} from '~/components/worksheet/start/ExistingWorksheetState';
import {
    WorksheetStateConfigurationHeadline,
} from '~/components/worksheet/start/WorksheetStateConfigurationHeadline';
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
                    <CardTitle className={classnames(["mb-0", "text-center"])}><b>Existing worksheets</b> from <WorksheetStateConfigurationHeadline/></CardTitle>
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

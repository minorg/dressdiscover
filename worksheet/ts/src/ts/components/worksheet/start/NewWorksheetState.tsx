import * as classnames from 'classnames';
import { WorksheetStateId } from '~/models/worksheet/state/WorksheetStateId';
import {
    WorksheetStateConfigurationHeadline,
} from '~/components/worksheet/start/WorksheetStateConfigurationHeadline';
import * as React from 'react';
import Hammer from 'react-hammerjs';
import { Button, Card, CardBody, CardHeader, CardTitle, Col, Container, Input, Row } from 'reactstrap';

interface Props {
    existingWorksheetStateIds: WorksheetStateId[];
    onSubmit: (kwds: { newWorksheetStateId: WorksheetStateId }) => void;
}

export class NewWorksheetState extends React.Component<Props, { newWorksheetStateId: string; }> {
    constructor(props: Props) {
        super(props);
        this.onChangeNewWorksheetStateId = this.onChangeNewWorksheetStateId.bind(this);
        this.onKeypressNewWorksheetStateId = this.onKeypressNewWorksheetStateId.bind(this);
        this.onSubmit = this.onSubmit.bind(this);
        this.state = { newWorksheetStateId: '' };
    }

    onChangeNewWorksheetStateId(event: React.ChangeEvent<HTMLInputElement>) {
        const value = event.target.value;
        this.setState((prevState) => Object.assign({}, prevState, { newWorksheetStateId: value }));
    }

    onKeypressNewWorksheetStateId(event: React.KeyboardEvent) {
        if (event.charCode !== 13) {
            return;
        }
        event.stopPropagation();
        this.onSubmit();
    }

    onSubmit() {
        let newWorksheetStateIdStem = this.state.newWorksheetStateId;
        if (!newWorksheetStateIdStem) {
            const currentDate = new Date();
            newWorksheetStateIdStem = "New object " + currentDate.getFullYear() + "-" + (currentDate.getMonth() + 1) + "-" + currentDate.getDate();
        }
        let newWorksheetStateIdSuffix = 0;
        let newWorksheetStateId = newWorksheetStateIdStem;
        while (this.props.existingWorksheetStateIds.some((existingWorksheetStateId) => existingWorksheetStateId.toString() === newWorksheetStateId)) {
            newWorksheetStateId = newWorksheetStateIdStem + " (" + (++newWorksheetStateIdSuffix) + ")";
        }

        this.props.onSubmit({ newWorksheetStateId: WorksheetStateId.parse(newWorksheetStateId) });
    }

    render() {
        return (
            <Hammer onSwipeRight={this.onSubmit}>
                <div>
                    <Card>
                        <CardHeader>
                            <CardTitle className={classnames(["mb-0", "text-center"])}><b>Start a new worksheet</b> in <WorksheetStateConfigurationHeadline/></CardTitle>
                        </CardHeader>
                        <CardBody>
                            <Container fluid>
                                <Row>
                                    <Col xs="10">
                                        <Input autoFocus className="form-control" onChange={this.onChangeNewWorksheetStateId} onKeyPress={this.onKeypressNewWorksheetStateId} placeholder="Object id or accession number (optional)" type="text" value={this.state.newWorksheetStateId} />
                                    </Col>
                                    <Col xs="2">
                                        <Button color="primary" onClick={this.onSubmit}>Create</Button>
                                    </Col>
                                </Row>
                            </Container>
                        </CardBody>
                    </Card>
                </div>
            </Hammer>);
    }
}

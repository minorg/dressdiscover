import * as classnames from 'classnames';
import { WorksheetStateId } from 'dressdiscover/api/models/worksheet/worksheet_state_id';
import * as React from 'react';
import { Button, Card, CardBody, CardHeader, CardTitle, Col, Container, Input, Row } from 'reactstrap';

interface Props {
    onSubmit: (kwds: { newWorksheetStateId: WorksheetStateId }) => void;
}

interface State {
    newWorksheetStateId: string;
}

export class NewWorksheetCard extends React.Component<Props, State> {
    constructor(props: Props) {
        super(props);
        this.state = { newWorksheetStateId: '' };
    }

    onChangeNewWorksheetStateId(event: any) {
        const value = event.target.value;
        this.setState((prevState) => Object.assign({}, prevState, { newWorksheetStateId: value }));
    }

    onKeypressNewWorksheetStateId(event: any) {
        if (event.charCode != 13) {
            return true;
        }
        this.onSubmit();
        return false;
    }

    onSubmit() {
        if (!this.state.newWorksheetStateId) {
            return;
        }
        this.props.onSubmit({ newWorksheetStateId: WorksheetStateId.parse(this.state.newWorksheetStateId) });
    }

    render() {
        return (
            <Card>
                <CardHeader>
                    <CardTitle className={classnames(["mb-0", "text-center"])}>Start a new worksheet</CardTitle>
                </CardHeader>
                <CardBody>
                    <Container fluid>
                        <Row>
                            <Col xs="10">
                                <Input autoFocus className="form-control" onChange={this.onChangeNewWorksheetStateId.bind(this)} onKeyPress={this.onKeypressNewWorksheetStateId.bind(this)} placeholder="Object id or accession number (optional)" type="text" value={this.state.newWorksheetStateId} />
                            </Col>
                            <Col xs="2">
                                <Button color="primary" onClick={this.onSubmit.bind(this)}>Create</Button>
                            </Col>
                        </Row>
                    </Container>
                </CardBody>
            </Card>);
    }
}
import * as classnames from 'classnames';
import * as React from 'react';
import { Button, Col, Row } from 'reactstrap';

interface Props {
    nextButtonEnabled: boolean;
    previousButtonEnabled: boolean;
    onClickFinishButton: () => void;
    onClickNextButton: () => void;
    onClickPreviousButton: () => void;
}

export class WorksheetNextPreviousButtons extends React.Component<Props> {
    render() {
        return (
            <Row>
                <Col xs="12">
                    <div className="float-left">
                        <Button className={classnames({ invisible: !this.props.previousButtonEnabled, visible: this.props.previousButtonEnabled })} color="primary" size="lg" onClick={this.props.onClickPreviousButton}>Previous</Button>
                    </div>
                    <div className="float-right">
                        <Button className={classnames({ invisible: !this.props.nextButtonEnabled, visible: this.props.nextButtonEnabled })} color="primary" size="lg" onClick={this.props.onClickNextButton}>Next</Button>
                        <Button className={classnames({ invisible: !this.props.nextButtonEnabled, visible: this.props.nextButtonEnabled })} color="primary" size="lg" onClick={this.props.onClickFinishButton}>Finish</Button>
                    </div>
                </Col>
            </Row>
        );
    }
}
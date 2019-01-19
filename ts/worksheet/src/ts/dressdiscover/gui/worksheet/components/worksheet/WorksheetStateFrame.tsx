import * as classnames from 'classnames';
import { ReactNode } from 'react';
import * as React from 'react';
import { Link } from 'react-router-dom';
import { BreadcrumbItem, Button, Col, Container, Progress, Row } from 'reactstrap';

import { Hrefs } from '../../Hrefs';
import { WorksheetStateWrapper } from '../../models/worksheet/WorksheetStateWrapper';
import { Frame } from '../frame/Frame';
import { ActiveNavbarItem } from '../navbar/ActiveNavbarItem';

interface Props {
    children?: ReactNode;
    id: string;
    nextButtonEnabled: boolean;
    previousButtonEnabled: boolean;
    save?: () => void;
    worksheetState: WorksheetStateWrapper;
}

export class WorksheetStateFrame extends React.Component<Props> {
    constructor(props: Props) {
        super(props);
        this.onClickFinishButton = this.onClickFinishButton.bind(this);
        this.onClickNextButton = this.onClickNextButton.bind(this);
        this.onClickPreviousButton = this.onClickPreviousButton.bind(this);
    }

    onClickFinishButton() {
        // Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.lastStateMark);
    }

    onClickNextButton() {
        // Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.nextStateMark(this.currentStateMark));
    }

    onClickPreviousButton() {
        // Application.instance.router.goToState(Application.instance.session.worksheetStateMachine.previousStateMark(this.currentStateMark));
    }

    render() {
        const { children, id, worksheetState, ...nextPreviousButtonProps } = this.props;

        const headline = "Worksheet: " + worksheetState.id.toString();

        const breadcrumbItems: ReactNode[] = [];
        breadcrumbItems.push(<BreadcrumbItem active={!worksheetState.currentStateMark.featureSetId && !worksheetState.currentStateMark.featureId}>
            <Link to={Hrefs.worksheetState(worksheetState.startStateMark)}>{headline}</Link>
        </BreadcrumbItem>);
        const currentFeatureSetStateMark = worksheetState.currentFeatureSetStateMark;
        const currentFeatureStateMark = worksheetState.currentFeatureStateMark;
        if (currentFeatureSetStateMark) {
            breadcrumbItems.push(<BreadcrumbItem active={!currentFeatureStateMark}>
                <Link to={Hrefs.worksheetState(currentFeatureSetStateMark)}>Feature Set: {worksheetState.currentFeatureSetDefinition!.displayName}</Link>
            </BreadcrumbItem>);
        }
        if (currentFeatureStateMark) {
            breadcrumbItems.push(<BreadcrumbItem active={true}>
                <Link to={Hrefs.worksheetState(currentFeatureStateMark)}>Feature: {worksheetState.currentFeatureDefinition!.displayName}}</Link>
            </BreadcrumbItem>);
        }

        const nextPreviousButtons = (
            <Row>
                <Col xs="12">
                    <div className="float-left">
                        <Button className={classnames({ invisible: !this.props.previousButtonEnabled, visible: this.props.previousButtonEnabled })} color="primary" size="lg" onClick={this.onClickPreviousButton}>Previous</Button>
                    </div>
                    <div className="float-right">
                        <Button className={classnames({ invisible: !this.props.nextButtonEnabled, visible: this.props.nextButtonEnabled })} color="primary" size="lg" onClick={this.onClickNextButton}>Next</Button>
                        <Button className={classnames({ invisible: !this.props.nextButtonEnabled, visible: this.props.nextButtonEnabled })} color="primary" size="lg" onClick={this.onClickFinishButton}>Finish</Button>
                    </div>
                </Col>
            </Row>
        );

        let progressBar: ReactNode | null;
        if (worksheetState.lastStateMarkIndex > 0) {
            progressBar = (
                <Row>
                    <Progress bar striped max={worksheetState.lastStateMarkIndex} min={0} value={worksheetState.currentStateMarkIndex}></Progress>
                </Row>
            );
        } else {
            progressBar = null;
        }

        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Worksheet}
                breadcrumbItems={<React.Fragment>...breadcrumbItems</React.Fragment>}
                headline={headline}
                id={this.props.id}
            >
                <Container fluid>
                    {progressBar}
                    <Row>
                        &nbsp;
                    </Row>
                    {nextPreviousButtons}
                    <Row>
                        &nbsp;
                    </Row>
                    <Row>
                        <Col md="12">
                            {this.props.children}
                        </Col>
                    </Row>
                    {nextPreviousButtons}
                    <Row>
                        &nbsp;
                    </Row>
                </Container>
            </Frame>);
    }
}

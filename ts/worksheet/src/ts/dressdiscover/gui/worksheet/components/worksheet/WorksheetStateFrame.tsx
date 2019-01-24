import * as classnames from 'classnames';
import { History } from 'history';
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
    history: History;
    id: string;
    finishButtonEnabled: boolean;
    nextButtonEnabled: boolean;
    previousButtonEnabled: boolean;
    save?: () => void;
    worksheetState: WorksheetStateWrapper;
}

export class WorksheetStateFrame extends React.Component<Props> {
    static defaultProps = {
        finishButtonEnabled: true,
        nextButtonEnabled: true,
        previousButtonEnabled: true
    };

    constructor(props: Props) {
        super(props);
        this.onClickFinishButton = this.onClickFinishButton.bind(this);
        this.onClickNextButton = this.onClickNextButton.bind(this);
        this.onClickPreviousButton = this.onClickPreviousButton.bind(this);
    }

    onClickFinishButton() {
        if (this.props.save) {
            this.props.save();
        }
        this.props.history.push(Hrefs.worksheetState(this.props.worksheetState.lastStateMark));
    }

    onClickNextButton() {
        if (this.props.save) {
            this.props.save();
        }
        this.props.history.push(Hrefs.worksheetState(this.props.worksheetState.nextStateMark));
    }

    onClickPreviousButton() {
        if (this.props.save) {
            this.props.save();
        }
        if (this.props.worksheetState.currentStateMarkIndex > 0) {
            this.props.history.push(Hrefs.worksheetState(this.props.worksheetState.previousStateMark));
        } else {
            this.props.history.push(Hrefs.worksheetStart);
        }
    }

    render() {
        const { worksheetState } = this.props;

        const headline = "Worksheet: " + worksheetState.id.toString();

        const breadcrumbItems: ReactNode[] = [];
        breadcrumbItems.push(<BreadcrumbItem active={!worksheetState.currentStateMark.featureSetId && !worksheetState.currentStateMark.featureId}>
            <Link to={Hrefs.worksheetState(worksheetState.firstStateMark)}>{headline}</Link>
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
                <Link to={Hrefs.worksheetState(currentFeatureStateMark)}>Feature: {worksheetState.currentFeatureDefinition!.displayName}</Link>
            </BreadcrumbItem>);
        }

        const finishButtonEnabled = typeof (this.props.finishButtonEnabled) !== "undefined" ? this.props.finishButtonEnabled : this.props.nextButtonEnabled;
        const nextPreviousButtons = (
            <Row>
                <Col xs="12">
                    <div className="float-left">
                        <Button className={classnames({ invisible: !this.props.previousButtonEnabled, visible: this.props.previousButtonEnabled })} color="primary" size="lg" onClick={this.onClickPreviousButton}>Previous</Button>
                    </div>
                    <div className="float-right">
                        <Button className={classnames({ invisible: !this.props.nextButtonEnabled, visible: this.props.nextButtonEnabled })} color="primary" size="lg" onClick={this.onClickNextButton}>Next</Button>
                        &nbsp;
                        <Button className={classnames({ invisible: !finishButtonEnabled, visible: finishButtonEnabled })} color="primary" size="lg" onClick={this.onClickFinishButton}>Finish</Button>
                    </div>
                </Col>
            </Row>
        );

        let progressBar: ReactNode | null;
        if (worksheetState.lastStateMarkIndex > 0) {
            progressBar = (
                <Row style={{ height: "20px" }}>
                    <Progress className="ml-4" bar striped value={worksheetState.progressPercentage}></Progress>
                </Row>
            );
        } else {
            progressBar = null;
        }

        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Worksheet}
                breadcrumbItems={<React.Fragment>{breadcrumbItems}</React.Fragment>}
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
                    <Row>
                        &nbsp;
                    </Row>
                    {nextPreviousButtons}
                </Container>
            </Frame>);
    }
}

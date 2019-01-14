import { ReactNode } from 'react';
import * as React from 'react';
import { Link } from 'react-router-dom';
import { BreadcrumbItem, Container } from 'reactstrap';

import { Hrefs } from '../../Hrefs';
import { WorksheetStateWrapper } from '../../models/worksheet/WorksheetStateWrapper';
import { Frame } from '../frame/Frame';
import { ActiveNavbarItem } from '../navbar/ActiveNavbarItem';

interface Props {
    children?: ReactNode;
    id: string;
    nextButtonEnabled: boolean;
    previousButtonEnabled: boolean;
    worksheetState: WorksheetStateWrapper;
}

export class WorksheetStateFrame extends React.Component<Props> {
    render() {
        const headline = "Worksheet: " + this.props.worksheetState.id.toString();

        const breadcrumbItems: ReactNode[] = [];
        breadcrumbItems.push(<BreadcrumbItem active={!this.props.worksheetState.currentStateMark.featureSetId && !this.props.worksheetState.currentStateMark.featureId}>
            <Link to={Hrefs.worksheetState(this.props.worksheetState.startStateMark)}>{headline}</Link>
        </BreadcrumbItem>);
        const currentFeatureSetStateMark = this.props.worksheetState.currentFeatureSetStateMark;
        const currentFeatureStateMark = this.props.worksheetState.currentFeatureStateMark;
        if (currentFeatureSetStateMark) {
            breadcrumbItems.push(<BreadcrumbItem active={!currentFeatureStateMark}>
                <Link to={Hrefs.worksheetState(currentFeatureSetStateMark)}>Feature Set: {this.props.worksheetState.currentFeatureSetDefinition!.displayName}</Link>
            </BreadcrumbItem>);
        }
        if (currentFeatureStateMark) {
            breadcrumbItems.push(<BreadcrumbItem active={true}>
                <Link to={Hrefs.worksheetState(currentFeatureStateMark)}>Feature: {this.props.worksheetState.currentFeatureDefinition!.displayName}}</Link>
            </BreadcrumbItem>);
        }

        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Worksheet}
                breadcrumbItems={<React.Fragment>...breadcrumbItems</React.Fragment>}
                headline={headline}
                id={this.props.id}
            >
                <Container fluid>
                    {this.props.children}
                </Container>
            </Frame>);
    }
}
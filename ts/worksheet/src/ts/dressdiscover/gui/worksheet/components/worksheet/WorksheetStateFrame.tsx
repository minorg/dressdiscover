import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import { ReactNode } from 'react';
import * as React from 'react';
import { Link } from 'react-router-dom';
import { BreadcrumbItem } from 'reactstrap';

import { Hrefs } from '../../Hrefs';
import { Frame } from '../frame/Frame';
import { ActiveNavbarItem } from '../navbar/ActiveNavbarItem';

interface Props {
    children?: ReactNode;
    breadcrumbItems?: ReactNode;
    id: string;
    mark: WorksheetStateMark;
    worksheetState: WorksheetState;
}

export class WorksheetStateFrame extends React.Component<Props> {
    render() {
        const headline = "Worksheet: " + this.props.worksheetState.id.toString();
        const breadcrumbItems = (
            <React.Fragment>
                <BreadcrumbItem active>
                    <Link to={Hrefs.worksheetState(this.props.mark)}>{headline}</Link>
                </BreadcrumbItem>
                {this.props.breadcrumbItems}</React.Fragment>);

        return (
            <Frame
                activeNavItem={ActiveNavbarItem.Worksheet}
                breadcrumbItems={breadcrumbItems}
                headline={headline}
                id={this.props.id}
            >
                {this.props.children}
            </Frame>);
    }
}
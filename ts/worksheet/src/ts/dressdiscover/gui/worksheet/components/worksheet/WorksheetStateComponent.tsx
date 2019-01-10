import * as queryString from 'query-string';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';

interface WorksheetStateComponentProps extends RouteComponentProps<{ worksheetStateId: string }> {
}

export class WorksheetStateComponent extends React.Component<WorksheetStateComponentProps> {
    render() {
        const locationParsed = queryString.parse(this.props.location);
    }
}

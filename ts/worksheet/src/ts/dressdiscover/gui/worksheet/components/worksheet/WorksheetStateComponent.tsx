import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import * as invariant from 'invariant';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';

import { WorksheetStateGetter } from './WorksheetStateGetter';
import { WorksheetStateMarkParser } from './WorksheetStateMarkParser';

interface WorksheetStateComponentProps extends RouteComponentProps<WorksheetStateMarkRouteParams> {
}

export class WorksheetStateComponent extends React.Component<WorksheetStateComponentProps> {
    render() {
        const mark = WorksheetStateMarkParser.parseRouteComponentProps(this.props);
        invariant(!mark.featureId, "unexpected feature id");
        invariant(!mark.featureSetId, "unexpected feature set id");

        return (
            <WorksheetStateGetter render={(worksheetState) => mark.review ? <WorksheetStateReview worksheetState={worksheetState} /> : <WorksheetStateStart worksheetState={worksheetState} />} worksheetStateId={mark.worksheetStateId} />
        );
    }
}

class WorksheetStateReview extends React.Component<{ worksheetState: WorksheetState }> {
}

class WorksheetStateStart extends React.Component<{ worksheetState: WorksheetState }> {
    render() {
        return (<div>Hello</div>);
    }
}
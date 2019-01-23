import {
    WorksheetFeatureSetStateTable,
} from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetFeatureSetStateTable';
import { History } from 'history';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';

import { WorksheetStateWrapper } from '../../models/worksheet/WorksheetStateWrapper';
import { WorksheetStateFrame } from './WorksheetStateFrame';
import { WorksheetStateGetter } from './WorksheetStateGetter';
import { WorksheetStateMarkParser } from './WorksheetStateMarkParser';

export class WorksheetFeatureSetStateEditOrReview extends React.Component<RouteComponentProps<WorksheetStateMarkRouteParams>> {
    render() {
        return (
            <WorksheetStateGetter
                render={(worksheetState) => <WorksheetFeatureSetStateEditOrReviewImpl history={this.props.history} worksheetState={worksheetState} />}
                worksheetStateMark={WorksheetStateMarkParser.parseRouteComponentProps(this.props)}
            />
        );
    }
}

class WorksheetFeatureSetStateEditOrReviewImpl extends React.Component<{ history: History, worksheetState: WorksheetStateWrapper }> {
    render() {
        const { worksheetState } = this.props;
        return (
            <WorksheetStateFrame
                history={this.props.history}
                id="worksheet-feature-set-state-edit-or-review"
                worksheetState={worksheetState}
            >
                <WorksheetFeatureSetStateTable featureSetDefinition={worksheetState.currentFeatureSetDefinition!} featureSetState={worksheetState.currentFeatureSetState} includeFeatureDescriptions={!worksheetState.currentStateMark.review} worksheetState={worksheetState} />
            </WorksheetStateFrame>);
    }
}

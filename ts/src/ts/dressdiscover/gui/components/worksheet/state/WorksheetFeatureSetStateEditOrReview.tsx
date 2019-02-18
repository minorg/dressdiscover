import { WorksheetFeatureSetStateTable } from 'dressdiscover/gui/components/worksheet/state/WorksheetFeatureSetStateTable';
import { History } from 'history';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';

import { WorksheetStateWrapper } from '../../../models/worksheet/state/WorksheetStateWrapper';
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
                headline={"Feature Set: " + worksheetState.currentFeatureSetDefinition!.displayName}
                history={this.props.history}
                id="worksheet-feature-set-state-edit-or-review"
                worksheetState={worksheetState}
            >
                <p>This is the list of features for this work type. Click on <b>Next</b> to begin entering data for each feature in order, or click on a specific feature to jump to it. You can click on <b>Finish</b> at any time to return to this page and see a summary of your choices.</p>
                <WorksheetFeatureSetStateTable featureSetDefinition={worksheetState.currentFeatureSetDefinition!} featureSetState={worksheetState.currentFeatureSetState} includeFeatureDescriptions={!worksheetState.currentStateMark.review} worksheetState={worksheetState} />
            </WorksheetStateFrame>);
    }
}

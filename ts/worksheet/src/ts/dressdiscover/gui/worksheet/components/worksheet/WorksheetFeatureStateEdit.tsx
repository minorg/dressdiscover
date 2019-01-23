import { WorksheetStateFrame } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateFrame';
import { WorksheetStateGetter } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateGetter';
import { WorksheetStateMarkParser } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateMarkParser';
import { WorksheetStateWrapper } from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetStateWrapper';
import { History } from 'history';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';

export class WorksheetFeatureStateEdit extends React.Component<RouteComponentProps<WorksheetStateMarkRouteParams>> {
    render() {
        return (
            <WorksheetStateGetter
                render={(worksheetState) => <WorksheetFeatureStateEditImpl history={this.props.history} worksheetState={worksheetState} />}
                worksheetStateMark={WorksheetStateMarkParser.parseRouteComponentProps(this.props)}
            />
        );
    }
}

class WorksheetFeatureStateEditImpl extends React.Component<{ history: History, worksheetState: WorksheetStateWrapper }> {
    render() {
        const { worksheetState } = this.props;
        return (
            <WorksheetStateFrame
                history={this.props.history}
                id="worksheet-feature-state-edit"
                worksheetState={worksheetState}
            >
            </WorksheetStateFrame>);
    }
}
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

export class WorksheetStateReview extends React.Component<RouteComponentProps<WorksheetStateMarkRouteParams>> {
    render() {
        return (
            <WorksheetStateGetter
                render={(worksheetState: WorksheetStateWrapper) => <WorksheetStateReviewImpl history={this.props.history} worksheetState={worksheetState} />}
                worksheetStateMark={WorksheetStateMarkParser.parseRouteComponentProps(this.props)}
            />
        );
    }
}

interface WorksheetStateReviewImplProps {
    history: History;
    worksheetState: WorksheetStateWrapper;
}

class WorksheetStateReviewImpl extends React.Component<WorksheetStateReviewImplProps> {
    render() {
        const { worksheetState } = this.props;

        return (
            <WorksheetStateFrame
                history={this.props.history}
                id="worksheet-state-edit"
                finishButtonEnabled={false}
                nextButtonEnabled={false}
                previousButtonEnabled={true}
                worksheetState={this.props.worksheetState}
            >
                <div className="clearfix"></div>
                {worksheetState.featureSetStates.map((featureSetState) => {
                    const featureSetDefinition = worksheetState.worksheetDefinition.featureSetById(featureSetState.id);
                    return (
                        <React.Fragment key={featureSetState.id.toString()}>
                            <h4 className="text-center">{featureSetDefinition.displayName}</h4>
                            <WorksheetFeatureSetStateTable
                                featureSetDefinition={featureSetDefinition}
                                featureSetState={featureSetState}
                                includeFeatureDescriptions={false}
                                worksheetState={worksheetState}
                            />
                        </React.Fragment>
                    );
                })}
                {worksheetState.text ? (
                    <React.Fragment>
                        <br />
                        <hr />
                        <br />
                        <h4>Freetext description</h4>
                        <p>{worksheetState.text}</p>
                    </React.Fragment>
                ) : null}
            </WorksheetStateFrame>);
    }
}

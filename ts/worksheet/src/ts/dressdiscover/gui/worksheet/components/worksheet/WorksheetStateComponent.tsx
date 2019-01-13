import './WorksheetStateComponent.scss';

import * as classnames from 'classnames';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { WorksheetState } from 'dressdiscover/api/models/worksheet/worksheet_state';
import { WorksheetStateMark } from 'dressdiscover/api/models/worksheet/worksheet_state_mark';
import * as invariant from 'invariant';
import * as _ from 'lodash';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';
import { Button, Table } from 'reactstrap';
import { update } from 'space-lift';

import { WorksheetDefinitionWrapper } from '../../models/worksheet/WorksheetDefinitionWrapper';
import { WorksheetDescriptionComponent } from './WorksheetDescriptionComponent';
import { WorksheetStateFrame } from './WorksheetStateFrame';
import { WorksheetStateGetter } from './WorksheetStateGetter';
import { WorksheetStateMarkParser } from './WorksheetStateMarkParser';

export class WorksheetStateComponent extends React.Component<RouteComponentProps<WorksheetStateMarkRouteParams>> {
    render() {
        const mark = WorksheetStateMarkParser.parseRouteComponentProps(this.props);
        invariant(!mark.featureId, "unexpected feature id");
        invariant(!mark.featureSetId, "unexpected feature set id");
        return (
            <WorksheetStateGetter render={
                (worksheetDefinition, worksheetState) => {
                    const delegateProps: WorksheetStateReviewOrStartProps = { mark, worksheetDefinition, worksheetState };
                    if (mark.review) {
                        return <WorksheetStateReview {...delegateProps} />
                    } else {
                        return <WorksheetStateStart {...delegateProps} />
                    }
                }
            }
                worksheetStateId={mark.worksheetStateId}
            />
        );
    }
}

interface WorksheetStateReviewOrStartProps {
    mark: WorksheetStateMark;
    worksheetDefinition: WorksheetDefinitionWrapper;
    worksheetState: WorksheetState;
}

class WorksheetStateReview extends React.Component<WorksheetStateReviewOrStartProps> {
    render() {
        return (<div></div>);
    }
}

class WorksheetStateStart extends React.Component<WorksheetStateReviewOrStartProps, { selectedFeatureSetIds: WorksheetFeatureSetId[] }> {
    constructor(props: WorksheetStateReviewOrStartProps) {
        super(props);
        this.onToggleFeatureSet = this.onToggleFeatureSet.bind(this);
        this.state = { selectedFeatureSetIds: [] };
    }

    isFeatureSetSelected(featureSetId: WorksheetFeatureSetId): boolean {
        return _.findIndex(this.state.selectedFeatureSetIds, (selected) => selected.equals(featureSetId)) != -1;
    }

    onToggleFeatureSet(featureSetId: WorksheetFeatureSetId) {
        this.setState(
            (prevState) => {
                const selectedFeatureSetIds = prevState.selectedFeatureSetIds;
                const newSelectedFeatureIds = _.filter(selectedFeatureSetIds, (selected) => !selected.equals(featureSetId));
                if (newSelectedFeatureIds.length == selectedFeatureSetIds.length) {
                    newSelectedFeatureIds.push(featureSetId);
                }
                return update(prevState, { selectedFeatureSetIds: newSelectedFeatureIds });
            });
    }

    render() {
        return (
            <WorksheetStateFrame
                id="worksheet-state-start"
                mark={this.props.mark}
                worksheetState={this.props.worksheetState}
            >
                <h4>Select feature sets</h4>
                <p className="card-text">Select one or more feature sets to describe the object.</p>
                <Table className="table-bordered">
                    <thead>
                        <tr>
                            <th></th>
                            <th>Description</th>
                            <th>Features</th>
                        </tr>
                    </thead>
                    <tbody>
                        {_.map(this.props.worksheetDefinition.featureSets, (featureSetDefinition) =>
                            <tr className={classnames({ "feature-set": true, selected: this.isFeatureSetSelected(featureSetDefinition.id) })}>
                                <td className="text-center">
                                    <Button active={this.isFeatureSetSelected(featureSetDefinition.id)} color="secondary" onClick={() => this.onToggleFeatureSet(featureSetDefinition.id)} size="lg">{featureSetDefinition.displayName}</Button>
                                    {/* <Input checked={this.isFeatureSetSelected(featureSetDefinition.id)} type="checkbox"></Input> */}
                                </td>
                                <td>
                                    {featureSetDefinition.description ? <WorksheetDescriptionComponent description={featureSetDefinition.description} /> : null}
                                </td>
                                <td className="align-middle">
                                    {_.map(featureSetDefinition.features, (featureDefinition) =>
                                        <React.Fragment><span data-bind="text: displayName">{featureDefinition.displayName}</span>&nbsp;&nbsp;</React.Fragment>
                                    )}
                                </td>
                            </tr>
                        )}
                    </tbody>
                </Table>
            </WorksheetStateFrame>);
    }
}
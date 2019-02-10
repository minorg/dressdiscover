import './WorksheetStateEdit.scss';

import * as classnames from 'classnames';
import { WorksheetFeatureSetId } from 'dressdiscover/api/models/worksheet/worksheet_feature_set_id';
import { History } from 'history';
import * as _ from 'lodash';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';
import { Button, Input, Table } from 'reactstrap';
import { update } from 'space-lift';

import { WorksheetStateWrapper } from '../../models/worksheet/state/WorksheetStateWrapper';
import { WorksheetDescriptionComponent } from './WorksheetDescriptionComponent';
import { WorksheetStateFrame } from './WorksheetStateFrame';
import { WorksheetStateGetter } from './WorksheetStateGetter';
import { WorksheetStateMarkParser } from './WorksheetStateMarkParser';

export class WorksheetStateEdit extends React.Component<RouteComponentProps<WorksheetStateMarkRouteParams>> {
    render() {
        return (
            <WorksheetStateGetter
                render={(worksheetState: WorksheetStateWrapper) => <WorksheetStateEditImpl history={this.props.history} worksheetState={worksheetState} />}
                worksheetStateMark={WorksheetStateMarkParser.parseRouteComponentProps(this.props)}
            />
        );
    }
}

interface WorksheetStateEditImplProps {
    history: History;
    worksheetState: WorksheetStateWrapper;
}

class WorksheetStateEditImpl extends React.Component<WorksheetStateEditImplProps, {
    description?: string,
    selectedFeatureSetIds: WorksheetFeatureSetId[]
}> {
    constructor(props: WorksheetStateEditImplProps) {
        super(props);
        this.onChangeDescription = this.onChangeDescription.bind(this);
        this.onToggleFeatureSet = this.onToggleFeatureSet.bind(this);
        this.save = this.save.bind(this);
        this.state = { description: this.props.worksheetState.text, selectedFeatureSetIds: this.props.worksheetState.selectedFeatureSetIds };
    }

    isFeatureSetSelected(featureSetId: WorksheetFeatureSetId): boolean {
        return this.state.selectedFeatureSetIds.some((selectedFeatureSetId) => selectedFeatureSetId.equals(featureSetId));
    }

    onChangeDescription(e: any) {
        const text = e.target.value;
        this.setState((prevState) => update(prevState, { description: text }));
    }

    onToggleFeatureSet(featureSetId: WorksheetFeatureSetId) {
        this.setState(
            (prevState) => {
                const selectedFeatureSetIds = prevState.selectedFeatureSetIds;
                const newSelectedFeatureIds = _.filter(selectedFeatureSetIds, (selected) => !selected.equals(featureSetId));
                if (newSelectedFeatureIds.length === selectedFeatureSetIds.length) {
                    newSelectedFeatureIds.push(featureSetId);
                }
                return update(prevState, { selectedFeatureSetIds: newSelectedFeatureIds });
            });
    }

    render() {
        const { worksheetState } = this.props;
        return (
            <WorksheetStateFrame
                headline={"Worksheet: " + worksheetState.id.toString()}
                history={this.props.history}
                id="worksheet-state-edit"
                finishButtonEnabled={this.state.selectedFeatureSetIds.length > 0}
                nextButtonEnabled={this.state.selectedFeatureSetIds.length > 0}
                previousButtonEnabled={false}
                save={this.save}
                worksheetState={worksheetState}
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
                        {worksheetState.worksheetDefinition.featureSets.map((featureSetDefinition) =>
                            <tr className={classnames({ "feature-set": true, selected: this.isFeatureSetSelected(featureSetDefinition.id) })} key={featureSetDefinition.id.toString()}>
                                <td className="text-center">
                                    <Button active={this.isFeatureSetSelected(featureSetDefinition.id)} color="secondary" onClick={() => this.onToggleFeatureSet(featureSetDefinition.id)} size="lg">{featureSetDefinition.displayName}</Button>
                                    {/* <Input checked={this.isFeatureSetSelected(featureSetDefinition.id)} type="checkbox"></Input> */}
                                </td>
                                <td>
                                    {featureSetDefinition.description ? <WorksheetDescriptionComponent description={featureSetDefinition.description} /> : null}
                                </td>
                                <td className="align-middle">
                                    {featureSetDefinition.features.map((featureDefinition) =>
                                        <React.Fragment key={featureDefinition.id.toString()}><span data-bind="text: displayName">{featureDefinition.displayName}</span>&nbsp;&nbsp;</React.Fragment>
                                    )}
                                </td>
                            </tr>
                        )}
                    </tbody>
                </Table>
                <br />
                <hr />
                <br />
                <h4>Freetext description</h4>
                <Input onChange={this.onChangeDescription} placeholder="Freetext description (optional)" rows="8" type="textarea" value={this.state.description} />
            </WorksheetStateFrame>);
    }

    save() {
        this.props.worksheetState.selectFeatureSets(this.state.selectedFeatureSetIds);
        if (this.state.description && this.state.description.trim().length) {
            this.props.worksheetState.text = this.state.description.trim();
        }
        this.props.worksheetState.save();
    }
}

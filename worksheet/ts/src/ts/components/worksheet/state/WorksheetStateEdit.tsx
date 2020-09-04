import './WorksheetStateEdit.scss';

import * as classnames from 'classnames';
import { WorksheetFeatureSetId } from '~/models/worksheet/WorksheetFeatureSetId';
import { CurrentUserStore } from '~/stores/current_user/CurrentUserStore';
import { History } from 'history';
import * as _ from 'lodash';
import { inject } from 'mobx-react';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';
import { Button, Input, Table } from 'reactstrap';

import { WorksheetStateWrapper } from '../~/models/worksheet/state/WorksheetStateWrapper';
import { WorksheetDescriptionComponent } from './WorksheetDescriptionComponent';
import { WorksheetStateFrame } from './WorksheetStateFrame';
import { WorksheetStateGetter } from './WorksheetStateGetter';
import { WorksheetStateMarkParser } from './WorksheetStateMarkParser';

export class WorksheetStateEdit extends React.Component<RouteComponentProps<WorksheetStateMarkRouteParams>> {
    render() {
        return (
            <WorksheetStateGetter
                history={this.props.history}
                render={(worksheetState: WorksheetStateWrapper) => <WorksheetStateEditImpl history={this.props.history} worksheetState={worksheetState} />}
                worksheetStateMark={WorksheetStateMarkParser.parseRouteComponentProps(this.props)}
            />
        );
    }
}

interface WorksheetStateEditImplProps {
    currentUserStore?: CurrentUserStore;
    history: History;
    worksheetState: WorksheetStateWrapper;
}

@inject("currentUserStore")
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
        this.setState((prevState) => Object.assign({}, prevState, { description: text }));
    }

    onToggleFeatureSet(featureSetId: WorksheetFeatureSetId) {
        this.setState(
            (prevState) => {
                const selectedFeatureSetIds = prevState.selectedFeatureSetIds;
                const newSelectedFeatureIds = _.filter(selectedFeatureSetIds, (selected) => !selected.equals(featureSetId));
                if (newSelectedFeatureIds.length === selectedFeatureSetIds.length) {
                    newSelectedFeatureIds.push(featureSetId);
                }
                return Object.assign({}, prevState, { selectedFeatureSetIds: newSelectedFeatureIds });
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
                <p className="card-text">Select one or more feature sets to describe the object. Currently the feature set for a Dress is the only one available, but more will be added in the future.</p>
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
                                    {featureSetDefinition.features.map((featureDefinition, featureDefinitionIndex) =>
                                        <React.Fragment key={featureDefinition.id.toString()}><span data-bind="text: displayName" style={{fontWeight: featureDefinitionIndex % 2 === 0 ? "bold" : "normal"}}>{featureDefinition.displayName}</span>{featureDefinitionIndex + 1 < featureSetDefinition.features.length ? "  \u00b7" : null}&nbsp;</React.Fragment>
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
        const { currentUserStore, worksheetState } = this.props;
        worksheetState.selectFeatureSets(this.state.selectedFeatureSetIds);
        if (this.state.description && this.state.description.trim().length) {
            worksheetState.text = this.state.description.trim();
        }
        currentUserStore!.currentUserServices.worksheetStateCommandService.putWorksheetState({ state: worksheetState.toWorksheetState() });
    }
}

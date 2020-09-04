import { WorksheetFeatureValueId } from '~/models/worksheet/WorksheetFeatureValueId';
import { WorksheetFeatureValueStateEdit } from '~/components/worksheet/state/WorksheetFeatureValueStateEdit';
import { WorksheetStateFrame } from '~/components/worksheet/state/WorksheetStateFrame';
import { WorksheetStateGetter } from '~/components/worksheet/state/WorksheetStateGetter';
import { WorksheetStateMarkParser } from '~/components/worksheet/state/WorksheetStateMarkParser';
import { WorksheetStateWrapper } from '~/models/worksheet/state/WorksheetStateWrapper';
import { CurrentUserStore } from '~/stores/current_user/CurrentUserStore';
import { History } from 'history';
import { inject } from 'mobx-react';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';
import { Container, Row } from 'reactstrap';

export class WorksheetFeatureStateEdit extends React.Component<RouteComponentProps<WorksheetStateMarkRouteParams>> {
    render() {
        return (
            <WorksheetStateGetter
                history={this.props.history}
                render={(worksheetState) => <WorksheetFeatureStateEditImpl history={this.props.history} worksheetState={worksheetState} />}
                worksheetStateMark={WorksheetStateMarkParser.parseRouteComponentProps(this.props)}
            />
        );
    }
}

interface WorksheetFeatureStateEditImplProps {
    currentUserStore?: CurrentUserStore;
    history: History;
    worksheetState: WorksheetStateWrapper;
}

@inject("currentUserStore")
class WorksheetFeatureStateEditImpl extends React.Component<WorksheetFeatureStateEditImplProps> {
    constructor(props: WorksheetFeatureStateEditImplProps) {
        super(props);

        this.onToggleFeatureValue = this.onToggleFeatureValue.bind(this);
        this.save = this.save.bind(this);
    }

    onToggleFeatureValue(featureValueId: WorksheetFeatureValueId) {
        const featureState = this.props.worksheetState.currentFeatureState;
        let selectedValueIds = (featureState && featureState.selectedValueIds && featureState.selectedValueIds.length) ? featureState.selectedValueIds : undefined;
        if (!selectedValueIds) {
            selectedValueIds = [featureValueId];
        } else {
            const otherSelectedValueIds = selectedValueIds.filter((selectedValueId) => !selectedValueId.equals(featureValueId));
            if (otherSelectedValueIds.length === selectedValueIds.length) {
                selectedValueIds = selectedValueIds.concat(featureValueId);
            } else {
                selectedValueIds = otherSelectedValueIds
            }
        }

        this.props.worksheetState.selectFeatureValues(selectedValueIds);
        this.forceUpdate();
    }

    render() {
        const { worksheetState } = this.props;
        const featureState = worksheetState.currentFeatureState;
        const selectedValueIds = (featureState && featureState.selectedValueIds && featureState.selectedValueIds.length) ? featureState.selectedValueIds : undefined;
        return (
            <WorksheetStateFrame
                headline={"Feature: " + worksheetState.currentFeatureDefinition!.displayName}
                history={this.props.history}
                id="worksheet-feature-state-edit"
                save={this.save}
                worksheetState={worksheetState}
            >
                <p>Select one or more boxes, then click <b>Next</b> to move to the next feature. Click on the arrow at the bottom right of an image to see the definition and other information.</p>
                <Container fluid>
                    <Row>
                        {worksheetState.currentFeatureDefinition!.values.map((featureValueDefinition) =>
                            <WorksheetFeatureValueStateEdit
                                featureValueDefinition={featureValueDefinition}
                                key={featureValueDefinition.id.toString()}
                                onToggleSelected={this.onToggleFeatureValue}
                                selected={!!selectedValueIds && selectedValueIds.some((selectedValueId) => selectedValueId.equals(featureValueDefinition.id))}
                            />
                        )}
                    </Row>
                </Container>
            </WorksheetStateFrame>);
    }

    save() {
        const { currentUserStore, worksheetState } = this.props;
        currentUserStore!.currentUserServices.worksheetStateCommandService.putWorksheetState({ state: worksheetState.toWorksheetState() });
    }
}

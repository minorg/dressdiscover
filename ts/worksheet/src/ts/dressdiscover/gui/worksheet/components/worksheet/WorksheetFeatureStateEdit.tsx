import * as classnames from 'classnames';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import { WorksheetStateFrame } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateFrame';
import { WorksheetStateGetter } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateGetter';
import { WorksheetStateMarkParser } from 'dressdiscover/gui/worksheet/components/worksheet/WorksheetStateMarkParser';
import {
    WorksheetFeatureValueDefinitionWrapper,
} from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetFeatureValueDefinitionWrapper';
import { WorksheetStateWrapper } from 'dressdiscover/gui/worksheet/models/worksheet/WorksheetStateWrapper';
import { History } from 'history';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';
import { Card, Container, Row } from 'reactstrap';

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

interface WorksheetFeatureStateEditImplProps {
    history: History;
    worksheetState: WorksheetStateWrapper;
}

interface WorksheetFeatureStateEditImplState {
    selectedValueIds?: WorksheetFeatureValueId[];
    text?: string;
}

class WorksheetFeatureStateEditImpl extends React.Component<WorksheetFeatureStateEditImplProps, WorksheetFeatureStateEditImplState> {
    constructor(props: WorksheetFeatureStateEditImplProps) {
        super(props);

        this.onToggleFeatureValue = this.onToggleFeatureValue.bind(this);
        this.save = this.save.bind(this);

        const featureState = props.worksheetState.currentFeatureState;
        const state: WorksheetFeatureStateEditImplState = {};
        if (featureState) {
            if (featureState.selectedValueIds && featureState.selectedValueIds.length) {
                state.selectedValueIds = featureState.selectedValueIds;
            }
            if (featureState.text) {
                state.text = featureState.text;
            }
        }
        this.state = state;
    }

    onToggleFeatureValue(featureValueId: WorksheetFeatureValueId) {
        this.setState((prevState) => {
            if (!prevState.selectedValueIds) {
                return { selectedValueIds: [featureValueId] };
            }
            const otherSelectedValueIds = prevState.selectedValueIds.filter((selectedValueId) => !selectedValueId.equals(featureValueId));
            if (otherSelectedValueIds.length === prevState.selectedValueIds.length) {
                return { selectedValueIds: prevState.selectedValueIds.concat(featureValueId) }; // Add
            } else {
                return { selectedValueIds: otherSelectedValueIds };
            }
        });
    }

    render() {
        const { worksheetState } = this.props;
        return (
            <WorksheetStateFrame
                history={this.props.history}
                id="worksheet-feature-state-edit"
                save={this.save}
                worksheetState={worksheetState}
            >
                <Container fluid>
                    <Row>
                        {worksheetState.currentFeatureDefinition!.values.map((featureValueDefinition) =>
                            <WorksheetFeatureValueStateEdit
                                featureValueDefinition={featureValueDefinition}
                                key={featureValueDefinition.id.toString()}
                                onToggleSelected={this.onToggleFeatureValue}
                                selected={!!this.state.selectedValueIds && this.state.selectedValueIds.some((selectedValueId) => selectedValueId.equals(featureValueDefinition.id))}
                            />
                        )}
                    </Row>
                </Container>
            </WorksheetStateFrame>);
    }

    save() {
    }
}

interface WorksheetFeatureValueStateEditProps {
    featureValueDefinition: WorksheetFeatureValueDefinitionWrapper;
    onToggleSelected: (featureValueId: WorksheetFeatureValueId) => void;
    selected: boolean;
}

interface WorksheetFeatureValueStateEditState {
    descriptionShown: boolean;
}

class WorksheetFeatureValueStateEdit extends React.Component<WorksheetFeatureValueStateEditProps, WorksheetFeatureValueStateEditState> {
    constructor(props: WorksheetFeatureValueStateEditProps) {
        super(props);
        this.onToggleDescription = this.onToggleDescription.bind(this);
        this.onToggleSelected = this.onToggleSelected.bind(this);
        this.state = { descriptionShown: true };
    }

    onToggleDescription() {
        this.setState((prevState) => ({ descriptionShown: !prevState.descriptionShown }));
    }

    onToggleSelected() {
        this.props.onToggleSelected(this.props.featureValueDefinition.id);
    }

    render() {
        return (
            <Card className={classnames({ "mb-4": true, "mr-4": true })} style={{ borderWidth: "8px" }}>
            </Card>
        );
    }
}

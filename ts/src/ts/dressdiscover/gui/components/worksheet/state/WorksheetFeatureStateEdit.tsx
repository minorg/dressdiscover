import * as classnames from 'classnames';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import { WorksheetDescriptionComponent } from 'dressdiscover/gui/components/worksheet/state/WorksheetDescriptionComponent';
import { WorksheetStateFrame } from 'dressdiscover/gui/components/worksheet/state/WorksheetStateFrame';
import { WorksheetStateGetter } from 'dressdiscover/gui/components/worksheet/state/WorksheetStateGetter';
import { WorksheetStateMarkParser } from 'dressdiscover/gui/components/worksheet/state/WorksheetStateMarkParser';
import {
    WorksheetFeatureValueDefinitionWrapper,
} from 'dressdiscover/gui/models/worksheet/definition/WorksheetFeatureValueDefinitionWrapper';
import { WorksheetStateWrapper } from 'dressdiscover/gui/models/worksheet/state/WorksheetStateWrapper';
import { CurrentUserStore } from 'dressdiscover/gui/stores/current_user/CurrentUserStore';
import { History } from 'history';
import { inject } from 'mobx-react';
import * as React from 'react';
import { RouteComponentProps } from 'react-router';
import { Card, CardBody, Collapse, Container, Row } from 'reactstrap';
import CardHeader from 'reactstrap/lib/CardHeader';

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
        this.state = { descriptionShown: false };
    }

    onToggleDescription() {
        this.setState((prevState) => ({ descriptionShown: !prevState.descriptionShown }));
    }

    onToggleSelected() {
        this.props.onToggleSelected(this.props.featureValueDefinition.id);
    }

    render() {
        const { featureValueDefinition: definition } = this.props;

        let thumbnailImgSrc: string | undefined;
        if (definition.image && definition.image.thumbnailUrl) {
            if (definition.image.thumbnailUrl.absolute) {
                thumbnailImgSrc = definition.image.thumbnailUrl.absolute;
            } else if (definition.image.thumbnailUrl.relative) {
                thumbnailImgSrc = "https://dressdiscover.org/worksheet/" + definition.image.thumbnailUrl.relative;
            }
        }
        if (!thumbnailImgSrc) {
            thumbnailImgSrc = 'http://via.placeholder.com/200x200?text=Missing%20image';
        }

        return (
            <Card className={classnames({ "border-info": this.props.selected, "mb-4": true, "mr-4": true })} style={{ borderWidth: "8px" }}>
                <CardHeader>
                    <a onClick={this.onToggleSelected}>{definition.displayName}</a>
                </CardHeader>
                <CardBody style={{ width: "240px" }}>
                    <figure className="figure">
                        <a onClick={this.onToggleSelected}>
                            <img
                                className="figure-img rounded"
                                src={thumbnailImgSrc}
                                style={{ height: "200px", width: "200px" }}
                            />
                        </a>
                        {definition.image ? (
                            <figcaption className="figure-caption" style={{ fontSize: "xx-small" }}>
                                Image&nbsp;&copy;
                                <span>{definition.image.rights.author}</span>
                                <br />License:&nbsp;
                                <span >{definition.image.rights.license}</span>
                            </figcaption>
                        ) : null}
                    </figure>
                    {definition.description ? (
                        <div className="card-text">
                            <a onClick={this.onToggleDescription}>Description</a>
                            <div className="float-right">
                                <a onClick={this.onToggleDescription} style={{ textDecoration: "none" }}>
                                    <i className={classnames({ fas: true, "fa-chevron-down": this.state.descriptionShown, "fa-chevron-right": !this.state.descriptionShown })}></i>
                                </a>
                            </div>
                            <br />
                            <Collapse isOpen={this.state.descriptionShown}>
                                <WorksheetDescriptionComponent description={definition.description}></WorksheetDescriptionComponent>
                            </Collapse>
                        </div>
                    ) : null}
                </CardBody>
            </Card>
        );
    }
}

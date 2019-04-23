import * as classnames from 'classnames';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import { WorksheetDescriptionComponent } from 'dressdiscover/gui/components/worksheet/state/WorksheetDescriptionComponent';
import {
    WorksheetFeatureValueDefinitionWrapper,
} from 'dressdiscover/gui/models/worksheet/definition/WorksheetFeatureValueDefinitionWrapper';
import * as React from 'react';
import { Card, CardBody, CardHeader, Collapse } from 'reactstrap';

interface Props {
    featureValueDefinition: WorksheetFeatureValueDefinitionWrapper;
    onToggleSelected: (featureValueId: WorksheetFeatureValueId) => void;
    selected: boolean;
}

interface State {
    descriptionShown: boolean;
}

export class WorksheetFeatureValueStateEdit extends React.Component<Props, State> {
    constructor(props: Props) {
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
                thumbnailImgSrc = "https://dressdiscover.org/img/worksheet/" + definition.image.thumbnailUrl.relative;
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

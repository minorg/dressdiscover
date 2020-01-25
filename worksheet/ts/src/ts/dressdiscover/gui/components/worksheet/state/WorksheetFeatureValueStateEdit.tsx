import './WorksheetFeatureValueStateEdit.scss';

import * as classnames from 'classnames';
import { WorksheetFeatureValueId } from 'dressdiscover/api/models/worksheet/worksheet_feature_value_id';
import { WorksheetDescriptionComponent } from 'dressdiscover/gui/components/worksheet/state/WorksheetDescriptionComponent';
import {
    WorksheetRightsLicenseComponent,
} from 'dressdiscover/gui/components/worksheet/state/WorksheetRightsLicenseComponent';
import {
    WorksheetFeatureValueDefinitionWrapper,
} from 'dressdiscover/gui/models/worksheet/definition/WorksheetFeatureValueDefinitionWrapper';
import * as React from 'react';
import { Button, Card, CardBody, CardHeader } from 'reactstrap';
import {DisclosurePanel} from "dressdiscover/gui/components/disclosure/DisclosurePanel";

export const WorksheetFeatureValueStateEdit: React.FunctionComponent<{
    featureValueDefinition: WorksheetFeatureValueDefinitionWrapper;
    onToggleSelected: (featureValueId: WorksheetFeatureValueId) => void;
    selected: boolean;
}> = ({featureValueDefinition : definition, onToggleSelected, selected}) => {
        let thumbnailImgSrc: string | undefined;
        if (definition.image && definition.image.thumbnailUrl) {
            if (definition.image.thumbnailUrl.absolute) {
                thumbnailImgSrc = definition.image.thumbnailUrl.absolute;
            } else if (definition.image.thumbnailUrl.relative) {
                thumbnailImgSrc = window.location.protocol + "//" + window.location.host + "/img/worksheet/" + definition.image.thumbnailUrl.relative;
            }
        }
        if (!thumbnailImgSrc) {
            thumbnailImgSrc = 'http://via.placeholder.com/200x200?text=Missing%20image';
        }

        const onToggleSelectedWrapper = () => onToggleSelected(definition.id);

        return (
            <Card className={classnames({ "border-info": selected, "mb-4": true, "mr-4": true, "worksheet-feature-value-state": true})}>
                <CardHeader>
                    <Button color="link" onClick={onToggleSelectedWrapper}>{definition.displayName}</Button>
                </CardHeader>
                <CardBody style={{ width: "240px" }}>
                    <figure className="figure">
                        <a onClick={onToggleSelectedWrapper}>
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
                                <span ><WorksheetRightsLicenseComponent license={definition.image.rights.license}></WorksheetRightsLicenseComponent></span>
                            </figcaption>
                        ) : null}
                    </figure>
                    {definition.description ? (
                        <DisclosurePanel title="Description">
                            <br/>
                            <WorksheetDescriptionComponent description={definition.description}></WorksheetDescriptionComponent>
                        </DisclosurePanel>
                    ) : null}
                </CardBody>
            </Card>
        );
    }

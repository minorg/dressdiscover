import * as React from "react";
import {ObjectCard} from "dressdiscover/cms/gui/core/components/object/ObjectCard";
import {Container, Row} from "reactstrap";

interface Object {
    collectionUri: string;
    description: string | null | undefined;
    institutionUri: string;
    thumbnail: {
        url: string;
    } | null | undefined;
    title: string;
    uri: string;
}

export const ObjectsGallery: React.FunctionComponent<{ objects: Object[] }> = ({objects}) => {
    return (
        <Container fluid>
            <Row>
                {objects.map(object =>
                    <div className="mr-4 mb-4" key={object.uri}>
                        <ObjectCard object={object}/>
                    </div>)}
            </Row>
        </Container>);
}

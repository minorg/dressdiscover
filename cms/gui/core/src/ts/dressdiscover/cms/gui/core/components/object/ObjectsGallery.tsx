import * as React from "react";
import {ObjectCard} from "dressdiscover/cms/gui/core/components/object/ObjectCard";
import {Container, Row} from "reactstrap";
import {ObjectCardObject} from "dressdiscover/cms/gui/core/components/object/ObjectCardObject";
import {DefaultPaginationProps} from "dressdiscover/cms/gui/core/components/pagination/DefaultPaginationProps";
import {DefaultPagination} from "dressdiscover/cms/gui/core/components/pagination/DefaultPagination";

type Object = ObjectCardObject;

interface Props extends DefaultPaginationProps {
    objects: Object[];
}

export const ObjectsGallery: React.FunctionComponent<Props> = ({objects, ...paginationProps}) => (
    <Container fluid>
        <Row>
            {objects.map(object =>
                <div className="mr-4 mb-4" key={object.uri}>
                    <ObjectCard object={object}/>
                </div>)}
        </Row>
        <Row>
            <DefaultPagination {...paginationProps}/>
        </Row>
    </Container>);

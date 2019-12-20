import * as React from "react";
import {Object} from "dressdiscover/cms/gui/core/models/Object";
import {Card, CardBody, CardHeader, CardTitle} from "reactstrap";

export const ObjectCard: React.FunctionComponent<{ object: Object }> = ({object}) => (
    <Card>
        <CardHeader>
            <CardTitle>{object.title}</CardTitle>
        </CardHeader>
        <CardBody>
            {object.description}
        </CardBody>
    </Card>);

import {Breadcrumb, BreadcrumbItem, Card, CardBody, CardHeader, CardTitle, Col, Container, Row} from "reactstrap";
import {Link} from "react-router-dom";
import {Hrefs} from "dressdiscover/cms/gui/core/Hrefs";
import * as React from "react";
import {Frame} from "dressdiscover/cms/gui/core/components/frame/Frame";
import {stripHtml} from "dressdiscover/cms/gui/core/util/stripHtml";
import {CollectionOverviewQuery_collectionByUri_rights} from "dressdiscover/cms/gui/core/api/queries/types/CollectionOverviewQuery";

type Rights = CollectionOverviewQuery_collectionByUri_rights;

export const InstitutionCollectionObjectOverview: React.FunctionComponent<{
    children: React.ReactNode;
    description?: string;
    institutionName: string;
    institutionUri: string;
    collectionName?: string;
    collectionUri?: string;
    rights?: Rights | null;
    objectTitle?: string;
    objectUri?: string;
    title: string
}> = (props) => (
    <Frame>
        <Container fluid>
            <Row>
                <Col xs={{size: 10, offset: 1}}>
                    <Breadcrumb>
                        <BreadcrumbItem><Link to={Hrefs.home}>Home</Link></BreadcrumbItem>
                        <BreadcrumbItem>Institutions</BreadcrumbItem>
                        <BreadcrumbItem><Link
                            to={Hrefs.institution(props.institutionUri)}>{props.institutionName}</Link></BreadcrumbItem>
                        {props.collectionName && props.collectionUri ?
                            <React.Fragment>
                                <BreadcrumbItem>Collections</BreadcrumbItem>
                                <BreadcrumbItem><Link
                                    to={Hrefs.collection({
                                        collectionUri: props.collectionUri,
                                        institutionUri: props.institutionUri
                                    })}>{props.collectionName}</Link></BreadcrumbItem>
                                {props.objectTitle && props.objectUri ?
                                    <React.Fragment>
                                        <BreadcrumbItem>Objects</BreadcrumbItem>
                                        <BreadcrumbItem><Link
                                            to={Hrefs.object({
                                                collectionUri: props.collectionUri,
                                                institutionUri: props.institutionUri,
                                                objectUri: props.objectUri
                                            })}>{props.objectTitle}</Link></BreadcrumbItem>
                                    </React.Fragment> : null}
                            </React.Fragment> : null}
                    </Breadcrumb>
                </Col>
            </Row>
            <Row>
                <Col xs={{size: 10, offset: 1}}>
                    <Card>
                        <CardHeader>
                            <CardTitle><h2>{props.title}</h2></CardTitle>
                            {props.description ?
                                <p>{stripHtml(props.description)}</p> : null}
                            {props.rights ? <small>{props.rights.text}</small> : null}
                        </CardHeader>
                        <CardBody>
                            {props.children}
                        </CardBody>
                    </Card>
                </Col>
            </Row>
        </Container>
    </Frame>
);

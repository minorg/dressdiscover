import {Breadcrumb, BreadcrumbItem, Card, CardBody, CardHeader, CardTitle, Col, Container, Row} from "reactstrap";
import {Link} from "react-router-dom";
import {Hrefs} from "dressdiscover/cms/gui/core/Hrefs";
import * as React from "react";
import {Frame} from "dressdiscover/cms/gui/core/components/frame/Frame";
import {stripHtml} from "dressdiscover/cms/gui/core/util/stripHtml";
import {CollectionOverviewQuery_collectionByUri_rights} from "dressdiscover/cms/gui/core/api/queries/types/CollectionOverviewQuery";
import {Uris} from "dressdiscover/cms/gui/core/util/Uris";

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
    <Frame
        documentTitle={[props.institutionName, props.collectionName, props.objectTitle].filter(name => !!name).join(" - ")}>
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
                            {props.rights ?
                                <small>
                                    <table className="table-bordered">
                                        <tr>
                                            <td className="px-2"><strong>Rights</strong></td>
                                            <td className="px-2">{props.rights.text}</td>
                                        </tr>
                                        {props.rights.holder ?
                                            <tr>
                                                <td className="px-2"><strong>Holder</strong></td>
                                                <td className="px-2">{props.rights.holder}</td>
                                            </tr>
                                            : null}
                                        {props.rights.license ?
                                            <tr>
                                                <td className="px-2"><strong>License</strong></td>
                                                <td className="px-2">{Uris.isUrl(props.rights.license) ?
                                                    <a href={props.rights.license}>{props.rights.license}</a> :
                                                    <React.Fragment>{props.rights.license}</React.Fragment>}</td>
                                            </tr>
                                            : null}
                                    </table>
                                </small> : null}
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
